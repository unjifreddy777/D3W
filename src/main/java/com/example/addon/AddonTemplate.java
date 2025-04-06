package com.example.addon;

import com.example.addon.commands.CommandExample;
import com.example.addon.modules.ModuleExample;
import com.example.addon.modules.NettyCrasherModule;
import com.example.addon.hud.MinjaeHud;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.categories.Category;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.utils.network.GithubRepo;

import org.slf4j.Logger;
import org.slf4j.helpers.NOPLogger; // LogUtils 대신 문제 없게 처리

public class AddonTemplate extends MeteorAddon {
    public static final Logger LOG = NOPLogger.NOP_LOGGER; // 로거 임시 사용 (LogUtils 오류 회피용)
    public static final Category CATEGORY = new Category("Example");
    public static final HudGroup HUD_GROUP = new HudGroup("Example");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Addon Template");

        // Modules
        Modules.get().add(new ModuleExample());
        Modules.get().add(new NettyCrasherModule());

        // Commands
        Commands.add(new CommandExample());

        // HUDs
        Hud.get().register(HudExample.INFO); // ✅ HUD 등록
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("MeteorDevelopment", "meteor-addon-template");
    }
}
