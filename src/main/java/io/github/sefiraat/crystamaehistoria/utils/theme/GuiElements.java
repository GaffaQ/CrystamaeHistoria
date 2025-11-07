package io.github.sefiraat.crystamaehistoria.utils.theme;

import io.github.sefiraat.crystamaehistoria.slimefun.items.tools.stave.SpellSlot;
import io.github.sefiraat.crystamaehistoria.utils.Skulls;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import lombok.experimental.UtilityClass;
import net.guizhanss.guizhanlib.minecraft.helper.MaterialHelper;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;
import java.text.MessageFormat;

@UtilityClass
public class GuiElements {

    public static final CustomItemStack MENU_BACKGROUND = new CustomItemStack(ChestMenuUtils.getBackground());

    public static final CustomItemStack MENU_BACKGROUND_INPUT = new CustomItemStack(
        Material.LIGHT_BLUE_STAINED_GLASS_PANE,
    ChatColor.BLUE + "Input"
    );

    public static final CustomItemStack MENU_STAVE_INPUT = new CustomItemStack(
        Material.LIGHT_BLUE_STAINED_GLASS_PANE,
    ChatColor.BLUE + "Place Stave Here"
    );

    public static final CustomItemStack MENU_REMOVE_PLATES = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
    ChatColor.BLUE + "Remove Spell Plate"
    );

    public static final CustomItemStack MENU_SAVE_STAVE = new CustomItemStack(
        Material.GREEN_STAINED_GLASS_PANE,
    ChatColor.BLUE + "Save Stave Settings"
    );

    public static final CustomItemStack MENU_BACKGROUND_OUTPUT = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
    ChatColor.RED + "Output"
    );

    public static final CustomItemStack MENU_DIVIDER = new CustomItemStack(
        Material.LIME_STAINED_GLASS_PANE,
        " "
    );

    public static final CustomItemStack TIER_INDICATOR_1 = new CustomItemStack(
        Skulls.GUI_TIER_NUMBER_1.getPlayerHead(),
        ThemeType.CLICK_INFO.getColor() + "T1"
    );

    public static final CustomItemStack TIER_INDICATOR_2 = new CustomItemStack(
        Skulls.GUI_TIER_NUMBER_2.getPlayerHead(),
        ThemeType.CLICK_INFO.getColor() + "T2"
    );

    public static final CustomItemStack TIER_INDICATOR_3 = new CustomItemStack(
        Skulls.GUI_TIER_NUMBER_3.getPlayerHead(),
        ThemeType.CLICK_INFO.getColor() + "T3"
    );

    public static final CustomItemStack TIER_INDICATOR_4 = new CustomItemStack(
        Skulls.GUI_TIER_NUMBER_4.getPlayerHead(),
        ThemeType.CLICK_INFO.getColor() + "T4"
    );

    public static final CustomItemStack TIER_INDICATOR_5 = new CustomItemStack(
        Skulls.GUI_TIER_NUMBER_5.getPlayerHead(),
        ThemeType.CLICK_INFO.getColor() + "T5"
    );

    @ParametersAreNonnullByDefault
    public static ItemStack getUniqueStoryIcon(Material material) {
        return ThemeType.themedItemStack(
            material,
            ThemeType.RARITY_UNIQUE,
            MaterialHelper.getName(material),
            "This story has been discovered"
        );
    }

    @ParametersAreNonnullByDefault
    public static ItemStack getStoryNotUnlockedIcon(Material material) {
        return ThemeType.themedItemStack(
            Material.BARRIER,
            ThemeType.RESEARCH,
            MaterialHelper.getName(material),
            MessageFormat.format("{0}{1} is locked", ThemeType.RESEARCH.getColor(), ChatColor.BOLD),
            "This story is not unlocked yet",
            "It will unlock when you use the Chronicler to first discover",
            "the story for the specified block."
        );
    }

    @ParametersAreNonnullByDefault
    public static ItemStack getSpellNotUnlockedIcon(String name) {
        return ThemeType.themedItemStack(
            Material.BARRIER,
            ThemeType.RESEARCH,
            name,
            MessageFormat.format("{0}{1} is locked", ThemeType.RESEARCH.getColor(), ChatColor.BOLD),
            "This spell is not unlocked yet",
            "It will unlock when you first",
            "charge a Spell Plate in the Liquefaction Basin."
        );
    }

    @ParametersAreNonnullByDefault
    public static ItemStack getBlockGildedIcon(Material material) {
        return ThemeType.themedItemStack(
            material,
            ThemeType.RARITY_UNIQUE,
            MaterialHelper.getName(material),
            "This block has been gilded"
        );
    }

    @ParametersAreNonnullByDefault
    public static ItemStack getBlockNotGildedIcon(Material material) {
        return ThemeType.themedItemStack(
            Material.BARRIER,
            ThemeType.RESEARCH,
            MaterialHelper.getName(material),
            MessageFormat.format("{0}{1} is locked", ThemeType.RESEARCH.getColor(), ChatColor.BOLD),
            "This block has not been gilded yet"
        );
    }

    @ParametersAreNonnullByDefault
    public static CustomItemStack getSpellSlotPane(SpellSlot spellSlot) {
        return new CustomItemStack(
            Material.RED_STAINED_GLASS_PANE,
            ChatColor.GRAY + "Spell: " + spellSlot.getDescription()
        );
    }

    @ParametersAreNonnullByDefault
    public static CustomItemStack getDirectionalSlotPane(BlockFace blockFace, boolean active) {
        Material material = active ? Material.RED_STAINED_GLASS_PANE : Material.GREEN_STAINED_GLASS_PANE;
        return new CustomItemStack(
            material,
            ChatColor.GRAY + "Facing: " + blockFace.name()
        );
    }
}
