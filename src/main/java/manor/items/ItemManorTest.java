package manor.items;

import net.minecraft.item.Item;

//这是ManorTest物品的实体，因为它没有任何功能，所以没有定义任何属性

public class ItemManorTest extends Item {
    public ItemManorTest(String unlocalizedName, String registryName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(registryName);

    }
}
