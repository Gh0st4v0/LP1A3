public class Analista extends Funcionario implements Ponto{
    public Analista(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void entrada(int hora) {
        setHoraEntrada(hora);
    }

    public void saida(int hora) {
        setHoraSaida(hora);
    }
}
