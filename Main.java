import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos libros
        Libro libro1 = new Libro();
        libro1.setId(1);
        libro1.setTitulo("El Señor de los Anillos");
        libro1.setAutor("J.R.R. Tolkien");
        libro1.setGenero("Fantasía");
        libro1.setCopiasDisponibles(5);

        Libro libro2 = new Libro();
        libro2.setId(2);
        libro2.setTitulo("Harry Potter y la Piedra Filosofal");
        libro2.setAutor("J.K. Rowling");
        libro2.setGenero("Fantasía");
        libro2.setCopiasDisponibles(3);

        // Agregar los libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Crear un usuario
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Juan Perez");
        usuario.setMultas(0.0);

        // Agregar el usuario a la biblioteca
        biblioteca.agregarUsuario(usuario);

        // Realizar un préstamo
        biblioteca.realizarPrestamo(usuario, libro1);

        // Simular la devolución del libro después de 7 días
        Prestamo prestamo = new Prestamo();
        prestamo.setId(1);
        prestamo.setUsuario(usuario);
        prestamo.setLibro(libro1);
        prestamo.setFechaPrestamo(new Date());
        prestamo.setFechaDevolucion(new Date(System.currentTimeMillis() + (7 * 24 * 60 * 60 * 1000))); // 7 días en milisegundos
        prestamo.setDevuelto(false);

        // Registrar la devolución del libro
        biblioteca.devolverLibro(prestamo);

        // Mostrar información sobre el usuario y sus libros prestados
        System.out.println("Nombre del usuario: " + usuario.getNombre());
        System.out.println("Libros prestados:");
        for (Libro libro : usuario.getLibrosPrestados()) {
            System.out.println(" - " + libro.getTitulo());
        }

        // Mostrar información sobre los libros en la biblioteca
        System.out.println("\nLibros en la biblioteca:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(" - " + libro.getTitulo() + " (" + libro.getCopiasDisponibles() + " copias disponibles)");
        }
    }
}
