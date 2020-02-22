import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Luisf
 */
public class ManipularDatos {
    
    Electronica electro = new Electronica();
    LinkedList<Electronica> electronicos = new LinkedList<>();
    Scanner escaner = new Scanner(System.in);
    
    public void scanDatos(){
        
        System.out.println("1.- Musica");
        System.out.println("2.- Video");
        System.out.println("3.- Videojuego");
        Integer opIngresar = escaner.nextInt();
                        
        System.out.print("Introduce SKU: ");
        String SKU = escaner.next();
        for (int i=0; i<electronicos.size(); i++){
           if (!electronicos.get(i).getSKU().equals(SKU)){
            System.out.print("Introduce Titulo: ");
            String Titulo = escaner.next();
            System.out.print("Introduce Año: ");
            Integer Age = escaner.nextInt();
                                
            Electronica electro = null;
            switch (opIngresar) {
                case 1:
                {
                    System.out.print("Introduce Artista: ");
                    String Artista = escaner.next();
                    System.out.print("Introduce Genero: ");
                    String Genero = escaner.next();
                    System.out.print("Introduce Tipo: ");
                    String Tipo = escaner.next();
                    electro = new Musica(Artista, Genero , Tipo, SKU, Titulo, Age);
                    break;
                }
                case 2:
                {
                    System.out.print("Introduce Artistas: ");
                    String Artistas = escaner.next();
                    System.out.print("Introduce Clasificacion: ");
                    String Clasificacion = escaner.next();
                    System.out.print("Introduce Tipo: ");
                    String Tipo = escaner.next();
                    electro = new Videos(Artistas, Clasificacion , Tipo, SKU, Titulo, Age);
                    break;
                }
                case 3:
                {
                    System.out.print("Introduce Edicion: ");
                    String Edicion = escaner.next();
                    System.out.print("Introduce Clasificacion: ");
                    String Clasificacion = escaner.next();
                    System.out.print("Introduce Tipo: ");
                    String Consola = escaner.next();
                    electro = new Videojuegos(Edicion, Clasificacion , Consola, SKU, Titulo, Age);
                    break;
                }
                default :
                {      
                    System.out.println("Opción no Valida");
                }       
            }
            electronicos.add(electro);
           } else {
               System.out.println("El SKU " + SKU + " ya existe");
           }
        }

    }
    
    public void imprimirDatos(){
        for(Electronica element: electronicos){
            System.out.println(element);
        }
    }
    
    public void eliminarDato(){
        System.out.print("Introduce el SKU a Borrar: ");
        String skuDeleted = escaner.next();
        for (int i=0; i<electronicos.size(); i++){
            if (electronicos.get(i).getSKU().equals(skuDeleted)){
                System.out.println("El SKU " + skuDeleted + " ha sido borrado");
                electronicos.remove(i);
                break;
            } else {
                System.out.println("El SKU a borra no existe");
            }
        }
    }
    
    public void editarDato(){
        System.out.print("Introduce el Número de Serie a Editar: ");
        String sku_Editable = escaner.next();
        for (int i=0; i<electronicos.size(); i++){
            if (electronicos.get(i).getSKU().equals(sku_Editable)){
                System.out.print("Introduce Titulo [" + electronicos.get(i).getTitulo()+ "]: ");
                electronicos.get(i).setTitulo(escaner.next());
                System.out.print("Introduce Año [" + electronicos.get(i).getAge()+ "]: ");
                electronicos.get(i).setAge(escaner.nextInt());
                               
                if (electronicos.get(i) instanceof Musica){
                    System.out.print("Introduce Artista [" + ((Musica) electronicos.get(i)).getArtista()+ "]: ");
                    ((Musica) electronicos.get(i)).setArtista(escaner.next());
                    System.out.print("Introduce Genero [" + ((Musica) electronicos.get(i)).getGenero()+ "]: ");
                    ((Musica) electronicos.get(i)).setGenero(escaner.next());
                    System.out.print("Introduce Tipo [" + ((Musica) electronicos.get(i)).getTipo()+ "]: ");
                    ((Musica) electronicos.get(i)).setTipo(escaner.next());
                } else if(electronicos.get(i) instanceof Videos) {
                    System.out.print("Introduce Artistas [" + ((Videos) electronicos.get(i)).getArtistas()+ "]: ");
                    ((Videos) electronicos.get(i)).setArtistas(escaner.next());
                    System.out.print("Introduce Clasificacion [" + ((Videos) electronicos.get(i)).getClasificacion()+ "]: ");
                    ((Videos) electronicos.get(i)).setClasificacion(escaner.next());
                     System.out.print("Introduce Tipo [" + ((Videos) electronicos.get(i)).getTipo()+ "]: ");
                    ((Videos) electronicos.get(i)).setTipo(escaner.next());
                } else {
                    System.out.print("Introduce Edicion [" + ((Videojuegos) electronicos.get(i)).getEdicion()+ "]: ");
                    ((Videojuegos) electronicos.get(i)).setEdicion(escaner.next());
                    System.out.print("Introduce Clasificacion [" + ((Videojuegos) electronicos.get(i)).getClasificacion()+ "]: ");
                    ((Videojuegos) electronicos.get(i)).setClasificacion(escaner.next());
                    System.out.print("Introduce Consola [" + ((Videojuegos) electronicos.get(i)).getConsola()+ "]: ");
                    ((Videojuegos) electronicos.get(i)).setConsola(escaner.next());
                }
                break;
            } else {
                System.out.println("El SKU:" + sku_Editable + " no existe" );
            }
        }
    }
}
   
