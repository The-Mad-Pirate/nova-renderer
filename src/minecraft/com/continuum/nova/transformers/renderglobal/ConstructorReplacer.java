package com.continuum.nova.transformers.renderglobal;

import com.continuum.nova.transformers.BetterMethodVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;

import static org.objectweb.asm.Opcodes.*;

/**
 * Replaces the constructor of the RenderGlobal class
 *
 * <p>My general strategy for the RenderGlobal class is to have a subclass and put the code I want in the subcless.
 * However, RenderGlobal's constructor makes a bunch of OpenGL calls, using functions from OpenGL 1 and 2. I created a
 * OpenGL 4.5 Core profile, which really isn't happy when you try to use OpenGL 1. So, I make this constructor so
 * no more OpenGL 1 calls be be made</p>
 *
 * @author David
 */
public class ConstructorReplacer extends BetterMethodVisitor {
    @Override
    public void visitCode() {
        Label l0 = new Label();
        mv.visitLabel(l0);
        mv.visitLineNumber(162, l0);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        Label l1 = new Label();
        mv.visitLabel(l1);
        mv.visitLineNumber(106, l1);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Sets", "newLinkedHashSet", "()Ljava/util/LinkedHashSet;", false);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "chunksToUpdate", "Ljava/util/Set;");
        Label l2 = new Label();
        mv.visitLabel(l2);
        mv.visitLineNumber(107, l2);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn(new Integer(69696));
        mv.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Lists", "newArrayListWithCapacity", "(I)Ljava/util/ArrayList;", false);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "renderInfos", "Ljava/util/List;");
        Label l3 = new Label();
        mv.visitLabel(l3);
        mv.visitLineNumber(108, l3);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Sets", "newHashSet", "()Ljava/util/HashSet;", false);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "field_181024_n", "Ljava/util/Set;");
        Label l4 = new Label();
        mv.visitLabel(l4);
        mv.visitLineNumber(111, l4);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitInsn(ICONST_M1);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "starGLCallList", "I");
        Label l5 = new Label();
        mv.visitLabel(l5);
        mv.visitLineNumber(113, l5);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitInsn(ICONST_M1);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "glSkyList", "I");
        Label l6 = new Label();
        mv.visitLabel(l6);
        mv.visitLineNumber(115, l6);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitInsn(ICONST_M1);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "glSkyList2", "I");
        Label l7 = new Label();
        mv.visitLabel(l7);
        mv.visitLineNumber(122, l7);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Maps", "newHashMap", "()Ljava/util/HashMap;", false);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "damagedBlocks", "Ljava/util/Map;");
        Label l8 = new Label();
        mv.visitLabel(l8);
        mv.visitLineNumber(123, l8);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Maps", "newHashMap", "()Ljava/util/HashMap;", false);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "mapSoundPositions", "Ljava/util/Map;");
        Label l9 = new Label();
        mv.visitLabel(l9);
        mv.visitLineNumber(124, l9);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitIntInsn(BIPUSH, 10);
        mv.visitTypeInsn(ANEWARRAY, "net/minecraft/client/renderer/texture/TextureAtlasSprite");
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "destroyBlockIcons", "[Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;");
        Label l10 = new Label();
        mv.visitLabel(l10);
        mv.visitLineNumber(128, l10);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn(new Double("4.9E-324"));
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "frustumUpdatePosX", "D");
        Label l11 = new Label();
        mv.visitLabel(l11);
        mv.visitLineNumber(129, l11);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn(new Double("4.9E-324"));
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "frustumUpdatePosY", "D");
        Label l12 = new Label();
        mv.visitLabel(l12);
        mv.visitLineNumber(130, l12);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn(new Double("4.9E-324"));
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "frustumUpdatePosZ", "D");
        Label l13 = new Label();
        mv.visitLabel(l13);
        mv.visitLineNumber(131, l13);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn(new Integer(-2147483648));
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "frustumUpdatePosChunkX", "I");
        Label l14 = new Label();
        mv.visitLabel(l14);
        mv.visitLineNumber(132, l14);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn(new Integer(-2147483648));
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "frustumUpdatePosChunkY", "I");
        Label l15 = new Label();
        mv.visitLabel(l15);
        mv.visitLineNumber(133, l15);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn(new Integer(-2147483648));
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "frustumUpdatePosChunkZ", "I");
        Label l16 = new Label();
        mv.visitLabel(l16);
        mv.visitLineNumber(134, l16);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn(new Double("4.9E-324"));
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "lastViewEntityX", "D");
        Label l17 = new Label();
        mv.visitLabel(l17);
        mv.visitLineNumber(135, l17);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn(new Double("4.9E-324"));
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "lastViewEntityY", "D");
        Label l18 = new Label();
        mv.visitLabel(l18);
        mv.visitLineNumber(136, l18);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn(new Double("4.9E-324"));
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "lastViewEntityZ", "D");
        Label l19 = new Label();
        mv.visitLabel(l19);
        mv.visitLineNumber(137, l19);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn(new Double("4.9E-324"));
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "lastViewEntityPitch", "D");
        Label l20 = new Label();
        mv.visitLabel(l20);
        mv.visitLineNumber(138, l20);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn(new Double("4.9E-324"));
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "lastViewEntityYaw", "D");
        Label l21 = new Label();
        mv.visitLabel(l21);
        mv.visitLineNumber(139, l21);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitTypeInsn(NEW, "net/minecraft/client/renderer/chunk/ChunkRenderDispatcher");
        mv.visitInsn(DUP);
        mv.visitMethodInsn(INVOKESPECIAL, "net/minecraft/client/renderer/chunk/ChunkRenderDispatcher", "<init>", "()V", false);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "renderDispatcher", "Lnet/minecraft/client/renderer/chunk/ChunkRenderDispatcher;");
        Label l22 = new Label();
        mv.visitLabel(l22);
        mv.visitLineNumber(141, l22);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitInsn(ICONST_M1);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "renderDistanceChunks", "I");
        Label l23 = new Label();
        mv.visitLabel(l23);
        mv.visitLineNumber(143, l23);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitInsn(ICONST_2);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "renderEntitiesStartupCounter", "I");
        Label l24 = new Label();
        mv.visitLabel(l24);
        mv.visitLineNumber(150, l24);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitInsn(ICONST_0);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "debugFixTerrainFrustum", "Z");
        Label l25 = new Label();
        mv.visitLabel(l25);
        mv.visitLineNumber(152, l25);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitIntInsn(BIPUSH, 8);
        mv.visitTypeInsn(ANEWARRAY, "org/lwjgl/util/vector/Vector4f");
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "debugTerrainMatrix", "[Lorg/lwjgl/util/vector/Vector4f;");
        Label l26 = new Label();
        mv.visitLabel(l26);
        mv.visitLineNumber(153, l26);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitTypeInsn(NEW, "net/minecraft/util/Vector3d");
        mv.visitInsn(DUP);
        mv.visitMethodInsn(INVOKESPECIAL, "net/minecraft/util/Vector3d", "<init>", "()V", false);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "debugTerrainFrustumPosition", "Lnet/minecraft/util/Vector3d;");
        Label l27 = new Label();
        mv.visitLabel(l27);
        mv.visitLineNumber(154, l27);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitInsn(ICONST_0);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "vboEnabled", "Z");
        Label l28 = new Label();
        mv.visitLabel(l28);
        mv.visitLineNumber(159, l28);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitInsn(ICONST_1);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "displayListEntitiesDirty", "Z");
        Label l29 = new Label();
        mv.visitLabel(l29);
        mv.visitLineNumber(163, l29);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "mc", "Lnet/minecraft/client/Minecraft;");
        Label l30 = new Label();
        mv.visitLabel(l30);
        mv.visitLineNumber(164, l30);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/Minecraft", "getRenderManager", "()Lnet/minecraft/client/renderer/entity/RenderManager;", false);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "renderManager", "Lnet/minecraft/client/renderer/entity/RenderManager;");
        Label l31 = new Label();
        mv.visitLabel(l31);
        mv.visitLineNumber(165, l31);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/Minecraft", "getTextureManager", "()Lnet/minecraft/client/renderer/texture/TextureManager;", false);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "renderEngine", "Lnet/minecraft/client/renderer/texture/TextureManager;");
        Label l32 = new Label();
        mv.visitLabel(l32);
        mv.visitLineNumber(166, l32);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitFieldInsn(GETFIELD, "net/minecraft/client/renderer/RenderGlobal", "renderEngine", "Lnet/minecraft/client/renderer/texture/TextureManager;");
        mv.visitFieldInsn(GETSTATIC, "net/minecraft/client/renderer/RenderGlobal", "locationForcefieldPng", "Lnet/minecraft/util/ResourceLocation;");
        mv.visitMethodInsn(INVOKEVIRTUAL, "net/minecraft/client/renderer/texture/TextureManager", "bindTexture", "(Lnet/minecraft/util/ResourceLocation;)V", false);
        Label l33 = new Label();
        mv.visitLabel(l33);
        mv.visitLineNumber(167, l33);
        mv.visitIntInsn(SIPUSH, 3553);
        mv.visitIntInsn(SIPUSH, 10242);
        mv.visitIntInsn(SIPUSH, 10497);
        mv.visitMethodInsn(INVOKESTATIC, "org/lwjgl/opengl/GL11", "glTexParameteri", "(III)V", false);
        Label l34 = new Label();
        mv.visitLabel(l34);
        mv.visitLineNumber(168, l34);
        mv.visitIntInsn(SIPUSH, 3553);
        mv.visitIntInsn(SIPUSH, 10243);
        mv.visitIntInsn(SIPUSH, 10497);
        mv.visitMethodInsn(INVOKESTATIC, "org/lwjgl/opengl/GL11", "glTexParameteri", "(III)V", false);
        Label l35 = new Label();
        mv.visitLabel(l35);
        mv.visitLineNumber(169, l35);
        mv.visitInsn(ICONST_0);
        mv.visitMethodInsn(INVOKESTATIC, "net/minecraft/client/renderer/GlStateManager", "bindTexture", "(I)V", false);
        Label l36 = new Label();
        mv.visitLabel(l36);
        mv.visitLineNumber(170, l36);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESPECIAL, "net/minecraft/client/renderer/RenderGlobal", "updateDestroyBlockIcons", "()V", false);
        Label l37 = new Label();
        mv.visitLabel(l37);
        mv.visitLineNumber(171, l37);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESTATIC, "net/minecraft/client/renderer/OpenGlHelper", "useVbo", "()Z", false);
        mv.visitFieldInsn(PUTFIELD, "net/minecraft/client/renderer/RenderGlobal", "vboEnabled", "Z");
        Label l38 = new Label();
        mv.visitLabel(l38);
        mv.visitLineNumber(173, l38);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitFieldInsn(GETFIELD, "net/minecraft/client/renderer/RenderGlobal", "vboEnabled", "Z");

        Label l48 = new Label();
        mv.visitLabel(l48);
        mv.visitLineNumber(189, l48);
        mv.visitInsn(RETURN);
        Label l49 = new Label();
        mv.visitLabel(l49);
        mv.visitLocalVariable("this", "Lnet/minecraft/client/renderer/RenderGlobal;", null, l0, l49, 0);
        mv.visitLocalVariable("mcIn", "Lnet/minecraft/client/Minecraft;", null, l0, l49, 1);
        mv.visitMaxs(7, 2);
    }
}
