package satisfyu.nethervinery.client.gui;

import com.mojang.blaze3d.vertex.PoseStack;
import de.cristelknight.doapi.client.recipebook.screen.AbstractRecipeBookGUIScreen;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import satisfyu.nethervinery.NetherVineryIdentifier;
import satisfyu.nethervinery.client.gui.handler.AgingBarrelGuiHandler;
import satisfyu.nethervinery.client.recipebook.AgingBarrelRecipeBook;

@Environment(EnvType.CLIENT)
public class AgingBarrelGui extends AbstractRecipeBookGUIScreen<AgingBarrelGuiHandler> {

    public AgingBarrelGui(AgingBarrelGuiHandler handler, Inventory inventory, Component title) {
        super(handler, inventory, title, new AgingBarrelRecipeBook(), new NetherVineryIdentifier("textures/gui/barrel_gui.png"));
    }

    @Override
    protected void init() {
        super.init();
        titleLabelX += 20;
    }

    @Override
    public void renderProgressArrow(PoseStack matrices) {
        int progress = this.menu.getScaledProgress(23);
        this.blit(matrices, leftPos + 94, topPos + 37, 177, 17, progress, 10); //Position Arrow
    }
}
