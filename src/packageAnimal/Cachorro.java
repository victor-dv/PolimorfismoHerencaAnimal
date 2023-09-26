package packageAnimal;

public class Cachorro extends Animal{



    public Cachorro(){}

    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public String somAnimal() {
        return "Auau-Auau";
    }
    @Override
    public String fazOque() {
        return "Correr e morder canelas, principalmente de motociclistas";
    }
}
