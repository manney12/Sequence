

/**
 * base class for sequence classes
 * @author lkfritz
 */


public abstract class Sequence implements SequenceOps{
    
     /**
      * Two private methods 
      * first is the  first term that cannot be manipulated.
      * second is the  private int variable that is hidden from the general 
      * society
      */ 
    private double firstTerm;
    private int n;
    
 /**
  * the public sequence default constructure that just  calls in the private field
  *  and also calls in the first term 
  */
    public Sequence (){
        
    int i= 1;
    this.firstTerm =i;
    
}
   /**
    *  sequence constructor parameter accepts a double  and identifier is  ft
    * @param ft this is the variable for the first term
    */
    public Sequence(double ft){
        this.firstTerm = ft;
    } 
    
   
    /**Sequence constructor that  accepts sequence constructor in its parameter 
     * @param s the calling of sequence and pass it with a variable s 
     */
    public Sequence(Sequence s){
        this(s.firstTerm);
    }
    /**
     * public method name get first term
     * @return the return of the calculated first term
     */
    public double getFT(){
        return firstTerm;
    }
    
/**
     * This is for the toString method
     * @return string that is comma sep. list of first 10
     * terms in the sequence
     */
    
    @Override
    public String toString(){
    String str = "";
        for(int i = 1; i <= 9; i++){
            str+=getNthTerm(i) + ", ";
        }
        str += getNthTerm(10);
  
        return str;
        }
    /**
     * 
     * @param n the passing of nth variable
     * @return 
     */
    public abstract double getNthTerm(int n);
    
    
    /**
     *  public method named get Nth sum for sequence and passes on to sub classes
     * @param n int n is passed into the method 
     * 
     * @return The returned  value is the sum that is calculated
     */
    public  double getNthSum(int n) {
     double sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + getNthTerm(i);
        }
        return  sum;
}
}