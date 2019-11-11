//number of significant digits
import java.util.*;
public class SignificantDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.next();
        boolean leadingnumber = true;
        boolean decimal = false;
        int sigfigs = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '.') {
                leadingnumber = false;
                sigfigs++;
            }
            if (!leadingnumber && s.charAt(i) == '0') {
                sigfigs++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) =='.') {
                decimal = true;
                break;
            }
        }
        if (!decimal) {
            int x = s.length()-1;
            while (s.charAt(x) == '0') {
                sigfigs--;
                x--;
            }
        }
        System.out.println("enter any number, integer or decimal: " + sigfigs);
    }
}
