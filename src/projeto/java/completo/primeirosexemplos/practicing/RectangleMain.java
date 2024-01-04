package projeto.java.completo.primeirosexemplos.practicing;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class RectangleMain {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");

        Rectangle fisrtRectangle = new Rectangle();
        fisrtRectangle.width = sc.nextDouble();
        fisrtRectangle.height = sc.nextDouble();

        System.out.println(fisrtRectangle);

    sc.close();
    }
}
