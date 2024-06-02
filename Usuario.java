import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private List<Libro> librosPrestados;
    private double multas;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public double getMultas() {
        return multas;
    }

    public void setMultas(double multas) {
        this.multas = multas;
    }
}
