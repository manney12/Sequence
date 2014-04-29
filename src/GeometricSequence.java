
/**
 * This is the Geometric Sequence class
 *
 * @author O.Emmanuel.OGAH
 */
public class GeometricSequence extends Sequence {
/**
 *  private method double for common ratio that  is hidden to the main eyes 
 * in the program
 */
    private double CommonR;

    /**
     *
     * @param ft This this the variable indication for making first term
     * @param commonRation this the variable indication for making commonRatio
     */
    public GeometricSequence(double ft, double commonRation) {
        super(ft);
        this.CommonR = commonRation;

    }
/**
 *  public default  constructor for GeometricSequence 
 * essentially  calls super into the method and also assign commoratio to 0
 */
     public GeometricSequence() {
        super();
        CommonR = 0;
    }
 
    @Override
   /**
     *
     * @param n parameter is  variable passed from sequence into this method 
     * @return The returning value is the  calculated  getNthTerm
     */
    public double getNthTerm(int n) {
     
        return   this.getFT()* Math.pow(CommonR,(n-1));
    }

    /**
     *
     * @param n this is the variable that is represented by the nth term which
     * is n
     * @return The returned value is the common ratio
     */
    public double getCommonRation(int n) {
        return CommonR;
    }
    
}
