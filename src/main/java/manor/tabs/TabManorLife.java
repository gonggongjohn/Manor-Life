package manor.tabs;

import manor.init.ItemRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabManorLife extends CreativeTabs{

        public TabManorLife() {
            super("manorlife");
        }

        @Override
        public Item getTabIconItem() {
            return ItemRegister.manorTest;
        }

}