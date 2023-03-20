public abstract class Animal implements Alimentavel{
    protected String nome;
    protected int idade;
    protected String especie;
    protected boolean alimentado;

    public abstract void emitirSom();
}
