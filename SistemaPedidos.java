public class SistemaPedidos {
    private FacturaService facturaService;
    
    public SistemaPedidos(FacturaService facturaService) {
        this.facturaService = facturaService;
    }
    
    public void registrarPedido(Pedido pedido) {
        System.out.println("\n=== Registrando pedido ===");
        pedido.validar();
        
        if (pedido.isValidado()) {
            facturaService.generarFactura(pedido.getCliente(), pedido.getMonto());
            
            if (facturaService.isFacturaExitosa()) {
                System.out.println("\n✅ FACTURA GENERADA EXITOSAMENTE");
                System.out.println("Detalle: " + facturaService.getDetalleFactura());
                System.out.println("Cliente: " + pedido.getCliente().getNombreCompleto() + " | Monto facturado: S/" + pedido.getMonto());
            } else {
                System.out.println("\n❌ ERROR AL GENERAR FACTURA");
                System.out.println("Motivo: " + facturaService.getDetalleFactura());
            }
        } else {
            System.out.println("No se puede generar factura - Pedido inválido");
        }
    }
}