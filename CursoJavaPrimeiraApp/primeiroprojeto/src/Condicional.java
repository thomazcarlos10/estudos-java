void main() {

    int yearRelease = 2022;
    boolean includedInThePlan = false;
    double movieRating = 8.1;
    String planType = "plus";

    if (yearRelease >= 2022) {
        System.out.println("Lançamento que os clientes estão curtindo!");
    } else {
        System.out.println("Filme retrô que vale a pena assistir!");
    }

    if (includedInThePlan || planType.equals("plus")) {
        System.out.println("Filme liberado");
    } else {
        System.out.println("Deve pagar a locação");
    }
}