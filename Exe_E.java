import java.util.Scanner;

public class Exe_E {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite as coordenadas x1, y1:");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        System.out.println("Digite as coordenadas x2, y2:");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("A distancia entre os pontos sao: " + distancia);
    


        


    }
}
