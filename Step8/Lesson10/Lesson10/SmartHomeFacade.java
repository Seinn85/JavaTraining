package Lesson10;

class SmartHomeFacade{
    private LightSystem lightSystem;
    private AirConditionerSystem airConditionerSystem;
    private DoorLockSystem doorLockSystem;

    public SmartHomeFacade() {
        this.lightSystem = new LightSystem();
        this.airConditionerSystem = new AirConditionerSystem();
        this.doorLockSystem = new DoorLockSystem();
    }

    // お出かけモード
    public void awayMode() {
        System.out.println("お出（で）かけモードを開始（かいし）します...");
        lightSystem.turnOff();
        airConditionerSystem.turnOff();
        doorLockSystem.lock();
        System.out.println("お出（で）かけモードが完了（かんりょう）しました。\n");
    }

    // 帰宅モード
    public void homeMode() {
        System.out.println("帰宅（きたく）モードを開始（かいし）します...");
        doorLockSystem.unlock();
        lightSystem.turnOn();
        airConditionerSystem.turnOn();
        System.out.println("帰宅（きたく）モードが完了（かんりょう）しました。\n");
    }
}