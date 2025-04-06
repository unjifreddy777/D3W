package com.example.addon;

import com.example.addon.commands.CommandExample;
import com.example.addon.modules.ModuleExample;
import com.example.addon.modules.TheMinjaeNettyCrasher;
import com.example.addon.hud.MinjaeHud;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.categories.Category;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;

import org.slf4j.Logger;
import org.slf4j.helpers.NOPLogger;

public class AddonTemplate extends MeteorAddon {
    public static final Logger LOG = NOPLogger.NOP_LOGGER;
    public static final Category CATEGORY = new Category("Example");
    public static final HudGroup HUD_GROUP = new HudGroup("Example");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Addon Template");

        Modules.get().add(new ModuleExample());
        Modules.get().add(new TheMinjaeNettyCrasher());

        Commands.add(new CommandExample());

        Hud.get().register(MinjaeHud.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}


