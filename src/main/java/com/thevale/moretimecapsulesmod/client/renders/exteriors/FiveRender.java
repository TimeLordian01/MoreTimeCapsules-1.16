package com.thevale.moretimecapsulesmod.client.renders.exteriors;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.client.models.exteriors.FiveExterior;
import com.thevale.moretimecapsulesmod.tileentities.FiveTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;
import net.tardis.mod.client.renderers.TRenderTypes;


public class FiveRender extends ExteriorRenderer<FiveTile> {
    public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod", "textures/exteriors/fiveexterior.png");
    public static FiveExterior MODEL = new FiveExterior();
    public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0x000000);

    public FiveRender(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void renderExterior(FiveTile tile, float v, MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1, float v1) {
        matrixStack.push();
        matrixStack.translate(0, -1, 0);
        MODEL.render(tile, 0.25F, matrixStack, iRenderTypeBuffer.getBuffer(TRenderTypes.getTardis(TEXTURE)), i, i1, v1);
        matrixStack.pop();
    }
}