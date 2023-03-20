public class Ave extends Animal {
    private String tipoBico;

    public Ave (String nome, int idade, String especie, boolean alimentado, String tipoBico){
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.alimentado = alimentado;
        this.tipoBico = tipoBico;
    }

    public void emitirSom(){
        System.out.println("Som de Ave");
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
