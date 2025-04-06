package com.example.addon.hud;

import com.example.addon.AddonTemplate;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class HudExample extends HudElement {
    public static final HudElementInfo<HudExample> INFO = new HudElementInfo<>(
        AddonTemplate.HUD_GROUP,
        "hud-example",
        "Displays example HUD.",
        HudExample::new
    );

    public HudExample() {
        super(INFO);
    }

    @Override
    public void render(HudRenderer renderer) {
        String text = "Example HUD";
        setSize(renderer.textWidth(text, true), renderer.textHeight(true));
        renderer.quad(x, y, getWidth(), getHeight(), Color.BLACK);
        renderer.text(text, x, y, Color.CYAN, true);
    }
}

