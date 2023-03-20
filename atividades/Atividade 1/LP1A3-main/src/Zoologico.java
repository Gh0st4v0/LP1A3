import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    List<Animal> lista = new ArrayList<Animal>();

    public void adicionarAnimal(Animal animal){
        lista.add(animal);
        System.out.println(animal.nome+" entrou no zoologico");
    }

    public void listarAnimais(){
        for (int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i).nome);
        }
    }

    public void alimentarAnimais(){
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).alimentar();
        }
    }
}
