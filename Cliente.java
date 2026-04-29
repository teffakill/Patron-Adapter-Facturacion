public class Cliente {
    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private String ruc;
    
    public Cliente(String id, String nombre, String apellido, String email, String ruc) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.ruc = ruc;
    }
    
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = "CLI-" + System.currentTimeMillis();
        this.email = "";
        this.ruc = "";
    }
    
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getEmail() { return email; }
    public String getRuc() { return ruc; }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public String getFormatoLegacy() {
        return "CLI-" + nombre.toUpperCase() + "-" + apellido.toUpperCase();
    }
}