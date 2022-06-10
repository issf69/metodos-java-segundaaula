package dio.com.br;

/**
 * Classe de exemplo para exercício da Aula 2 Métodos.
  */
public class Quadrilatero {

    public static void area(double lado) {

        System.out.println("Area do quadrado:" + lado * lado);
    }

    public static void area(double ladoo1, double Lado2) {

        System.out.println("Area do retangulo: + lado1 * lado2");
    }

    public static void area(double baseMaior, double baseMenor,double altura) {

        System.out.println("Area do trapezio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

}
