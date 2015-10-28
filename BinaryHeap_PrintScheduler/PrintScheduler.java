/**  Keegan O'Hara
     CS 124
     Homework 7
     Print Scheduler program  */
     
import java.util.ArrayList;


public class PrintScheduler  {

   public static void main(String[] args)   {
   
      
      BinaryHeap heap = new BinaryHeap(10);
//       heap.insert(1);
//       System.out.println(heap.findMin());
//       heap.insert(2);
//       System.out.println(heap.findMin());
//       heap.insert(5);
//       System.out.println(heap.findMin());
//       heap.insert(7);
//       System.out.println(heap.findMin());
//       heap.deleteMin();
//       System.out.println(heap.findMin());

      PrintRequest print1 = new PrintRequest("keohara", 10, 1000, 0);
      System.out.println(print1.getID());
      System.out.println(print1.getID());
      PrintRequest print2 = new PrintRequest("joBLow", 10, 1000, 0);
      System.out.println(print2.getID());
      System.out.println(print2);
      if (print1.compareTo(print2) < 0 )  {
         System.out.println("YES");   }
      
      
     //  public static int add(String login, String time, int priority, int size, int handle) {
//          heap.insert(priority);
//          PrintRequest print = new PrintRequest(login, time, priority, size, handle);
//          
//          if (heap.isEmpty()) {
//             return -2;  }
//          else  {
//             return 





   }
}
   
      