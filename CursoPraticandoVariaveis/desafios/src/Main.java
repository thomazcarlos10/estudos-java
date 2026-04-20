void main() {
    // Ex01
    String name = "Maria";
    int personAge = 25;
    double height = 1.68;
    boolean student = true;

    System.out.println("Nome: " + name + "\nIdade: " + personAge + "\nAltura: " + height + "\nÉ estudante: " + student);

    // Ex02
    System.out.println();
    double doubleValue = 19.5;
    int intValue = (int) doubleValue;

    System.out.println("O valor inteiro do produto é: " + intValue);

    // Ex03
    System.out.println();
    double n1 = 7.5;
    double n2 = 8.0;
    double n3 = 9.0;

    double average = (n1 + n2 + n3) / 3.0;

    System.out.println("A média das notas é: " + average);

    // Ex04
    System.out.println();
    int celsius = 20;

    double fahrenheit = (celsius * 9 / 5.0) + 32;

    System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

    // Ex05
    System.out.println();
    String title = "O Pequeno Príncipe";
    String author = "Antoine de Saint-Exupéry";
    int pagesNumber = 96;
    double price = 39.99;
    char category = 'F';

    String categoryDescription = "";

    if (category == 'F') {
        categoryDescription = "Ficção";
    } else if (category == 'N') {
        categoryDescription = "Não-ficção";
    } else if (category == 'T') {
        categoryDescription = "Tecnologia";
    } else if (category == 'H') {
        categoryDescription = "História";
    } else {
        System.out.println("Categoria inválida!!!");
    }

    System.out.println("Livro cadastrado: " + title + ", de " + author + ". Ele possui " + pagesNumber + " páginas, custa R$" + price + " e pertence à categoria " + categoryDescription + ".");

    // Ex06
    System.out.println();
    double productPrice = 150.00;

    String productCategory;

    if (productPrice <= 50.00) {
        productCategory = "Econômico";
    } else if (productPrice <= 200.00) {
        productCategory = "Intermediário";
    } else {
        productCategory = "Premium";
    }
    System.out.println("Categoria do produto: " + productCategory);

    // Ex07
    System.out.println();
    int number = 7;

    if (number % 2 == 0) {
        System.out.println("O número é par!");
    } else {
        System.out.println("O número e ímpar!");
    }

    // Ex08
    System.out.println();
    double amountInReal = 451.50;
    double exchangeRate = 5.25;

    double amountInDollar = amountInReal / exchangeRate;

    System.out.println("O valor em dólares é: US$ " + amountInDollar);

    // Ex09
    System.out.println();
    int age = 17;
    String message;

    if (age >= 18) {
        message = "Você é maior de idade.";
    } else {
        message = "Você é menor de idade.";
    }

    System.out.println(message);

    // Ex10
    System.out.println();
    double averageConsumption = 12.5;
    double tankCapacity = 50;
    double currentFuel = 20;
    double tripDistance = 200;

    double maximumAutonomy = averageConsumption * tankCapacity;
    double currentAutonomy = averageConsumption * currentFuel;

    System.out.println("Autonomia máxima do veículo: " + maximumAutonomy + " km");
    System.out.println("Autonomia atual: " + currentAutonomy + " km");

    if (currentAutonomy >= tripDistance) {
        System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
    } else {
        System.out.println("Você não conseguirá completar a viagem, pare para abastecer.");
    }
}