import java.util.SortedMap;

public class Calculadora{

    public void soma(int a, int b) {
        int r = a + b;
        System.out.println(r);
    }
    public static void main(String[] args) {

        Calculadora c1 = new Calculadora();

        c1.soma(1, 2);
        System.out.println(c1);     
    }
}