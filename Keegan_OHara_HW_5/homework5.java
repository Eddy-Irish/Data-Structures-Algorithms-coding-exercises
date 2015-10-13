/** Keegan O'Hara
    CS124
    Homework 5 main program file */
    
import java.util.ArrayList;
import java.util.Random;

public class homework5  {   
   
   public static void main(String[] args) {

      // Create the trees
      BinarySearchTree bstTree = new BinarySearchTree();
      BinarySearchTree bstTree2 = new BinarySearchTree();
      AvlTree avlTree = new AvlTree();
      SplayTree splayTree = new SplayTree();
      
      
      
      // Timing of insertion of 100,000 nodes of increasing value into BST
      ArrayList<Integer> array1 = new ArrayList<Integer>();
      for (int i = 0; i <= 100000; i++) {
            array1.add(i);
         }

      long begin = System.nanoTime();
      for (int i = 0; i <= 100000; i++)   {
         bstTree.insert(array1.get(i));
      }
      long end = System.nanoTime();
      long elapsed = (end - begin);
      System.out.println("\nBST insertion, increasing : " + elapsed + " nanoseconds.");
      
      
      ArrayList<Integer> array2 = new ArrayList<Integer>();
      Random randomGenerator = new Random();
         
      
      for (int x = 0; x <= 100000; x++) {
         int index = randomGenerator.nextInt(100000 - x);
         array2.add(array1.get(index));
         array1.remove(index);
      }
      
      // Timing of insertion of 100000 randomly ordered nodes into BST
      begin = System.nanoTime();
      for (int i = 0; i <= 100000; i++)   {
         bstTree.insert(array2.get(i));
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nBST insertion, increasing : " + elapsed + " nanoseconds.");

            
            
            
// 
      
      

   }
}