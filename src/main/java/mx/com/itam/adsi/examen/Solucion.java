package mx.com.itam.adsi.examen;
/**Clase Solucion para el examen.
 *
 */
import org.apache.log4j.Logger;

public class Solucion{
    private final static Logger LOG = Logger.getLogger(Solucion.class);   
    /**Resuelve el problema asignado.
    *La logica general es recorrer los substring del tipo 0,i hasta la mitad del string (pues si existe el substring tiene que estar al principio y no puede ser mas grande que la mitad de la cadena). Solo prueba con cadenas de longitud un divisor de la longitud total
    *Probablemente se pueden hacer mejoras para la eleccion de cadenas candidatas, haci como en el processamiento para ver si puede o no generar la cadena.
    *@param s - El string
    *@return b - Un booleano diciendo si o no
    */
   public static boolean problema(String s){
       boolean res = false;
       int i = 1;
       int n = s.length();
       int m = n/2;
       String test, replaced;
       while (!res && i<=m){
           if(n%i==0){
             test = s.substring(0,i); //Solo es necesario considerar las cadenas de 0 a i, pues de otro modo no puede estar repetida en toda la cadena
             LOG.info(test);
             replaced = s.replace(test,"");
             LOG.info(replaced);
             if(replaced.equals("")){
               res = true;
             }
           
           }
           i++;
           
       }
       return res;
   }

   public static void main(String...argv) {
        System.out.println(problema("ababab"));
   }
}
