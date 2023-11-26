package net.romchyk1219.redupdate.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.romchyk1219.redupdate.item.ModItems;

public class ModLootTableModifiers {
    private static final Identifier JUNGLE_TEMPLE_ID =
            new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier DESERT_PYRAMID_ID =
            new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier ANCIENT_CITY_ID =
            new Identifier("minecraft", "chests/ancient_city");
    private static final Identifier BURIED_TREASURE_ID =
            new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier SHIPWRECK_TREASURE_ID =
            new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier ABANDONED_MINESHAFT_ID =
            new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier SIMPLE_DUNGEON_ID =
            new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier WOODLAND_MANSION_ID =
            new Identifier("minecraft", "chests/woodland_mansion");

    private static final Identifier VILLAGE_ARMORER_ID =
            new Identifier("minecraft", "chests/village/village_armorer");
    private static final Identifier VILLAGE_TOOLSMITH_ID =
            new Identifier("minecraft", "chests/village/village_toolsmith");
    private static final Identifier VILLAGE_WEAPONSMITH_ID =
            new Identifier("minecraft", "chests/village/village_weaponsmith");
    private static final Identifier VILLAGE_BUTCHER_ID =
            new Identifier("minecraft", "chests/village/village_butcher");
    private static final Identifier VILLAGE_FISHER_ID =
            new Identifier("minecraft", "chests/village/village_fisher");
    private static final Identifier VILLAGE_SHEPHERD_ID =
            new Identifier("minecraft", "chests/village/village_shepherd");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(JUNGLE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(DESERT_PYRAMID_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(ANCIENT_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(BURIED_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(SHIPWRECK_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f))
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(SIMPLE_DUNGEON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(WOODLAND_MANSION_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(VILLAGE_ARMORER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(VILLAGE_TOOLSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(VILLAGE_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 9.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }


            if(VILLAGE_BUTCHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.TOMATO))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 16.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(VILLAGE_FISHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.TOMATO))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 16.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(VILLAGE_SHEPHERD_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.TOMATO))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 16.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }


            if(VILLAGE_BUTCHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.TOMATO_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 16.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(VILLAGE_FISHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.TOMATO_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 16.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(VILLAGE_SHEPHERD_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.75f))
                        .with(ItemEntry.builder(ModItems.TOMATO_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 16.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}