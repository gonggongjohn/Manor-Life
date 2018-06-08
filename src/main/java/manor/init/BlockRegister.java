package manor.init;

import manor.ManorLife;
import manor.blocks.BlockManorTest;
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
    public static void init(){
        manorTest =new BlockManorTest("manor_testblock", "manor_testblock", Material.ROCK);
    }

    public static void register(){
        registerBlock(manorTest);
    }

    public static void registerRenders(){
        registerRender(manorTest);
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
