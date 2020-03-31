public class XYMachine {
  public static void main(String[] args){
    double k= 2;
    double j = 1;
    for (k=2; k< 101; k++)
    {
      j = j * k+ (j + k);
    }
    System.out.println(j);
  }
}
