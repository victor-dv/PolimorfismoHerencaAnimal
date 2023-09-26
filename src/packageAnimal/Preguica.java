package packageAnimal;

public class Preguica extends Animal{

    public Preguica(){
    }
    public Preguica(String nome, int idade){
        super(nome,idade);
    }
    @Override
    public String somAnimal() {
        return "wiiiiiii";
    }

    @Override
    public String fazOque() {
        return "Sobir em árvores";
    }
}
