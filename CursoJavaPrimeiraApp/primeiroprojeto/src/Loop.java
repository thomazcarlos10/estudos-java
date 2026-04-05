void main() {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    double average = 0;
    double note;

    for (int i = 0; i < 3; i++) {
        System.out.print("Diga sua avaliação para o filme: ");
        note = scanner.nextDouble();
        average += note;
    }

    System.out.println("Média de avaliações: " + average / 3);
}