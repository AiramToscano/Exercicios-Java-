import java.util.Calendar;

public class Mains {
    public static void main(String[] args) {
       Calculadora.soma(3, 4);
       Calculadora.diminui(3, 4);
       Calculadora.multiplica(3, 4);
       Calculadora.divide(3, 4);
       Calendar c = Calendar.getInstance();
       Horario.horario(c.getTime());
    }

}