package animais;

public class Aves extends  Animal{

    @Override
    public void locomover() {
        System.out.println("Voam");
    }

    @Override
    public void alimentar() {
        System.out.println("Graos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");

    }
}
