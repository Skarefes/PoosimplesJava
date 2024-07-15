package animais;

public class Main {
    public static void main(String[] args) {
        Mamiferos canguru = new Mamiferos();
        caes c = new caes();
        Peixes p = new Peixes();

        canguru.membros = 4;
        canguru.idade = 90;
        canguru.peso = 90.6f;
        canguru.setPelo("Branco");
        c.idade = 9;
        c.membros = 4;
        c.peso = 10;
        c.emitirSom();
        c.locomover();
        c.setPelo("Preto");
        c.reagir("oi");
        c.reagir("Um biscoito");
        c.reagir(false);
        System.out.println(c.toString());

        System.out.println("----------------------");

        canguru.emitirSom();
        canguru.locomover();
        System.out.println(canguru.toString());

        System.out.println("----------------------");
        p.idade = 30;
        p.membros = 0;
        p.emitirSom();
        p.alimentar();
        p.setEscamas("Dourado");
        System.out.println(p.toString());
    }
}