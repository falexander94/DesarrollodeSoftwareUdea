public class empresa {
    private String nombre;

    private  int telefono;

    private String direccion;

    private int nit;

    public empresa(String nombre, int telefono, String direccion, int nit) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Telefono: "+ telefono);
        System.out.println("Direccion: "+ direccion);
        System.out.println("Nit: "+ nit);
    }
}
