package net.romchyk1219.redupdate.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.romchyk1219.redupdate.RedUpdate;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RedUpdate.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RedUpdate.LOGGER.info("Registering Mod Items for " + RedUpdate.MOD_ID);
    }
}
