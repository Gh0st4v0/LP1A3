public class Reptil extends Animal{
    private double temperaturaCorporal;

    public Reptil (String nome, int idade, String especie, boolean alimentado, double temperaturaCorporal){
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.alimentado = alimentado;
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public void emitirSom() {
        System.out.println("Som de Reptil");
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
