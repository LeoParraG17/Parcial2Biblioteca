public class Cliente extends Persona {

    public Cliente(int idPersona, String nombre, String apellido, String direccion, String telefono) {
        super(idPersona, nombre, apellido, direccion, telefono);
    }

    public String toString() {
        return "Cliente: " + nombre + " " + apellido;
    }

}