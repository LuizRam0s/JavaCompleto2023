package projeto.java.completo.primeirosexemplos.triangle;

import java.security.PublicKey;

public class Triangle {

    public String name;
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(){}

    public  Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateArea(){
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    @Override
    public String toString() {
        return "Triangle " +
               "area " +
                String.format("%.2f", calculateArea());
    }
}
