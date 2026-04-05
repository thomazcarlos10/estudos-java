void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int number = scanner.nextInt();

    if (number > 0) {
        System.out.println("Número positivo");
    } else {
        System.out.println("Número negativo");
    }

    scanner.close();
}