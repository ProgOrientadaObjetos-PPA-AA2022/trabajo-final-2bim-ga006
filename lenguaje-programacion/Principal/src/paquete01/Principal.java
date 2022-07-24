package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.*;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<PlanCelular> lista = new ArrayList<>();

        System.out.println("Ingrese el nombre del Propietario:");
        String nom = entrada.nextLine();
        System.out.println("Ingrese el número de Cédula del Propietario:");
        String ced = entrada.nextLine();
        System.out.println("Ingrese la Ciudad del Propietario:");
        String ciu = entrada.nextLine();
        System.out.println("Ingrese la Marca del celular:");
        String mar = entrada.nextLine();
        System.out.println("Ingrese el Modelo del celular:");
        String mod = entrada.nextLine();
        System.out.println("Ingrese el Número de telefono:");
        String nume = entrada.nextLine();

        int op = 0;

        do {
            System.out.println("\t------Plan Celular------\n"
                    + "Ingrese (1) para un Plan de Megas\n"
                    + "Ingrese (2) para un Plan de Minutos\n"
                    + "Ingrese (3) para un Plan de Megas y Minutos\n"
                    + "Ingrese (4) para un Plan de  Minutos y Megas Económico\n");
            op = entrada.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("Ingrese el Número de Megas (Gb)");
                    int giga = entrada.nextInt();
                    System.out.println("Ingrese el Costo por Mega:");
                    double gicos = entrada.nextDouble();
                    PlanPostPagoMegas me = new PlanPostPagoMegas(nom, ced, ciu, mar, mod, nume, giga, gicos, 12.0);
                    me.calcularPagoMensual();
                    lista.add(me);
                }
                case 2 -> {
                    System.out.println("Ingrese el Número de Minutos nacionales:");
                    int mina = entrada.nextInt();
                    System.out.println("Ingrese el Costo por Minuto nacional:");
                    double cosMn = entrada.nextDouble();
                    System.out.println("Ingrese el Número de Minutos internacionales:");
                    int mini = entrada.nextInt();
                    System.out.println("Ingrese el Costo por Minuto nacional");
                    double cosMi = entrada.nextDouble();
                    PlanPostPagoMinutos mi = new PlanPostPagoMinutos(nom, ced,
                            ciu, mar, mod, nume, mina, cosMn, mini, cosMi);
                    mi.calcularPagoMensual();
                    lista.add(mi);

                }
                case 3 -> {
                    System.out.println("Ingrese el Número de minutos");
                    int min = entrada.nextInt();
                    System.out.println("Ingrese el Costo por minuto");
                    double cost = entrada.nextDouble();
                    System.out.println("Ingrese el Número de Megas (Gb)");
                    int giga = entrada.nextInt();
                    System.out.println("Ingrese el Costo por Mega:");
                    double gicos = entrada.nextDouble();
                    PlanPostPagoMinutosMegas mm = new PlanPostPagoMinutosMegas(nom, ced,
                            ciu, mar, mod, nume, min, cost, giga, gicos);
                    mm.calcularPagoMensual();
                    lista.add(mm);

                }
                case 4 -> {
                    System.out.println("Ingrese el Número de minutos");
                    int min = entrada.nextInt();
                    System.out.println("Ingrese el Costo por minuto");
                    double cost = entrada.nextDouble();
                    System.out.println("Ingrese el Número de Megas (Gb)");
                    int giga = entrada.nextInt();
                    System.out.println("Ingrese el Costo por Mega:");
                    double gicos = entrada.nextDouble();
                    PlanPostPagoMinutosMegasEconomico mmE = new PlanPostPagoMinutosMegasEconomico(nom, ced,
                            ciu, mar, mod, nume, min, cost, giga, gicos, 100);
                    mmE.calcularPagoMensual();
                    lista.add(mmE);
                }
                case 0 ->
                    System.out.println("Fin del programa");
            }
            entrada.nextLine();

            System.out.println("Ingrese 0 para salir.");
            op = 0;

        } while (op != 0);
    }
}
