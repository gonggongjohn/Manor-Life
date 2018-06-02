package manor;

/* ManorLife模组主程序
   关于模组的定义以及Proxy均在此定义，一般不用修改
 */

import manor.tabs.TabManorLife;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ManorLife.MODID, name = ManorLife.NAME, version = ManorLife.VERSION)
public class ManorLife{
	public static final String MODID = "manor";
	public static final String NAME = "Manor Life";
	public static final String VERSION = "1.0.0";

	public static final CreativeTabs tabManorLife = new TabManorLife();

    @SidedProxy(clientSide = "manor.CilentProxy",
            serverSide = "manor.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static ManorLife instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        proxy.registerRenders();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}