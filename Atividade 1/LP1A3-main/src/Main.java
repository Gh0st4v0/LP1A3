public class Main {
    public static void main(String args[]){
        Mamifero macaco = new Mamifero("Macaco", 20, "chimpanze", false, 8);
        Mamifero gorila = new Mamifero("Gorila", 20, "gorila silverback", true, 8);
        Reptil crocodilo = new Reptil("Crocodilo", 20, "crocodilo do nilo", false, 30);
        Ave beijaFlor = new Ave ("Beija-Flor", 20, "saíra-beija-flor", false, "longo");

        Zoologico zoo = new Zoologico();
        zoo.adicionarAnimal(macaco);
        zoo.adicionarAnimal(gorila);
        zoo.adicionarAnimal(crocodilo);
        zoo.adicionarAnimal(beijaFlor);

        zoo.alimentarAnimais();

        zoo.listarAnimais();
    }
}
