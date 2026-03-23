public class Principal {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.00);
        Produto p2 = new Produto("Mouse", 80.00);
        Produto p3 = new Produto();

        p3.nome = "Teclado";
        p3.preco = 150.00;

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();

        Produto.exibirQuantidadeTotal();
    }
}