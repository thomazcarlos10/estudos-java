public class Vehicle {
    private String name;
    private String model;
    private Integer age;
    private Double price;

    public Vehicle(String name, String model, Integer age, Double price) {
        this.name = name;
        this.model = model;
        this.age = age;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{Name: " + name
                + ", Model: " + model
                + ", Age: " + age
                + ", Price: " + String.format("%.2f", price) + "}";
    }
}