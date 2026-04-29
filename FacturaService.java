public interface FacturaService {
    void generarFactura(Cliente cliente, double monto);
    boolean isFacturaExitosa();
    String getDetalleFactura();
}