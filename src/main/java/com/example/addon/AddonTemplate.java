package com.example.addon;

import com.example.addon.modules.TheMinjaeNettyCrasher;
import com.example.addon.hud.MinjaeHud;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.categories.Category;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;

import org.slf4j.Logger;
import org.slf4j.helpers.NOPLogger;

public class AddonTemplate extends MeteorAddon {
    public static final Logger LOG = NOPLogger.NOP_LOGGER;

    // ✅ 카테고리 추가
    public static final Category CATEGORY = new Category("Minjae");
    public static final HudGroup HUD_GROUP = new HudGroup("Minjae Addon");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Minjae's Meteor Addon");

        // Modules
        Modules.get().add(new TheMinjaeNettyCrasher());

        // HUDs
        Hud.get().register(MinjaeHud.INFO);
    }

    // ✅ 카테고리 등록 메서드 추가
    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}


