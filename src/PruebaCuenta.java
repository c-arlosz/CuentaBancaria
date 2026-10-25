
public class PruebaCuenta {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE VALORES POR DEFECTO ===");
        CuentaBancaria c1 = new CuentaBancaria();
        c1.mostrarEstado(); // Observa los valores por defecto impresos (null, 0.0, false)
        System.out.println("\n=== CONFIGURANDO CUENTA 1 ===");
        c1.numeroCuenta = "CTA-001";
        c1.titular = "Ana Martínez";
        c1.activa = true;
        c1.depositar(1500.0);
        c1.mostrarEstado();
        System.out.println("\n=== CREANDO Y OPERANDO CUENTA 2 ===");
        CuentaBancaria c2 = new CuentaBancaria();
        c2.numeroCuenta = "CTA-002";
        c2.titular = "Carlos López";
        c2.activa = true;
        c2.depositar(500.0);
        c2.retirar(200.0);
        System.out.println("\n=== VERIFICACIÓN DE INDEPENDENCIA EN HEAP ===");
        c1.mostrarEstado();
        c2.mostrarEstado();
    }
}