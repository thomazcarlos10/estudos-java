public class Pessoa {

    private String name;
    private Integer age;

    public Pessoa(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Idade: " + age;
    }
}