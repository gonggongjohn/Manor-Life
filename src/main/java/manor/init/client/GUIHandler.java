package manor.init.client;

import manor.tile.machine.TileJuiceExtractor;
import manor.tile.machine.container.ContainerJuiceExtractor;
import manor.tile.machine.gui.GUIJuiceExtractor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler {

    public static final int JUICE_EXTRACTOR = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == JUICE_EXTRACTOR){
            return new ContainerJuiceExtractor(player.inventory,(TileJuiceExtractor) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == JUICE_EXTRACTOR){
            return  new GUIJuiceExtractor(player.inventory,(TileJuiceExtractor) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }
}
