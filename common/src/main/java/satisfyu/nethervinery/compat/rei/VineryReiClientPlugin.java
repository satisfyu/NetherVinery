package satisfyu.nethervinery.compat.rei;

import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import satisfyu.nethervinery.compat.rei.press.WinePressCategory;
import satisfyu.nethervinery.compat.rei.press.WinePressDisplay;
import satisfyu.nethervinery.compat.rei.aging.AgingBarrelCategory;
import satisfyu.nethervinery.compat.rei.aging.AgingBarrelDisplay;
import satisfyu.nethervinery.recipe.AgingBarrelRecipe;
import satisfyu.nethervinery.registry.NetherObjectRegistry;


import java.util.ArrayList;
import java.util.List;


public class VineryReiClientPlugin {
    public static void registerCategories(CategoryRegistry registry) {
        registry.add(new AgingBarrelCategory());
        registry.add(new WinePressCategory());

        registry.addWorkstations(
                AgingBarrelDisplay.FERMENTATION_BARREL_DISPLAY,
                EntryStacks.of(NetherObjectRegistry.WARPED_FERMENTATION_BARREL.get()),
                EntryStacks.of(NetherObjectRegistry.CRIMSON_FERMENTATION_BARREL.get())
        );
        registry.addWorkstations(
                WinePressDisplay.WINE_PRESS_DISPLAY,
                EntryStacks.of(NetherObjectRegistry.WARPED_APPLE_PRESS.get()),
                EntryStacks.of(NetherObjectRegistry.CRIMSON_APPLE_PRESS.get())
        );
    }

    public static void registerDisplays(DisplayRegistry registry) {
        registry.registerFiller(AgingBarrelRecipe.class, AgingBarrelDisplay::new);
        registry.add(new WinePressDisplay());
    }

    public static List<Ingredient> ingredients(Recipe<Container> recipe, ItemStack stack){
        List<Ingredient> l = new ArrayList<>(recipe.getIngredients());
        l.add(0, Ingredient.of(stack.getItem()));
        return l;
    }

}
