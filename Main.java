public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro(1, "El Principito", "Antoine de Saint-Exupéry", "Literatura infantil", 2);
        Libro libro2 = new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", "Novela", 3);
        Libro[] libros = {libro1, libro2};

        biblioteca.guardarLibros(libros);

        Libro[] librosCargados = biblioteca.cargarLibros();

        for (Libro libro : librosCargados) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }
    }
}
