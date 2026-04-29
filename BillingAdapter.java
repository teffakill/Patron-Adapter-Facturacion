public class BillingAdapter implements FacturaService {
    
    private LegacyBillingSystem legacySystem;
    private boolean exitoso;
    private String detalle;
    
    public BillingAdapter(LegacyBillingSystem legacySystem) {
        this.legacySystem = legacySystem;
        this.exitoso = false;
        this.detalle = "";
    }
    
    @Override
    public void generarFactura(Cliente cliente, double monto) {
        String montoFormateado = String.format("%.2f", monto);
        String clienteFormateado = cliente.getFormatoLegacy();
        
        System.out.println("[Adapter] Adaptando solicitud moderna a sistema legacy...");
        
        legacySystem.emitirComprobante(clienteFormateado, montoFormateado);
        
        String estado = legacySystem.obtenerEstadoComprobante();
        if (estado.equals("PROCESADO_EXITOSO")) {
            exitoso = true;
            detalle = legacySystem.obtenerInfoCompleta();
            System.out.println("[Adapter] Factura generada exitosamente!");
        } else {
            exitoso = false;
            detalle = "Error en la generación de factura";
            System.out.println("[Adapter] Error al generar factura!");
        }
    }
    
    @Override
    public boolean isFacturaExitosa() {
        return exitoso;
    }
    
    @Override
    public String getDetalleFactura() {
        return detalle;
    }
}