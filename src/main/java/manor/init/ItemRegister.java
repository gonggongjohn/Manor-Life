package manor.init;

/* 所有物品要在此完成注册（非方块）
 */

import manor.ManorLife;
import manor.items.ItemManorTest;
import manor.items.food.fruits.*;
import manor.items.food.vegetables.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRegister {
    public static Item manorTest;
    public static ItemFood potato;
    public static ItemFood banana;
    public static ItemFood pineapple;
    public static ItemFood grape;
    public static ItemFood strawberry;
    public static ItemFood lemon;
    public static ItemFood pear;
    public static ItemFood mango;
    public static ItemFood coffeebean;
    public static ItemFood cucumber;
    public static ItemFood onion;
    public static ItemFood corn;
    public static ItemFood cabbage;

    public static void init(){
        //unlocalizedName为在游戏中的id名称，registryName是在forge中注册的名称
        manorTest = new ItemManorTest("manor_test", "manor_test");
        //对于食物来说还应当传入三个值，amount代表能恢复的饱食度，saturation表示能该事物所能添加的相对饱和度，isWolfFood表示狼会不会吃它
        potato = new ItemPotato("potato", "potato", 4, 0.3F, false);
        banana = new ItemBanana("banana", "banana", 2, 0.2F, false);
        pineapple = new ItemPineapple("pineapple", "pineapple", 5, 0.4F, false);
        grape = new ItemGrape("grape", "grape", 1, 0.1F, false);
        strawberry = new ItemStrawberry("strawberry", "strawberry", 1, 0.1F, false);
        lemon = new ItemLemon("lemon", "lemon", 2, 0.1F, false);
        pear = new ItemPear("pear", "pear", 4, 0.2F, false);
        mango = new ItemMango("mango", "mango", 4, 0.2F, false);
        coffeebean = new ItemCoffeebean("coffeebean", "coffeebean", 0, 0.1F, false);
        cucumber = new ItemCucumber("cucumber", "cucumber", 4, 0.4F, false);
        onion = new ItemOnion("onion", "onion", 1, 0.4F, false);
        corn = new ItemCorn("corn", "corn", 6, 0.4F, false);
        cabbage = new ItemCabbage("cabbage", "cabbage", 6, 0.2F, false);
    }

    public static void register(){
        registerItem(manorTest);
        registerItem(potato);
        registerItem(banana);
        registerItem(pineapple);
        registerItem(grape);
        registerItem(strawberry);
        registerItem(lemon);
        registerItem(pear);
        registerItem(mango);
        registerItem(coffeebean);
        registerItem(cucumber);
        registerItem(onion);
        registerItem(corn);
        registerItem(cabbage);
    }

    public static void registerRenders(){
        registerRender(manorTest);
        registerRender(potato);
        registerRender(banana);
        registerRender(pineapple);
        registerRender(grape);
        registerRender(strawberry);
        registerRender(lemon);
        registerRender(pear);
        registerRender(mango);
        registerRender(coffeebean);
        registerRender(cucumber);
        registerRender(onion);
        registerRender(corn);
        registerRender(cabbage);
    }

    public static void registerItem(Item item){
        item.setCreativeTab(ManorLife.tabManorLife);
        GameRegistry.register(item);
    }

    public static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(ManorLife.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }
}
