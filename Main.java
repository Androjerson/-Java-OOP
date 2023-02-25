class Main {
  public static void main(String[] args) {
    Box obj = new Box(3, 4, 5);
    System.out.println(obj);
    Boxweight obj1 = new Boxweight();
    System.out.println(obj1.weight);
    Boxweight obj2 = new Boxweight(1,2,3,4);
    System.out.println(obj2.l+" "+obj2.h+" "+obj2.w+" "+obj2.weight);
    Boxweight obj4=new Box(2,5,6);
    System.out.println(obj4.l);
    Box obj5 =new Boxweight(4,7,9,8);
    System.out.println(obj5.weight);
    

  }
}