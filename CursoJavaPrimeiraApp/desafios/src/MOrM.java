void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int number1 = scanner.nextInt();

    System.out.print("Digite outro número inteiro: ");
    int number2 = scanner.nextInt();

    if (number1 == number2) {
        System.out.println("Os números digitados são iguais.");
    } else if (number1 > number2) {
        System.out.println("O primeiro número é maior");
    } else {
        System.out.println("O segundo número é maior");
    }

    scanner.close();
}