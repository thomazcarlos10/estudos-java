import Heranca.*;
import Interface.*;

void main() {

    // Ex01
    Pessoa pessoa = new Pessoa();
    pessoa.comprimentar();

    // Ex02
    System.out.println();
    Calculadora calculadora = new Calculadora();
    System.out.println("O dobro do número recebido é: " + calculadora.number(10));

    // Ex03
    System.out.println();
    Musica musica = new Musica();
    musica.titulo = "21 Questions";
    musica.artista = "50 Cent";
    musica.anoLancamento = 2003;
    musica.fichaTecnica();
    musica.avaliarMusica(10);
    musica.avaliarMusica(9.3);
    musica.avaliarMusica(8.9);
    System.out.println("Avaliação média da música: " + musica.mediaAvaliacoes());

    // Ex04
    System.out.println();
    Carro carro = new Carro();
    carro.modelo = "Toyota Corolla";
    carro.ano = 2016;
    carro.cor = "Prata";
    carro.fichaTecnica();
    System.out.println("Idade do carro em anos: " + carro.calcularIdade(2026));

    // Ex05
    System.out.println();
    Aluno aluno = new Aluno();
    aluno.nome = "César";
    aluno.idade = 17;
    aluno.exibirInformacoes();

    // Ex06
    System.out.println();
    ContaBancaria contaBancaria = new ContaBancaria();
    contaBancaria.setNumeroConta(123456);
    contaBancaria.setSaldo(15000.50);
    contaBancaria.titular = "Carlos";
    System.out.println("Titular: " + contaBancaria.titular);
    System.out.println("Número da conta: " + contaBancaria.getNumeroConta());
    System.out.println("Saldo: " + contaBancaria.getSaldo());

    // Ex07
    System.out.println();
    IdadePessoa idadePessoa = new IdadePessoa();
    idadePessoa.setNome("Maria Vitoria");
    idadePessoa.setIdade(18);
    System.out.println("Nome: " + idadePessoa.getNome());
    System.out.println("Idade: " + idadePessoa.getIdade());
    idadePessoa.maiorIdadeOuMenorIdade();

    // Ex08
    System.out.println();
    Produto produto = new Produto();
    produto.setNome("Carro");
    produto.setPreco(1000.00);
    System.out.println("Nome do produto: " + produto.getNome());
    System.out.println("Preço do produto: " + produto.getPreco());
    produto.aplicarDesconto(10);
    System.out.println("Preço do produto com desconto: " + produto.getPreco());

    // Ex09
    System.out.println();
    Student student = new Student();
    student.setNome("José");
    student.setNota1(10.0);
    student.setNota2(6.5);
    student.setNota3(7.8);
    System.out.println("Nome do aluno: " + student.getNome());
    System.out.println("Média das notas do aluno: " + student.average());

    // Ex10
    System.out.println();
    Livro livro = new Livro();
    livro.setTitulo("Entendendo Algoritmos");
    livro.setAutor("Aditya Bhargava");
    livro.exibirDetalhes();

    // Ex11
    System.out.println();

    ModelCar modelCar = new ModelCar();
    modelCar.definirNomeModelo("Sedan");
    modelCar.definirPreco(30000, 32000, 35000);
    modelCar.exibirInfo();

    // Ex12
    System.out.println();
    Cachorro cachorro = new Cachorro();
    cachorro.emitirSom();
    cachorro.abanarRabo();

    Gato gato = new Gato();
    gato.emitirSom();
    gato.arranharMoveis();

    // Ex13
    System.out.println();
    ContaCorrente contaCorrente = new ContaCorrente();
    contaCorrente.depositar(5000.00);
    contaCorrente.sacar(2500.00);
    contaCorrente.consultarSaldo();
    contaCorrente.setTarifaMensal(50.00);
    contaCorrente.cobrarTarifaMensal();
    contaCorrente.consultarSaldo();

    // Ex14
    System.out.println();
    VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
    verificadorPrimo.verificarSeEhPrimo(11);

    GeradorPrimo geradorPrimo = new GeradorPrimo();
    System.out.println("O próximo número primo é: " + geradorPrimo.gerarProximoPrimo(13));

    // Ex15
    System.out.println();
    ConversorMoeda conversorMoeda = new ConversorMoeda(5.25, 1000.00);
    System.out.println("Convertendo o dollar para real temos R$" + conversorMoeda.converterDolarParaReal());

    // Ex16
    System.out.println();
    CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular(2.0, 5.0);
    System.out.println("Área do retangulo: " + calculadoraSalaRetangular.calcularArea());
    System.out.println("Perimetro do retangulo: " + calculadoraSalaRetangular.calcularPerimetro());

    // Ex17
    System.out.println();
    TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao(7);
    tabuadaMultiplicacao.mostrarTabuada();

    // Ex18
    System.out.println();
    ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao(50);
    System.out.println("Convertendo " + conversor.getTemperatura() + "ºC para Fahrenheit temos: " + conversor.celsiusParaFahrenheit() + "ºF");
    System.out.println("Convertendo " + conversor.getTemperatura() + "ºF para Celcius temos: " + conversor.fahrenheitParaCelsius() + "ºC");

    // Ex19
    System.out.println();
    Book book = new Book(1000.00);
    ProdutoFisico produtoFisico = new ProdutoFisico(1000.00);
    System.out.println("Preço do livro com acréscimo de 10% R$ " + book.calcularPrecoFinal());
    System.out.println("Preço do produto físico com desconto de 10% R$ " + produtoFisico.calcularPrecoFinal());

    // Ex20
    System.out.println();
    Product product = new Product(1500.00);
    product.precoTotal(15);
    product.aplicarDesconto(0.1);
    System.out.println("O valor total com desconto é R$ " + product.getTot());

    Service service = new Service(1600.00);
    service.precoTotal(10);
    service.aplicarDesconto(0.2);
    System.out.println("O valor total com desconto é R$ " + service.getTot());
}