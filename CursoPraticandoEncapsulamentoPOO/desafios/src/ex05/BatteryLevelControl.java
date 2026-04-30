package ex05;

public class BatteryLevelControl {
    private Integer batteryLevel;

    public void setBatteryLevel(Integer batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        }
    }

    public void batteryStats() {
        if (batteryLevel <= 20) {
            System.out.println("Status: Bateria fraca");
        } else if (batteryLevel < 80) {
            System.out.println("Status: Bateria ok");
        } else {
            System.out.println("Status: Bateria cheia");
        }
    }
}