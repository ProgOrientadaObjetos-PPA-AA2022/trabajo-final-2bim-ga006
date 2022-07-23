
package paquete01;
import paquete02.*;
public class Principal {

    
    public static void main(String[] args) {
        PlanPostPagoMinutos a = new PlanPostPagoMinutos();
        a.establecerCostoMinutoInternacional(100);
        a.establecerCostoMinutoNacional(200);
        a.establecerMinutosInternacionales(3);
        a.establecerMinutosNacionales(5);
        a.calcularPagoMensual();
        System.out.println(a);
        PlanPostPagoMegas b = new PlanPostPagoMegas();
        b.establecerCostoGB(0.5);
        b.establecerNumeroMegasGB(5000);
        b.establecerTarifaBase(10);
        b.calcularPagoMensual();
        System.out.println(b);
        
        PlanPostPagoMinutosMegasEconomico c = new PlanPostPagoMinutosMegasEconomico();
        c.establecerCostoGB(20);
        c.establecerCostoMinuto(5);
        c.establecerNumeroMegasGB(100);
        c.establecerMinutos(100);
        c.establecerPDescuento(10);
        c.calcularPagoMensual();
        c.establecerCedulaPropietario("1104857071");
        c.establecerCiudadPropietario("Loja");
        c.establecerMarcaCelular("Iphone");
        c.establecerModeloCelular("7");
        c.establecerNombresPropietario("Juan Perez");
        c.establecerNumeroCelular("0960947889");
        System.out.println(c);
    }
    
}
