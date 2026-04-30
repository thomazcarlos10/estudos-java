import ex01.RegisteringVehicles;
import ex02.Contacts;
import ex03.ProductRegistration;
import ex04.PasswordControl;
import ex05.BatteryLevelControl;
import ex06.BankBalanceControl;
import ex07.MovieReview;
import ex08.LoginValidation;
import ex09.PointSystemStudents;
import ex10.GradeRecord;

void main() {
    // Ex01
    RegisteringVehicles vehicle = new RegisteringVehicles("Gol", "ABC-1234", 2020);

    System.out.println("Veículo cadastrado:");
    System.out.println("Modelo: " + vehicle.getModel());
    System.out.println("Placa: " + vehicle.getPlate());
    System.out.println("Ano: " + vehicle.getAge());

    // Ex02
    System.out.println();
    List<Contacts> contactList = new ArrayList<>();

    contactList.add(new Contacts("João Silva", "(11) 99999-0000"));
    contactList.add(new Contacts("Luana Santos", "(21) 98888-0000"));
    contactList.add(new Contacts("Pedro Oliveira", "(31) 97777-0000"));

    int index = 1;
    for (Contacts c : contactList) {
        System.out.printf("%d. %s - %s\n", index++, c.getName(), c.getTelephoneNumber());
    }

    // Ex03
    System.out.println();
    ProductRegistration product = new ProductRegistration();
    product.setName("Mouse");
    product.setPrice(-59.90);

    System.out.println("Produto: " + product.getName());
    System.out.println("Preço: " + String.format("%.2f", product.getPrice()));

    // Ex04
    System.out.println();
    PasswordControl password = new PasswordControl("123456");
    password.changePassword("123456", "abc123");

    // Ex05
    System.out.println();
    BatteryLevelControl battery = new BatteryLevelControl();
    battery.setBatteryLevel(85);
    battery.batteryStats();

    // Ex06
    System.out.println();
    BankBalanceControl account = new BankBalanceControl("Ana");
    account.toDeposit(1000.00);
    account.toWithdraw(200.00);
    account.displayBalance();

    // Ex07
    System.out.println();
    MovieReview movie = new MovieReview("Matrix");
    movie.evaluateMovie(5);
    movie.evaluateMovie(4);
    movie.evaluateMovie(5);
    movie.evaluateMovie(3);
    movie.evaluateMovie(4);
    movie.calculationAverage();

    // Ex08
    System.out.println();
    Scanner sc = new Scanner(System.in);
    LoginValidation loginValidation = new LoginValidation("aluno2025", "escola@123");
    int remainingAttempt = 3;

    while (remainingAttempt > 0) {
        System.out.print("Digite o seu usuário: ");
        String login = sc.nextLine();

        System.out.print("Digite a sua senha: ");
        String password1 = sc.nextLine();

        if (loginValidation.validatePassword(login, password1)) {
            System.out.println("Login bem-sucedido!");
            break;
        } else {
            remainingAttempt--;
            System.out.println("Senha incorreta. Tentativas restantes: " + remainingAttempt);
        }
    }
    sc.close();

    // Ex09
    System.out.println();
    PointSystemStudents students = new PointSystemStudents("Fernanda");
    students.earnPoints(120);
    students.displayStats();

    // Ex10
    System.out.println();
    GradeRecord gradeRecord = new GradeRecord("Matemática");
    gradeRecord.addGrade(7.5);
    gradeRecord.addGrade(11.0);
    gradeRecord.addGrade(8.0);
    gradeRecord.addGrade(-3.0);
    gradeRecord.addGrade(9.5);
    System.out.println("Total de notas válidas: " + gradeRecord.getCount());
    gradeRecord.averageGrades();
}