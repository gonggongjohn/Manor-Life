package manor.tile.machine.container;

import manor.tile.machine.TileJuiceExtractor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerJuiceExtractor extends Container {
    private TileJuiceExtractor te;

    public ContainerJuiceExtractor(IInventory playerInv, TileJuiceExtractor te) {
        this.te = te;
        IItemHandler handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
        this.addSlotToContainer(new SlotItemHandler(handler, 0, 42, 43));
        this.addSlotToContainer(new SlotItemHandler(handler, 1, 121, 43));

        int xPos = 8;
        int yPos = 84;

        for(int y = 0; y < 3; ++y){
            for(int x = 0;x < 9; ++x){
                this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, xPos + x * 18, yPos + y * 18));
            }
        }

        for(int x = 0; x < 9; ++x){
            this.addSlotToContainer(new Slot(playerInv, x, xPos + x * 18, 99));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
