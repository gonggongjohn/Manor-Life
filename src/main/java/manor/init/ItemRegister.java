package manor.init;

/* 所有物品要在此完成注册（非方块）
 */

import manor.ManorLife;
import manor.items.ItemManorTest;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRegister {
    public static Item manorTest;
    public static void init(){
        manorTest = new ItemManorTest("manor_test", "manor_test");

    }

    public static void register(){
        registerItem(manorTest);
    }

    public static void registerRenders(){
        registerRender(manorTest);
    }

    public static void registerItem(Item item){
        item.setCreativeTab(ManorLife.tabManorLife);
        GameRegistry.register(item);
    }

    public static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(ManorLife.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }
}
