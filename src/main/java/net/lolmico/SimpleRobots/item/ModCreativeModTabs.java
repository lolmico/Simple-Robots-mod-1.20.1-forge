package net.lolmico.SimpleRobots.item;

import net.lolmico.SimpleRobots.SimpleRobots;
import net.lolmico.SimpleRobots.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimpleRobots.MOD_ID);


    public static final RegistryObject<CreativeModeTab> ROBOT_TAB = CREATIVE_MODE_TABS.register("robot_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.METAL.get()))
                    .title(Component.translatable("creativetab.robot_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //adding items to custom creative tab
                        output.accept(ModItems.METAL.get());
                        output.accept(ModBlocks.METAL_BLOCK.get());
                        output.accept(ModItems.RAW_METAL.get());
                        output.accept(ModBlocks.RAW_METAL_BLOCK.get());
                        output.accept(ModItems.COPPER_WIRE.get());
                        output.accept(ModItems.SCREEN.get());
                        output.accept(ModItems.CORE.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
