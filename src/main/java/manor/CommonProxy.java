package manor;

/* 公共Proxy文件
   在服务器和客户端中均要加载的内容要在此完成注册，比如物品的注册
 */

import manor.init.ItemRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event){
        ItemRegister.init();
        ItemRegister.register();
    }

    public void init(FMLInitializationEvent event){

    }

    public void postInit(FMLPostInitializationEvent event){
        
    }

    public void registerRenders(){

    }

}
