package com.chrisgardian.firstmod.item;

import com.chrisgardian.firstmod.FirstMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FirstMod.MOD_ID);

    public static final DeferredItem<Item> TRUCMUCHE = ITEMS.register("trucmuche", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_TRUCMUCHE = ITEMS.register("raw_trucmuche", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
