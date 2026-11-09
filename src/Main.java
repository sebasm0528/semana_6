import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int opcion;

        do{
            System.out.println();
            System.out.println("\nSeleccione una opción:");
            opcion = input.nextInt();

        }while(opcion!=0);
    input.close();
    }
}