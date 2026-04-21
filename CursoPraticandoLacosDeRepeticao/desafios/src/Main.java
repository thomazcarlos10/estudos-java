void main() {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    // Ex01
    System.out.print("Digite a quantidade de degraus: ");
    int quantity = scanner.nextInt();

    for (int i = 1; i <= quantity; i++) {
        System.out.println("Subindo o degrau " + i);
    }
    System.out.println("Você chegou ao topo!");

    // Ex02
    System.out.println();
    int[] values = {10, 20, 30, 40, 50};
    int totalValue = 0;

    for (int i = 0; i < values.length; i++) {
        totalValue += values[i];
    }
    System.out.println("A soma total das receitas é: " + totalValue);

    // Ex03
    System.out.println();
    int sum = 0;

    for (int i = 1; i <= 100; i++) {
        if (i % 2 == 0) {
            sum += i;
        }
    }
    System.out.println("A soma dos números pares de 1 a 100 é: " + sum);

    // Ex04
    System.out.println();
    System.out.print("Digite um número: ");
    int number = scanner.nextInt();

    int fat = 1;
    for (int i = number; i >= 1; i--) {
        fat *= i;
    }
    System.out.println("O fatorial de " + number + " é: " + fat);

    // Ex05
    System.out.println();
    scanner.nextLine();
    System.out.print("Digite os números separados por espaço: ");
    String[] numbersStr = scanner.nextLine().split(" ");
    int bigger = Integer.MIN_VALUE;

    for (String numStr: numbersStr) {
        int num = Integer.parseInt(numStr);
        if (bigger < num) {
            bigger = num;
        }
    }
    System.out.println("O maior número é: " + bigger);

    // Ex06
    System.out.println();
    String correctPassword = "1234";

    for (int i = 3; i >= 1; i--) {
        int attempts = i;

        System.out.print("Digite sua senha: ");
        String password = scanner.nextLine();

        if (password.equalsIgnoreCase(correctPassword)) {
            System.out.println("Senha Correta! Acesso concedido!");
            break;
        } else if (i > 1) {
            System.out.println("Senha incorreta. Você tem " + (i - 1) + " tentativas restantes. ");
        } else {
            System.out.println("Conta bloqueada temporariamente.");
        }
    }

    // Ex07
    System.out.println();
    String name;

    do {
        System.out.print("Digite seu nome: ");
        name = scanner.nextLine();

        if (name.length() < 3) {
            System.out.println("Nome inválido. Digite novamente.");
        }
    } while (name.length() < 3);
    System.out.println("Nome " + name + " cadastrado com sucesso!");

    // Ex08
    System.out.println();
    int quantityPositives = 0;
    int quantityNegative = 0;

    while(true) {
        System.out.print("Digite um número (ou 'fim' para encerrar): ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("fim")) {
            break;
        }

        int num = Integer.parseInt(answer);

        if (num > 0) {
            quantityPositives++;
        } else {
            quantityNegative++;
        }
    }
    System.out.println("Números positivos: " + quantityPositives);
    System.out.println("Números negativos: " + quantityNegative);

    // Ex09
    System.out.println();

    System.out.print("Digite um número: ");
    int numberTyped = scanner.nextInt();

    for (int i = 1; i <= numberTyped; i++) {
        if (i % 10 == 5) {
            continue;
        }
        System.out.print(i + " ");
    }

    // Ex10
    System.out.println();
    List<String> names = new ArrayList<>();

    while (true) {
        System.out.print("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
        String nameTyped = scanner.nextLine().trim();

        if (nameTyped.equalsIgnoreCase("sair")) {
            System.out.println("Programa finalizado.");
            break;
        }

        if (nameTyped.equalsIgnoreCase("ver")) {
            System.out.println("Lista atualizada de convidados: " + names);
            continue;
        }

        boolean alreadyExists = false;
        for (String name : names) {
            if (name.toLowerCase().equals(nameTyped.toLowerCase())) {
                alreadyExists = true;
                break;
            }
        }

        if (alreadyExists) {
            System.out.println("O nome " + nameTyped + " já está na lista de convidados.");
        } else {
            names.add(nameTyped);
            System.out.println(nameTyped + " foi adicionado à lista de convidados.");
        }
    }

    scanner.close();
}