public class Example2_1 {
  public static void main(String[] args) {
    char chinaWord = '好';
    char Z='张';
    char X='鑫';
    char you='\u4F60';
    int position = 20320;
    float x=12345.12345678f;
    double y=12345.1234567;
    System.out.println("汉字:"+chinaWord+"的位置:"+(int)chinaWord);
    System.out.println(position+"位置上的字符是:"+(char)(position));
    position=21319;
    System.out.println(position+"位置上的字符是:"+(char)position);
    System.out.println("you:"+you);
    System.out.println(Z+":"+(int)(Z));
    System.out.println(X+":"+(int)(X));
    System.out.println(x);
    System.out.println(y);
  }
}