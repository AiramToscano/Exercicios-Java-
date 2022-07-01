import java.util.List;
import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.0);
        System.out.println(notas.indexOf(8.5));
    }
}