// import java.util.*;

public class cmdLineImplementation {
    //Adding numbers using command Line
    public static void main(String[] args) {
        double sum=0d;
        for(String i : args){
            if(i.matches("[0-9\\.]+")) sum+=Double.parseDouble(i);
        }
        System.out.println("Sum is: " + sum);
    }
}
