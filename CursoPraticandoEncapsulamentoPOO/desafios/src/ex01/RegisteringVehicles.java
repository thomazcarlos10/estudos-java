package ex01;

public class RegisteringVehicles {
    private String model;
    private String plate;
    private Integer age;

    public RegisteringVehicles(String model, String plate, Integer age) {
        this.model = model;
        this.plate = plate;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public Integer getAge() {
        return age;
    }
}