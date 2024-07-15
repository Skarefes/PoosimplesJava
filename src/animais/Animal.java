package animais;

public abstract class Animal {
    //atributos
    protected float peso;
    protected int idade;
    protected int membros;

    //métodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Animal " +
                "peso= " + this.peso +
                ", idade= " + this.idade +
                ", membros= " + this.membros;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
