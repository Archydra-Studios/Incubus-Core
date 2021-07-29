package azzy.fabric.incubus_core.recipe.processor;

import azzy.fabric.incubus_core.json.JsonUtils;
import com.google.gson.JsonElement;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import org.jetbrains.annotations.NotNull;

public class StackComponent extends NamedComponent<ItemStack> {

    private StackComponent(String componentName) {
        super(componentName);
    }

    @Override
    public ItemStack readFromJson(JsonElement json) {
        return JsonUtils.stackFromJson(json.getAsJsonObject());
    }

    @Override
    public void writeToBuf(PacketByteBuf buf, ItemStack component) {
        buf.writeItemStack(component);
    }

    @Override
    public @NotNull ItemStack readFromBuf(PacketByteBuf buf) {
        return buf.readItemStack();
    }
}
