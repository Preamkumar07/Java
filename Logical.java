class Logical{
    public static void main(String[] args) {
          int x=10;
          int y=5;
          int a=7;
          int b=8;
          boolean result= x>y && a>b ;
          boolean c= x>y || a>b ;
          boolean d = x>y && a<b;
          boolean e= x<y || a>b ;
          System.out.println(result);
          System.out.println(c);
          System.out.println(!c);
          System.out.println(d);
          System.out.println(e);
    }
}