public class Mamifero extends Animal{
    private int tempoGestacao;

    public Mamifero (String nome, int idade, String especie, boolean alimentado, int tempoGestacao){
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.alimentado = alimentado;
        this.tempoGestacao = tempoGestacao;

    }

    public void emitirSom(){
        System.out.println("Som de mamífero");
    }

    public void alimentar() {
        if (alimentado == false) {
            alimentado = true;
            System.out.println(nome+" foi alimentado");
            emitirSom();
        }
        else{
            System.out.println(nome+" ja está alimentado");
        }
    }
}