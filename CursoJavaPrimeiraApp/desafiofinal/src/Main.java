void main() {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    double initialBalance = 2500.0;
    String name = "Carlos Eduardo";
    String accType = "Corrente";

    System.out.println("****************************************************");
    System.out.println("Dados iniciais do cliente: \n");
    System.out.println("Nome:          " + name);
    System.out.println("Tipo conta:    " + accType);
    System.out.printf("Saldo inicial: R$ %.2f", initialBalance);
    System.out.println("\n\n****************************************************");

    int option = 0;
    String menu = """
            1 - Consultar saldos
            2 - Receber valor
            3 - Transferir valor
            4 - Sair
            """;

    while (option != 4) {
        System.out.println("\n\nOperações:\n\n");
        System.out.println(menu);

        System.out.print("Digite a opção desejada: ");
        option = scanner.nextInt();

        if (option == 1) {
            System.out.printf("O saldo atual é R$: %.2f", initialBalance);
        } else if (option == 2) {
            System.out.print("Informe o valor a receber: R$ ");
            double amountReceive = scanner.nextDouble();
            initialBalance += amountReceive;
            System.out.printf("Saldo atualizado: R$ %.2f", initialBalance);
        } else if (option == 3) {
            System.out.print("Informe o valor que deseja transferir: R$ ");
            double amountTransfer = scanner.nextDouble();
            if (amountTransfer > initialBalance) {
                System.out.println("Não há saldo suficiente para fazer essa transferência.");
            } else {
                initialBalance -= amountTransfer;
                System.out.printf("Saldo atualizado: R$ %.2f", initialBalance);
            }
        } else if (option == 4) {
            System.out.println("Encerrando o programa!");
        } else {
            System.out.println("Número inválido!");
        }
    }

    scanner.close();
}