package fr.pixfri.pixfrimod.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.*;
import org.jetbrains.annotations.NotNull;

public class ModResultSlot extends SlotItemHandler {
    public ModResultSlot(IItemHandler itemHandler, int index, int x, int y) {
        super(itemHandler, index, x, y);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return false;
    }
}
