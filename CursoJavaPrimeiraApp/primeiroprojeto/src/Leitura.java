void main() {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu filme favorito: ");
    String film = scanner.nextLine();
    System.out.print("Qual o ano de lançamento? ");
    int yearRelease = scanner.nextInt();
    System.out.print("Diga sua avaliação para o filme: ");
    double evaluation = scanner.nextDouble();

    System.out.println(film);
    System.out.println(yearRelease);
    System.out.println(evaluation);

    scanner.close();
}