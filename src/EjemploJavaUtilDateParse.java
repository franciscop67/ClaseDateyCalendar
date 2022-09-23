import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingresa la fecha");

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
        try {
            Date fecha  = format.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));
            
            Date fecha2 =  new Date();
            System.out.println("fecha2 = " + fecha2);
            
            if(fecha.after(fecha2)){ //Empieza a comparar fechas
                System.out.println("Fecha1 (del usuario) es después que fecha2 (actual)");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha1 (del usuario) es anterior que fecha2 (actual)");
            }else if (fecha.equals(fecha2)){
                System.out.println("Ambas fechas son iguales");
            }

            //Otra alternativa
            if (fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha1 (del usuario) es después que fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha1 (del usuario) es anterior que fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Ambas fechas son iguales");
            }

            //Termina de comparar fechas
        } catch (ParseException e) {
            //e.printStackTrace();
            System.err.println("La fecha ha tenido un formato incorrecto: "  + e.getMessage());
            System.out.println("El formato debe ser 'yyyy-MM-dd'");
            System.exit(1); //Sale del programa
            //main(args); //Si se encuentra con algún error regresa al principio del programa
        }
    }
}
