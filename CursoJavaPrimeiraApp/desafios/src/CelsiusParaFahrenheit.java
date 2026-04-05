void main() {

    double tempCelsius = 30.4;
    double tempFahrenheit = (tempCelsius * 1.8) + 32;

    String msg = String.format("A temperatura de %.2fº Celsius é equivalente a %.2fº Fahrenheit", tempCelsius, tempFahrenheit);

    System.out.println(msg);

    int tempFahrenheitInt = (int) tempFahrenheit;

    System.out.println("A temperatura em Fahrenheit inteira é: " + tempFahrenheitInt + "º");
}