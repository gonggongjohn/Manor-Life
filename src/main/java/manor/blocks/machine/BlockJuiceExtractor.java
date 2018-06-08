package manor.blocks.machine;

import manor.ManorLife;
import manor.init.client.GUIHandler;
import manor.tile.machine.TileJuiceExtractor;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

import javax.annotation.Nullable;

public class BlockJuiceExtractor extends Block implements ITileEntityProvider {
    public BlockJuiceExtractor(String unlocalizedName, String registryName,Material materialIn) {
        super(materialIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(ManorLife.MODID, registryName));
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileJuiceExtractor();
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileJuiceExtractor();
    }

   /* @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        TileJuiceExtractor te = (TileJuiceExtractor) worldIn.getTileEntity(pos);
        IItemHandler handler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
        for(int slot = 0; slot < handler.getSlots() - 1; slot++){
            ItemStack stack = handler.getStackInSlot(slot);
            InventoryHelper.spawnItemStack(worldIn, pos.getX(), pos.getY(), pos.getZ(), stack);
        }
        super.breakBlock(worldIn, pos, state);
    }
    */

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote){
            playerIn.openGui(ManorLife.instance, GUIHandler.JUICE_EXTRACTOR, worldIn, pos.getX(), pos.getY(), pos.getZ());
        }
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
    }
}
