package proxy;

/**
 *
 * @author cavargas10
 */
public class App {

    public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "cavargas10", 100);
                
		ICuenta cuentaProxy = new CuentaProxy();
		//ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoA());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);
		
	}
    
}