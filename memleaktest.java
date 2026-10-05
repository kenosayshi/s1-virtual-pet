import java.util.ArrayList;
import java.util.List;

public class memleaktest {
    public List<Double> l = new ArrayList<>();

    private memleaktest(){

    }

    public static void main(String[] args) {
        memleaktest a = new memleaktest();
        while (true) {
            a.l.add(Math.random());
            System.out.println(a.l);
        }
    }
}
