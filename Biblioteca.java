import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> catalogoLibros;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        catalogoLibros = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        catalogoLibros.add(libro);
    }

    public Libro consultarLibroPorISBN(String ISBN) {
        for (Libro libro : catalogoLibros) {
            if (libro.getISBN().equals(ISBN)) {
                return libro;
            }
        }
        return null;
    }

    public Prestamo prestarLibro(Libro libro, Cliente cliente) {
        Prestamo prestamo = new Prestamo(libro, cliente);
        prestamos.add(prestamo);
        libro.setEstado("prestado");
        return prestamo;
    }

    public void devolverLibro(Prestamo prestamo) {
        prestamos.remove(prestamo);
        prestamo.getLibro().setEstado("disponible");
    }

    public List<Prestamo> consultarPrestamosActivos() {
        return new ArrayList<>(prestamos);
    }

    public List<Prestamo> consultarPrestamosPorCliente(Cliente cliente) {
        List<Prestamo> prestamosCliente = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCliente().equals(cliente)) {
                prestamosCliente.add(prestamo);
            }
        }
        return prestamosCliente;
    }
}