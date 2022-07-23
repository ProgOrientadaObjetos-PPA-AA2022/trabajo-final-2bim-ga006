
package paquete01;
import paquete02.*;
public class Principal {

    
    public static void main(String[] args) {
        
        PlanPostPagoMinutos a = new PlanPostPagoMinutos
        (null,null,null,null,null,null,100, 200, 3, 5);
        a.calcularPagoMensual();
        System.out.println(a);
        
        PlanPostPagoMegas b = new PlanPostPagoMegas
        (null,null,null,null,null,null,5000,0.5, 10);
        b.calcularPagoMensual();
        System.out.println(b);
        
        PlanPostPagoMinutosMegasEconomico c = new PlanPostPagoMinutosMegasEconomico
        ("Juan Perez","1104857071","Loja","Iphone","7","0960947889",20,5,100,100,10);
        c.calcularPagoMensual();
        
        System.out.println(c);
        /*
        int op = 0;
        
         do {
            switch (op) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:

                    break;
                case 0:
                    System.out.println("Fin del programa");
            }
        } while (op != 0);*/
    }
    
}
