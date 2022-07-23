
package paquete02;


public abstract class PlanCelular {
    protected String nombresPropietario;
    protected String cedulaPropietario;
    protected String ciudadPropietario;
    protected String marcaCelular;
    protected String modeloCelular;
    protected String numeroCelular;
    protected double pagoMensual;

    
    
    
    public void establecerNombresPropietario(String n) {
        nombresPropietario = n;
    }

    public String obtenerNombresPropietario() {
        return nombresPropietario;
    }

    public void establecerCedulaPropietario(String n) {
        cedulaPropietario = n;
    }

    public String obtenerCedulaPropietario() {
        return cedulaPropietario;
    }

    public void establecerCiudadPropietario(String n) {
        ciudadPropietario = n;
    }

    public String obtenerCiudadPropietario() {
        return ciudadPropietario;
    }
    
    public void establecerMarcaCelular(String n) {
        marcaCelular = n;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }

    public void establecerModeloCelular(String n) {
        modeloCelular = n;
    }

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public void establecerNumeroCelular(String n) {
        numeroCelular = n;
    }

    public String obtenerNumeroCelular() {
        return numeroCelular;
    }
    
    public abstract void calcularPagoMensual();

    public double obtenerPagoMensual() {
        return pagoMensual;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("--------------------\n"
                + "Propietario\n"
                + "\tNombres del Propietario: %s\n"
                + "\tCedula del Propietario: %s\n"
                + "\tCiudad del Propietario: %s\n"
                + "Celular\n"
                + "\tMarca del Celular: %s\n"
                + "\tModelo del Celular: %s\n"
                + "\tNumero del Celular: %s\n", 
                obtenerNombresPropietario(), obtenerCedulaPropietario(),
                obtenerCiudadPropietario(), obtenerMarcaCelular(), 
                obtenerModeloCelular(), obtenerNumeroCelular());

        return cadena;
    }
    
}
