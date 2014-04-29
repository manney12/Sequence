
/**
 * This is the Lucas class
 *
 * @author Owoicho Emmanuel.OGAH
 */
public class Lucas extends Sequence {
    //set Nth Term for the method
    private double secondTerm;

    /**
     *The is for the constructor
     * @param ft this is the first term
     * @param st this is second term
     */
    public Lucas() {
        super(1);
        secondTerm = 1;
    }

    /**
     *This is for getting the nth term in Lucas class
     * @param n int passes the variable into the method and is passed method
     * @return The y is returned from formula which is the term that will
     * always change but x variable will always be the same
     */
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