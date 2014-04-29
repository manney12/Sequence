
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner b = new Scanner(new File("SEQ.in"));
       Sequence s;
// create  the variable String to be use as sequence letter to read from the file 
        String seqLetter;
   // create  variable to be used in the if statement for getting the values of  in the file
        double first;
        double second;
  // The scanner is need to through the file and get the read files      
        Scanner reader = new Scanner(new File("SEQ.in"));
    // The  while loop is needed for the condition it is in  because it has three conditions to pass through if true 
        while (reader.hasNext()) {
            seqLetter = reader.next();
            // this is the condition A  if the scanner located it in the file  also with the first and second value  and ignore any sign of cases 
            if (seqLetter.equalsIgnoreCase("A")) {
                first = reader.nextDouble();
                second = reader.nextDouble();
               // the  ArithmeticSequence  class is called to do the calculation  on  s
                s = new ArithmeticSequence(first, second);
                // the output statement is needed  to   dispaly the  The first ten terms in the Sequence and The sum of the first 5 terms
                System.out.println("The first ten terms in the Sequence are : "+s);
                System.out.println("The sum of the first 5 terms  = "+s.getNthSum(5));
            }
            // this is the condition A  if the scanner located it in the file  also with the first and second value  and ignore any sign of cases 
            if (seqLetter.equalsIgnoreCase("F")) {
                first =reader.nextDouble();
                second = reader.nextDouble();
// the  fibonacci class is called to do the calculation  s
                s = new Fibonacci(first,second);
                // out put statement for the statement 
                System.out.println("The first ten terms in the Sequence are:"+s.toString());
                System.out.println("The sum of the first 5 terms ="+s.getNthSum(5));
                
            }
            // this is the condition A  if the scanner located it in the file  also with the first and second value  and ignore any sign of cases 
            if (seqLetter.equalsIgnoreCase("G")) {
                first = reader.nextDouble();
                second = reader.nextDouble();
                // the  GeometricSequence is called to do the calculation  s
                 s = new GeometricSequence(first,second);
                  // the output statement is needed  to   dispaly the  The first ten terms in the Sequence and The sum of the first 5 terms
                System.out.println("The first ten terms in the Sequence are:"+s.toString());
                System.out.println("The sum of the first 5 terms = "+s.getNthSum(5));
            }
        }

    }
}
