package courses.java.intro.oop3;

import courses.java.intro.oop2.Circle;
import courses.java.intro.oop2.Shape;
import courses.java.intro.oop2.Square;
import courses.java.intro.oop2.Triangle;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        int[] values = {1,5,7};
        System.out.println(values[1]);

      Shape[] shaps = {
              new Square(),
              new Triangle(),
              new Circle(),

      };

      Shape[] sh2 = new Shape[5];
      sh2[0] = new Circle(5);
      sh2[0].setColor("White");
      System.out.println(sh2[0].getColor());

        ArrayList l = new ArrayList();


    }
}
