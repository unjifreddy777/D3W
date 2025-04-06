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
        "Displays 'Minjae Sense' in top-left.",
        HudExample::new
    );

    public HudExample() {
        super(INFO);
        this.setPos(5, 5); // 왼쪽 위 살짝 띄운 위치
    }

    @Override
    public void render(HudRenderer renderer) {
        String text = "Minjae Sense";

        setSize(renderer.textWidth(text, true), renderer.textHeight(true));

        // 텍스트만 렌더링
        renderer.text(text, x, y, Color.CYAN, true);
    }
}
