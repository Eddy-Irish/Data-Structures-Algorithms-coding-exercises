/**Keegan O'Hara, CS 148, HW 7
   
   Custom PrintRequest class      */
   
import java.util.concurrent.atomic.AtomicInteger;


public class PrintRequest implements Comparable<PrintRequest>  {

   static private final AtomicInteger instanceCount = new AtomicInteger();
   
   {
      instanceCount.getAndIncrement();
   }
   
   private int ID;
   private String login;
   private String time;
   private int priority;
   private int size;
   private int handle;
   
   //Constructor
   public PrintRequest(String log, String time, int pri, int sz, int handy)  {
      this.login = log;
      this.priority = pri;
      this.size = sz;
      this.handle = 0;
      this.ID = instanceCount.get();
   }
   
   //Gettor methods
   public int getID()         {  return ID;   }
   public String getLogin()   {  return login;}
   public String getTime()    {  return time;  }
   public int getPriority()   {  return priority;   }
   public int getSize()       { return size; }
   public int getHandle()     { return handle;  }
   
   public String toString()  {
      String str = ("" + ID + " " + login + " " + time + " " + priority + " " + size + " " + handle);
      return str;
   }
   
   public int compareTo(PrintRequest other)  {
      if (this.priority < other.getPriority()) {
         return -1;   }
      if (this.priority == other.getPriority()) {
         return 0;    }
      else  {
         return 1;   }
   }
   
} 