# 🎯 Patrón Adapter - Facturación Electrónica

## 📌 Descripción
Implementación del patrón de diseño **Adapter** para integrar un sistema de facturación electrónica con una librería legacy (`LegacyBillingSystem`).

## ❌ Problema
El sistema actual usa `FacturaService` con método:
- `generarFactura(Cliente cliente, double monto)`

Pero la librería externa `LegacyBillingSystem` usa:
- `emitirComprobante(String datosCliente, String valor)`

**¡Son incompatibles!** No pueden comunicarse directamente.

## ✅ Solución
Se implementa el patrón **Adapter** con la clase `BillingAdapter` que actúa como **TRADUCTOR** entre ambos sistemas.

## 📊 Diagrama de clases
![Diagrama del Patrón Adapter](Patron%20Adapter.png)

## 📁 Estructura del proyecto
| Archivo | Descripción |
|---------|-------------|
| `Cliente.java` | Modelo de cliente (OOP) |
| `FacturaService.java` | Interfaz objetivo |
| `LegacyBillingSystem.java` | Sistema legacy (NO modificado) |
| `BillingAdapter.java` | **EL ADAPTADOR** (traduce) |
| `Pedido.java` | Modelo de pedido |
| `SistemaPedidos.java` | Cliente que usa el adapter |
| `Main.java` | Clase principal |

## 🔄 Flujo de datos
