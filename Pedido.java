public class Pedido {
    private String id;
    private Cliente cliente;
    private double monto;
    private boolean validado;
    
    public Pedido(String id, Cliente cliente, double monto) {
        this.id = id;
        this.cliente = cliente;
        this.monto = monto;
        this.validado = false;
    }
    
    public void validar() {
        if (monto > 0 && cliente != null && cliente.getNombre() != null && !cliente.getNombre().isEmpty()) {
            validado = true;
            System.out.println("Pedido " + id + " validado correctamente");
        } else {
            System.out.println("Error: Pedido " + id + " no válido");
        }
    }
    
    public boolean isValidado() { return validado; }
    public Cliente getCliente() { return cliente; }
    public double getMonto() { return monto; }
    public String getId() { return id; }
}