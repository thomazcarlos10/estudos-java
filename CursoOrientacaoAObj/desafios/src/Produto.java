public class Produto {

    private String nome;
    private Double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(int percentual) {
        double desconto = preco * (percentual * 0.01);
        return preco -= desconto;
    }
}