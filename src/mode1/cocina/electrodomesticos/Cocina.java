package mode1.cocina.electrodomesticos;

import java.util.Scanner;

public class Cocina {
    private String marca;
    private String modelo;
    private String tipo;
    private String combustible;
    private int numeroDeHornallas;
    private boolean tieneHorno;
    private boolean llevaEnchufe;

    public Cocina(String marca, String modelo, String tipo, String combustible, int numeroDeHornallas, boolean tieneHorno, boolean llevaEnchufe) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.combustible = combustible;
        this.numeroDeHornallas = numeroDeHornallas;
        this.tieneHorno = tieneHorno;
        this.llevaEnchufe = llevaEnchufe;
    }

    public Cocina() {
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCombustible() {
        return combustible;
    }

    public int getNumeroDeHornallas() {
        return numeroDeHornallas;
    }

    public boolean isTieneHorno() {
        return tieneHorno;
    }

    public boolean isLlevaEnchufe() {
        return llevaEnchufe;
    }

    public void setMarca(String marca) {this.marca = marca;}

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setNumeroDeHornallas(int numeroDeHornallas) {
        this.numeroDeHornallas = numeroDeHornallas;
    }

    public void setTieneHorno(boolean tieneHorno) {
        this.tieneHorno = tieneHorno;
    }

    public void setLlevaEnchufe(boolean llevaEnchufe) {
        this.llevaEnchufe = llevaEnchufe;
    }

    public void crearCocina() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Marca de la cocina;");
        setMarca(leer.nextLine());
        System.out.println("Ingresede Modelo de la cocina;");
        setModelo(leer.nextLine());
        System.out.println("Ingrese tipo de cocina;\n1.Cocina Industrial\n2.Cocina Electrica\n3.Cocina de inducción\n4.Cocina mixta");
        int opcion = leer.nextInt();

        leer.nextLine();
        String tip;
        switch (opcion) {
            case 1:
                tip = "Industrial";
                setTipo(tip);
                break;
            case 2:
                tip = "Electrica";
                setTipo(tip);
                break;
            case 3:
                tip = "Induccion";
                setTipo(tip);
                break;
            case 4:
                tip = "mixta";
                setTipo(tip);
                break;

            default:
                System.out.println("ingrese solo opciones subgeridas");

        }
        System.out.println("Que combustible lleva:\nA.Gas enbasado\nB.Gas Natural\nC.Electricidad");

        String OpcionCombustible = leer.nextLine().toUpperCase();

        switch (OpcionCombustible) {

            case "A":
                    OpcionCombustible = "Gas enbasado";
                setCombustible(OpcionCombustible);
                break;
            case "B":
                OpcionCombustible= "Gas Natural ";
                setCombustible(OpcionCombustible);
                break;
            case "C":
                OpcionCombustible = "Electricidad";
                setCombustible(OpcionCombustible);
                break;

        }


        System.out.print("Ingrese cuantas hornallas desea (1-5): ");
        int opcionHornallas = leer.nextInt();
        if (opcionHornallas >= 1 && opcionHornallas <= 5) {
            setNumeroDeHornallas(opcionHornallas);
        } else {
            System.out.println("Opción inválida. Ingrese un número entre 1 y 5.");
            return;
        }
        System.out.println("Desea que la cocina tenga Horno S/N?");
        leer.nextLine();
        char OpcionHorno = leer.nextLine().charAt(0);
        if (OpcionHorno=='S' || OpcionHorno=='s') {
            setTieneHorno(true);
        } else if (OpcionHorno=='N' || OpcionHorno=='n') {
            setTieneHorno(false);
        } else {
            System.out.println("Opción inválida. Ingrese solo S o N.");
return;
        }

        System.out.println("La cocina lleva enchufe S/N?");
        char  OpcionEnchufe = leer.nextLine().charAt(0);
        if (OpcionEnchufe=='S' || OpcionEnchufe=='s') {
            setLlevaEnchufe(true);
        } else if (OpcionEnchufe == 'N' ||OpcionEnchufe=='n') {
            setLlevaEnchufe(false);
        } else {
            System.out.println("Opción inválida. Ingrese solo S o N.");

        }


    }

    @Override
    public String toString() {
        return "Cocina{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", combustible='" + combustible + '\'' +
                ", numeroDeHornallas=" + numeroDeHornallas +
                ", tieneHorno=" + tieneHorno +
                ", llevaEnchufe=" + llevaEnchufe +
                '}';
    }
}

