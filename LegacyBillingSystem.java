public class LegacyBillingSystem {
    private String datosCliente = "";
    private String montoFormateado = "";
    
    public void emitirComprobante(String datosCliente, String valor) {
        this.datosCliente = datosCliente;
        this.montoFormateado = valor;
        System.out.println("[Legacy] Emitiendo comprobante para: " + datosCliente + " - Monto: " + valor);
    }
    
    public String obtenerEstadoComprobante() {
        return "PROCESADO_EXITOSO";
    }
    
    public String obtenerInfoCompleta() {
        return "Cliente: " + datosCliente + " | Total: " + montoFormateado;
    }
}