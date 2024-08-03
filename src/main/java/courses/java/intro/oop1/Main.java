package courses.java.intro.oop1;

public class Main {
    public static void main(String[] args) {
//      instantiere obiect de tip pixuri
        Pixuri pixulVerdeGri=new Pixuri();
//      initializare atribute
        pixulVerdeGri.culoare="verde";
        pixulVerdeGri.culoarePasta="albastra";
        pixulVerdeGri.tip="gel";
        pixulVerdeGri.diametru=2;
        pixulVerdeGri.lungime=12;

        System.out.println(pixulVerdeGri.scrie());
        pixulVerdeGri.scrie("Primul meu obiect in java");


        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Diagonal: " + rectangle.getDiagonal());
    }

}
