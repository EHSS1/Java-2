import java.util.Scanner;

public class Exe_C {
    public static void main(String[] args) throws Exception {
        
        //Calcule o volume de uma esfera com raio r fornecido pelo usuário. A fórmula do volume é 4/3 *'pi'*r^3
        Scanner scan = new Scanner(System.in);
        
        //Informar o raio da esfera
        System.out.println("Digite o raio da esfera: ");
        double raio = scan.nextDouble();
        
        //Calcular o volume da esfera
        double volume = 4.0/3.0 *Math.PI * Math.pow(raio, 3); 

        //Imprimir o volume da esfera
        System.out.println("Volume é: " + volume);
                   
        //println é só colocar o nome dentro das aspas e fora dela o + e a variável solicitada. ex: ("Volume é: " + volume);
        //printf é só colocar dentro das aspas o nome e %.2f\n" depois a vírgula e o nome da variável escolhida. ex: ("A área do c´rculo é: %.2f " , volume)





        


    }
}
