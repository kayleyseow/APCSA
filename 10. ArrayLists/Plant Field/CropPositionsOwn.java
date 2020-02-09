import java.util.*;
public class CropPositionsOwn{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int l = console.nextInt();//constant for legume crop
        int c = console.nextInt();//constant for corn crop
        int r = console.nextInt();//constant for rice crop
        int k = console.nextInt();//constant to switch row
        int m = console.nextInt();//months
        ArrayList<ArrayList<String>> periodList = new ArrayList<ArrayList<String>>();
        ArrayList<String> period = new ArrayList<String>();
        periodList.add(period);
        for (int month = 1; month <= m; month++){
            if (month%k == 0){  // period has ended or reached the end of months
                period = new ArrayList<String>();
                periodList.add(period);
            }
            if (month%l == 0){
                period.add("L");    
            }
            if (month%c == 0){
                period.add("C");
            }
            if (month%r == 0){
                period.add("R");
            }           
            System.out.print(month);
            for (int p = 0; p < periodList.size(); p++){
                System.out.println(periodList.get(p).toString());
            
            }
        }
    }
}