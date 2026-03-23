public class Produto {

    String nome;
    double preco;
    static int quantidadeTotal = 0;

    // construtor padrão
    public Produto() {
        quantidadeTotal++;
    }

    // construtor com parâmetros
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidadeTotal++;
    }

    // método para exibir dados
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("-----------------------");
    }

    // método estático para mostrar total
    public static void exibirQuantidadeTotal() {
        System.out.println("Total de produtos cadastrados: " + quantidadeTotal);
    }
}