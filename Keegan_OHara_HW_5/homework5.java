/** Keegan O'Hara
    CS124
    Homework 5 main program file */

public class homework5  {   
   
   public static void main(String[] args) {

      // Create the trees
      BinarySearchTree bstTree = new BinarySearchTree();
      AvlTree avlTree = new AvlTree();
      SplayTree splayTree = new SplayTree();
      
      
      
      // Timing of insertion of 100,000 nodes of increasing value into BST
      long begin = System.nanoTime();
      for (int i = 0; i <= 100000; i++)   {
         bstTree.insert(i);
      }
      long end = System.nanoTime();
      long elapsed = (end - begin);
      System.out.println("\nBST insertion, increasing : " + elapsed + " nanoseconds.");
      
      
      // Timing of insertion of 100,000 nodes of increasing value into a AVL Tree
      begin = System.nanoTime();
      for (int j = 0; j <= 100000; j++) {
         avlTree.insert(j);
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nAVL insertion, increasing : " + elapsed + " nanoseconds.");
      
      
      // Timing of insertion of 100,000 nodes of increasing value into a Splay Tree
      begin = System.nanoTime();
      for (int k = 0; k <= 100000; k++) {
         splayTree.insert(k);
      }
      end = System.nanoTime();
      elapsed = (end - begin);
      System.out.println("\nSplay insertion, increasing : " + elapsed + " nanoseconds.");

      
      

   }
}