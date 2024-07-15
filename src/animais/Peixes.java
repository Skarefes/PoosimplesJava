package animais;

public class Peixes extends Animal{
    private String escamas;

    @Override
    public String toString() {
        return super.toString() + "Peixes{" +
                "escamas='" + this.escamas + '\'' +
                '}';
    }

    @Override
    public void locomover() {
        System.out.println("Nadam");
    }

    @Override
    public void alimentar() {
        System.out.println("minhoca");
    }

    @Override
    public void emitirSom() {
        System.out.println("....");
    }

    public String getEscamas() {
        return escamas;
    }

    public void setEscamas(String escamas) {
        this.escamas = escamas;
    }
}
