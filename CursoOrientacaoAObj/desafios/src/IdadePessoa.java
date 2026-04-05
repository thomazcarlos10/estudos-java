public class IdadePessoa {

    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void maiorIdadeOuMenorIdade() {
        if (idade >= 18) {
            System.out.println("Maior de Idade.");
        } else {
            System.out.println("Menor de Idade");
        }
    }
}