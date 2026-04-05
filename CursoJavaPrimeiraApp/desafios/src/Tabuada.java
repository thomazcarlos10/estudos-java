void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int number = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
        System.out.println(number + " x " + i + " = " + number * i);
    }


    scanner.close();
}