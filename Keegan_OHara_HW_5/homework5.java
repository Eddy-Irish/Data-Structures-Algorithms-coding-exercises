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
      AvlTree avlTree2 = new AvlTree();
      SplayTree splayTree = new SplayTree();
      SplayTree splayTree2 = new SplayTree();
      
      
      
      ArrayList<Integer> array1 = new ArrayList<Integer>();
      for (int i = 0; i < 100000; i++) {
            array1.add(i);
         }


      // Timing of insertion of 100,000 nodes of increasing value into BST
       long begin = System.nanoTime();
       for (int i = 0; i < 100000; i++)   {
          bstTree.insert(array1.get(i));
       }
       long end = System.nanoTime();
       long elapsed = (end - begin);
       System.out.println("\nBST insertion, increasing : " + elapsed + " nanoseconds.");
       
      
      //Create a second arrayList that has the values in a random order
      ArrayList<Integer> array2 = new ArrayList<Integer>();
      Random randomGenerator = new Random();
      for (int x = 0; x < 100000; x++) {
         int index = randomGenerator.nextInt(100000 - x);
         array2.add(array1.get(index));
         array1.remove(index);
      }
      
      
      //Timing of insertion of 100000 randomly ordered nodes into BST
      begin = System.nanoTime();
      for (int i = 0; i < 100000; i++)   {
         bstTree2.insert(array2.get(i));
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nBST insertion, random : " + elapsed + " nanoseconds.");
      
      
      //Create an arrayList for inserting in increasing order
       ArrayList<Integer> array3 = new ArrayList<Integer>();
      for (int i = 0; i < 100000; i++) {
            array3.add(i);
      }
      
      
      //
      //       AVL TREES, INSERTION
      //
      
      //Timing of insertion in increasing order for AVL tree
      begin = System.nanoTime();
      for (int i = 0; i < 100000; i++)   {
         avlTree.insert(array3.get(i));
      }
      end = System.nanoTime();
       elapsed = (end - begin);
       System.out.println("\nAVL insertion, increasing : " + elapsed + " nanoseconds.");
       
       //Timing of insertion in random order for AVL tree
      begin = System.nanoTime();
      for (int i = 0; i < 100000; i++)   {
         avlTree2.insert(array2.get(i));
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nAVL insertion, random : " + elapsed + " nanoseconds.");
      
      
      
      //
      //       Splay TREES, INSERTION
      //
      
      //Timing of insertion in increasing order for Splay tree
      begin = System.nanoTime();
      for (int i = 0; i < 100000; i++)   {
         splayTree.insert(array3.get(i));
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nSplay insertion, increasing : " + elapsed + " nanoseconds.");
      
      //Timing of insertion in random order for AVL tree
      begin = System.nanoTime();
      for (int i = 0; i < 100000; i++)   {
         splayTree2.insert(array2.get(i));
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nSplay insertion, random : " + elapsed + " nanoseconds.");
      
      
      
      //
      //   SEARCHING FOR KEYS
      //
      
      // First remove 50000 keys from array2, so we will be left with an arraylist
      //  of 50k unique, random keys to search for
      for (int count = 0; count < 50000; count++) {
         array2.remove(count);
      }
      
      
      // 50k search, Binary Search Tree
      begin = System.nanoTime();
      for (int count = 0; count < 50000; count++) {
         bstTree2.contains(array2.get(count));
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nElapsed time for BST searches, 50k unique : " + elapsed + " nanoseconds");


       // 50k search, AVL Tree
      begin = System.nanoTime();
      for (int count = 0; count < 50000; count++) {
         avlTree2.contains(array2.get(count));
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nElapsed time for AVL searches, 50k unique : " + elapsed + " nanoseconds");


       // 50k search, Splay Tree
      begin = System.nanoTime();
      for (int count = 0; count < 50000; count++) {
         splayTree2.contains(array2.get(count));
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nElapsed time for Splay searches, 50k unique : " + elapsed + " nanoseconds");
      
      
      // 500, repeated search, Binary Search Tree
      begin = System.nanoTime();
      for (int count = 0; count < 500; count++) {
         for (int inner = 0; inner < 100; inner++) {
            bstTree2.contains(array2.get(count));
         }
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nElapsed time for BST searches, 500 repeated : " + elapsed + " nanoseconds");


      // 500, repeated search, AVL Tree
      begin = System.nanoTime();
      for (int count = 0; count < 500; count++) {
         for (int inner = 0; inner < 100; inner++) {
            avlTree2.contains(array2.get(count));
         }
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nElapsed time for AVL searches, 500 repeated : " + elapsed + " nanoseconds");
      
      
      // 500, repeated search, Splay Tree
      begin = System.nanoTime();
      for (int count = 0; count < 500; count++) {
         for (int inner = 0; inner < 100; inner++) {
            splayTree2.contains(array2.get(count));
         }
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nElapsed time for Splay searches, 500 repeated : " + elapsed + " nanoseconds");




      
      
      

            
            
            
 
      
      

   }
}