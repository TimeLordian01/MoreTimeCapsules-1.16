package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.7.5

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.Tardis;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.client.renderers.exteriors.TTCapsuleExteriorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.misc.IDoorType.EnumDoorType;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class TTCInteriorDoor extends EntityModel<Entity> implements IInteriorDoorRenderer {
	public static final ResourceLocation TEXTURE = new ResourceLocation(Moretimecapsulesmod.MODID, "textures/interiordoor/tt_capsule.png");

	private final ModelRenderer boti;
	private final ModelRenderer bb_main;
	private final ModelRenderer frame;
	private final ModelRenderer roof;
	private final ModelRenderer walls;
	private final ModelRenderer bone22;
	private final ModelRenderer bone8;
	private final ModelRenderer bone7;
	private final ModelRenderer left_door_rotate_90;
	private final ModelRenderer right_door_rotate_90;

	public TTCInteriorDoor() {
		textureWidth = 128;
		textureHeight = 128;

		boti = new ModelRenderer(this);
		boti.setRotationPoint(-8.0F, 0.0F, 7.0F);
		boti.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, 0.0F, 18.0F, 32.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 11.5F);


		frame = new ModelRenderer(this);
		frame.setRotationPoint(0.0F, 3.0F, 0.0F);
		bb_main.addChild(frame);


		roof = new ModelRenderer(this);
		roof.setRotationPoint(0.0F, -32.0F, 0.0F);
		frame.addChild(roof);
		roof.setTextureOffset(0, 33).addBox(-9.0F, -8.0F, -6.5F, 18.0F, 5.0F, 3.0F, 0.0F, false);

		walls = new ModelRenderer(this);
		walls.setRotationPoint(0.0F, 0.0F, 0.0F);
		frame.addChild(walls);


		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(3.0F, -3.0F, 9.0F);
		walls.addChild(bone22);


		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.0F, 0.0F, -9.0F);
		bone22.addChild(bone8);
		setRotationAngle(bone8, 0.0F, -1.5708F, 0.0F);
		bone8.setTextureOffset(16, 41).addBox(-6.5F, -32.0F, 7.0F, 2.0F, 32.0F, 2.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-3.0F, 0.0F, -9.0F);
		bone22.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 1.5708F, 0.0F);
		bone7.setTextureOffset(40, 40).addBox(4.5F, -32.0F, 7.0F, 2.0F, 32.0F, 2.0F, 0.0F, false);

		left_door_rotate_90 = new ModelRenderer(this);
		left_door_rotate_90.setRotationPoint(7.0F, -14.5F, -5.0F);
		bb_main.addChild(left_door_rotate_90);
		left_door_rotate_90.setTextureOffset(0, 41).addBox(-7.0F, -17.5F, -0.525F, 7.0F, 32.0F, 1.0F, 0.0F, false);

		right_door_rotate_90 = new ModelRenderer(this);
		right_door_rotate_90.setRotationPoint(-7.0F, -14.5F, -5.0F);
		bb_main.addChild(right_door_rotate_90);
		right_door_rotate_90.setTextureOffset(38, 0).addBox(0.0F, -17.5F, -0.525F, 7.0F, 32.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
					   int packedOverlay) {
		matrixStack.push();

		matrixStack.rotate(Vector3f.YP.rotationDegrees(180));
		matrixStack.translate(0, 0, 0.12);

		this.left_door_rotate_90.rotateAngleY = this.right_door_rotate_90.rotateAngleY = 0;
		float rot = (float)Math.toRadians(EnumDoorType.TT_CAPSULE.getRotationForState(door.getOpenState()));

		if(door.getOpenState() == EnumDoorState.ONE) {
			this.right_door_rotate_90.rotateAngleY = -rot;
			this.left_door_rotate_90.rotateAngleY = 0;
		}
		else {
			this.left_door_rotate_90.rotateAngleY = rot;
			this.right_door_rotate_90.rotateAngleY = -rot;
		}

		boti.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);

		matrixStack.pop();

	}

	@Override
	public ResourceLocation getTexture() {
		return TEXTURE;
	}
}