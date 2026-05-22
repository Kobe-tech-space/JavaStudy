public class exercise5_1 {
  public static void main(String[] args) {
    char you='你',me='我',him='他';
    System.out.println("汉字你在Unicode表中的位置"+(int)(you));
    System.out.println("汉字我在Unicode表中的位置"+(int)(me));
    System.out.println("汉字他在Unicode表中的位置"+(int)(him));
    prt(2);
  }
  public static void prt(int length) {
    char s[]={'你','我','他'};
    for(int i=0;i<=length;i++) {
      System.out.printf("汉字%s在Unicode表中的位置:%d\n",s[i],(int)(s[i]));
    }
  }
}
