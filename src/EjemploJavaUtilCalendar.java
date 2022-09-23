import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();  //Es abstracta no se puede colocar el new
        //calendario.set(2020,11,25, 18, 2, 10);//Indica una fecha en especifico
        //calendario.set(2021,Calendar.SEPTEMBER,25, 18, 2, 10);//Otra manera de colocar fecha
        calendario.set(Calendar.YEAR, 2020); //Otra manera de colocar fecha
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha =  calendario.getTime();//Obtiene la fecha actual
        System.out.println("Fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a"); //Damos formato HH formato 24 horas, hh 12 horas
        String fechaConFormato =  formato.format(fecha);
        System.out.println("fecha Con Formato = " + fechaConFormato);

    }
}
