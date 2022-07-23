
package paquete02;


public class PlanPostPagoMegas extends PlanCelular{
    private int numeroMegasGB;
    private double costoGB;
    private double tarifaBase;
    
    public void establecerNumeroMegasGB(int n) {
        numeroMegasGB = n;
    }

    public int obtenerNumeroMegasGB() {
        return numeroMegasGB;
    }

    public void establecerCostoGB(double n) {
        costoGB = n;
    }

    public double obtenerCostoGB() {
        return costoGB;
    }

    public void establecerTarifaBase(double n) {
        tarifaBase = n;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public void calcularPagoMensual() {
        pagoMensual = tarifaBase + (numeroMegasGB * costoGB);
    }

    @Override
    public double obtenerPagoMensual(){
        return pagoMensual;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Plan PostPago Megas\n"
                + super.toString() + "\nReporte\n"
                + "\tNumero de Megas (GB): %d\n"
                + "\tCosto del GB: %.2f\n"
                + "\tTarifa base: %.2f\n"
                + "\tPago mensual: %.2f\n", 
                obtenerNumeroMegasGB(),obtenerCostoGB(),
                obtenerTarifaBase(),
                obtenerPagoMensual());
        return cadena;
    }
}
