package animais;

public class Mamiferos extends Animal{
    private String pelo;
    @Override
    public void locomover() {
        System.out.println("Correm");
    }

    @Override
    public String toString() {
        return super.toString() + " pelagem: " + this.pelo;
    }

    @Override
    public void alimentar() {
        System.out.println("Carne");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
}
