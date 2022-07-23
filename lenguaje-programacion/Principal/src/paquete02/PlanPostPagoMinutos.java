
package paquete02;


public class PlanPostPagoMinutos extends PlanCelular{
    private int minutosNacionales;
    private double costoMinutoNacional;
    private int minutosInternacionales;
    private double costoMinutoInternacional;
    
    public PlanPostPagoMinutos(int n, double m, int c, double z){
        minutosNacionales = n;
        costoMinutoNacional = m;
        minutosInternacionales = c;
        costoMinutoInternacional = z;
    }
    
    public void establecerMinutosNacionales(int n) {
        minutosNacionales = n;
    }

    public int obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public void establecerCostoMinutoNacional(double n) {
        costoMinutoNacional = n;
    }

    public double obtenerCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public void establecerMinutosInternacionales(int n) {
        minutosInternacionales = n;
    }

    public int obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public void establecerCostoMinutoInternacional(double n) {
        costoMinutoInternacional = n;
    }

    public double obtenerCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutosNacionales * costoMinutoNacional) + 
                (minutosInternacionales * costoMinutoInternacional);
    }
    
    @Override
    public double obtenerPagoMensual(){
        return pagoMensual;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Plan PostPago Minutos\n"
                + super.toString() + "\nReporte\n"
                + "\tMinutos nacionales: %d\n"
                + "\tCosto minuto nacional: %.2f\n"
                + "\tMinutos internacionales: %d\n"
                + "\tCosto minutos internacionales: %.2f\n"
                + "\tPago mensual: %.2f\n", 
                obtenerMinutosNacionales(),obtenerCostoMinutoNacional(),
                obtenerMinutosInternacionales(),
                obtenerCostoMinutoInternacional(),
                obtenerPagoMensual());
        return cadena;
    }
}
