package manor.tile.machine.gui;

import manor.ManorLife;
import manor.tile.machine.TileJuiceExtractor;
import manor.tile.machine.container.ContainerJuiceExtractor;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GUIJuiceExtractor extends GuiContainer {
    private TileJuiceExtractor te;
    private IInventory playerInv;

    public GUIJuiceExtractor(IInventory playerInv, TileJuiceExtractor te) {
        super(new ContainerJuiceExtractor(playerInv, te));

        this.xSize = 175;
        this.ySize = 165;

        this.te = te;
        this.playerInv = playerInv;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(new ResourceLocation(ManorLife.MODID, "textures/gui/container/GUIJuiceExtractor.png"));
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
    }
}
