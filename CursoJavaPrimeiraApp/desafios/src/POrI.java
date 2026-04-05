void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
        System.out.println("O número digitado é par!");
    } else {
        System.out.println("O número digitado é ímpar!");
    }

    scanner.close();
}