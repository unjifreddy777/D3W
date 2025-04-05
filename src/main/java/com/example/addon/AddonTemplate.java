public class AddonTemplate extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Example");
    public static final HudGroup HUD_GROUP = new HudGroup("Example");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Addon Template");

        // Modules
        Modules.get().add(new ModuleExample());
        Modules.get().add(new NettyCrasherModule()); // ✅ 추가 완료!

        // Commands
        Commands.add(new CommandExample());

        // HUDs
        Hud.get().register(HudExample.INFO);
        Hud.get().register(MinjaeHud.INFO); // ✅ HUD 등록도 OK!
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

