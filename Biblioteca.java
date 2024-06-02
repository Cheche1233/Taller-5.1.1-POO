import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public Libro buscarLibro(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public Usuario buscarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public void realizarPrestamo(Usuario usuario, Libro libro) {
        Prestamo prestamo = new Prestamo();
        prestamo.setUsuario(usuario);
        prestamo.setLibro(libro);
        prestamos.add(prestamo);

        if (usuario.getLibrosPrestados() == null) {
            usuario.setLibrosPrestados(new ArrayList<>()); // Inicializar la lista si es null
        }
        usuario.getLibrosPrestados().add(libro); // Agregar el libro a los libros prestados del usuario
        libro.setCopiasDisponibles(libro.getCopiasDisponibles() - 1); // Reducir la cantidad de copias disponibles del libro
    }

    public void devolverLibro(Prestamo prestamo) {
        prestamo.setDevuelto(true);
    }
}
