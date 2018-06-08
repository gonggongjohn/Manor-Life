package manor.init;

import manor.ManorLife;
import manor.tile.machine.TileJuiceExtractor;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityRegister {
    public static void registerTileEntities(){
        registerTileEntity(TileJuiceExtractor.class, "juice_extractor");
    }

    public static void registerTileEntity(Class<? extends TileEntity> tileentity, String blockName){
        GameRegistry.registerTileEntity(tileentity, ManorLife.MODID + ":" + blockName);
    }
}
