void main() {
    Scanner scanner = new Scanner(System.in);
    SearchCep searchCep = new SearchCep();

    System.out.print("Digite um número de CEP para consulta: ");
    String cep = scanner.nextLine();

    try {
        AddressData addressData = searchCep.searchAddress(cep);
        System.out.println(addressData);
        FileGenerator fileGenerator = new FileGenerator();
        fileGenerator.fileGeneratorJson(addressData);
    } catch (RuntimeException e) {
        System.out.println(e.getMessage());
        System.out.println("Finalizando a aplicação");
    }

    scanner.close();
}