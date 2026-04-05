void main() {

    double originalPrice = 1500.0;
    double discountPercent = 10;
    double discountValue = originalPrice * (discountPercent * 0.01);
    double newPrice = originalPrice - discountValue;

    System.out.println("Preço original: R$" + originalPrice);
    System.out.println("Desconto: R$" + discountValue);
    System.out.println("Novo preço com desconto: R$" + newPrice);
}