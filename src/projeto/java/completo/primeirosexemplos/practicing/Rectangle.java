package projeto.java.completo.primeirosexemplos.practicing;

public class Rectangle {

    //largura
    public double width;
    //altura
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2*(width+height);
    }

    public double diagonal(){
        return  Math.sqrt(width*width + height*height);
    }

    @Override
    public String toString() {
        return "Area = " + String.format("%.2f%n", area())+
                "Perimeter = " + String.format("%.2f%n", perimeter()) +
                "Diagonal = " + String.format("%.2f", diagonal());
    }
}
