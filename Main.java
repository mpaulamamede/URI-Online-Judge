import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class Main {
    //public static final double PI = ;
    static void area(double r){
        double area = 0;
        area = 3.14159 * r * r;
        DecimalFormat dec = new DecimalFormat("#0.0000");
        //System.out.println(dec.format(area));
        System.out.println("A=" + String.format(Locale.US, "%.4f%n", area));
    }    
 
    public static void main(String[] args) throws IOException {
                double r = 0;
        Scanner input = new Scanner(System.in);
        r = Float.parseFloat(input.nextLine());
        area(r);        
    } 
}