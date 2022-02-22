package io.github.mooy1.infinityexpansion.commands;

import java.util.List;

import javax.annotation.Nonnull;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinitylib.commands.SubCommand;

public final class PrintItem extends SubCommand {

    public PrintItem() {
        super("printitem", "顯示該物品的內部資料來進行除錯目的", "infinityexpansion.printitem");
    }

    @Override
    protected void execute(@Nonnull CommandSender commandSender, @Nonnull String[] strings) {
        if (!(commandSender instanceof Player)) {
            return;
        }

        Player p = (Player) commandSender;

        ItemStack item = p.getInventory().getItemInMainHand();

        if (item.getType() == Material.AIR) {
            p.sendMessage(ChatColor.RED + "你必須拿著物品!");
            return;
        }

        p.sendMessage(item.toString());
    }

    @Override
    protected void complete(@Nonnull CommandSender commandSender, @Nonnull String[] strings, @Nonnull List<String> list) {

    }

}
