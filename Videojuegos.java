/**
 *
 * @author Luisf
 */
public class Videojuegos extends Electronica{
    
    private String Edicion;
    private String Clasificacion;
    private String Consola;

    public Videojuegos() {
    }

    public Videojuegos(String Edicion, String Clasificacion, String Consola, String SKU, String Titulo, Integer Age) {
        super(SKU, Titulo, Age);
        this.Edicion = Edicion;
        this.Clasificacion = Clasificacion;
        this.Consola = Consola;
    }

    public String getEdicion() {
        return Edicion;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getConsola() {
        return Consola;
    }

    public void setConsola(String Consola) {
        this.Consola = Consola;
    }

    @Override
    public String toString() {
        return super.toString() + "Videojuegos: " + "Edicion=" + Edicion + ", Clasificacion=" + Clasificacion + ", Consola=" + Consola;
    }
    
    
    
    
    
}