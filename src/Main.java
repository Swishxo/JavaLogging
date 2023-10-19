import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.*;

public class Main {
    static Log log;

    static {
        try {
            log = new Log("LOGG.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        ArrayList<Object> obj = new ArrayList<>();
        String[] x = {"Shenanigans", "Bamboozle", "Bodacious", "Brouhaha", "Canoodle", "Gnarly", "Goggle", "Gubbins"};

        for(int i =0; i<=50; i++){
            obj.add(i);
        }

        for(int i=0; i< x.length; i++){
            obj.add(x[i]);
        }

        for(int i=0;i<obj.size();i++){
            isNumber(obj.get(i));
            isString(obj.get(i));
        }
    }
    public static void isNumber(Object n){
        if(n instanceof Integer){

            log.logger.setLevel(Level.FINE);
            log.logger.fine(n.toString() + " is dividable by 2");
        }
        else{
            log.logger.setLevel(Level.WARNING);
            log.logger.severe(n.toString() + " is not a number");
        }
    }

    public static void isString(Object o){
        if(o instanceof String){
            log.logger.setLevel(Level.FINE);
            log.logger.info("String: " + o.toString());
        }
        else{
            log.logger.setLevel(Level.WARNING);
            log.logger.warning(o.toString() + ": is not a String type");
        }
    }
}

/*



 */