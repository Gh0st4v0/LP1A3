import java.util.ArrayList;
import java.util.List;

public class Departamento<T extends Funcionario> {
    private List<T> listaFuncionarios = new ArrayList<>();

    private List<Gerente> listaGerente = new ArrayList<>();

    Departamento(List <T> listaFuncionarios, List <Gerente> listaGerente ){
        this.listaGerente = listaGerente;
        this.listaFuncionarios = listaFuncionarios;
    }
    
    public void listarFuncionarios(){
        for (int i=0; i < listaFuncionarios.size(); i++){
            System.out.println(listaFuncionarios.get(i).getNome() + " " + listaFuncionarios.get(i).getId() + " " + listaFuncionarios.get(i).getSalario());
        }
    }

    public void listarAtrasados(int horario){
        for (int i=0; i < listaFuncionarios.size(); i++){
            if (listaFuncionarios.get(i).getHoraEntrada() > horario){
                System.out.println(listaFuncionarios.get(i).getNome() + " " + listaFuncionarios.get(i).getId() + " " + listaFuncionarios.get(i).getSalario());
            }
        }
    }
}
