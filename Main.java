import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

//Area of a Circle
//Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1002

public class Main {
    public static final double PI = 3.14159d;
    static void area(String r){
        BigDecimal PI1 = BigDecimal.valueOf(PI);
        BigDecimal r1 = new BigDecimal(r);
        BigDecimal area = r1.multiply(PI1.multiply(r1));
        DecimalFormat areaf = new DecimalFormat("#.####", new DecimalFormatSymbols(Locale.ENGLISH));
        areaf.setDecimalSeparatorAlwaysShown(true);
        areaf.setMinimumFractionDigits(4);
        System.out.println("A=" + areaf.format(area));
    }    
 
    public static void main(String[] args) throws IOException {
        String r;
        Scanner input = new Scanner(System.in);
        r = input.nextLine();
        area(r);        
    } 
}