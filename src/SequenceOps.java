/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * This method  is  define behaviors for objects that 
have sequential properties. This interface should have the following methods defined
 * @author O.Emmanuel.OGAH
 */
// the collection of the  what sequence should work 
public interface SequenceOps {
    
//Method that gets the nth term in sequece
    // purpose is to  have n parameter and have a return value 
    public double getNthTerm(int n);
    //method that sums up the first nth terms  in sequence
     public  double getNthSum(int n);
     

}
