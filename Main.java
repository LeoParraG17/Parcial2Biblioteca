import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Creación de autores
        Autor autor1 = new Autor(1, "Juan", "Martínez", "Calle Principal 123", "123456789", LocalDate.of(1980, 5, 15), null);
        Autor autor2 = new Autor(2, "María", "González", "Avenida Central 456", "987654321", LocalDate.of(1975, 9, 22), LocalDate.of(2020, 12, 10));

        // Creación de libros
        Libro libro1 = new Libro("9781234567890", "La Noche de las Estrellas", autor1, "Drama", "Disponible");
        Libro libro2 = new Libro("9780987654321", "El Viaje del Tiempo", autor2, "Ciencia Ficción", "Prestado");

        // Creación de clientes
        Cliente cliente1 = new Cliente(1, "Pedro", "López", "Calle de la Luna 789", "555111222");
        Cliente cliente2 = new Cliente(2, "Ana", "Rodríguez", "Avenida del Sol 321", "666222333");

        // Creación de biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros al catálogo
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Realizar préstamos
        Prestamo prestamo1 = biblioteca.prestarLibro(libro1, cliente1);
        Prestamo prestamo2 = biblioteca.prestarLibro(libro2, cliente2);

        // Devolver libro
        biblioteca.devolverLibro(prestamo1);

        // Consultar préstamos activos
        System.out.println("Préstamos activos:");
        for (Prestamo p : biblioteca.consultarPrestamosActivos()) {
            System.out.println(p);
        }

        // Consultar préstamos por cliente
        System.out.println("\nPréstamos de " + cliente2.getNombre() + " " + cliente2.getApellido() + ":");
        for (Prestamo p : biblioteca.consultarPrestamosPorCliente(cliente2)) {
            System.out.println(p);
        }
    }
}
