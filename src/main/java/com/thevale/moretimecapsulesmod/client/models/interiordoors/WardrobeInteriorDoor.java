package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.9.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.WardrobeRender;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.misc.TexVariant;
import net.tardis.mod.tileentities.ConsoleTile;

public class WardrobeInteriorDoor extends EntityModel<Entity> implements IInteriorDoorRenderer{
	private final ModelRenderer LeftDoor;
	private final ModelRenderer Walls;
	private final ModelRenderer RightDoor;
	private final ModelRenderer boti;

	public WardrobeInteriorDoor() {
		textureWidth = 128;
		textureHeight = 128;

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-6.2734F, 10.3125F, -7.8516F);
		LeftDoor.setTextureOffset(101, 126).addBox(0.2734F, 12.0625F, 0.0391F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(8, 105).addBox(5.2734F, -9.3125F, -0.0234F, 1.0F, 22.0F, 1.0F, 0.001F, false);
		LeftDoor.setTextureOffset(101, 126).addBox(0.2734F, 4.8125F, 0.0391F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(101, 126).addBox(0.2734F, -2.8125F, 0.0391F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(101, 126).addBox(0.2734F, -9.8125F, -0.0234F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(8, 105).addBox(-0.3516F, -9.3125F, -0.0234F, 1.0F, 22.0F, 1.0F, 0.001F, false);
		LeftDoor.setTextureOffset(61, 109).addBox(5.0234F, -0.8125F, -0.5234F, 1.0F, 2.0F, 2.0F, -0.375F, false);
		LeftDoor.setTextureOffset(30, 105).addBox(0.4609F, -9.8125F, -0.0234F, 6.0F, 22.0F, 1.0F, -0.125F, false);

		Walls = new ModelRenderer(this);
		Walls.setRotationPoint(7.5F, 1.0F, 2.0F);
		Walls.setTextureOffset(0, 102).addBox(-1.25F, -2.0F, -10.0F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(48, 117).addBox(-1.625F, -1.0F, -9.9375F, 1.0F, 1.0F, 1.0F, 0.01F, false);
		Walls.setTextureOffset(48, 117).addBox(-1.625F, 22.0F, -9.9375F, 1.0F, 1.0F, 1.0F, 0.01F, false);
		Walls.setTextureOffset(48, 117).addBox(-14.375F, -1.0F, -9.9375F, 1.0F, 1.0F, 1.0F, 0.01F, false);
		Walls.setTextureOffset(48, 117).addBox(-14.375F, 22.0F, -9.9375F, 1.0F, 1.0F, 1.0F, 0.01F, false);
		Walls.setTextureOffset(0, 102).addBox(-14.75F, -2.0F, -10.0F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(57, 120).addBox(-14.5F, -2.25F, -9.875F, 14.0F, 2.0F, 1.0F, -0.1875F, false);
		Walls.setTextureOffset(57, 120).addBox(-14.5F, 22.25F, -9.875F, 14.0F, 2.0F, 1.0F, -0.1875F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(6.2734F, 11.1875F, -7.8516F);
		RightDoor.setTextureOffset(101, 126).addBox(-6.2734F, 11.1875F, 0.0391F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(8, 105).addBox(-6.2734F, -10.1875F, -0.0234F, 1.0F, 22.0F, 1.0F, 0.001F, false);
		RightDoor.setTextureOffset(101, 126).addBox(-6.2734F, 3.9375F, 0.0391F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(101, 126).addBox(-6.2734F, -3.6875F, 0.0391F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(101, 126).addBox(-6.2734F, -10.6875F, -0.0234F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(8, 105).addBox(-0.6484F, -10.1875F, -0.0234F, 1.0F, 22.0F, 1.0F, 0.001F, false);
		RightDoor.setTextureOffset(66, 119).addBox(-6.0234F, -1.6875F, -0.5234F, 1.0F, 2.0F, 2.0F, -0.375F, false);
		RightDoor.setTextureOffset(30, 105).addBox(-6.4609F, -10.6875F, -0.0234F, 6.0F, 22.0F, 1.0F, -0.125F, false);

		boti = new ModelRenderer(this);
		boti.setRotationPoint(0.0F, 24.0F, 0.0F);
		boti.setTextureOffset(0, 0).addBox(-7.0F, -24.75F, -8.625F, 14.0F, 25.0F, 1.0F, -0.1875F, false);
	}

	@Override
	public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		EnumDoorState state = door.getOpenState();
		matrixStack.push();
		matrixStack.translate(0.0D, -0.75D, 0.3D);
		matrixStack.scale(1.5F, 1.5F, 1.5F);
		switch(state) {
			case ONE:
				this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
		}

		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		Walls.render(matrixStack, buffer, packedLight, packedOverlay);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pop();
	}

	@Override
	public ResourceLocation getTexture() {
		ConsoleTile tile = TardisHelper.getConsoleInWorld(Minecraft.getInstance().world).orElse(null);
		if (tile != null) {
			int index = tile.getExteriorManager().getExteriorVariant();
			if (tile.getExteriorType().getVariants() != null && index < tile.getExteriorType().getVariants().length)
				return tile.getExteriorType().getVariants()[index].getTexture();
		}


		return WardrobeRender.TEXTURE;
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

	}
}