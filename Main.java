import java.util.Scanner;

/**
 *
 * @author Luisf
 */

public class Main {

    public static void main (String... args){

        ManipularDatos manager = new ManipularDatos();
        Scanner escaner = new Scanner(System.in);
        
        while(true){
           
        System.out.println("1.- Ingresar");
        System.out.println("2.- Eliminar");
        System.out.println("3.- Actualizar");
        System.out.println("4.- Imprimir");
        System.out.println("0.- Salir");
        
        int option = escaner.nextInt();
        
        if (option == 0){
            break;
        }
        
        switch(option){
            case 1:
                manager.scanDatos();
                break;
            case 2:
                manager.eliminarDato();
                break;
            case 3:
                manager.editarDato();
                break;
            case 4:
                manager.imprimirDatos();
                break;
        }
        
        }
        
    }

}
