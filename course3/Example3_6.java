public class Example3_6 {
  public static void main(String[] args) {
    int n = 1;
    double sum = 0;
    do {
      sum += fac(n);
      n++;
    } while (n<=20);
    System.out.println("sum="+sum);
  }
  public static double fac(int a) {
    int sum = 1;
    double res;
    for(int i=1;i<=a;i++) {
      sum *=i;
    }
    res = 1.0/sum;
    return res;
  }
}
