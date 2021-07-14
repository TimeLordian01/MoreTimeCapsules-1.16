package com.thevale.moretimecapsulesmod.client.models.consoles;// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.tileentities.consoles.NewCoralConsoleTile;
import com.thevale.moretimecapsulesmod.tileentities.consoles.SmithConsoleTile;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.TileModel;
import net.tardis.mod.controls.*;
import net.tardis.mod.enums.EnumDoorState;

public class NewCoralConsole extends EntityModel<Entity> implements TileModel<NewCoralConsoleTile> {
	private final ModelRenderer Console;
	private final ModelRenderer Panels;
	private final ModelRenderer Panel1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Panel2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Panel3;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer Panel4;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer Panel5;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer Panel6;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer ConsoleRings;
	private final ModelRenderer LowerRing;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer UpperRing;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer Struts;
	private final ModelRenderer StrutSet1;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer StrutSet2;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer StrutSet3;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;
	private final ModelRenderer cube_r69;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer StrutSet4;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r78;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer StrutSet5;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;
	private final ModelRenderer cube_r96;
	private final ModelRenderer StrutSet6;
	private final ModelRenderer cube_r97;
	private final ModelRenderer cube_r98;
	private final ModelRenderer cube_r99;
	private final ModelRenderer cube_r100;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer Pipes;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer cube_r116;
	private final ModelRenderer cube_r117;
	private final ModelRenderer TimeRotor;
	private final ModelRenderer Casing;
	private final ModelRenderer CasingGlass12_r1;
	private final ModelRenderer CasingGlass11_r1;
	private final ModelRenderer CasingGlass10_r1;
	private final ModelRenderer CasingGlass9_r1;
	private final ModelRenderer CasingGlass8_r1;
	private final ModelRenderer CasingGlass7_r1;
	private final ModelRenderer CasingGlass6_r1;
	private final ModelRenderer CasingGlass5_r1;
	private final ModelRenderer CasingGlass4_r1;
	private final ModelRenderer CasingGlass3_r1;
	private final ModelRenderer CasingGlass2_r1;
	private final ModelRenderer InnerTimeRotor;
	private final ModelRenderer RodGlass4_r1;
	private final ModelRenderer RodGlass3_r1;
	private final ModelRenderer RodGlass2_r1;
	private final ModelRenderer MovingRingLower;
	private final ModelRenderer RotorRing_r1;
	private final ModelRenderer RotorRing_r2;
	private final ModelRenderer RotorRing_r3;
	private final ModelRenderer RotorRing_r4;
	private final ModelRenderer RotorRing_r5;
	private final ModelRenderer RotorRing_r6;
	private final ModelRenderer RotorRing_r7;
	private final ModelRenderer RotorRing_r8;
	private final ModelRenderer RotorRing_r9;
	private final ModelRenderer RotorRing_r10;
	private final ModelRenderer RotorRing_r11;
	private final ModelRenderer MovingRingUpper;
	private final ModelRenderer RotorRing_r12;
	private final ModelRenderer RotorRing_r13;
	private final ModelRenderer RotorRing_r14;
	private final ModelRenderer RotorRing_r15;
	private final ModelRenderer RotorRing_r16;
	private final ModelRenderer RotorRing_r17;
	private final ModelRenderer RotorRing_r18;
	private final ModelRenderer RotorRing_r19;
	private final ModelRenderer RotorRing_r20;
	private final ModelRenderer RotorRing_r21;
	private final ModelRenderer RotorRing_r22;
	private final ModelRenderer Controls;
	private final ModelRenderer Throttle;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;
	private final ModelRenderer HandleRot;
	private final ModelRenderer Handle_r1;
	private final ModelRenderer Random;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r126;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r129;
	private final ModelRenderer cube_r130;
	private final ModelRenderer cube_r131;
	private final ModelRenderer cube_r132;
	private final ModelRenderer Levers;
	private final ModelRenderer Lever1;
	private final ModelRenderer Wheel_r1;
	private final ModelRenderer cube_r133;
	private final ModelRenderer Lever1Rot;
	private final ModelRenderer cube_r134;
	private final ModelRenderer Lever2Rot;
	private final ModelRenderer cube_r135;
	private final ModelRenderer Lever2;
	private final ModelRenderer Wheel_r2;
	private final ModelRenderer cube_r136;
	private final ModelRenderer Lever1Rot2;
	private final ModelRenderer cube_r137;
	private final ModelRenderer Lever2Rot2;
	private final ModelRenderer cube_r138;
	private final ModelRenderer Float;
	private final ModelRenderer HandbreakRotation;
	private final ModelRenderer cube_r139;
	private final ModelRenderer Handbreak;
	private final ModelRenderer HandbreakRotation2;
	private final ModelRenderer cube_r140;
	private final ModelRenderer Handpumps;
	private final ModelRenderer pump1;
	private final ModelRenderer cube_r141;
	private final ModelRenderer pump2;
	private final ModelRenderer cube_r142;
	private final ModelRenderer pump3;
	private final ModelRenderer cube_r143;
	private final ModelRenderer pump4;
	private final ModelRenderer cube_r144;

	public NewCoralConsole() {
		textureWidth = 128;
		textureHeight = 128;

		Console = new ModelRenderer(this);
		Console.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Panels = new ModelRenderer(this);
		Panels.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(Panels);
		

		Panel1 = new ModelRenderer(this);
		Panel1.setRotationPoint(0.0F, 0.5F, 0.0F);
		Panels.addChild(Panel1);
		setRotationAngle(Panel1, 0.0F, -0.5236F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.5F, -15.439F, 4.0445F);
		Panel1.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(11, 41).addBox(-5.5F, 0.0F, -2.0F, 12.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.5F, -13.375F, 11.75F);
		Panel1.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(8, 33).addBox(-8.5F, 0.0F, -2.0F, 18.0F, 1.0F, 8.0F, 0.0F, false);

		Panel2 = new ModelRenderer(this);
		Panel2.setRotationPoint(0.0F, 0.5F, 0.0F);
		Panels.addChild(Panel2);
		setRotationAngle(Panel2, 0.0F, -1.5708F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.5F, -15.439F, 4.0445F);
		Panel2.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(11, 8).addBox(-5.5F, 0.0F, -2.0F, 12.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5F, -13.375F, 11.75F);
		Panel2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(8, 0).addBox(-8.5F, 0.0F, -2.0F, 18.0F, 1.0F, 8.0F, 0.0F, false);

		Panel3 = new ModelRenderer(this);
		Panel3.setRotationPoint(0.0F, 0.5F, 0.0F);
		Panels.addChild(Panel3);
		setRotationAngle(Panel3, 0.0F, -2.618F, 0.0F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.5F, -15.439F, 4.0445F);
		Panel3.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(11, 25).addBox(-5.5F, 0.0F, -2.0F, 12.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.5F, -13.375F, 11.75F);
		Panel3.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(8, 17).addBox(-8.5F, 0.0F, -2.0F, 18.0F, 1.0F, 8.0F, 0.0F, false);

		Panel4 = new ModelRenderer(this);
		Panel4.setRotationPoint(0.0F, 0.5F, 0.0F);
		Panels.addChild(Panel4);
		setRotationAngle(Panel4, 0.0F, 2.618F, 0.0F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.5F, -15.439F, 4.0445F);
		Panel4.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(10, 119).addBox(-5.5F, 0.0F, -2.0F, 12.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.5F, -13.375F, 11.75F);
		Panel4.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(7, 111).addBox(-8.5F, 0.0F, -2.0F, 18.0F, 1.0F, 8.0F, 0.0F, false);

		Panel5 = new ModelRenderer(this);
		Panel5.setRotationPoint(0.0F, 0.5F, 0.0F);
		Panels.addChild(Panel5);
		setRotationAngle(Panel5, 0.0F, 1.5708F, 0.0F);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.5F, -15.439F, 4.0445F);
		Panel5.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.2182F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(75, 57).addBox(-5.5F, 0.0F, -2.0F, 12.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.5F, -13.375F, 11.75F);
		Panel5.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(72, 49).addBox(-8.5F, 0.0F, -2.0F, 18.0F, 1.0F, 8.0F, 0.0F, false);

		Panel6 = new ModelRenderer(this);
		Panel6.setRotationPoint(0.0F, 0.5F, 0.0F);
		Panels.addChild(Panel6);
		setRotationAngle(Panel6, 0.0F, 0.5236F, 0.0F);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.5F, -15.439F, 4.0445F);
		Panel6.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(10, 119).addBox(-5.5F, 0.0F, -2.0F, 12.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.5F, -13.375F, 11.75F);
		Panel6.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.3927F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(72, 32).addBox(-8.5F, 0.0F, -2.0F, 18.0F, 1.0F, 8.0F, 0.0F, false);

		ConsoleRings = new ModelRenderer(this);
		ConsoleRings.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(ConsoleRings);
		

		LowerRing = new ModelRenderer(this);
		LowerRing.setRotationPoint(0.0F, 0.0F, 0.0F);
		ConsoleRings.addChild(LowerRing);
		LowerRing.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.15F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.2618F, 0.0F);
		cube_r13.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.14F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.5236F, 0.0F);
		cube_r14.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.15F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.7854F, 0.0F);
		cube_r15.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.14F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 1.0472F, 0.0F);
		cube_r16.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.15F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 1.309F, 0.0F);
		cube_r17.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.14F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 1.5708F, 0.0F);
		cube_r18.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.15F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 1.8326F, 0.0F);
		cube_r19.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.14F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 2.0944F, 0.0F);
		cube_r20.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.15F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 2.3562F, 0.0F);
		cube_r21.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.14F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 2.618F, 0.0F);
		cube_r22.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.15F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 2.8798F, 0.0F);
		cube_r23.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.14F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 3.1416F, 0.0F);
		cube_r24.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.15F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, -2.8798F, 0.0F);
		cube_r25.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.14F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, -2.618F, 0.0F);
		cube_r26.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.15F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, -2.3562F, 0.0F);
		cube_r27.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.14F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, -2.0944F, 0.0F);
		cube_r28.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.15F, false);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, -1.8326F, 0.0F);
		cube_r29.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.14F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, -1.5708F, 0.0F);
		cube_r30.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.15F, false);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, -1.309F, 0.0F);
		cube_r31.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.14F, false);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, -1.0472F, 0.0F);
		cube_r32.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.15F, false);

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, -0.7854F, 0.0F);
		cube_r33.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.14F, false);

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, -0.5236F, 0.0F);
		cube_r34.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.15F, false);

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
		LowerRing.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, -0.2618F, 0.0F);
		cube_r35.setTextureOffset(34, 83).addBox(-2.5F, -12.25F, 16.0F, 5.0F, 4.0F, 2.0F, -0.14F, false);

		UpperRing = new ModelRenderer(this);
		UpperRing.setRotationPoint(0.0F, 0.0F, 0.0F);
		ConsoleRings.addChild(UpperRing);
		UpperRing.setTextureOffset(12, 53).addBox(-1.5F, -16.0F, 3.625F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		UpperRing.setTextureOffset(8, 0).addBox(-1.5F, -19.5F, 3.625F, 3.0F, 4.0F, 1.0F, -0.375F, false);
		UpperRing.setTextureOffset(22, 58).addBox(-2.0F, -21.5F, 3.375F, 4.0F, 1.0F, 3.0F, -0.38F, false);
		UpperRing.setTextureOffset(22, 58).addBox(-2.0F, -19.75F, 3.625F, 4.0F, 1.0F, 3.0F, -0.32F, false);
		UpperRing.setTextureOffset(22, 58).addBox(-2.0F, -52.0F, 3.375F, 4.0F, 1.0F, 3.0F, -0.37F, false);
		UpperRing.setTextureOffset(22, 58).addBox(-2.0F, -53.5F, 3.625F, 4.0F, 1.0F, 3.0F, -0.31F, false);

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0F, 10.75F, 0.0F);
		UpperRing.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.5236F, 0.0F);
		cube_r36.setTextureOffset(22, 58).addBox(-2.0F, -64.25F, 3.625F, 4.0F, 1.0F, 3.0F, -0.32F, false);
		cube_r36.setTextureOffset(22, 58).addBox(-2.0F, -62.75F, 3.375F, 4.0F, 1.0F, 3.0F, -0.38F, false);
		cube_r36.setTextureOffset(22, 58).addBox(-2.0F, -30.5F, 3.625F, 4.0F, 1.0F, 3.0F, -0.3F, false);
		cube_r36.setTextureOffset(22, 58).addBox(-2.0F, -32.25F, 3.375F, 4.0F, 1.0F, 3.0F, -0.375F, false);
		cube_r36.setTextureOffset(8, 0).addBox(-1.5F, -30.25F, 3.625F, 3.0F, 4.0F, 1.0F, -0.375F, false);
		cube_r36.setTextureOffset(12, 53).addBox(-1.5F, -26.75F, 3.625F, 3.0F, 3.0F, 2.0F, 0.001F, false);

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.0F, 10.75F, 0.0F);
		UpperRing.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 1.0472F, 0.0F);
		cube_r37.setTextureOffset(22, 58).addBox(-2.0F, -64.25F, 3.625F, 4.0F, 1.0F, 3.0F, -0.31F, false);
		cube_r37.setTextureOffset(22, 58).addBox(-2.0F, -62.75F, 3.375F, 4.0F, 1.0F, 3.0F, -0.37F, false);
		cube_r37.setTextureOffset(22, 58).addBox(-2.0F, -30.5F, 3.625F, 4.0F, 1.0F, 3.0F, -0.32F, false);
		cube_r37.setTextureOffset(22, 58).addBox(-2.0F, -32.25F, 3.375F, 4.0F, 1.0F, 3.0F, -0.38F, false);
		cube_r37.setTextureOffset(8, 0).addBox(-1.5F, -30.25F, 3.625F, 3.0F, 4.0F, 1.0F, -0.375F, false);
		cube_r37.setTextureOffset(12, 53).addBox(-1.5F, -26.75F, 3.625F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0F, 10.75F, 0.0F);
		UpperRing.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 1.5708F, 0.0F);
		cube_r38.setTextureOffset(22, 58).addBox(-2.0F, -64.25F, 3.625F, 4.0F, 1.0F, 3.0F, -0.32F, false);
		cube_r38.setTextureOffset(22, 58).addBox(-2.0F, -62.75F, 3.375F, 4.0F, 1.0F, 3.0F, -0.38F, false);
		cube_r38.setTextureOffset(22, 58).addBox(-2.0F, -30.5F, 3.625F, 4.0F, 1.0F, 3.0F, -0.3F, false);
		cube_r38.setTextureOffset(22, 58).addBox(-2.0F, -32.25F, 3.375F, 4.0F, 1.0F, 3.0F, -0.375F, false);
		cube_r38.setTextureOffset(8, 0).addBox(-1.5F, -30.25F, 3.625F, 3.0F, 4.0F, 1.0F, -0.375F, false);
		cube_r38.setTextureOffset(12, 53).addBox(-1.5F, -26.75F, 3.625F, 3.0F, 3.0F, 2.0F, 0.001F, false);

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.0F, 10.75F, 0.0F);
		UpperRing.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 2.0944F, 0.0F);
		cube_r39.setTextureOffset(22, 58).addBox(-2.0F, -64.25F, 3.625F, 4.0F, 1.0F, 3.0F, -0.31F, false);
		cube_r39.setTextureOffset(22, 58).addBox(-2.0F, -62.75F, 3.375F, 4.0F, 1.0F, 3.0F, -0.37F, false);
		cube_r39.setTextureOffset(22, 58).addBox(-2.0F, -30.5F, 3.625F, 4.0F, 1.0F, 3.0F, -0.32F, false);
		cube_r39.setTextureOffset(22, 58).addBox(-2.0F, -32.25F, 3.375F, 4.0F, 1.0F, 3.0F, -0.38F, false);
		cube_r39.setTextureOffset(8, 0).addBox(-1.5F, -30.25F, 3.625F, 3.0F, 4.0F, 1.0F, -0.375F, false);
		cube_r39.setTextureOffset(12, 53).addBox(-1.5F, -26.75F, 3.625F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.0F, 10.75F, 0.0F);
		UpperRing.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 2.618F, 0.0F);
		cube_r40.setTextureOffset(22, 58).addBox(-2.0F, -64.25F, 3.625F, 4.0F, 1.0F, 3.0F, -0.32F, false);
		cube_r40.setTextureOffset(22, 58).addBox(-2.0F, -62.75F, 3.375F, 4.0F, 1.0F, 3.0F, -0.38F, false);
		cube_r40.setTextureOffset(22, 58).addBox(-2.0F, -30.5F, 3.625F, 4.0F, 1.0F, 3.0F, -0.3F, false);
		cube_r40.setTextureOffset(22, 58).addBox(-2.0F, -32.25F, 3.375F, 4.0F, 1.0F, 3.0F, -0.375F, false);
		cube_r40.setTextureOffset(8, 0).addBox(-1.5F, -30.25F, 3.625F, 3.0F, 4.0F, 1.0F, -0.375F, false);
		cube_r40.setTextureOffset(12, 53).addBox(-1.5F, -26.75F, 3.625F, 3.0F, 3.0F, 2.0F, 0.001F, false);

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.0F, 10.75F, 0.0F);
		UpperRing.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 3.1416F, 0.0F);
		cube_r41.setTextureOffset(22, 58).addBox(-2.0F, -64.25F, 3.625F, 4.0F, 1.0F, 3.0F, -0.31F, false);
		cube_r41.setTextureOffset(22, 58).addBox(-2.0F, -62.75F, 3.375F, 4.0F, 1.0F, 3.0F, -0.37F, false);
		cube_r41.setTextureOffset(22, 58).addBox(-2.0F, -30.5F, 3.625F, 4.0F, 1.0F, 3.0F, -0.32F, false);
		cube_r41.setTextureOffset(22, 58).addBox(-2.0F, -32.25F, 3.375F, 4.0F, 1.0F, 3.0F, -0.38F, false);
		cube_r41.setTextureOffset(8, 0).addBox(-1.5F, -30.25F, 3.625F, 3.0F, 4.0F, 1.0F, -0.375F, false);
		cube_r41.setTextureOffset(12, 53).addBox(-1.5F, -26.75F, 3.625F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(0.0F, 10.75F, 0.0F);
		UpperRing.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, -2.618F, 0.0F);
		cube_r42.setTextureOffset(22, 58).addBox(-2.0F, -64.25F, 3.625F, 4.0F, 1.0F, 3.0F, -0.32F, false);
		cube_r42.setTextureOffset(22, 58).addBox(-2.0F, -62.75F, 3.375F, 4.0F, 1.0F, 3.0F, -0.38F, false);
		cube_r42.setTextureOffset(22, 58).addBox(-2.0F, -30.5F, 3.625F, 4.0F, 1.0F, 3.0F, -0.3F, false);
		cube_r42.setTextureOffset(22, 58).addBox(-2.0F, -32.25F, 3.375F, 4.0F, 1.0F, 3.0F, -0.375F, false);
		cube_r42.setTextureOffset(8, 0).addBox(-1.5F, -30.25F, 3.625F, 3.0F, 4.0F, 1.0F, -0.375F, false);
		cube_r42.setTextureOffset(12, 53).addBox(-1.5F, -26.75F, 3.625F, 3.0F, 3.0F, 2.0F, 0.001F, false);

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.0F, 10.75F, 0.0F);
		UpperRing.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, -2.0944F, 0.0F);
		cube_r43.setTextureOffset(22, 58).addBox(-2.0F, -64.25F, 3.625F, 4.0F, 1.0F, 3.0F, -0.31F, false);
		cube_r43.setTextureOffset(22, 58).addBox(-2.0F, -62.75F, 3.375F, 4.0F, 1.0F, 3.0F, -0.37F, false);
		cube_r43.setTextureOffset(22, 58).addBox(-2.0F, -30.5F, 3.625F, 4.0F, 1.0F, 3.0F, -0.32F, false);
		cube_r43.setTextureOffset(22, 58).addBox(-2.0F, -32.25F, 3.375F, 4.0F, 1.0F, 3.0F, -0.38F, false);
		cube_r43.setTextureOffset(8, 0).addBox(-1.5F, -30.25F, 3.625F, 3.0F, 4.0F, 1.0F, -0.375F, false);
		cube_r43.setTextureOffset(12, 53).addBox(-1.5F, -26.75F, 3.625F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(0.0F, 10.75F, 0.0F);
		UpperRing.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, -1.5708F, 0.0F);
		cube_r44.setTextureOffset(22, 58).addBox(-2.0F, -64.25F, 3.625F, 4.0F, 1.0F, 3.0F, -0.32F, false);
		cube_r44.setTextureOffset(22, 58).addBox(-2.0F, -62.75F, 3.375F, 4.0F, 1.0F, 3.0F, -0.38F, false);
		cube_r44.setTextureOffset(22, 58).addBox(-2.0F, -30.5F, 3.625F, 4.0F, 1.0F, 3.0F, -0.3F, false);
		cube_r44.setTextureOffset(22, 58).addBox(-2.0F, -32.25F, 3.375F, 4.0F, 1.0F, 3.0F, -0.375F, false);
		cube_r44.setTextureOffset(8, 0).addBox(-1.5F, -30.25F, 3.625F, 3.0F, 4.0F, 1.0F, -0.375F, false);
		cube_r44.setTextureOffset(12, 53).addBox(-1.5F, -26.75F, 3.625F, 3.0F, 3.0F, 2.0F, 0.001F, false);

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.0F, 10.75F, 0.0F);
		UpperRing.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, -1.0472F, 0.0F);
		cube_r45.setTextureOffset(22, 58).addBox(-2.0F, -64.25F, 3.625F, 4.0F, 1.0F, 3.0F, -0.31F, false);
		cube_r45.setTextureOffset(22, 58).addBox(-2.0F, -62.75F, 3.375F, 4.0F, 1.0F, 3.0F, -0.37F, false);
		cube_r45.setTextureOffset(22, 58).addBox(-2.0F, -30.5F, 3.625F, 4.0F, 1.0F, 3.0F, -0.32F, false);
		cube_r45.setTextureOffset(22, 58).addBox(-2.0F, -32.25F, 3.375F, 4.0F, 1.0F, 3.0F, -0.38F, false);
		cube_r45.setTextureOffset(8, 0).addBox(-1.5F, -30.25F, 3.625F, 3.0F, 4.0F, 1.0F, -0.375F, false);
		cube_r45.setTextureOffset(12, 53).addBox(-1.5F, -26.75F, 3.625F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.0F, 10.75F, 0.0F);
		UpperRing.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, -0.5236F, 0.0F);
		cube_r46.setTextureOffset(22, 58).addBox(-2.0F, -64.25F, 3.625F, 4.0F, 1.0F, 3.0F, -0.32F, false);
		cube_r46.setTextureOffset(22, 58).addBox(-2.0F, -62.75F, 3.375F, 4.0F, 1.0F, 3.0F, -0.38F, false);
		cube_r46.setTextureOffset(22, 58).addBox(-2.0F, -30.5F, 3.625F, 4.0F, 1.0F, 3.0F, -0.3F, false);
		cube_r46.setTextureOffset(22, 58).addBox(-2.0F, -32.25F, 3.375F, 4.0F, 1.0F, 3.0F, -0.375F, false);
		cube_r46.setTextureOffset(8, 0).addBox(-1.5F, -30.25F, 3.625F, 3.0F, 4.0F, 1.0F, -0.375F, false);
		cube_r46.setTextureOffset(12, 53).addBox(-1.5F, -26.75F, 3.625F, 3.0F, 3.0F, 2.0F, 0.001F, false);

		Struts = new ModelRenderer(this);
		Struts.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(Struts);
		

		StrutSet1 = new ModelRenderer(this);
		StrutSet1.setRotationPoint(0.0F, -4.666F, 0.0F);
		Struts.addChild(StrutSet1);
		

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.5F, 0.0F, 12.676F);
		StrutSet1.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.48F, 0.0F, 0.0F);
		cube_r47.setTextureOffset(12, 64).addBox(-2.0F, -1.0F, -6.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.5F, -5.815F, 18.6851F);
		StrutSet1.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.9599F, 0.0F, 0.0F);
		cube_r48.setTextureOffset(12, 79).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.5F, -3.3737F, 17.3332F);
		StrutSet1.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.6981F, 0.0F, 0.0F);
		cube_r49.setTextureOffset(12, 74).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 2.0F, 3.0F, 0.001F, false);

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.5F, -9.887F, 7.1722F);
		StrutSet1.addChild(cube_r50);
		setRotationAngle(cube_r50, 3.1416F, 0.0F, 0.0F);
		cube_r50.setTextureOffset(34, 70).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.5F, -9.3734F, 12.0075F);
		StrutSet1.addChild(cube_r51);
		setRotationAngle(cube_r51, 3.0107F, 0.0F, 0.0F);
		cube_r51.setTextureOffset(53, 76).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 5.0F, 0.001F, false);

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.5F, -8.1624F, 15.5184F);
		StrutSet1.addChild(cube_r52);
		setRotationAngle(cube_r52, 2.7489F, 0.0F, 0.0F);
		cube_r52.setTextureOffset(56, 83).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.5F, -7.2948F, 16.9482F);
		StrutSet1.addChild(cube_r53);
		setRotationAngle(cube_r53, 2.4435F, 0.0F, 0.0F);
		cube_r53.setTextureOffset(26, 68).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.001F, false);

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.5F, -6.1636F, 17.704F);
		StrutSet1.addChild(cube_r54);
		setRotationAngle(cube_r54, 1.8762F, 0.0F, 0.0F);
		cube_r54.setTextureOffset(22, 79).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.5F, -3.3496F, 12.5102F);
		StrutSet1.addChild(cube_r55);
		setRotationAngle(cube_r55, 1.2654F, 0.0F, 0.0F);
		cube_r55.setTextureOffset(24, 75).addBox(-2.0F, 3.5F, 2.0F, 3.0F, 2.0F, 2.0F, 0.001F, false);

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.5F, 3.9924F, 7.5924F);
		StrutSet1.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.9163F, 0.0F, 0.0F);
		cube_r56.setTextureOffset(12, 58).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.001F, false);

		StrutSet2 = new ModelRenderer(this);
		StrutSet2.setRotationPoint(0.0F, -4.666F, 0.0F);
		Struts.addChild(StrutSet2);
		setRotationAngle(StrutSet2, 0.0F, -1.0472F, 0.0F);
		

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(0.5F, 0.0F, 12.676F);
		StrutSet2.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.48F, 0.0F, 0.0F);
		cube_r57.setTextureOffset(12, 64).addBox(-2.0F, -1.0F, -6.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.5F, -5.815F, 18.6851F);
		StrutSet2.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.9599F, 0.0F, 0.0F);
		cube_r58.setTextureOffset(12, 79).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(0.5F, -3.3737F, 17.3332F);
		StrutSet2.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.6981F, 0.0F, 0.0F);
		cube_r59.setTextureOffset(12, 74).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 2.0F, 3.0F, 0.001F, false);

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(0.5F, -9.887F, 7.1722F);
		StrutSet2.addChild(cube_r60);
		setRotationAngle(cube_r60, 3.1416F, 0.0F, 0.0F);
		cube_r60.setTextureOffset(34, 70).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.5F, -9.3734F, 12.0075F);
		StrutSet2.addChild(cube_r61);
		setRotationAngle(cube_r61, 3.0107F, 0.0F, 0.0F);
		cube_r61.setTextureOffset(49, 63).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 5.0F, 0.001F, false);

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(0.5F, -8.1624F, 15.5184F);
		StrutSet2.addChild(cube_r62);
		setRotationAngle(cube_r62, 2.7489F, 0.0F, 0.0F);
		cube_r62.setTextureOffset(44, 72).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.5F, -7.2948F, 16.9482F);
		StrutSet2.addChild(cube_r63);
		setRotationAngle(cube_r63, 2.4435F, 0.0F, 0.0F);
		cube_r63.setTextureOffset(54, 72).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.001F, false);

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(0.5F, -6.1636F, 17.704F);
		StrutSet2.addChild(cube_r64);
		setRotationAngle(cube_r64, 1.8762F, 0.0F, 0.0F);
		cube_r64.setTextureOffset(22, 79).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.5F, -3.3496F, 12.5102F);
		StrutSet2.addChild(cube_r65);
		setRotationAngle(cube_r65, 1.2654F, 0.0F, 0.0F);
		cube_r65.setTextureOffset(24, 75).addBox(-2.0F, 3.5F, 2.0F, 3.0F, 2.0F, 2.0F, 0.001F, false);

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(0.5F, 3.9924F, 7.5924F);
		StrutSet2.addChild(cube_r66);
		setRotationAngle(cube_r66, -0.9163F, 0.0F, 0.0F);
		cube_r66.setTextureOffset(12, 58).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.001F, false);

		StrutSet3 = new ModelRenderer(this);
		StrutSet3.setRotationPoint(0.0F, -4.666F, 0.0F);
		Struts.addChild(StrutSet3);
		setRotationAngle(StrutSet3, 0.0F, -2.0944F, 0.0F);
		

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(0.5F, 0.0F, 12.676F);
		StrutSet3.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.48F, 0.0F, 0.0F);
		cube_r67.setTextureOffset(12, 64).addBox(-2.0F, -1.0F, -6.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(0.5F, -5.815F, 18.6851F);
		StrutSet3.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.9599F, 0.0F, 0.0F);
		cube_r68.setTextureOffset(12, 79).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(0.5F, -3.3737F, 17.3332F);
		StrutSet3.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.6981F, 0.0F, 0.0F);
		cube_r69.setTextureOffset(12, 74).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 2.0F, 3.0F, 0.001F, false);

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(0.5F, -9.887F, 7.1722F);
		StrutSet3.addChild(cube_r70);
		setRotationAngle(cube_r70, 3.1416F, 0.0F, 0.0F);
		cube_r70.setTextureOffset(34, 70).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(0.5F, -9.3734F, 12.0075F);
		StrutSet3.addChild(cube_r71);
		setRotationAngle(cube_r71, 3.0107F, 0.0F, 0.0F);
		cube_r71.setTextureOffset(32, 76).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 5.0F, 0.001F, false);

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(0.5F, -8.1624F, 15.5184F);
		StrutSet3.addChild(cube_r72);
		setRotationAngle(cube_r72, 2.7489F, 0.0F, 0.0F);
		cube_r72.setTextureOffset(26, 62).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(0.5F, -7.2948F, 16.9482F);
		StrutSet3.addChild(cube_r73);
		setRotationAngle(cube_r73, 2.4435F, 0.0F, 0.0F);
		cube_r73.setTextureOffset(26, 68).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.001F, false);

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.5F, -6.1636F, 17.704F);
		StrutSet3.addChild(cube_r74);
		setRotationAngle(cube_r74, 1.8762F, 0.0F, 0.0F);
		cube_r74.setTextureOffset(22, 79).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(0.5F, -3.3496F, 12.5102F);
		StrutSet3.addChild(cube_r75);
		setRotationAngle(cube_r75, 1.2654F, 0.0F, 0.0F);
		cube_r75.setTextureOffset(24, 75).addBox(-2.0F, 3.5F, 2.0F, 3.0F, 2.0F, 2.0F, 0.001F, false);

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.5F, 3.9924F, 7.5924F);
		StrutSet3.addChild(cube_r76);
		setRotationAngle(cube_r76, -0.9163F, 0.0F, 0.0F);
		cube_r76.setTextureOffset(12, 58).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.001F, false);

		StrutSet4 = new ModelRenderer(this);
		StrutSet4.setRotationPoint(0.0F, -4.666F, 0.0F);
		Struts.addChild(StrutSet4);
		setRotationAngle(StrutSet4, 0.0F, 3.1416F, 0.0F);
		

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(0.5F, 0.0F, 12.676F);
		StrutSet4.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.48F, 0.0F, 0.0F);
		cube_r77.setTextureOffset(12, 64).addBox(-2.0F, -1.0F, -6.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(0.5F, -5.815F, 18.6851F);
		StrutSet4.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.9599F, 0.0F, 0.0F);
		cube_r78.setTextureOffset(12, 79).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(0.5F, -3.3737F, 17.3332F);
		StrutSet4.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.6981F, 0.0F, 0.0F);
		cube_r79.setTextureOffset(12, 74).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 2.0F, 3.0F, 0.001F, false);

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.5F, -9.887F, 7.1722F);
		StrutSet4.addChild(cube_r80);
		setRotationAngle(cube_r80, 3.1416F, 0.0F, 0.0F);
		cube_r80.setTextureOffset(34, 70).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.5F, -9.3734F, 12.0075F);
		StrutSet4.addChild(cube_r81);
		setRotationAngle(cube_r81, 3.0107F, 0.0F, 0.0F);
		cube_r81.setTextureOffset(32, 76).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 5.0F, 0.001F, false);

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.5F, -8.1624F, 15.5184F);
		StrutSet4.addChild(cube_r82);
		setRotationAngle(cube_r82, 2.7489F, 0.0F, 0.0F);
		cube_r82.setTextureOffset(40, 62).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.5F, -7.2948F, 16.9482F);
		StrutSet4.addChild(cube_r83);
		setRotationAngle(cube_r83, 2.4435F, 0.0F, 0.0F);
		cube_r83.setTextureOffset(26, 68).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.001F, false);

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.5F, -6.1636F, 17.704F);
		StrutSet4.addChild(cube_r84);
		setRotationAngle(cube_r84, 1.8762F, 0.0F, 0.0F);
		cube_r84.setTextureOffset(22, 79).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.5F, -3.3496F, 12.5102F);
		StrutSet4.addChild(cube_r85);
		setRotationAngle(cube_r85, 1.2654F, 0.0F, 0.0F);
		cube_r85.setTextureOffset(24, 75).addBox(-2.0F, 3.5F, 2.0F, 3.0F, 2.0F, 2.0F, 0.001F, false);

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.5F, 3.9924F, 7.5924F);
		StrutSet4.addChild(cube_r86);
		setRotationAngle(cube_r86, -0.9163F, 0.0F, 0.0F);
		cube_r86.setTextureOffset(12, 58).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.001F, false);

		StrutSet5 = new ModelRenderer(this);
		StrutSet5.setRotationPoint(0.0F, -4.666F, 0.0F);
		Struts.addChild(StrutSet5);
		setRotationAngle(StrutSet5, 0.0F, 2.0944F, 0.0F);
		

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.5F, 0.0F, 12.676F);
		StrutSet5.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.48F, 0.0F, 0.0F);
		cube_r87.setTextureOffset(12, 64).addBox(-2.0F, -1.0F, -6.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.5F, -5.815F, 18.6851F);
		StrutSet5.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.9599F, 0.0F, 0.0F);
		cube_r88.setTextureOffset(12, 79).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.5F, -3.3737F, 17.3332F);
		StrutSet5.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.6981F, 0.0F, 0.0F);
		cube_r89.setTextureOffset(12, 74).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 2.0F, 3.0F, 0.001F, false);

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.5F, -9.887F, 7.1722F);
		StrutSet5.addChild(cube_r90);
		setRotationAngle(cube_r90, 3.1416F, 0.0F, 0.0F);
		cube_r90.setTextureOffset(34, 70).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.5F, -9.3734F, 12.0075F);
		StrutSet5.addChild(cube_r91);
		setRotationAngle(cube_r91, 3.0107F, 0.0F, 0.0F);
		cube_r91.setTextureOffset(49, 63).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 5.0F, 0.001F, false);

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.5F, -8.1624F, 15.5184F);
		StrutSet5.addChild(cube_r92);
		setRotationAngle(cube_r92, 2.7489F, 0.0F, 0.0F);
		cube_r92.setTextureOffset(44, 72).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.5F, -7.2948F, 16.9482F);
		StrutSet5.addChild(cube_r93);
		setRotationAngle(cube_r93, 2.4435F, 0.0F, 0.0F);
		cube_r93.setTextureOffset(26, 68).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.001F, false);

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.5F, -6.1636F, 17.704F);
		StrutSet5.addChild(cube_r94);
		setRotationAngle(cube_r94, 1.8762F, 0.0F, 0.0F);
		cube_r94.setTextureOffset(22, 79).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.5F, -3.3496F, 12.5102F);
		StrutSet5.addChild(cube_r95);
		setRotationAngle(cube_r95, 1.2654F, 0.0F, 0.0F);
		cube_r95.setTextureOffset(24, 75).addBox(-2.0F, 3.5F, 2.0F, 3.0F, 2.0F, 2.0F, 0.001F, false);

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.5F, 3.9924F, 7.5924F);
		StrutSet5.addChild(cube_r96);
		setRotationAngle(cube_r96, -0.9163F, 0.0F, 0.0F);
		cube_r96.setTextureOffset(12, 58).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.001F, false);

		StrutSet6 = new ModelRenderer(this);
		StrutSet6.setRotationPoint(0.0F, -4.666F, 0.0F);
		Struts.addChild(StrutSet6);
		setRotationAngle(StrutSet6, 0.0F, 1.0472F, 0.0F);
		

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.5F, 0.0F, 12.676F);
		StrutSet6.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.48F, 0.0F, 0.0F);
		cube_r97.setTextureOffset(12, 64).addBox(-2.0F, -1.0F, -6.0F, 3.0F, 2.0F, 8.0F, 0.0F, false);

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.5F, -5.815F, 18.6851F);
		StrutSet6.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.9599F, 0.0F, 0.0F);
		cube_r98.setTextureOffset(12, 79).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(0.5F, -3.3737F, 17.3332F);
		StrutSet6.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.6981F, 0.0F, 0.0F);
		cube_r99.setTextureOffset(12, 74).addBox(-2.0F, -1.0F, -4.0F, 3.0F, 2.0F, 3.0F, 0.001F, false);

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(0.5F, -9.887F, 7.1722F);
		StrutSet6.addChild(cube_r100);
		setRotationAngle(cube_r100, 3.1416F, 0.0F, 0.0F);
		cube_r100.setTextureOffset(34, 70).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(0.5F, -9.3734F, 12.0075F);
		StrutSet6.addChild(cube_r101);
		setRotationAngle(cube_r101, 3.0107F, 0.0F, 0.0F);
		cube_r101.setTextureOffset(31, 49).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 5.0F, 0.001F, false);

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(0.5F, -8.1624F, 15.5184F);
		StrutSet6.addChild(cube_r102);
		setRotationAngle(cube_r102, 2.7489F, 0.0F, 0.0F);
		cube_r102.setTextureOffset(43, 55).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(0.5F, -7.2948F, 16.9482F);
		StrutSet6.addChild(cube_r103);
		setRotationAngle(cube_r103, 2.4435F, 0.0F, 0.0F);
		cube_r103.setTextureOffset(33, 56).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.001F, false);

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(0.5F, -6.1636F, 17.704F);
		StrutSet6.addChild(cube_r104);
		setRotationAngle(cube_r104, 1.8762F, 0.0F, 0.0F);
		cube_r104.setTextureOffset(22, 79).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(0.5F, -3.3496F, 12.5102F);
		StrutSet6.addChild(cube_r105);
		setRotationAngle(cube_r105, 1.2654F, 0.0F, 0.0F);
		cube_r105.setTextureOffset(24, 75).addBox(-2.0F, 3.5F, 2.0F, 3.0F, 2.0F, 2.0F, 0.001F, false);

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(0.5F, 3.9924F, 7.5924F);
		StrutSet6.addChild(cube_r106);
		setRotationAngle(cube_r106, -0.9163F, 0.0F, 0.0F);
		cube_r106.setTextureOffset(12, 58).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.001F, false);

		Pipes = new ModelRenderer(this);
		Pipes.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(Pipes);
		Pipes.setTextureOffset(12, 83).addBox(-4.5F, -9.125F, 14.75F, 9.0F, 2.0F, 2.0F, 0.01F, false);
		Pipes.setTextureOffset(12, 87).addBox(-4.0F, -7.125F, 13.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		Pipes.setTextureOffset(18, 91).addBox(-3.5F, -6.125F, 11.0F, 7.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.0F, 0.5236F, 0.0F);
		cube_r107.setTextureOffset(12, 87).addBox(-4.0F, -7.125F, 13.0F, 8.0F, 2.0F, 2.0F, 0.01F, false);
		cube_r107.setTextureOffset(12, 83).addBox(-4.5F, -9.125F, 14.75F, 9.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r107.setTextureOffset(18, 91).addBox(-3.5F, -6.125F, 11.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.0F, 1.0472F, 0.0F);
		cube_r108.setTextureOffset(12, 87).addBox(-4.0F, -7.125F, 13.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r108.setTextureOffset(12, 83).addBox(-4.5F, -9.125F, 14.75F, 9.0F, 2.0F, 2.0F, 0.01F, false);
		cube_r108.setTextureOffset(18, 91).addBox(-3.5F, -6.125F, 11.0F, 7.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(cube_r109);
		setRotationAngle(cube_r109, 0.0F, 1.5708F, 0.0F);
		cube_r109.setTextureOffset(12, 87).addBox(-4.0F, -7.125F, 13.0F, 8.0F, 2.0F, 2.0F, 0.01F, false);
		cube_r109.setTextureOffset(12, 83).addBox(-4.5F, -9.125F, 14.75F, 9.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r109.setTextureOffset(18, 91).addBox(-3.5F, -6.125F, 11.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.0F, 2.0944F, 0.0F);
		cube_r110.setTextureOffset(12, 87).addBox(-4.0F, -7.125F, 13.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r110.setTextureOffset(12, 83).addBox(-4.5F, -9.125F, 14.75F, 9.0F, 2.0F, 2.0F, 0.01F, false);
		cube_r110.setTextureOffset(18, 91).addBox(-3.5F, -6.125F, 11.0F, 7.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.0F, 2.618F, 0.0F);
		cube_r111.setTextureOffset(12, 87).addBox(-4.0F, -7.125F, 13.0F, 8.0F, 2.0F, 2.0F, 0.01F, false);
		cube_r111.setTextureOffset(12, 83).addBox(-4.5F, -9.125F, 14.75F, 9.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r111.setTextureOffset(18, 91).addBox(-3.5F, -6.125F, 11.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.0F, 3.1416F, 0.0F);
		cube_r112.setTextureOffset(12, 87).addBox(-4.0F, -7.125F, 13.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r112.setTextureOffset(12, 83).addBox(-4.5F, -9.125F, 14.75F, 9.0F, 2.0F, 2.0F, 0.01F, false);
		cube_r112.setTextureOffset(18, 91).addBox(-3.5F, -6.125F, 11.0F, 7.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.0F, -2.618F, 0.0F);
		cube_r113.setTextureOffset(12, 87).addBox(-4.0F, -7.125F, 13.0F, 8.0F, 2.0F, 2.0F, 0.01F, false);
		cube_r113.setTextureOffset(12, 83).addBox(-4.5F, -9.125F, 14.75F, 9.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r113.setTextureOffset(18, 91).addBox(-3.5F, -6.125F, 11.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.0F, -2.0944F, 0.0F);
		cube_r114.setTextureOffset(12, 87).addBox(-4.0F, -7.125F, 13.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r114.setTextureOffset(12, 83).addBox(-4.5F, -9.125F, 14.75F, 9.0F, 2.0F, 2.0F, 0.01F, false);
		cube_r114.setTextureOffset(18, 91).addBox(-3.5F, -6.125F, 11.0F, 7.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(cube_r115);
		setRotationAngle(cube_r115, 0.0F, -1.5708F, 0.0F);
		cube_r115.setTextureOffset(12, 87).addBox(-4.0F, -7.125F, 13.0F, 8.0F, 2.0F, 2.0F, 0.01F, false);
		cube_r115.setTextureOffset(12, 83).addBox(-4.5F, -9.125F, 14.75F, 9.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r115.setTextureOffset(18, 91).addBox(-3.5F, -6.125F, 11.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.0F, -1.0472F, 0.0F);
		cube_r116.setTextureOffset(12, 87).addBox(-4.0F, -7.125F, 13.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r116.setTextureOffset(12, 83).addBox(-4.5F, -9.125F, 14.75F, 9.0F, 2.0F, 2.0F, 0.01F, false);
		cube_r116.setTextureOffset(18, 91).addBox(-3.5F, -6.125F, 11.0F, 7.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.0F, -0.5236F, 0.0F);
		cube_r117.setTextureOffset(12, 87).addBox(-4.0F, -7.125F, 13.0F, 8.0F, 2.0F, 2.0F, 0.01F, false);
		cube_r117.setTextureOffset(12, 83).addBox(-4.5F, -9.125F, 14.75F, 9.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r117.setTextureOffset(18, 91).addBox(-3.5F, -6.125F, 11.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);

		TimeRotor = new ModelRenderer(this);
		TimeRotor.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Casing = new ModelRenderer(this);
		Casing.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotor.addChild(Casing);
		Casing.setTextureOffset(0, 0).addBox(-1.5F, -54.0F, 3.5F, 3.0F, 54.0F, 1.0F, -0.38F, false);

		CasingGlass12_r1 = new ModelRenderer(this);
		CasingGlass12_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Casing.addChild(CasingGlass12_r1);
		setRotationAngle(CasingGlass12_r1, 0.0F, 0.5236F, 0.0F);
		CasingGlass12_r1.setTextureOffset(0, 0).addBox(-1.5F, -54.0F, 3.5F, 3.0F, 54.0F, 1.0F, -0.38F, false);

		CasingGlass11_r1 = new ModelRenderer(this);
		CasingGlass11_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Casing.addChild(CasingGlass11_r1);
		setRotationAngle(CasingGlass11_r1, 0.0F, 1.0472F, 0.0F);
		CasingGlass11_r1.setTextureOffset(0, 0).addBox(-1.5F, -54.0F, 3.5F, 3.0F, 54.0F, 1.0F, -0.38F, false);

		CasingGlass10_r1 = new ModelRenderer(this);
		CasingGlass10_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Casing.addChild(CasingGlass10_r1);
		setRotationAngle(CasingGlass10_r1, 0.0F, 1.5708F, 0.0F);
		CasingGlass10_r1.setTextureOffset(0, 0).addBox(-1.5F, -54.0F, 3.5F, 3.0F, 54.0F, 1.0F, -0.38F, false);

		CasingGlass9_r1 = new ModelRenderer(this);
		CasingGlass9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Casing.addChild(CasingGlass9_r1);
		setRotationAngle(CasingGlass9_r1, 0.0F, 2.0944F, 0.0F);
		CasingGlass9_r1.setTextureOffset(0, 0).addBox(-1.5F, -54.0F, 3.5F, 3.0F, 54.0F, 1.0F, -0.38F, false);

		CasingGlass8_r1 = new ModelRenderer(this);
		CasingGlass8_r1.setRotationPoint(0.0F, -1.5F, 0.0F);
		Casing.addChild(CasingGlass8_r1);
		setRotationAngle(CasingGlass8_r1, 0.0F, 2.618F, 0.0F);
		CasingGlass8_r1.setTextureOffset(0, 0).addBox(-1.5F, -52.5F, 3.5F, 3.0F, 54.0F, 1.0F, -0.38F, false);

		CasingGlass7_r1 = new ModelRenderer(this);
		CasingGlass7_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Casing.addChild(CasingGlass7_r1);
		setRotationAngle(CasingGlass7_r1, 0.0F, 3.1416F, 0.0F);
		CasingGlass7_r1.setTextureOffset(0, 0).addBox(-1.5F, -54.0F, 3.5F, 3.0F, 54.0F, 1.0F, -0.38F, false);

		CasingGlass6_r1 = new ModelRenderer(this);
		CasingGlass6_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Casing.addChild(CasingGlass6_r1);
		setRotationAngle(CasingGlass6_r1, 0.0F, -2.618F, 0.0F);
		CasingGlass6_r1.setTextureOffset(0, 0).addBox(-1.5F, -54.0F, 3.5F, 3.0F, 54.0F, 1.0F, -0.38F, false);

		CasingGlass5_r1 = new ModelRenderer(this);
		CasingGlass5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Casing.addChild(CasingGlass5_r1);
		setRotationAngle(CasingGlass5_r1, 0.0F, -2.0944F, 0.0F);
		CasingGlass5_r1.setTextureOffset(0, 0).addBox(-1.5F, -54.0F, 3.5F, 3.0F, 54.0F, 1.0F, -0.38F, false);

		CasingGlass4_r1 = new ModelRenderer(this);
		CasingGlass4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Casing.addChild(CasingGlass4_r1);
		setRotationAngle(CasingGlass4_r1, 0.0F, -1.5708F, 0.0F);
		CasingGlass4_r1.setTextureOffset(0, 0).addBox(-1.5F, -54.0F, 3.5F, 3.0F, 54.0F, 1.0F, -0.38F, false);

		CasingGlass3_r1 = new ModelRenderer(this);
		CasingGlass3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Casing.addChild(CasingGlass3_r1);
		setRotationAngle(CasingGlass3_r1, 0.0F, -1.0472F, 0.0F);
		CasingGlass3_r1.setTextureOffset(0, 0).addBox(-1.5F, -54.0F, 3.5F, 3.0F, 54.0F, 1.0F, -0.38F, false);

		CasingGlass2_r1 = new ModelRenderer(this);
		CasingGlass2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Casing.addChild(CasingGlass2_r1);
		setRotationAngle(CasingGlass2_r1, 0.0F, -0.5236F, 0.0F);
		CasingGlass2_r1.setTextureOffset(0, 0).addBox(-1.5F, -54.0F, 3.5F, 3.0F, 54.0F, 1.0F, -0.38F, false);

		InnerTimeRotor = new ModelRenderer(this);
		InnerTimeRotor.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotor.addChild(InnerTimeRotor);
		

		RodGlass4_r1 = new ModelRenderer(this);
		RodGlass4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerTimeRotor.addChild(RodGlass4_r1);
		setRotationAngle(RodGlass4_r1, 0.0F, -3.1416F, 0.0F);
		RodGlass4_r1.setTextureOffset(0, 55).addBox(-1.5F, -54.0F, -3.5F, 3.0F, 54.0F, 3.0F, -0.38F, false);

		RodGlass3_r1 = new ModelRenderer(this);
		RodGlass3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerTimeRotor.addChild(RodGlass3_r1);
		setRotationAngle(RodGlass3_r1, 0.0F, 1.5708F, 0.0F);
		RodGlass3_r1.setTextureOffset(0, 55).addBox(-1.5F, -54.0F, -3.5F, 3.0F, 54.0F, 3.0F, -0.38F, false);
		RodGlass3_r1.setTextureOffset(0, 55).addBox(-1.5F, -54.0F, 0.5F, 3.0F, 54.0F, 3.0F, -0.38F, false);

		RodGlass2_r1 = new ModelRenderer(this);
		RodGlass2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerTimeRotor.addChild(RodGlass2_r1);
		setRotationAngle(RodGlass2_r1, 0.0F, 3.1416F, 0.0F);
		RodGlass2_r1.setTextureOffset(0, 55).addBox(-1.5F, -54.0F, 0.5F, 3.0F, 54.0F, 3.0F, -0.38F, false);

		MovingRingLower = new ModelRenderer(this);
		MovingRingLower.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerTimeRotor.addChild(MovingRingLower);
		MovingRingLower.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		MovingRingLower.setTextureOffset(0, 112).addBox(-1.5F, -25.75F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r1 = new ModelRenderer(this);
		RotorRing_r1.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingLower.addChild(RotorRing_r1);
		setRotationAngle(RotorRing_r1, 0.0F, 2.0944F, 0.0F);
		RotorRing_r1.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r1.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r2 = new ModelRenderer(this);
		RotorRing_r2.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingLower.addChild(RotorRing_r2);
		setRotationAngle(RotorRing_r2, 0.0F, 1.5708F, 0.0F);
		RotorRing_r2.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r2.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r3 = new ModelRenderer(this);
		RotorRing_r3.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingLower.addChild(RotorRing_r3);
		setRotationAngle(RotorRing_r3, 0.0F, 1.0472F, 0.0F);
		RotorRing_r3.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r3.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r4 = new ModelRenderer(this);
		RotorRing_r4.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingLower.addChild(RotorRing_r4);
		setRotationAngle(RotorRing_r4, 0.0F, 0.5236F, 0.0F);
		RotorRing_r4.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r4.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r5 = new ModelRenderer(this);
		RotorRing_r5.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingLower.addChild(RotorRing_r5);
		setRotationAngle(RotorRing_r5, 0.0F, -0.5236F, 0.0F);
		RotorRing_r5.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r5.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r6 = new ModelRenderer(this);
		RotorRing_r6.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingLower.addChild(RotorRing_r6);
		setRotationAngle(RotorRing_r6, 0.0F, -1.0472F, 0.0F);
		RotorRing_r6.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r6.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r7 = new ModelRenderer(this);
		RotorRing_r7.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingLower.addChild(RotorRing_r7);
		setRotationAngle(RotorRing_r7, 0.0F, -1.5708F, 0.0F);
		RotorRing_r7.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r7.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r8 = new ModelRenderer(this);
		RotorRing_r8.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingLower.addChild(RotorRing_r8);
		setRotationAngle(RotorRing_r8, 0.0F, -2.0944F, 0.0F);
		RotorRing_r8.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r8.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r9 = new ModelRenderer(this);
		RotorRing_r9.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingLower.addChild(RotorRing_r9);
		setRotationAngle(RotorRing_r9, 0.0F, -2.618F, 0.0F);
		RotorRing_r9.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r9.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r10 = new ModelRenderer(this);
		RotorRing_r10.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingLower.addChild(RotorRing_r10);
		setRotationAngle(RotorRing_r10, 0.0F, 3.1416F, 0.0F);
		RotorRing_r10.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r10.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r11 = new ModelRenderer(this);
		RotorRing_r11.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingLower.addChild(RotorRing_r11);
		setRotationAngle(RotorRing_r11, 0.0F, 2.618F, 0.0F);
		RotorRing_r11.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r11.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		MovingRingUpper = new ModelRenderer(this);
		MovingRingUpper.setRotationPoint(0.0F, -24.0F, 0.0F);
		InnerTimeRotor.addChild(MovingRingUpper);
		MovingRingUpper.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		MovingRingUpper.setTextureOffset(0, 112).addBox(-1.5F, -25.75F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r12 = new ModelRenderer(this);
		RotorRing_r12.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingUpper.addChild(RotorRing_r12);
		setRotationAngle(RotorRing_r12, 0.0F, 2.0944F, 0.0F);
		RotorRing_r12.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r12.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r13 = new ModelRenderer(this);
		RotorRing_r13.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingUpper.addChild(RotorRing_r13);
		setRotationAngle(RotorRing_r13, 0.0F, 1.5708F, 0.0F);
		RotorRing_r13.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r13.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r14 = new ModelRenderer(this);
		RotorRing_r14.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingUpper.addChild(RotorRing_r14);
		setRotationAngle(RotorRing_r14, 0.0F, 1.0472F, 0.0F);
		RotorRing_r14.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r14.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r15 = new ModelRenderer(this);
		RotorRing_r15.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingUpper.addChild(RotorRing_r15);
		setRotationAngle(RotorRing_r15, 0.0F, 0.5236F, 0.0F);
		RotorRing_r15.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r15.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r16 = new ModelRenderer(this);
		RotorRing_r16.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingUpper.addChild(RotorRing_r16);
		setRotationAngle(RotorRing_r16, 0.0F, -0.5236F, 0.0F);
		RotorRing_r16.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r16.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r17 = new ModelRenderer(this);
		RotorRing_r17.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingUpper.addChild(RotorRing_r17);
		setRotationAngle(RotorRing_r17, 0.0F, -1.0472F, 0.0F);
		RotorRing_r17.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r17.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r18 = new ModelRenderer(this);
		RotorRing_r18.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingUpper.addChild(RotorRing_r18);
		setRotationAngle(RotorRing_r18, 0.0F, -1.5708F, 0.0F);
		RotorRing_r18.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r18.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r19 = new ModelRenderer(this);
		RotorRing_r19.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingUpper.addChild(RotorRing_r19);
		setRotationAngle(RotorRing_r19, 0.0F, -2.0944F, 0.0F);
		RotorRing_r19.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r19.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r20 = new ModelRenderer(this);
		RotorRing_r20.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingUpper.addChild(RotorRing_r20);
		setRotationAngle(RotorRing_r20, 0.0F, -2.618F, 0.0F);
		RotorRing_r20.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r20.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r21 = new ModelRenderer(this);
		RotorRing_r21.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingUpper.addChild(RotorRing_r21);
		setRotationAngle(RotorRing_r21, 0.0F, 3.1416F, 0.0F);
		RotorRing_r21.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r21.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		RotorRing_r22 = new ModelRenderer(this);
		RotorRing_r22.setRotationPoint(0.0F, -1.75F, 0.0F);
		MovingRingUpper.addChild(RotorRing_r22);
		setRotationAngle(RotorRing_r22, 0.0F, 2.618F, 0.0F);
		RotorRing_r22.setTextureOffset(0, 112).addBox(-1.5F, -24.0F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);
		RotorRing_r22.setTextureOffset(0, 112).addBox(-1.5F, -22.25F, 1.375F, 3.0F, 2.0F, 3.0F, -0.45F, false);

		Controls = new ModelRenderer(this);
		Controls.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Throttle = new ModelRenderer(this);
		Throttle.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(Throttle);
		

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(0.0F, -14.75F, 0.0F);
		Throttle.addChild(cube_r118);
		setRotationAngle(cube_r118, 0.5236F, 1.0472F, 0.0F);
		cube_r118.setTextureOffset(20, 102).addBox(-1.0F, -7.625F, -15.375F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(-0.25F, -14.75F, -11.5F);
		Throttle.addChild(cube_r119);
		setRotationAngle(cube_r119, 0.1309F, 0.0F, 0.0F);
		cube_r119.setTextureOffset(12, 95).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		HandleRot = new ModelRenderer(this);
		HandleRot.setRotationPoint(1.0F, -15.0F, -11.0F);
		Throttle.addChild(HandleRot);
		

		Handle_r1 = new ModelRenderer(this);
		Handle_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		HandleRot.addChild(Handle_r1);
		setRotationAngle(Handle_r1, -0.3927F, 0.0F, 0.0F);
		Handle_r1.setTextureOffset(26, 98).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, -0.25F, false);

		Random = new ModelRenderer(this);
		Random.setRotationPoint(-7.5777F, -15.5F, -4.375F);
		Controls.addChild(Random);
		

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(0.0F, 0.0F, 0.0F);
		Random.addChild(cube_r120);
		setRotationAngle(cube_r120, 0.096F, 1.0472F, 0.0F);
		cube_r120.setTextureOffset(12, 105).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(7.5777F, 15.5F, 4.375F);
		Random.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.3316F, 2.3387F, 0.0F);
		cube_r121.setTextureOffset(36, 63).addBox(-1.0F, -16.75F, -10.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(7.5777F, 15.5F, 4.375F);
		Random.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.2618F, -1.5708F, 0.0F);
		cube_r122.setTextureOffset(47, 51).addBox(-2.0F, -16.5F, -7.0F, 1.0F, 1.0F, 3.0F, -0.125F, false);

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(7.5777F, 15.5F, 4.375F);
		Random.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.2618F, -2.618F, 0.0F);
		cube_r123.setTextureOffset(37, 60).addBox(-1.0F, -16.5F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(7.5777F, 15.5F, 4.375F);
		Random.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.2618F, 0.3927F, 0.0F);
		cube_r124.setTextureOffset(37, 60).addBox(-1.0F, -16.75F, -7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(7.5777F, 15.5F, 4.375F);
		Random.addChild(cube_r125);
		setRotationAngle(cube_r125, 0.2182F, 3.1416F, 0.0F);
		cube_r125.setTextureOffset(54, 56).addBox(-1.0F, -17.875F, -12.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(7.5777F, 15.5F, 4.375F);
		Random.addChild(cube_r126);
		setRotationAngle(cube_r126, 0.1222F, -1.0472F, 0.0F);
		cube_r126.setTextureOffset(44, 46).addBox(-1.5F, -18.25F, -8.625F, 2.0F, 2.0F, 2.0F, -0.375F, false);
		cube_r126.setTextureOffset(44, 46).addBox(-1.5F, -17.125F, -8.625F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		cube_r126.setTextureOffset(35, 47).addBox(-1.75F, -17.25F, -6.125F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(7.5777F, 15.5F, 4.375F);
		Random.addChild(cube_r127);
		setRotationAngle(cube_r127, 0.384F, -2.0944F, 0.0F);
		cube_r127.setTextureOffset(22, 47).addBox(0.25F, -19.25F, -9.375F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(7.5777F, 15.5F, 4.375F);
		Random.addChild(cube_r128);
		setRotationAngle(cube_r128, 0.1309F, 2.0944F, 0.0F);
		cube_r128.setTextureOffset(22, 47).addBox(-1.0F, -17.125F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(7.5777F, 15.5F, 4.375F);
		Random.addChild(cube_r129);
		setRotationAngle(cube_r129, 0.2618F, 0.6545F, 0.0F);
		cube_r129.setTextureOffset(10, 47).addBox(0.0F, -16.5F, -8.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(7.3277F, 0.75F, -11.125F);
		Random.addChild(cube_r130);
		setRotationAngle(cube_r130, 0.7854F, 0.0F, 0.0F);
		cube_r130.setTextureOffset(12, 102).addBox(-1.0F, -0.375F, -4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r130.setTextureOffset(13, 103).addBox(-1.0F, -1.125F, -4.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(-6.2989F, 3.1945F, 1.2708F);
		Random.addChild(cube_r131);
		setRotationAngle(cube_r131, 0.0F, 1.5708F, -0.4363F);
		cube_r131.setTextureOffset(20, 105).addBox(-1.125F, -0.375F, -1.375F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(7.5777F, 0.75F, 4.375F);
		Random.addChild(cube_r132);
		setRotationAngle(cube_r132, 0.7854F, 1.0472F, 0.0F);
		cube_r132.setTextureOffset(13, 103).addBox(-1.25F, -11.75F, -14.5F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		Levers = new ModelRenderer(this);
		Levers.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(Levers);
		

		Lever1 = new ModelRenderer(this);
		Lever1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Levers.addChild(Lever1);
		

		Wheel_r1 = new ModelRenderer(this);
		Wheel_r1.setRotationPoint(-12.4613F, -16.8452F, 5.8955F);
		Lever1.addChild(Wheel_r1);
		setRotationAngle(Wheel_r1, -0.1243F, 0.51F, -0.2506F);
		Wheel_r1.setTextureOffset(48, 87).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, -0.375F, false);

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(-11.7119F, -14.7164F, 6.7619F);
		Lever1.addChild(cube_r133);
		setRotationAngle(cube_r133, -0.1243F, 0.51F, -0.2506F);
		cube_r133.setTextureOffset(48, 83).addBox(-0.75F, -2.625F, -1.25F, 2.0F, 3.0F, 1.0F, -0.25F, false);
		cube_r133.setTextureOffset(34, 89).addBox(-1.75F, -0.625F, -0.5F, 4.0F, 1.0F, 2.0F, -0.01F, false);

		Lever1Rot = new ModelRenderer(this);
		Lever1Rot.setRotationPoint(0.0F, 0.0F, 0.0F);
		Lever1.addChild(Lever1Rot);
		setRotationAngle(Lever1Rot, 0.0F, 0.5236F, 0.0F);
		

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(-13.5F, -15.375F, 0.625F);
		Lever1Rot.addChild(cube_r134);
		setRotationAngle(cube_r134, 0.0F, 0.0F, -0.2618F);
		cube_r134.setTextureOffset(48, 78).addBox(-0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, -0.126F, false);

		Lever2Rot = new ModelRenderer(this);
		Lever2Rot.setRotationPoint(0.0F, 0.0F, 0.0F);
		Lever1.addChild(Lever2Rot);
		setRotationAngle(Lever2Rot, 0.0F, 0.5236F, 0.0F);
		

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(-13.5F, -15.375F, 0.625F);
		Lever2Rot.addChild(cube_r135);
		setRotationAngle(cube_r135, 0.0F, 0.0F, -0.2618F);
		cube_r135.setTextureOffset(48, 78).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 3.0F, 1.0F, -0.126F, false);

		Lever2 = new ModelRenderer(this);
		Lever2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Levers.addChild(Lever2);
		setRotationAngle(Lever2, 0.0F, 3.1416F, 0.0F);
		

		Wheel_r2 = new ModelRenderer(this);
		Wheel_r2.setRotationPoint(-12.4613F, -16.8452F, 5.8955F);
		Lever2.addChild(Wheel_r2);
		setRotationAngle(Wheel_r2, -0.1243F, 0.51F, -0.2506F);
		Wheel_r2.setTextureOffset(48, 87).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, -0.375F, false);

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(-11.7119F, -14.7164F, 6.7619F);
		Lever2.addChild(cube_r136);
		setRotationAngle(cube_r136, -0.1243F, 0.51F, -0.2506F);
		cube_r136.setTextureOffset(48, 83).addBox(-0.75F, -2.625F, -1.25F, 2.0F, 3.0F, 1.0F, -0.25F, false);
		cube_r136.setTextureOffset(34, 89).addBox(-1.75F, -0.625F, -0.5F, 4.0F, 1.0F, 2.0F, -0.01F, false);

		Lever1Rot2 = new ModelRenderer(this);
		Lever1Rot2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Lever2.addChild(Lever1Rot2);
		setRotationAngle(Lever1Rot2, 0.0F, 0.5236F, 0.0F);
		

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(-13.5F, -15.375F, 0.625F);
		Lever1Rot2.addChild(cube_r137);
		setRotationAngle(cube_r137, 0.0F, 0.0F, -0.2618F);
		cube_r137.setTextureOffset(48, 78).addBox(-0.5F, -2.5F, 0.0F, 1.0F, 3.0F, 1.0F, -0.126F, false);

		Lever2Rot2 = new ModelRenderer(this);
		Lever2Rot2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Lever2.addChild(Lever2Rot2);
		setRotationAngle(Lever2Rot2, 0.0F, 0.5236F, 0.0F);
		

		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(-13.5F, -15.375F, 0.625F);
		Lever2Rot2.addChild(cube_r138);
		setRotationAngle(cube_r138, 0.0F, 0.0F, -0.2618F);
		cube_r138.setTextureOffset(48, 78).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 3.0F, 1.0F, -0.126F, false);

		Float = new ModelRenderer(this);
		Float.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(Float);
		setRotationAngle(Float, 0.0F, -2.0944F, 0.0F);
		

		HandbreakRotation = new ModelRenderer(this);
		HandbreakRotation.setRotationPoint(1.0136F, -9.875F, -18.0217F);
		Float.addChild(HandbreakRotation);
		setRotationAngle(HandbreakRotation, 0.0F, 0.0F, -0.7418F);
		

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(0.0F, 0.0F, 0.0F);
		HandbreakRotation.addChild(cube_r139);
		setRotationAngle(cube_r139, 0.0F, 0.0436F, 0.0F);
		cube_r139.setTextureOffset(37, 93).addBox(-0.75F, -0.75F, -0.125F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r139.setTextureOffset(43, 94).addBox(1.25F, 0.25F, -0.125F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		Handbreak = new ModelRenderer(this);
		Handbreak.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(Handbreak);
		setRotationAngle(Handbreak, 0.0F, 1.0472F, 0.0F);
		

		HandbreakRotation2 = new ModelRenderer(this);
		HandbreakRotation2.setRotationPoint(-1.0136F, -9.875F, -18.0217F);
		Handbreak.addChild(HandbreakRotation2);
		setRotationAngle(HandbreakRotation2, 0.0F, 0.0F, 0.2182F);
		

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(0.0F, 0.0F, 0.0F);
		HandbreakRotation2.addChild(cube_r140);
		setRotationAngle(cube_r140, 0.0F, -0.0436F, 0.0F);
		cube_r140.setTextureOffset(37, 93).addBox(-1.25F, -0.75F, -0.125F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r140.setTextureOffset(43, 94).addBox(-5.25F, 0.25F, -0.125F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		Handpumps = new ModelRenderer(this);
		Handpumps.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(Handpumps);
		

		pump1 = new ModelRenderer(this);
		pump1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Handpumps.addChild(pump1);
		setRotationAngle(pump1, 0.0F, -0.3927F, 0.0F);
		

		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(18.5F, -10.5F, 0.5F);
		pump1.addChild(cube_r141);
		setRotationAngle(cube_r141, 0.0F, 0.0F, 0.3054F);
		cube_r141.setTextureOffset(31, 97).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		pump2 = new ModelRenderer(this);
		pump2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Handpumps.addChild(pump2);
		setRotationAngle(pump2, 0.0F, -2.4871F, 0.0F);
		

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(18.5F, -10.5F, 0.5F);
		pump2.addChild(cube_r142);
		setRotationAngle(cube_r142, 0.0F, 0.0F, 0.3054F);
		cube_r142.setTextureOffset(31, 97).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		pump3 = new ModelRenderer(this);
		pump3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Handpumps.addChild(pump3);
		setRotationAngle(pump3, 0.0F, -2.7053F, 0.0F);
		

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(18.5F, -10.5F, 0.5F);
		pump3.addChild(cube_r143);
		setRotationAngle(cube_r143, 0.0F, 0.0F, 0.3054F);
		cube_r143.setTextureOffset(31, 97).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		pump4 = new ModelRenderer(this);
		pump4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Handpumps.addChild(pump4);
		setRotationAngle(pump4, 0.0F, 2.5307F, 0.0F);
		

		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(18.5F, -10.5F, 0.5F);
		pump4.addChild(cube_r144);
		setRotationAngle(cube_r144, 0.0F, 0.0F, 0.3054F);
		cube_r144.setTextureOffset(31, 97).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}


	public void render(SmithConsoleTile tile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {

		matrixStack.push();
		matrixStack.translate(0.09,1.65,-0.075);
		matrixStack.rotate(Vector3f.YP.rotation(-0.5f));
		Console.render(matrixStack, iVertexBuilder, i, i1);
		InnerTimeRotor.render(matrixStack, iVertexBuilder, i, i1);
		Casing.render(matrixStack, iVertexBuilder, i, i1);
		Controls.render(matrixStack, iVertexBuilder, i, i1);
		matrixStack.pop();



		matrixStack.push();

		matrixStack.translate(-1.3, 0.555, -0.68);
		matrixStack.rotate(Vector3f.YP.rotationDegrees(1));
		matrixStack.rotate(Vector3f.XP.rotationDegrees(0.8F));
		matrixStack.rotate(Vector3f.ZP.rotationDegrees(0));

		//TODO Find out wtf this below is
		//WorldText text = new WorldText(0.22F, 0.15F, 0.002F, 0xFFFFFF);
		//text.renderMonitor(Helper.getConsoleText(tile));

		matrixStack.scale(0.4F, 0.3F, 0.4F); //Size of sonic in port
		matrixStack.translate(1.1, -1.2, 2.55); //Location XYZ
		matrixStack.rotate(Vector3f.YP.rotationDegrees(0));
		matrixStack.rotate(Vector3f.XP.rotationDegrees(0F));
		matrixStack.rotate(Vector3f.ZP.rotationDegrees(0.5F));
		matrixStack.pop();
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

	}

	@Override
	public void render(NewCoralConsoleTile newCoralConsoleTile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {

	}
}