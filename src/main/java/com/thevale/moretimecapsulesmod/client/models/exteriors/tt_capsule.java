package com.thevale.moretimecapsulesmod.client.models.exteriors;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.TTCRender;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.enums.EnumMatterState;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;

public class tt_capsule extends ExteriorModel {
	private static float LIGHT = 0F;
	private static float ALPHA = 1F;
	private final ModelRenderer base;
	private final ModelRenderer Group1;
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer Group2;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer Group3;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer Group4;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer door;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer boti;
	private final ModelRenderer backing;
	private final ModelRenderer cube_r6;

	public tt_capsule() {
		textureWidth = 256;
		textureHeight = 256;

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Group1 = new ModelRenderer(this);
		Group1.setRotationPoint(0.0F, 0.0F, 0.0F);
		base.addChild(Group1);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group1.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -1.5708F, 0.0F);
		bone5.setTextureOffset(139, 122).addBox(-2.625F, -42.95F, 10.925F, 5.0F, 42.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group1.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -1.1781F, 0.0F);
		bone4.setTextureOffset(34, 72).addBox(-2.5F, -1.0F, -11.5F, 5.0F, 1.0F, 24.0F, 0.0F, false);
		bone4.setTextureOffset(34, 40).addBox(-2.5F, -51.0F, -11.5F, 5.0F, 8.0F, 24.0F, 0.0F, false);
		bone4.setTextureOffset(127, 122).addBox(-2.625F, -42.95F, 10.925F, 5.0F, 42.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group1.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -0.7854F, 0.0F);
		bone3.setTextureOffset(102, 97).addBox(-2.5F, -1.0F, -11.5F, 5.0F, 1.0F, 24.0F, 0.0F, false);
		bone3.setTextureOffset(0, 32).addBox(-2.5F, -51.0F, -11.5F, 5.0F, 8.0F, 24.0F, 0.0F, false);
		bone3.setTextureOffset(115, 122).addBox(-2.625F, -42.95F, 10.925F, 5.0F, 42.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group1.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -0.3927F, 0.0F);
		bone2.setTextureOffset(0, 45).addBox(-2.5F, -1.0F, 11.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(12, 32).addBox(-2.5F, -51.0F, 11.5F, 5.0F, 8.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(103, 122).addBox(-2.625F, -42.95F, 10.925F, 5.0F, 42.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group1.addChild(bone);
		bone.setTextureOffset(91, 121).addBox(-2.625F, -42.95F, 10.925F, 5.0F, 42.0F, 1.0F, 0.0F, false);

		Group2 = new ModelRenderer(this);
		Group2.setRotationPoint(0.0F, 0.0F, 0.0F);
		base.addChild(Group2);
		setRotationAngle(Group2, 0.0F, -1.5708F, 0.0F);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group2.addChild(bone6);
		setRotationAngle(bone6, 0.0F, -1.5708F, 0.0F);
		

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group2.addChild(bone7);
		setRotationAngle(bone7, 0.0F, -1.1781F, 0.0F);
		bone7.setTextureOffset(34, 43).addBox(-2.5F, -1.0F, 11.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone7.setTextureOffset(34, 21).addBox(-2.5F, -43.0F, 10.5F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		bone7.setTextureOffset(34, 9).addBox(-2.5F, -51.0F, 11.5F, 5.0F, 8.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group2.addChild(bone8);
		setRotationAngle(bone8, 0.0F, -0.7854F, 0.0F);
		bone8.setTextureOffset(102, 72).addBox(-2.5F, -1.0F, -11.5F, 5.0F, 1.0F, 24.0F, 0.0F, false);
		bone8.setTextureOffset(68, 0).addBox(-2.5F, -51.0F, -11.5F, 5.0F, 8.0F, 24.0F, 0.0F, false);
		bone8.setTextureOffset(0, 18).addBox(-2.5F, -43.0F, 10.5F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		bone8.setTextureOffset(82, 122).addBox(-0.625F, -42.95F, 10.925F, 3.0F, 42.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group2.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.3927F, 0.0F);
		bone9.setTextureOffset(12, 43).addBox(-2.5F, -1.0F, 11.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(34, 0).addBox(-2.5F, -51.0F, 11.5F, 5.0F, 8.0F, 1.0F, 0.0F, false);
		bone9.setTextureOffset(151, 122).addBox(-2.625F, -42.95F, 10.925F, 5.0F, 42.0F, 1.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group2.addChild(bone10);
		bone10.setTextureOffset(102, 40).addBox(-2.5F, -1.0F, -11.5F, 5.0F, 1.0F, 24.0F, 0.0F, false);
		bone10.setTextureOffset(34, 8).addBox(-2.5F, -51.0F, -11.5F, 5.0F, 8.0F, 24.0F, 0.0F, false);

		Group3 = new ModelRenderer(this);
		Group3.setRotationPoint(0.0F, 0.0F, 0.0F);
		base.addChild(Group3);
		setRotationAngle(Group3, 0.0F, 3.1416F, 0.0F);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group3.addChild(bone11);
		setRotationAngle(bone11, 0.0F, -1.5708F, 0.0F);
		bone11.setTextureOffset(58, 122).addBox(-2.625F, -42.95F, 10.925F, 5.0F, 42.0F, 1.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group3.addChild(bone12);
		setRotationAngle(bone12, 0.0F, -1.1781F, 0.0F);
		bone12.setTextureOffset(12, 21).addBox(-2.5F, -1.0F, 11.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(0, 9).addBox(-2.5F, -51.0F, 11.5F, 5.0F, 8.0F, 1.0F, 0.0F, false);
		bone12.setTextureOffset(46, 122).addBox(-2.625F, -42.95F, 10.925F, 5.0F, 42.0F, 1.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group3.addChild(bone13);
		setRotationAngle(bone13, 0.0F, -0.7854F, 0.0F);
		bone13.setTextureOffset(0, 43).addBox(-2.5F, -1.0F, 11.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(0, 0).addBox(-2.5F, -51.0F, 11.5F, 5.0F, 8.0F, 1.0F, 0.0F, false);
		bone13.setTextureOffset(0, 21).addBox(-2.5F, -43.0F, 10.5F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		bone13.setTextureOffset(24, 163).addBox(-2.625F, -42.95F, 10.925F, 3.0F, 42.0F, 1.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group3.addChild(bone14);
		setRotationAngle(bone14, 0.0F, -0.3927F, 0.0F);
		bone14.setTextureOffset(102, 8).addBox(-2.5F, -1.0F, -11.5F, 5.0F, 1.0F, 24.0F, 0.0F, false);
		bone14.setTextureOffset(34, 18).addBox(-2.5F, -43.0F, 10.5F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		bone14.setTextureOffset(0, 0).addBox(-2.5F, -51.0F, -11.5F, 5.0F, 8.0F, 24.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group3.addChild(bone15);
		bone15.setTextureOffset(34, 97).addBox(-2.5F, -1.0F, -11.5F, 5.0F, 1.0F, 24.0F, 0.0F, false);
		bone15.setTextureOffset(34, 40).addBox(-2.5F, -43.0F, 10.5F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		bone15.setTextureOffset(68, 64).addBox(-2.5F, -51.0F, -11.5F, 5.0F, 8.0F, 24.0F, 0.0F, false);

		Group4 = new ModelRenderer(this);
		Group4.setRotationPoint(0.0F, 0.0F, 0.0F);
		base.addChild(Group4);
		setRotationAngle(Group4, 0.0F, 1.5708F, 0.0F);
		

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group4.addChild(bone16);
		setRotationAngle(bone16, 0.0F, -1.5708F, 0.0F);
		bone16.setTextureOffset(12, 41).addBox(-2.5F, -1.0F, 11.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone16.setTextureOffset(0, 32).addBox(-2.5F, -51.0F, 11.5F, 5.0F, 8.0F, 1.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group4.addChild(bone17);
		setRotationAngle(bone17, 0.0F, -1.1781F, 0.0F);
		bone17.setTextureOffset(68, 96).addBox(-2.5F, -1.0F, -11.5F, 5.0F, 1.0F, 24.0F, 0.0F, false);
		bone17.setTextureOffset(68, 32).addBox(-2.5F, -51.0F, -11.5F, 5.0F, 8.0F, 24.0F, 0.0F, false);
		bone17.setTextureOffset(34, 122).addBox(-2.625F, -42.95F, 10.925F, 5.0F, 42.0F, 1.0F, 0.0F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group4.addChild(bone18);
		setRotationAngle(bone18, 0.0F, -0.7854F, 0.0F);
		bone18.setTextureOffset(0, 41).addBox(-2.5F, -1.0F, 11.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone18.setTextureOffset(12, 9).addBox(-2.5F, -51.0F, 11.5F, 5.0F, 8.0F, 1.0F, 0.0F, false);
		bone18.setTextureOffset(70, 122).addBox(-2.625F, -42.95F, 10.925F, 5.0F, 42.0F, 1.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group4.addChild(bone19);
		setRotationAngle(bone19, 0.0F, -0.3927F, 0.0F);
		bone19.setTextureOffset(0, 96).addBox(-2.5F, -1.0F, -11.5F, 5.0F, 1.0F, 24.0F, 0.0F, false);
		bone19.setTextureOffset(0, 64).addBox(-2.5F, -51.0F, -11.5F, 5.0F, 8.0F, 24.0F, 0.0F, false);
		bone19.setTextureOffset(160, 0).addBox(-2.625F, -42.95F, 10.925F, 5.0F, 42.0F, 1.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		Group4.addChild(bone20);
		bone20.setTextureOffset(12, 18).addBox(-2.5F, -1.0F, 11.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone20.setTextureOffset(12, 0).addBox(-2.5F, -51.0F, 11.5F, 5.0F, 8.0F, 1.0F, 0.0F, false);

		door = new ModelRenderer(this);
		door.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(door, 0.0F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		door.addChild(cube_r1);
		setRotationAngle(cube_r1, -3.1416F, 0.7854F, 3.1416F);
		cube_r1.setTextureOffset(163, 85).addBox(0.375F, -41.95F, 10.425F, 2.0F, 41.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		door.addChild(cube_r2);
		setRotationAngle(cube_r2, -3.1416F, 0.3927F, 3.1416F);
		cube_r2.setTextureOffset(12, 163).addBox(-2.625F, -41.95F, 10.425F, 5.0F, 41.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		door.addChild(cube_r3);
		setRotationAngle(cube_r3, -3.1416F, 0.0F, 3.1416F);
		cube_r3.setTextureOffset(0, 163).addBox(-2.625F, -41.95F, 10.425F, 5.0F, 41.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		door.addChild(cube_r4);
		setRotationAngle(cube_r4, -3.1416F, -0.3927F, 3.1416F);
		cube_r4.setTextureOffset(160, 43).addBox(-2.625F, -41.95F, 10.425F, 5.0F, 41.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		door.addChild(cube_r5);
		setRotationAngle(cube_r5, -3.1416F, -0.7854F, 3.1416F);
		cube_r5.setTextureOffset(163, 127).addBox(-2.475F, -41.95F, 10.425F, 2.0F, 41.0F, 1.0F, 0.0F, false);

		boti = new ModelRenderer(this);
		boti.setRotationPoint(0.0F, 24.0F, 0.0F);

		backing = new ModelRenderer(this);
		backing.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		boti.addChild(cube_r6);
		setRotationAngle(cube_r6, -3.1416F, 0.0F, 3.1416F);
		cube_r6.setTextureOffset(0, 121).addBox(-8.5F, -43.0F, 7.5F, 17.0F, 42.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		base.render(matrixStack, buffer, packedLight, packedOverlay);
		door.render(matrixStack, buffer, packedLight, packedOverlay);
		//boti.render(matrixStack, buffer, packedLight, packedOverlay);
		//backing.render(matrixStack, buffer, packedLight, packedOverlay);
		this.backing.showModel = false;
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(ExteriorTile tile, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
		EnumDoorState state = tile.getOpen();
		switch(state) {
			case ONE:
				this.door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.TT_CAPSULE.getRotationForState(EnumDoorState.ONE));
				break;
			case BOTH:
				this.door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.TT_CAPSULE.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.TT_CAPSULE.getRotationForState(EnumDoorState.CLOSED));
				break;
			default:
				break;
		}
		base.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		door.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		boti.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		//backing.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);

		LIGHT = tile.lightLevel;

		if (tile.getMatterState() != EnumMatterState.SOLID)
			ALPHA = tile.alpha;
		else ALPHA = 1F;

		if(tile.getNextDoorState() == EnumDoorState.BOTH) {
			if(tile.getBotiWorld() != null) {
				PortalInfo info = new PortalInfo();
				info.setPosition(tile.getPos());
				info.setWorldShell(tile.getBotiWorld());
				info.setTranslate(matrix -> {
					matrix.translate(-0.45, 1, 0.45);
					matrix.rotate(Vector3f.XP.rotationDegrees(0));
					matrix.rotate(Vector3f.YP.rotationDegrees(180));
					ExteriorRenderer.applyTransforms(matrix, tile);
				});
				info.setTranslatePortal(matrix -> {
					matrix.translate(-0.5, 1.5, -0.5);
					matrix.rotate(Vector3f.XP.rotationDegrees(180));
					matrix.rotate(Vector3f.YP.rotationDegrees(0));
					matrix.rotate(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(tile.getBotiWorld().getPortalDirection())));
				});

				info.setRenderPortal((matrix, buf) -> {
					matrix.push();
					matrix.scale(0.8F, 1F, 1F);
					this.boti.render(matrix, buf.getBuffer(RenderType.getEntityCutout(TTCRender.TEXTURE)), packedLight, packedOverlay);
					matrix.pop();
				});

				BOTIRenderer.addPortal(info);
			}
		}
		if(tile.getNextDoorState() == EnumDoorState.CLOSED) {
			if(tile.getBotiWorld() != null) {
				PortalInfo info = new PortalInfo();
				info.setPosition(tile.getPos());
				info.setWorldShell(tile.getBotiWorld());
				info.setTranslate(matrix -> {
					matrix.translate(-0.45, 1, 0.45);
					matrix.rotate(Vector3f.XP.rotationDegrees(0));
					matrix.rotate(Vector3f.YP.rotationDegrees(180));
					ExteriorRenderer.applyTransforms(matrix, tile);
				});
				info.setTranslatePortal(matrix -> {
					matrix.translate(0.5, 1.5, -0.5);
					matrix.rotate(Vector3f.XP.rotationDegrees(180));
					matrix.rotate(Vector3f.YP.rotationDegrees(0));
					matrix.rotate(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(tile.getBotiWorld().getPortalDirection())));
				});

				info.setRenderPortal((matrix, buf) -> {
					matrix.push();
					matrix.scale(0.8F, 1F, 1F);
					this.boti.render(matrix, buf.getBuffer(RenderType.getEntityCutout(TTCRender.TEXTURE)), packedLight, packedOverlay);
					matrix.pop();
				});

				BOTIRenderer.addPortal(info);
			}
		}
	}
}