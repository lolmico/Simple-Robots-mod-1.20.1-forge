package net.lolmico.SimpleRobots.item;

import net.lolmico.SimpleRobots.SimpleRobots;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, SimpleRobots.MOD_ID);

    public static final RegistryObject<Item> METAL = Items.register("metal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_METAL = Items.register("raw_metal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);


    }
}
