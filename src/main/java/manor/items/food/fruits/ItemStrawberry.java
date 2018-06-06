package manor.items.food.fruits;

import net.minecraft.item.ItemFood;

public class ItemStrawberry extends ItemFood{

    public ItemStrawberry(String unlocalizedName, String registryName,int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(registryName);
    }
}
