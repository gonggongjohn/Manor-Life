package manor.items.food.fruits;

import net.minecraft.item.ItemFood;

//这是一个食物，所以extends的是ItemFood而不是Item

public class ItemPotato extends ItemFood {

    public ItemPotato(String unlocalizedName, String registryName,int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(registryName);
    }
}
