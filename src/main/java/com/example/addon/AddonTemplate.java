ppackage com.example.addon;

import com.example.addon.modules.TheMinjaeNettyCrasher;
import com.example.addon.hud.MinjaeHud;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;

import org.slf4j.Logger;
import org.slf4j.helpers.NOPLogger;

public class AddonTemplate extends MeteorAddon {
    public static final Logger LOG = NOPLogger.NOP_LOGGER;
    public static final HudGroup HUD_GROUP = new HudGroup("Minjae Addon");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Minjae's Meteor Addon");

        // Modules
        Modules.get().add(new TheMinjaeNettyCrasher());

        // HUDs
        Hud.get().register(MinjaeHud.INFO);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}


