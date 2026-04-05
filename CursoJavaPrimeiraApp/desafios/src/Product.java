void main() {

    double productPrice = 1525.0;
    int productQuantity = 15;

    System.out.println("Temos disponiveis " + productQuantity + " unidades de Iphone 17 ProMax e o preço é " + productPrice + " a unidade");

    double totalPrice = productPrice * productQuantity;
    System.out.println("Valor total do estoque: R$" + totalPrice);
}