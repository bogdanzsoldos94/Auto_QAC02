package courses.java.intro.oop3;

import courses.java.intro.oop2.Circle;
import courses.java.intro.oop2.Shape;
import courses.java.intro.oop2.Square;
import courses.java.intro.oop2.Triangle;


public class Main {
    public static void main(String[] args) {
        int[] values = {1,5,7};
        System.out.println(values[1]);

      Shape[] shaps = {
              new Square(),
              new Triangle(),
              new Circle(),

      };
    }
}
