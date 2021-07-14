package com.thevale.moretimecapsulesmod.client.renders.exteriors;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.thevale.moretimecapsulesmod.client.models.exteriors.tt_capsule;
import com.thevale.moretimecapsulesmod.tileentities.TTCTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.renderers.TRenderTypes;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;


public class TTCRender extends ExteriorRenderer<TTCTile> {
    public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod","textures/exteriors/tt_capsule.png");
    public static tt_capsule MODEL = new tt_capsule();
    public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0x000000);

    public TTCRender(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void renderExterior(TTCTile TTCTile, float v, MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1, float v1) {
        matrixStack.push();
        matrixStack.translate(0, -1, 0);
        MODEL.render(TTCTile, 0.25F, matrixStack, iRenderTypeBuffer.getBuffer(TRenderTypes.getTardis(TEXTURE)), i, i1, v1);
        matrixStack.pop();
    }
}

