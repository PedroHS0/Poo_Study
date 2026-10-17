package Q1;

public class Jogo {

    private String titulo;
    private double preco;
    private int estoque;

    public Jogo(String titulo, double preco, int estoque) {
        this.titulo = titulo;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Estoque: " + estoque);
        System.out.println();
    }
    public void vender(int quantidade) {
        if (quantidade > estoque ) {
            System.out.println("Estoque insuficiente");
            return;
        }
        estoque -= quantidade;
    }
    public void repor(int quantidade) {
        estoque += quantidade;
    }
}
