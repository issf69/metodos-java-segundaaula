# metodos-java-segundaaula
# Quadrilatero.java
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
## Principal.java (main)
# package dio.com.br;

public class Main {

    public static void main(String[] args) {

        //Quadrilatero
        System.out.println("Exercicio quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

    }
}
## Resultado
C:\Users\Irene\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\lib\idea_rt.jar=51354:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Irene\Documents\Metodo java aula 2\metodo-java-aula2\out\production\metodo-java-aula2" dio.com.br.Main
Exercicio quadrilatero
Area do quadrado:9.0
Area do retangulo: + lado1 * lado2
Area do trapezio:67.5
Area do retangulo: + lado1 * lado2

Process finished with exit code 0
