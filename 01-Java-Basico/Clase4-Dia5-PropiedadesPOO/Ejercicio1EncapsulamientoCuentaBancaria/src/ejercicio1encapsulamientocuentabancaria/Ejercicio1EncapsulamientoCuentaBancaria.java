
package ejercicio1encapsulamientocuentabancaria;

import logica.CuentaBancaria;

public class Ejercicio1EncapsulamientoCuentaBancaria {

    
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        
        cuenta.setTitular("luis");
        cuenta.getTitular();
       
        cuenta.setSaldo(1000);
        cuenta.getSaldo();
        
        cuenta.setNumeroCuenta(1);
        cuenta.getNumeroCuenta();
        
        System.out.println("cuenta bancaria  \n Titular  " + cuenta.getTitular() + " Saldo "+cuenta.getSaldo() + "Numero de cuenta " +  cuenta.getNumeroCuenta() );
    }
    //sale un error al poner private en el get de saldo
}
