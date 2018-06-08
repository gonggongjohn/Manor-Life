package manor.blocks;

import manor.ManorLife;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockPearLog extends Block {
    public BlockPearLog(String unlocalizedName, String registryName, Material materialIn) {
        super(materialIn);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(ManorLife.MODID, registryName));
    }
}
