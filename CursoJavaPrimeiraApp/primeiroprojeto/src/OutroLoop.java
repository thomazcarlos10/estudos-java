void main() {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    double average = 0;
    double note = 0;
    int totalNotes = 0;

    while (note != -1) {
        System.out.print("Diga sua avaliação para o filme ou -1 para encerrar: ");
        note = scanner.nextDouble();

        if (note != -1) {
            average += note;
            totalNotes++;
        }
    }

    System.out.println("Média de avaliações: " + average / totalNotes);
}