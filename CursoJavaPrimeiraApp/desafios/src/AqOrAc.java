void main() {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    int escolha = 0;

    while (escolha != 3) {
        System.out.println("----------Menu----------");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.println("3. Sair");
        System.out.println("------------------------");
        System.out.print("\nDigite sua escolha: ");
        escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite o lado do quadrado: ");
            int lado = scanner.nextInt();
            double areaQ = Math.pow(lado, 2);
            System.out.println("A área do quadrado é: " + areaQ);
        } else if (escolha == 2) {
            System.out.print("Digite o raio do círculo: ");
            int raio = scanner.nextInt();
            System.out.println("Digite o valor de PI: ");
            double pi = scanner.nextDouble();
            double areaC = pi * Math.pow(raio, 2);
            System.out.println("A área do círculo é: " + areaC);
        } else if (escolha == 3) {
            System.out.println("Programa encerrado.");
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }


    scanner.close();
}