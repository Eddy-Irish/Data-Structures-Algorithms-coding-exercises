public class mainClass {

   public static void main(String[] args)  {
      
      PrintScheduler test = new PrintScheduler();
      
      int x = test.add("keohara", "time", 10, 10000, 0);
      System.out.println(x);
      
      int y = test.add("jones", "time", 11, 10000, 0);
      System.out.println(y);
      
      int z = test.add("magilicutty", "time", 12, 10000, 0);
      System.out.println(z);
      
      int f = test.add("keohara", "time", 13, 10000, 0);
      System.out.println(f);
      
      test.status();

      
    


   }
}