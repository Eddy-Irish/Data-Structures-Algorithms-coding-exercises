public class homework5  {   
   
   public static void main(String[] args) {

      BinarySearchTree tree = new BinarySearchTree();
      
      for (int i = 0; i < 11; i++) {
         tree.insert(i);
      }
      tree.printTree();
      tree.insert(-1);
      System.out.println("\n-----------\n");
      tree.printTree();

   }
}