package manor;

/* 客户端Proxy
   仅在客户端加载的内容要在此完成注册，比如模型和材质的注册
 */

import manor.init.BlockRegister;
import manor.init.ItemRegister;
import manor.init.client.GUIHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CilentProxy extends CommonProxy{
    public void preInit(FMLPreInitializationEvent event){
        NetworkRegistry.INSTANCE.registerGuiHandler(ManorLife.instance, new GUIHandler());
        super.preInit(event);
    }

    public void init(FMLInitializationEvent event){
        super.init(event);
    }

    public void postInit(FMLPostInitializationEvent event){
        super.postInit(event);
    }

    @Override
    public void registerRenders(){
        ItemRegister.registerRenders();
        BlockRegister.registerRenders();
    }
}
