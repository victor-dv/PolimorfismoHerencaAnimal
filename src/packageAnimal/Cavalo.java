package packageAnimal;

public class Cavalo extends Animal{

    public Cavalo(){
    }
    public Cavalo(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String somAnimal() {
        return "iirriiii, riiinchinn";
    }
    @Override
    public String fazOque() {
        return "Correr";
    }
}
