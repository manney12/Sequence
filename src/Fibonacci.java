/*
 * This is a fibonacci class describs most of the calculation
 * and open the template in the editor.
 */

/**
 *
 * @author O.Emmanuel.OGAH
 */
public class Fibonacci extends Sequence {
     /**
      * This is a private double that cannot  be  changed and is hidden from the public eye
      *
      */
    private double secondTerm;
    
    /**
     * 
     * @param ft first term  inherited from the  super class
     * @param st second term that is passed from this class header that is 
     * why it has  "this" to call this specific class
     */
     public Fibonacci(double ft, double st){
        super(ft);
        this.secondTerm = st;
        
        }

    /**
     *The is for the constructor
     * @param ft this is the first term
     * @param st this is second term
     */
    public Fibonacci() {
        super(1);
        secondTerm = 1;
    }
/**
 * 
 * @param n is an identifier  for the data type to be passed on
 * @return  the return value is a y variable that contains 
 * calculation of what the get nth term is suppose to be
 */
    @Override
    public double getNthTerm(int n) {
         double x = this.getFT();
        double y = secondTerm;
        double temp;
            if (n == 1) {
            return this.getFT();

        }  if (n == 2) {
            return secondTerm;
        } 
        if(n>2){
            for (int i = 2; i < n; i++) {
            
                temp = x + y;
                x = y;
                y = temp;
                
            }
        }
    
        return y;

    }

    
}
