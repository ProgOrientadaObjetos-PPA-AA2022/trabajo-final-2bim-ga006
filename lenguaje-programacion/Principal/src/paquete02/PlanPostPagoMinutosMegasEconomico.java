package paquete02;

public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private int minutos;
    private double costoMinuto;
    private int numeroMegasGB;
    private double costoGB;
    private double pDescuento;

    public PlanPostPagoMinutosMegasEconomico(int n, double m, int c, double z, double x) {
        minutos = n;
        costoMinuto = m;
        numeroMegasGB = c;
        costoGB = z;
        pDescuento = x;
    }

    public void establecerMinutos(int n) {
        minutos = n;
    }

    public int obtenerMinutos() {
        return minutos;
    }

    public void establecerCostoMinuto(double n) {
        costoMinuto = n;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }

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

    public void establecerPDescuento(double n) {
        pDescuento = n / 100;
    }

    public double obtenerPDescuento() {
        return pDescuento;
    }

    @Override
    public void calcularPagoMensual() {
        double subtotal = (minutos * costoMinuto)
                + (numeroMegasGB * costoGB);
        pagoMensual = subtotal - (pDescuento * subtotal);
    }

    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("Plan PostPago MinutosMegas Economico\n"
                + super.toString() + "\nReporte\n"
                + "\tMinutos: %d\n"
                + "\tCosto minuto : %.2f\n"
                + "\tNumero de Megas (GB): %d\n"
                + "\tCosto del GB: %.2f\n"
                + "\tPorcentage Descuento: %.2f\n"
                + "\tPago mensual: %.2f\n",
                obtenerMinutos(), obtenerCostoMinuto(),
                obtenerNumeroMegasGB(),
                obtenerCostoGB(), obtenerPDescuento() * 100,
                obtenerPagoMensual());
        return cadena;
    }
}
