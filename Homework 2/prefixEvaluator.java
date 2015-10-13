/** Keegan O'Hara
    CS 124
    Homework #2, question 2
    Program to evaluate prefix expressions */
    
import java.io.*;
import java.util.*;


public class prefixEvaluator {

   public static void main(String[] args) throws IOException {
   
      ArrayList<String> expressions = new ArrayList<String>();
      ArrayList<Integer> outputValues = new ArrayList<Integer>();
   
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the name of the file containing the prefix expression you want evaluated: ");
      String fileName = keyboard.nextLine();
      
      File file = new File(fileName);
      Scanner inputFile = new Scanner(file);
      
      /* Here I open the input file, read the contents of it one line at a time,
         create a string tokenizer object for each line, and then reverse the order of
         the string from the file into the format that will be used to evaluate
         the prefix expression.  The reversed string is then added to a string 
         arrayList.
         
         This is because it is best to read from right to left when evaluating prefix
         expressions, and so instead of doing it another way, I decided to reverse the 
         order of the input strings here instead of doing it later */
         
      while (inputFile.hasNext())  {
         String line = inputFile.nextLine();
         StringTokenizer str1 = new StringTokenizer(line);
         String reversedString = "";
         while (str1.hasMoreTokens()) {
            reversedString = str1.nextToken() + " " + reversedString;
         }
         
         expressions.add(reversedString);
      }
      
      /* I didn't know if you wanted to be able to name the output file
         but that seemed unimportant so I just labeled it clearly as you see below */
         
      PrintWriter outputFile = new PrintWriter("outputFile_Keegan's_CS124_HW.txt");
      
      for (String s : expressions){
         
         int outputAnswer = prefixEvaluator(s);
         outputFile.println(outputAnswer);
      } 
      
      
   }
   
   /** prefixEvaluator is a method that accepts a string argument
        and then uses a stack to evaluate the prefix argument (although
        the string parameter is actually a reversed version of the expression
        so here it is really evaluated as a postfi expression would) */
    public static int prefixEvaluator(String exp) {
       
       Stack<Integer> stack = new Stack<Integer>();
       StringTokenizer expression = new StringTokenizer(exp);
       
       while (expression.hasMoreTokens()) {
       
          String currentValue = expression.nextToken();
       
          if (currentValue.equals("+")) {
             int r1 = stack.pop();
             int r2 = stack.pop();
             stack.push(r1 + r2); }
          else if (currentValue.equals("-")){
             int r1 = stack.pop();
             int r2 = stack.pop();
             stack.push(r1 - r2); }
          else if (currentValue.equals("*")){
             int r1 = stack.pop();
             int r2 = stack.pop();
             stack.push(r1 * r2); }

          else if (currentValue.equals("/")){
             int r1 = stack.pop();
             int r2 = stack.pop();
             stack.push(r1 / r2); }

          else {
             int value = Integer.parseInt(currentValue);
             stack.push(value); }
       }
       return stack.pop();
   }
}
