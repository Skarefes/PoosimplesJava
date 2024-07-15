package animais;

public class caes extends Mamiferos{
    @Override
    public void locomover(){
        System.out.println("Caminha");
    }
    @Override
    public void alimentar(){
        System.out.println("Ração");
    }
    public void emitirSom(){
        System.out.println("Late");
    }

    public void reagir(String frase){
        if(frase.equals("Um biscoito")){
            System.out.println("Abanou o rabo");
        } else {
            System.out.println("Rosnou");
        }
    }
    public void reagir(boolean dono){
        if (dono == true){
            System.out.println("Lamber");
        }else{
            System.out.println("Morder");
        }
    }

}
