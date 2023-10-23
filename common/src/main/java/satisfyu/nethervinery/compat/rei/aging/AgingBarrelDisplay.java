package satisfyu.nethervinery.compat.rei.aging;


import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import satisfyu.nethervinery.NetherVinery;
import satisfyu.nethervinery.compat.rei.VineryReiClientPlugin;
import satisfyu.nethervinery.recipe.AgingBarrelRecipe;
import satisfyu.vinery.registry.ObjectRegistry;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class AgingBarrelDisplay extends BasicDisplay {

    public static final CategoryIdentifier<AgingBarrelDisplay> FERMENTATION_BARREL_DISPLAY = CategoryIdentifier.of(NetherVinery.MODID, "aging_barrel_display");


    public AgingBarrelDisplay(AgingBarrelRecipe recipe) {
        this(EntryIngredients.ofIngredients(VineryReiClientPlugin.ingredients(recipe, new ItemStack(ObjectRegistry.WINE_BOTTLE.get()))), Collections.singletonList(EntryIngredients.of(recipe.getResultItem())), Optional.ofNullable(recipe.getId()));
    }

    public AgingBarrelDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs, Optional<ResourceLocation> location) {
        super(inputs, outputs, location);
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return FERMENTATION_BARREL_DISPLAY;
    }
}
