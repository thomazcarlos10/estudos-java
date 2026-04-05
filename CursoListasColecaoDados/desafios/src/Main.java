import interfaces.Forma;

void main() {

    // Ex01
    Pessoa pessoa1 = new Pessoa("Carlos", 21);
    Pessoa pessoa2 = new Pessoa("Elisangela", 47);
    Pessoa pessoa3 = new Pessoa("Maria", 18);

    // Ex02
    ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

    // Ex03
    listaDePessoas.add(pessoa1);
    listaDePessoas.add(pessoa2);
    listaDePessoas.add(pessoa3);

    // Ex04
    System.out.println("Tamanho da Lista: " + listaDePessoas.size());

    // Ex05
    System.out.println("Primeira pessoa da lista: " + listaDePessoas.getFirst());

    // Ex06
    System.out.println("Lista completa: ");
    for (Pessoa pessoa : listaDePessoas) {
        System.out.println(pessoa);
    }

    // Ex07/09
    System.out.println();
    Produto produto1 = new Produto("Carro", 150000.00, 1);
    Produto produto2 = new Produto("Iphone 17", 5000.00, 2);
    Produto produto3 = new Produto("Bicicleta", 1500.00, 4);

    ArrayList<Produto> produtos = new ArrayList<>();
    produtos.add(produto1);
    produtos.add(produto2);
    produtos.add(produto3);
    System.out.println("Tamanho da lista: " + produtos.size());
    System.out.println("Recuperando pelo índice: " + produtos.get(1).toString());

    // Ex08
    System.out.println("Lista de produtos:");
    for (Produto p : produtos) {
        System.out.println(p);
    }

    // Ex10
    System.out.println();
    ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Banana", 3.30, 2, "03 dias");

    produtos.add(produtoPerecivel);
    System.out.println(produtos);

    // Ex11
    System.out.println();
    ArrayList<String> strings = new ArrayList<>();
    strings.add("Banana");
    strings.add("Bicicleta");
    strings.add("Carro");
    strings.forEach(System.out::println);

    // Ex12
    Cachorro cachorro = new Cachorro();
    Animal animal = (Animal) cachorro;

    // Ex13
    if (animal instanceof Cachorro) {
        Cachorro cachorro1 = (Cachorro) animal;
    } else {
        System.out.println("O objeto não é um Cachorro.");
    }

    // Ex14
    System.out.println();
    Product product1 = new Product("Moto", 12000.00);
    Product product2 = new Product("Pc Gamer", 10000.00);
    Product product3 = new Product("Notebook", 4000.00);

    List<Product> listaDeProdutos = new ArrayList<>();
    listaDeProdutos.add(product1);
    listaDeProdutos.add(product2);
    listaDeProdutos.add(product3);
    double avg;
    double sum = 0.0;
    for (Product p : listaDeProdutos) {
        sum += p.getPrice();
    }
    avg = sum / listaDeProdutos.size();
    System.out.println("Preço médio: R$ " + avg);

    // Ex15
    System.out.println();
    Circulo circulo = new Circulo();

    Quadrado quadrado = new Quadrado();

    List<Forma> formas = new ArrayList<>();
    formas.add(quadrado);
    formas.add(circulo);
    for (Forma f : formas) {
        if (f instanceof Quadrado) {
            System.out.println("Área do Quadrado: " + f.calcularArea(6));
        } else {
            System.out.println("Área do Círculo: " + f.calcularArea(2));
        }
    }

    // Ex16
    System.out.println();
    ContaBancaria contaBancaria1 = new ContaBancaria(18229, 18000.00);
    ContaBancaria contaBancaria2 = new ContaBancaria(18230, 15000.00);
    ContaBancaria contaBancaria3 = new ContaBancaria(18231, 20000.00);

    List<ContaBancaria> listaContaBancarias = new ArrayList<>();
    listaContaBancarias.add(contaBancaria1);
    listaContaBancarias.add(contaBancaria2);
    listaContaBancarias.add(contaBancaria3);

    ContaBancaria maiorSaldo = listaContaBancarias.get(0);
    for (ContaBancaria c : listaContaBancarias) {
        if (c.getSaldo() > maiorSaldo.getSaldo()) {
            maiorSaldo = c;
        }
    }
    System.out.println("Número da conta com maior saldo: " + maiorSaldo.getNumber() + " e o saldo dessa conta é: R$ " + maiorSaldo.getSaldo());

    // Ex17
    System.out.println();
    List<Integer> list = new ArrayList<>();
    for (int i = 50; i >= 1; i--) {
        list.add(i);
    }
    System.out.println("Antes de ordenar em ordem Crescente: " + list);
    Collections.sort(list);
    System.out.println("Depois de ordenar em ordem Crescente: " + list);

    // Ex 18/19
    System.out.println();
    Title title1 = new Title("Rambo");
    Title title2 = new Title("Mercenários");
    Title title3 = new Title("A hora do Rush");

    List<Title> titles = new ArrayList<>();
    titles.add(title1);
    titles.add(title2);
    titles.add(title3);

    Collections.sort(titles);
    System.out.println("Ordenando por ordem alfabética: " + titles);

    // Ex 20
    System.out.println();
    List<String> listArrayList = new ArrayList<>();
    listArrayList.add("Carlos");
    listArrayList.add("Sergio");
    System.out.println("ArrayList: " + listArrayList);

    List<String> listLinkedList = new LinkedList<>();
    listLinkedList.add("Maria");
    listLinkedList.add("Elisangela");
    System.out.println("LinkedList: " + listLinkedList);

    // Ex21
    System.out.println();
    List<String> polymorphicList;
    polymorphicList = new ArrayList<>();
    polymorphicList.add("A");
    polymorphicList.add("B");
    System.out.println("ArrayList: " + polymorphicList);

    polymorphicList = new LinkedList<>();
    polymorphicList.add("1");
    polymorphicList.add("2");
    System.out.println("LinkedList: " + polymorphicList);
}