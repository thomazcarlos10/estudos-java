import ex09.LateFee;
import ex01.Product;
import ex02.Book;
import ex03.ZeroingBalance;
import ex04.TemperatureControl;
import ex05.CalculatingGrades;
import ex06.CorrectingRegistration;
import ex07.TaskControl;
import ex08.InventoryControl;
import ex10.ShoppingCart;

void main() {
    Locale.setDefault(Locale.US);

    // Ex01
    Product product = new Product();

    product.name = "Mouse Gamer";
    product.price = 159.90;
    product.quantity = 25;

    product.displayInformation();

    // Ex02
    System.out.println();
    Book book = new Book();

    book.title = "O Guia do Mochileiro das Galáxias";
    book.author = "Douglas Adams";
    book.pagesNumber = 208;

    book.displayInformation();

    // Ex03
    System.out.println();
    ZeroingBalance zeroingBalance = new ZeroingBalance();

    zeroingBalance.balance = 1579.42;

    zeroingBalance.displayBalance();
    zeroingBalance.resetBalance();
    zeroingBalance.displayBalance();

    // Ex04
    System.out.println();
    TemperatureControl temperatureControl = new TemperatureControl();

    temperatureControl.local = "Setor A";
    temperatureControl.currentTemperature = 39.2;

    temperatureControl.displayInfo();

    // Ex05
    System.out.println();
    CalculatingGrades calculatingGrades = new CalculatingGrades();

    calculatingGrades.name = "João Silva";
    calculatingGrades.g1 = 6.5;
    calculatingGrades.g2 = 7.5;

    calculatingGrades.calculateAverage();

    // Ex06
    System.out.println();
    CorrectingRegistration correctingRegistration = new CorrectingRegistration();

    correctingRegistration.name = "Júlia Oliveira";
    correctingRegistration.position = "Pessoa Desenvolvedora Júnior";
    correctingRegistration.accessLevel = 1;

    correctingRegistration.updateData("Pessoa Desenvolvedora Plena", 2);

    // Ex07
    System.out.println();
    List<TaskControl> list = new ArrayList<>();

    TaskControl t1 = new TaskControl();
    t1.description = "Estudar Java";
    t1.completed = false;

    TaskControl t2 = new TaskControl();
    t2.description = "Fazer exercícios";
    t2.completed = true;

    list.add(t1);
    list.add(t2);

    for (TaskControl t : list) {
        t.displayInfo();
    }

    // Ex08
    System.out.println();
    InventoryControl item = new InventoryControl();

    item.name = "Camiseta";
    item.quantity = 10;

    item.toSell(3);
    item.toSell(8);

    // Ex09
    System.out.println();
    LateFee lateFee = new LateFee();

    lateFee.title = "Dom Casmurro";
    lateFee.daysOfDelay = 3;

    lateFee.displayInfo();

    // Ex10
    System.out.println();
    List<ShoppingCart> shoppingCartList = new ArrayList<>();

    ShoppingCart i1 = new ShoppingCart();
    i1.name = "Teclado";
    i1.price = 120.0;
    i1.quantity = 1;

    ShoppingCart i2 = new ShoppingCart();
    i2.name = "Mouse";
    i2.price = 60.0;
    i2.quantity = 2;

    shoppingCartList.add(i1);
    shoppingCartList.add(i2);

    double totalPurchase = 0.0;
    for (ShoppingCart i : shoppingCartList) {
        totalPurchase += i.totalCalculation();
    }

    System.out.printf("Total da compra: R$ %.2f", totalPurchase);
}