public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE FACTURACIÓN ELECTRÓNICA ===\n");
        
        LegacyBillingSystem legacySystem = new LegacyBillingSystem();
        FacturaService facturaService = new BillingAdapter(legacySystem);
        SistemaPedidos sistema = new SistemaPedidos(facturaService);
        
        Cliente cliente1 = new Cliente("Juan", "Perez");
        Cliente cliente2 = new Cliente("Maria", "Gomez");
        
        Pedido pedido1 = new Pedido("P001", cliente1, 250.50);
        sistema.registrarPedido(pedido1);
        
        Pedido pedido2 = new Pedido("P002", cliente2, 189.90);
        sistema.registrarPedido(pedido2);
        
        System.out.println("\n--- Pedido inválido ---");
        Cliente clienteInvalido = new Cliente("", "");
        Pedido pedido3 = new Pedido("P003", clienteInvalido, -100);
        sistema.registrarPedido(pedido3);
    }
}