import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Lista {
    List<Produto> lista = new ArrayList<Produto>();

    public void adicionarProduto(Produto produto){
        lista.add(produto);
    }

    public void listarProdutos(){
        for (Produto produto : lista) {
            System.out.println(produto.nome);
            System.out.println(produto.preco);
        }
        if (lista.size() == 0){
            throw new RuntimeException ("Tamanhodalist nao pode ser 0");
        }
    }

    public Produto procurarProduto(String nome){
        for (Produto produto : lista) {
            if (Objects.equals(nome, produto.nome)) {
                return produto;
            }
        }
        throw new RuntimeException("Produto não encontrado");
    }

    public void venderProduto(){
        System.out.println("Busque o produto que o cliente quer comprar: ");
        Scanner x=new Scanner(System.in);
        String nome = x.nextLine();
        procurarProduto(nome);

        System.out.println("Quanto dinheiro o cliente ofereceu?");
        x = new Scanner(System.in);
        double preco = x.nextDouble();
        if (procurarProduto(nome).preco > preco){
            throw new RuntimeException("Faltou dinheiro para a compra");
        }
        else if (procurarProduto(nome).preco == preco) {
            System.out.println(nome +" comprado, nao ha troco");
        }
        else {
        	double troco = preco - procurarProduto(nome).preco;
        	System.out.println("comprado, R$"+troco+" de troco a ser devolvido");
        }
    }
}
