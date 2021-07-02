package com.thevale.moretimecapsulesmod.registry;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.blocks.ValeBlocks;
import com.thevale.moretimecapsulesmod.texturevariants.TextureVariants;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.exterior.TwoBlockBasicExterior;
import net.tardis.mod.misc.DoorSounds;
import net.tardis.mod.registries.ExteriorRegistry;

public class ValeExteriorRegistry {
    public static final DeferredRegister<AbstractExterior> EXTERIORS = DeferredRegister.create(AbstractExterior.class, Moretimecapsulesmod.MODID);


    public static final RegistryObject<AbstractExterior> FIVEEXTERIOR = EXTERIORS.register("2005exterior", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_canon05.get().getDefaultState(), true, EnumDoorTypes.CANON05, DoorSounds.WOOD,new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/fiveexterior.png")));
    public static final RegistryObject<AbstractExterior> WARDROBE = EXTERIORS.register("wardrobe", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_wardrobe.get().getDefaultState(), true, EnumDoorTypes.WARDROBE, DoorSounds.WOOD,new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/wardrobeexterior.png"), TextureVariants.WARDROBE));
    public static final RegistryObject<AbstractExterior> PTORED = EXTERIORS.register("policeboxred", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_ptored.get().getDefaultState(), true, EnumDoorTypes.PTORED, DoorSounds.WOOD,new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/ptoredexterior.png")));
    public static final RegistryObject<AbstractExterior> SHALKA = EXTERIORS.register("shalka", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_shalka.get().getDefaultState(), true, EnumDoorTypes.SHALKA, DoorSounds.WOOD,new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/shalkaexterior.png")));
    public static final RegistryObject<AbstractExterior> ORGAN = EXTERIORS.register("organ", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_organ.get().getDefaultState(), true, EnumDoorTypes.ORGAN, DoorSounds.WOOD,new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/organexterior.png")));
    public static final RegistryObject<AbstractExterior> TT_CAPSULE = EXTERIORS.register("tt_capsule", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_tt_capsule.get().getDefaultState(), true, EnumDoorTypes.TT_CAPSULE, DoorSounds.WOOD,new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/tt_capsule_exterior.png")));



}
