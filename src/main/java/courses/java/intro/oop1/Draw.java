package courses.java.intro.oop1;

public class Draw {

    public static void drawFullShape(int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++)
                System.out.print("*");
//            create new line
            System.out.println();
        }
    }
}
