package com.moldy.squidgamemod.item;

import com.moldy.squidgamemod.SquidGameMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SquidGameMod.MOD_ID);

    public static final DeferredItem<Item> THANOS_CROSS = ITEMS.register("thanos_cross",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FORK = ITEMS.register("fork",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
