void main() {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    // Ex01
    int number = 8;

    if (number % 2 == 0) {
        System.out.println("O número " + number + " é par.");
    } else {
        System.out.println("O número " + number + " é ímpar.");
    }

    // Ex02
    System.out.println();
    double average =  8.2;

    if (average < 5.0) {
        System.out.println("O estudante teve média " + average + " e foi reprovado.");
    } else if (average < 7.0) {
        System.out.println("O estudante teve média " + average + " e está de recuperação.");
    } else {
        System.out.println("O estudante teve média " + average + " e foi aprovado.");
    }

    // Ex03
    System.out.println();
    String correctPassword = "123456";

    System.out.print("Digite a senha: ");
    String passwordAttempt = scanner.nextLine();

    if (passwordAttempt.equals(correctPassword)) {
        System.out.println("Acesso permitido!");
    } else {
        System.out.println("Acesso negado!");
    }

    // Ex04
    System.out.println();
    System.out.print("Digite o primeiro número: ");
    int number1 = scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    int number2 = scanner.nextInt();

    if (number1 > number2) {
        System.out.println("O maior número é: " + number1);
    } else if (number2 > number1) {
        System.out.println("O maior número é: " + number2);
    } else {
        System.out.println("Os números são iguais.");
    }

    // Ex05
    System.out.println();
    System.out.print("Digite o valor da compra: ");
    double price = scanner.nextDouble();

    if (price >= 100.00) {
        double discount = price * 0.1;
        System.out.println("Desconto de 10% aplicado.");
        System.out.println("Novo valor: R$ " + (price - discount));
    } else {
        System.out.println("Nenhum desconto aplicado.");
        System.out.println("Valor total: R$ " + price);
    }

    // Ex06
    System.out.println();
    scanner.nextLine();
    System.out.print("Digite o dia da semana(em letras minúsculas): ");
    String dayOfTheWeek = scanner.nextLine();

    if (dayOfTheWeek.equals("segunda") || dayOfTheWeek.equals("terça")
            || dayOfTheWeek.equals("Quarta") || dayOfTheWeek.equals("quinta")
            || dayOfTheWeek.equals("sexta")) {
        System.out.println(dayOfTheWeek + " é um dia útil.");
    } else {
        System.out.println(dayOfTheWeek + " não e um dia útil");
    }

    // Ex07
    System.out.println();
    System.out.print("Digite o valor do empréstimo: ");
    int value = scanner.nextInt();

    if (value >= 1000 && value <= 5000) {
        System.out.println("O valor " + value + ", está dentro do intervalo permitido para empréstimo.");
    } else {
        System.out.println("O valor " + value + ", não está dentro do intervalo permitido para empréstimo.");
    }

    // Ex08
    System.out.println();
    System.out.print("Digite o primeiro lado: ");
    int l1 = scanner.nextInt();
    System.out.print("Digite o segundo lado: ");
    int l2 = scanner.nextInt();
    System.out.print("Digite o terceiro lado: ");
    int l3 = scanner.nextInt();

    if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
        System.out.println("Os lados podem formar um triângulo");
    } else {
        System.out.println("Os lados não podem formar um triângulo.");
    }

    // Ex09
    System.out.println();
    System.out.print("Digite a idade do doador: ");
    int age = scanner.nextInt();
    System.out.print("Digite o peso do doador(em kg): ");
    int weight = scanner.nextInt();

    boolean validAge = age >= 18 && age <= 65;
    boolean validWeight = weight > 50;

    if (validAge && validWeight) {
        System.out.println("Doador compatível");
    } else {
        System.out.println("O doador não é compatível");
        if (!validAge) {
            System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
        }
        if (!validWeight) {
            System.out.println("Motivo: Deve pesar mais de 50 kg.");
        }
    }

    // Ex10
    System.out.println();
    int correctCode = 2023;
    int minimumPermissionLevel = 1;
    int maximumPermissionLevel = 3;

    System.out.print("Digite o código de acesso: ");
    int code = scanner.nextInt();
    System.out.print("Digite o nível de permissão: ");
    int permission = scanner.nextInt();

    boolean validCode = code == correctCode;
    boolean validPermission = permission >= minimumPermissionLevel && permission <= maximumPermissionLevel;

    if (validCode && validPermission) {
        System.out.println("Acesso permitido. Bem-vindo ao sistema!");
    } else {
        System.out.println("Acesso negado. Tente novamente!");
        if (!validCode) {
            System.out.println("Código inválido!");
        }
        if (!validPermission) {
            System.out.println("Nível de permissão inválida!");
        }
    }
    scanner.close();
}