import java.util.Scanner;

public class Exe_B {
    public static void main(String[] args) throws Exception {
        
        // Calcule a hipotenusa de um triângulo retângulo usando os lados a e b fornecidos pelo usuário.

        Scanner scan = new Scanner(System.in);
        
        //Informar valor do lado a 
        System.out.println("Digite o valor do lado a: ");
        double a = scan.nextDouble();

        //Informar valor do lado b
        System.out.println("Digite o valor do lado b:");
        double b = scan.nextDouble();

        //Calcular hipotenusa
        double hipotenusa = Math.sqrt(a * a + b * b );

        //Imprimir Hipotenusa

        System.out.printf("A hipotenusa do triângulo é: %.2f\n", hipotenusa);


    }
}
