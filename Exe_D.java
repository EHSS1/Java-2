import java.util.Scanner;

public class Exe_D {
    public static void main(String[] args) throws Exception {
        
        //d) Peça ao usuário uma base e um expoente, e calcule a potência.
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double base = scan.nextDouble();

        System.out.println("Digite o valor do expoente:");
        double expoente = scan.nextDouble();

        //Calcular expoente usando a classe Math

        double potencia = Math.pow(base, expoente);
        System.out.println("O valor da potencia é: " + potencia);

        
    }
}
