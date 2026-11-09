import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int opcion;

        List<Persona> personas = new ArrayList<>();

        do{
            System.out.println("\n---------- M E N Ú ----------");
            System.out.println("1. Ingresar datos de Persona");
            System.out.println("2. Ver datos de Persona");
            System.out.println("0. Salir");
            System.out.println("-----------------------------");
            System.out.print("Seleccione una opción:");
            opcion = input.nextInt();

            switch (opcion){
                case 1:
                    input.nextLine();
                    System.out.print("Ingrese el nombre de la persona: ");
                    String nombre = input.nextLine();
                    System.out.print("Ingrese la edad de la persona: ");
                    int edad = input.nextInt();
                    System.out.print("Ingrese la estatura de la persona: ");
                    float estatura = input.nextFloat();

                    Persona persona = new Persona(nombre, edad, estatura);
                    personas.add(persona);

                    break;
                case 2:
                    if(personas.isEmpty()){
                        System.out.println(" -No hay personas registradas");
                    }else{
                        for(Persona p: personas){
                            p.imprimirDatos();
                        }
                    }
                    break;
                case 0:
                    System.out.println("\n Saliendo del programa...");
                    break;
                default:
                    System.out.println("\n -Opción incorrecta");
                    break;
            }

        }while(opcion!=0);
    input.close();
    }
}