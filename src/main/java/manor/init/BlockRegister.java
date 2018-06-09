package manor.init;

//所有方块要在此完成注册

import manor.ManorLife;
import manor.blocks.BlockManorTest;
import manor.blocks.BlockPearLog;
import manor.blocks.machine.BlockJuiceExtractor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegister {
    public static Block manorTest;
    public static Block pearLog;
    public static Block juiceExtractor;
    public static void init(){
        //最后一项Material指方块的属性（具体见Material点后面的提示）
        manorTest =new BlockManorTest("manor_testblock", "manor_testblock", Material.ROCK);
        pearLog =new BlockPearLog("pear_log", "pear_log", Material.WOOD);
        juiceExtractor = new BlockJuiceExtractor("juice_extractor", "juice_extractor", Material.IRON);

    }

    public static void register(){
        registerBlock(manorTest);
        registerBlock(pearLog);
        registerBlock(juiceExtractor);
    }

    public static void registerRenders(){
        registerRender(manorTest);
        registerRender(pearLog);
        registerRender(juiceExtractor);
    }

    public static void registerBlock(Block block){
        block.setCreativeTab(ManorLife.tabManorLife);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    public static void registerRender(Block block){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(ManorLife.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
    }
}
