import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Calcule o Índice de Massa Corporal (IMC) de uma pessoa, onde o usuário fornece o peso em
    //quilogramas e a altura em metros. IMC = peso / (altura x altura)
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu peso em quilograma: ");
        double peso = scan.nextDouble();

        System.out.println("Digite sua altura mtrs: ");
        double altura = scan.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O indice IMC da pessoa é: " + imc);
        

        





       
    }
}
