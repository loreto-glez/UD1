package ud1;

public class Constantes {
    // Fuerza de la Gravedad g
    public static final double G = 9.80665;

    public static void main(String[] args) {
        // Con qué fuerza atrae la tierra a un balón de fútbol
        // Fórmula: F = m * g;
        double m = .450;
        double f = m * G;
        System.outprintln("La tierra atrae a un balón de fútbol con una fuerza de " + f + " newtons.")


    }
}