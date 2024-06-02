import java.io.*;

public class Biblioteca {
    private static final String ARCHIVO_LIBROS = "libros.txt";

    public void guardarLibros(Libro[] libros) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_LIBROS))) {
            for (Libro libro : libros) {
                writer.println(libro.getId() + "," + libro.getTitulo() + "," + libro.getAutor() + "," +
                        libro.getGenero() + "," + libro.getCopiasDisponibles());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Libro[] cargarLibros() {
        Libro[] libros = null; // Inicializar el arreglo fuera del bloque try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_LIBROS))) {
            String linea;
            int contador = 0;
            while ((linea = reader.readLine()) != null) {
                contador++;
            }
            libros = new Libro[contador];
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Retornar null si ocurre un error al abrir el archivo
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_LIBROS))) {
            String linea;
            int contador = 0;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                libros[contador] = new Libro(Integer.parseInt(partes[0]), partes[1], partes[2], partes[3],
                        Integer.parseInt(partes[4]));
                contador++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return libros; // Retornar el arreglo de libros
    }
}
