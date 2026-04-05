void main() {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite sua 1ª nota: ");
    double n1 = scanner.nextDouble();
    System.out.print("Digite sua 2ª nota: ");
    double n2 = scanner.nextDouble();

    double average = (n1 + n2) / 2.0;
    System.out.println("A média das notas digitadas é: " + average);
}