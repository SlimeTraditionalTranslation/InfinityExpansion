package io.github.mooy1.infinityexpansion;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

import io.github.mooy1.infinityexpansion.commands.GiveRecipe;
import io.github.mooy1.infinityexpansion.commands.PrintItem;
import io.github.mooy1.infinityexpansion.commands.SetData;
import io.github.mooy1.infinitylib.AbstractAddon;
//import io.github.mooy1.infinitylib.bstats.bukkit.Metrics;
import io.github.mooy1.infinitylib.commands.AbstractCommand;

public final class InfinityExpansion extends AbstractAddon {
    
    private static InfinityExpansion instance;
    
    public static InfinityExpansion inst() {
        return instance;
    }
    
    @Override
    public void onEnable() {
        instance = this;
        super.onEnable();
        
        Setup.setup(this);

        if (getServer().getPluginManager().getPlugin("LiteXpansion") != null) {
            runSync(() -> log(Level.WARNING,
                    "########################################################",
                    "LiteXpansion 削弱(nerfs)此附加的能源發電機.",
                    "你可以在LiteXpansion的config內關閉此削弱.",
                    "在 'options:' 增加 'nerf-other-addons: false'",
                    "########################################################"
            ));
        }
    }

    //@Override
    /*protected Metrics setupMetrics() {
        return new Metrics(this, 8991);
    }*/

    @Override
    protected String getGithubPath() {
        return "xMikux/InfinityExpansion/master";
    }

    @Override
    protected List<AbstractCommand> getSubCommands() {
        return Arrays.asList(new GiveRecipe(), new SetData(), new PrintItem());        
    }

    @Override
    public void onDisable() {
        instance = null;
    }
    
}
