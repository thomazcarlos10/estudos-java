void main() {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    System.out.print("Digite o limite do cartão: ");
    double limit = scanner.nextDouble();

    CreditCard creditCard = new CreditCard(limit);

    int choice = 1;
    while (choice != 0) {
        scanner.nextLine();
        System.out.print("Digite a descrição da compra: ");
        String name = scanner.nextLine();
        System.out.print("Digite o valor da compra: ");
        double value = scanner.nextDouble();

        Product product = new Product(name, value);
        creditCard.purchase(product);
        productList.add(product);

        System.out.print("Digite 0 para sair ou 1 para continuar: ");
        choice = scanner.nextInt();
    }

    System.out.println("\n************************************");
    System.out.println("\nCompras Realizadas:\n");

    productList.sort(Comparator.comparing(Product::getValue));
    for (Product p : productList) {
        System.out.println(p.toString());
    }
    System.out.println("\n************************************\n");
    System.out.printf("Saldo do cartão: %.2f", creditCard.getBalance());

    scanner.close();
}