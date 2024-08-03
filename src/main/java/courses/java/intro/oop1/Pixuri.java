package courses.java.intro.oop1;

public class Pixuri {
    public String culoare;
    public String culoarePasta;
    public String tip;
    public int lungime;
    public int diametru;


    public String scrie () {
        return ("Pixul scrie:" + culoarePasta);
    }

    public void scrie (String text) {
        System.out.println("<"+culoare+">" + text + "</"+culoare+">");
    }
}
