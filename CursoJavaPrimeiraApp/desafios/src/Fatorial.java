void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int number = scanner.nextInt();

    int result = 1;

    for (int i = 1; i <= number; i++) {
        result *= i;
    }

    System.out.println(result);

    scanner.close();
}