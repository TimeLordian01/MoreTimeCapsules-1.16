package com.thevale.moretimecapsulesmod.registry;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.blocks.ValeBlocks;
import com.thevale.moretimecapsulesmod.client.models.interiordoors.*;
import com.thevale.moretimecapsulesmod.client.renders.consoles.CoralConsoleRender;
import com.thevale.moretimecapsulesmod.client.renders.consoles.NewCoralConsoleRender;
import com.thevale.moretimecapsulesmod.client.renders.consoles.SmithConsoleRender;
import com.thevale.moretimecapsulesmod.client.renders.consoles.ValeConsoleRender;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.*;
import com.thevale.moretimecapsulesmod.tileentities.*;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = Moretimecapsulesmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ValeModelRegistry {
    @SubscribeEvent
    public static void Register(FMLClientSetupEvent event) {
        // Render Stuff
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(ValeBlocks.console_vale.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.console_smith.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.console_coral2.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.exterior_wardrobe.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.exterior_shalka.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.exterior_ptored.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.exterior_organ.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.exterior_canon05.get(), RenderType.getTranslucent());
                });
        //Exteriors
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_shalka.get(), ShalkaRender::new);
        EnumDoorTypes.SHALKA.setInteriorDoorModel(new ShalkaInteriorDoor());
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_ptored.get(), PtoredRender::new);
        EnumDoorTypes.PTORED.setInteriorDoorModel(new Ptoredinteriordoor());
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_wardrobe.get(), WardrobeRender::new);
        EnumDoorTypes.WARDROBE.setInteriorDoorModel(new WardrobeInteriorDoor());
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_organ.get(), OrganRender::new);
        EnumDoorTypes.ORGAN.setInteriorDoorModel(new OrganInnerDoors());
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_canon05.get(), FiveRender::new);
        EnumDoorTypes.CANON05.setInteriorDoorModel(new FiveInteriorDoor());
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_tt_capsule.get(), TTCRender::new);
        EnumDoorTypes.TT_CAPSULE.setInteriorDoorModel(new TTCInteriorDoor());
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_streetside.get(), StreetsideRender::new);
        EnumDoorTypes.STREETSIDE.setInteriorDoorModel(new StreetsideInteriorDoor());
        //Consoles
        ClientRegistry.bindTileEntityRenderer(ValeTiles.console_vale.get(), ValeConsoleRender::new);
        ClientRegistry.bindTileEntityRenderer(ValeTiles.console_coral2.get(), CoralConsoleRender::new);
        ClientRegistry.bindTileEntityRenderer(ValeTiles.console_smith.get(), SmithConsoleRender::new);
        ClientRegistry.bindTileEntityRenderer(ValeTiles.console_newcoral.get(), NewCoralConsoleRender::new);
    }

}
