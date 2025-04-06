package com.example.addon.hud;

import com.example.addon.AddonTemplate;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class MinjaeHud extends HudElement {
    public static final HudElementInfo<MinjaeHud> INFO = new HudElementInfo<>(
        AddonTemplate.HUD_GROUP,
        "minjaesense",
        "Displays the MinjaeSense version.",
        MinjaeHud::new
    );

    public MinjaeHud() {
        super(INFO);
    }

    @Override
    public void render(HudRenderer renderer) {
        String text = "MinjaeSense v0.0.1";

        setSize(renderer.textWidth(text, true), renderer.textHeight(true));

        // Optional: 배경 사각형
        renderer.quad(x, y, getWidth(), getHeight(), Color.BLACK);

        // 텍스트 렌더링
        renderer.text(text, x, y, Color.CYAN, true);
    }
}
