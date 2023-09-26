package packageAnimal;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acao;

        System.out.println("Olá, escolher um animal: " + "\n" +
                "1. Cachorro" + "\n" +
                "2. Cavalo" + "\n" +
                "3. Preguiça");
        acao = scanner.nextInt();

        if (acao == 1){
        Cachorro cachorro = new Cachorro();
        System.out.println("nome do(a) Cachorro: ");
        cachorro.setNome(scanner.next());
        System.out.println("Qual a idade do(a) " + cachorro.getNome() + ":");
        cachorro.setIdade(scanner.nextInt());
            System.out.println( "O(a) cachorra gosta de: " + cachorro.fazOque() +" e faz "+ cachorro.somAnimal());
        }
        if (acao == 2){
            Cavalo cavalo = new Cavalo();
            System.out.println("nome do(a) Cavalo: ");
            cavalo.setNome(scanner.next());
            System.out.println("Qual a idade do(a) " + cavalo.getNome() + ":");
            cavalo.setIdade(scanner.nextInt());
            System.out.println( "O(a) cavalo gosta de: " + cavalo.fazOque() +" e faz "+ cavalo.somAnimal());
        }else {
            Preguica preguica = new Preguica();
            System.out.println("nome do(a) Preguiça: ");
            preguica.setNome(scanner.next());
            System.out.println("Qual a idade do(a) " + preguica.getNome() + ":");
            preguica.setIdade(scanner.nextInt());
            System.out.println( "O(a) preguiça gosta de: " + preguica.fazOque() +" e faz "+ preguica.somAnimal());
        }

    }
}
