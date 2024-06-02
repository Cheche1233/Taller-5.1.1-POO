public class Main {
    public static void main(String[] args) {
        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear un libro
        Libro libro1 = new Libro();
        libro1.setId(1);
        libro1.setTitulo("El Principito");
        libro1.setAutor("Antoine de Saint-Exupéry");
        libro1.setGenero("Literatura infantil");
        libro1.setCopiasDisponibles(2);

        // Agregar el libro a la biblioteca
        biblioteca.agregarLibro(libro1);

        // Crear un usuario
        Usuario usuario1 = new Usuario();
        usuario1.setId(1);
        usuario1.setNombre("María");

        // Agregar el usuario a la biblioteca
        biblioteca.agregarUsuario(usuario1);

        // Realizar un préstamo
        biblioteca.realizarPrestamo(usuario1, libro1);

        // Mostrar información sobre el usuario y sus libros prestados
        System.out.println("Nombre del usuario: " + usuario1.getNombre());
        System.out.println("Libros prestados:");
        for (Libro libro : usuario1.getLibrosPrestados()) {
            System.out.println(" - " + libro.getTitulo());
        }

        // Mostrar información sobre los libros en la biblioteca
        System.out.println("\nLibros en la biblioteca:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(" - " + libro.getTitulo() + " (" + libro.getCopiasDisponibles() + " copias disponibles)");
        }
    }
}
