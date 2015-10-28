/**  Keegan O'Hara
     CS 124
     Homework 7
     Print Scheduler program  */
     
import java.util.ArrayList;


public class PrintScheduler  {

   private BinaryHeap<PrintRequest> heap;
   
      public PrintScheduler()  {
         heap = new BinaryHeap<>();
      }

      public int add(String login, String time, int priority, int size, int handle) {
         PrintRequest print = new PrintRequest(login, time, priority, size, handle);
         heap.insert(print);
         
         if (heap.isEmpty()) {
            return -2;   }
         else {
            return print.getID(); }
      }
      
      public int print_next()  {
         if (heap.isEmpty())  {
            return -2;   }
         else {
            return heap.deleteMax().getID();   }
      }
      
       //
       public int find_next()  {
         if (heap.isEmpty())  {
            return -2;   }
         else {
            return heap.findMax().getID();   }
      }
      
      
      public int cancel(String deleteLogin)  {
         BinaryHeap<PrintRequest> temp = new BinaryHeap<>();
         int deleteCount = 0;
         while (!heap.isEmpty()) {
            if (heap.findMax().getLogin().equals(deleteLogin)) {
               heap.deleteMax();
               deleteCount++;    }
            else  {
               temp.insert(heap.deleteMax());  }
         }
         heap = temp;
         return deleteCount;
      }
      
      
      
      public int cancel(int deleteID)  {
         BinaryHeap<PrintRequest> temp = new BinaryHeap<>();
         int code = -3;
         while (!heap.isEmpty()) {
            if (heap.findMax().getID() == deleteID) {
               heap.deleteMax(); 
               code = 0;   }
            else  {
               temp.insert(heap.deleteMax());  }
         }
         heap = temp;
         return code;
      }
      
      
      public int status()  {
         BinaryHeap<PrintRequest> temp = new BinaryHeap<>();
         if (heap.isEmpty()) {
            return -2;   }
         while (!heap.isEmpty()) {
            System.out.println(heap.findMax().toString());
            temp.insert(heap.deleteMax());   }
        
         heap = temp;
         
          return -3;
       }

          


   }



   
      