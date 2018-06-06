package manor.items.food.vegetables;

import net.minecraft.item.ItemFood;

public class ItemOnion extends ItemFood {

    public ItemOnion(String unlocalizedName, String registryName,int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(registryName);
    }
}