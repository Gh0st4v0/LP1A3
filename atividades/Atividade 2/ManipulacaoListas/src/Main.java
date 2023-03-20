public class Main {
    public static void main(String[] args) {
        Lista novaLista = new Lista();
        Produto sabonete = new Produto("sabonete", 3.50);
        Produto chocolate = new Produto("chocolate", 10.99);
        Produto salgadinho = new Produto("salgadinho", 4.99);
        Produto refrigerante = new Produto("refrigerante", 6.99);

        novaLista.adicionarProduto(sabonete);
        novaLista.adicionarProduto(chocolate);
        novaLista.adicionarProduto(salgadinho);
        novaLista.adicionarProduto(refrigerante);

        novaLista.listarProdutos();

        novaLista.venderProduto();
    }
}