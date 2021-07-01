package com.thevale.moretimecapsulesmod.registry;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.blocks.ValeBlocks;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryBuilder;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.exterior.TwoBlockBasicExterior;
import net.tardis.mod.misc.DoorSounds;

import java.util.ArrayList;
import java.util.function.Supplier;


public class ExteriorRegistry{
    public static final DeferredRegister<AbstractExterior> EXTERIORS = DeferredRegister.create(AbstractExterior.class, Moretimecapsulesmod.MODID);

    public static Supplier<IForgeRegistry<AbstractExterior>> EXTERIOR_REGISTRY = EXTERIORS.makeRegistry("exterior", () -> new RegistryBuilder<AbstractExterior>().setMaxID(Integer.MAX_VALUE - 1));

    public static AbstractExterior getExterior(ResourceLocation key){
        return EXTERIOR_REGISTRY.get().getValue(key);
    }

    public static ArrayList<AbstractExterior> getDefaultExteriors() {
        ArrayList<AbstractExterior> list = new ArrayList<AbstractExterior>();
        for(AbstractExterior ext : EXTERIOR_REGISTRY.get().getValues()) {
            if(ext.isUnlockedByDefault())
                list.add(ext);
        }
        return list;
    }

    public static final RegistryObject<AbstractExterior> FIVEEXTERIOR = EXTERIORS.register("2005Exterior", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_canon05.get().getDefaultState(), true, EnumDoorTypes.CANON05, DoorSounds.WOOD,new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/fiveexterior.png")));
    public static final RegistryObject<AbstractExterior> WARDROBE = EXTERIORS.register("Wardrobe", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_wardrobe.get().getDefaultState(), true, EnumDoorTypes.WARDROBE, DoorSounds.WOOD,new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/wardrobeexterior.png")));
    public static final RegistryObject<AbstractExterior> PTORED = EXTERIORS.register("PoliceBoxRed", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_ptored.get().getDefaultState(), true, EnumDoorTypes.PTORED, DoorSounds.WOOD,new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/ptoredexterior.png")));
    public static final RegistryObject<AbstractExterior> SHALKA = EXTERIORS.register("Shalka", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_shalka.get().getDefaultState(), true, EnumDoorTypes.SHALKA, DoorSounds.WOOD,new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/shalkaexterior.png")));
    public static final RegistryObject<AbstractExterior> ORGAN = EXTERIORS.register("Organ", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_organ.get().getDefaultState(), true, EnumDoorTypes.ORGAN, DoorSounds.WOOD,new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/organexterior.png")));
}
