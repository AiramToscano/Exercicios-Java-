import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Horario {
    public static void horario(Date date){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = dateFormat.format(date);
        String[] horarioFull = dataFormatada.split("\\s+");
        String[] firsthour = horarioFull[1].split(":");
        int hour = Integer.parseInt(firsthour[0]);
        
        if(hour >= 1 && hour < 12) {
          System.out.println("Olá, bom dia");
        }
        if(hour >= 12 && hour <= 18) {
            System.out.println("Olá, boa tarde");
          }
        if(hour > 18 && hour <= 24) {
            System.out.println("Olá, boa noite");
          }
    }
}
