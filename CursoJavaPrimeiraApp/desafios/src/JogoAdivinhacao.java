void main() {

    Scanner scanner = new Scanner(System.in);

    int generatedNumber = new Random().nextInt(100);
    int attempts = 5;
    int number = 0;

    for (int i = 1; i <= attempts; i++) {
        System.out.print("Adivinhe o número: ");
        number = scanner.nextInt();

        if (number == generatedNumber) {
            System.out.println("Parabéns, você acertou!");
            break;
        } else if (number > generatedNumber) {
            System.out.println("O número digitado é maior que o número gerado!");
        } else {
            System.out.println("O número digitado é menor que o número gerado!");
        }
    }

    if (attempts == 5 && number != generatedNumber) {
        System.out.println("\nVocê não conseguiu acertar o número em 05 tentativas. O número era: " + generatedNumber);
    }

    scanner.close();
}