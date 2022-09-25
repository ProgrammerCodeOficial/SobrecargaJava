/*
 * Exemplo de sobrecarga no Java (mantem o nome e altera o paramentro (assinatura)).
 */

public class Quadrilatero {

    // Quadrado
    public static void area(double lado) {
        System.out.println("Área do quadrado: " + lado * lado);
    }

    // Retangulo

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }
    // Trapezio

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    // Losango

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do losango: " + (diagonal1 + diagonal2) / 2);
    }

}
