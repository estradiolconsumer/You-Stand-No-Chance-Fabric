package net.ddsnerd.yourbad.item;

import net.ddsnerd.yourbad.item.custom.ModAxeItem;
import net.ddsnerd.yourbad.yourbad;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WOODSCYTHE = registerItem("woodscythe", new ModAxeItem(ModToolMaterials.WOOD, 3, 10f,  new FabricItemSettings()));

    public static final Item STONESCYTHE = registerItem("stonescythe", new ModAxeItem(ModToolMaterials.STONE, 4, 10f,  new FabricItemSettings()));

    public static final Item IRONSCYTHE = registerItem("ironscythe", new ModAxeItem(ModToolMaterials.IRON, 10, 10f,  new FabricItemSettings()));

    public static final Item GOLDSCYTHE = registerItem("goldscythe", new ModAxeItem(ModToolMaterials.GOLD, 8, 10f,  new FabricItemSettings()));

    public static final Item DIAMONDSCYTHE = registerItem("diamondscythe", new ModAxeItem(ModToolMaterials.DIAMOND, 12, 10f,  new FabricItemSettings()));

    public static final Item NETHERITESCYTHE = registerItem("netheritescythe", new ModAxeItem(ModToolMaterials.NETHERITE, 13, 10f,  new FabricItemSettings()));

    //Titanium Items
    public static final Item TITAINIUMHELMET = registerItem("titaniumhelmet", new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item TITAINIUMCHESTPLATE = registerItem("titaniumchestplate", new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item TITAINIUMLEGGINGS = registerItem("titaniumleggings", new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item TITAINIUMBOOTS = registerItem("titaniumboots", new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new FabricItemSettings()));

    public static final Item TITANIUMSCYTHE = registerItem("titaniumscythe", new ModAxeItem(ModToolMaterials.NETHERITE, 14, 10f,  new FabricItemSettings()));

    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(yourbad.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.SCYTHES, WOODSCYTHE);
        addToItemGroup(ModItemGroup.SCYTHES, STONESCYTHE);
        addToItemGroup(ModItemGroup.SCYTHES, IRONSCYTHE);
        addToItemGroup(ModItemGroup.SCYTHES, DIAMONDSCYTHE);
        addToItemGroup(ModItemGroup.SCYTHES, NETHERITESCYTHE);
        addToItemGroup(ModItemGroup.SCYTHES, TITANIUMSCYTHE);

        addToItemGroup(ModItemGroup.SCYTHESORE, TITANIUMSCYTHE);
        addToItemGroup(ModItemGroup.SCYTHESORE, TITANIUM_INGOT);
        addToItemGroup(ModItemGroup.SCYTHESORE, TITAINIUMHELMET);
        addToItemGroup(ModItemGroup.SCYTHESORE, TITAINIUMCHESTPLATE);
        addToItemGroup(ModItemGroup.SCYTHESORE, TITAINIUMLEGGINGS);
        addToItemGroup(ModItemGroup.SCYTHESORE, TITAINIUMBOOTS);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        yourbad.LOGGER.info("Registering Mod Items for " + yourbad.MOD_ID);

        addItemsToItemGroup();
    }
}
