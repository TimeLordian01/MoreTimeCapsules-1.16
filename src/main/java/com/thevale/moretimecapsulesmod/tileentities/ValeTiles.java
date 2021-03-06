package com.thevale.moretimecapsulesmod.tileentities;


import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.blocks.ValeBlocks;
import com.thevale.moretimecapsulesmod.tileentities.consoles.CoralConsoleTile;
import com.thevale.moretimecapsulesmod.tileentities.consoles.NewCoralConsoleTile;
import com.thevale.moretimecapsulesmod.tileentities.consoles.SmithConsoleTile;
import com.thevale.moretimecapsulesmod.tileentities.consoles.ValeConsoleTile;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.blocks.TileBlock;

import com.google.common.base.Supplier;

public class ValeTiles {
    public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Moretimecapsulesmod.MODID);
    //Exteriors
    public static RegistryObject<TileEntityType<OrganTile>> exterior_organ = TILES.register("exterior_organ", () -> registerTiles(OrganTile::new, ValeBlocks.exterior_organ.get()));
    public static RegistryObject<TileEntityType<FiveTile>> exterior_canon05 = TILES.register("exterior_canon05", () -> registerTiles(FiveTile::new, ValeBlocks.exterior_canon05.get()));
    public static RegistryObject<TileEntityType<PtoredTile>> exterior_ptored = TILES.register("exterior_ptored", () -> registerTiles(PtoredTile::new, ValeBlocks.exterior_ptored.get()));
    public static RegistryObject<TileEntityType<ShalkaTile>> exterior_shalka = TILES.register("exterior_shalka", () -> registerTiles(ShalkaTile::new, ValeBlocks.exterior_shalka.get()));
    public static RegistryObject<TileEntityType<WardrobeTile>> exterior_wardrobe = TILES.register("exterior_wardrobe", () -> registerTiles(WardrobeTile::new, ValeBlocks.exterior_wardrobe.get()));
    public static RegistryObject<TileEntityType<TTCTile>> exterior_tt_capsule = TILES.register("exterior_tt_capsule", () -> registerTiles(TTCTile::new, ValeBlocks.exterior_tt_capsule.get()));
    public static RegistryObject<TileEntityType<StreetsideTile>> exterior_streetside = TILES.register("exterior_streetside", () -> registerTiles(StreetsideTile::new, ValeBlocks.exterior_streetside.get()));

    //Consoles
    public static RegistryObject<TileEntityType<ValeConsoleTile>> console_vale = TILES.register("console_vale", () -> registerTiles(ValeConsoleTile::new, ValeBlocks.console_vale.get()));
    public static RegistryObject<TileEntityType<CoralConsoleTile>> console_coral2 = TILES.register("console_coral2", () -> registerTiles(CoralConsoleTile::new, ValeBlocks.console_coral2.get()));
    public static RegistryObject<TileEntityType<SmithConsoleTile>> console_smith = TILES.register("console_smith", () -> registerTiles(SmithConsoleTile::new, ValeBlocks.console_smith.get()));
    public static RegistryObject<TileEntityType<NewCoralConsoleTile>> console_newcoral = TILES.register("console_newcoral", () -> registerTiles(NewCoralConsoleTile::new, ValeBlocks.console_newcoral.get()));



    private static <T extends TileEntity> TileEntityType<T> registerTiles(Supplier<T> tile, Block... validBlock) {
        TileEntityType<T> type = TileEntityType.Builder.create(tile, validBlock).build(null);

        for (Block block : validBlock) {
            if (block instanceof TileBlock) {
                ((TileBlock) block).setTileEntity(type);
            }
        }

        return type;
    }
}