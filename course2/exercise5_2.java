public class exercise5_2 {
  public static void main(String[] args) {
    System.out.println("希腊大写字母:");
    for(int i=0x0391;i<=0x03A9;i++) {
      if (i==0x03A2) continue;
      System.out.print((char)(i)+" ");
    }
    System.out.println("\n希腊小写字母:");
    for(int i = 0x03B1; i <= 0x03C9; i++) {
      if (i == 0x03C2) continue; 
      System.out.print((char)(i)+" ");
    }
  }
}
