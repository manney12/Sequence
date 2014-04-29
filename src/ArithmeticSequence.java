/**
 * This is the Arithmetic Sequence
 * @author Lydia fritz but worked on it by O.Emmanuel.OGAH 
 */

public class ArithmeticSequence extends Sequence{
    
    private double commonDifference = 0; 
    
    
    /**
     * This is for constructor
     * @param ft This is the variable for first term
     * @param cd This is the variable for the common Difference
     */
    public ArithmeticSequence(double ft, double cd){
        super(ft);
        this.commonDifference = cd;
        
        }
    

    
    /**
     * This is the method that calls for the get the common difference 
     * @return this get this  common difference from the private method
     */
    public double getCD(){return this.commonDifference;}


/**
     *This is for getting the nth term in Lucas class
     * @param n int passes the variable into the method and is passed method
     * @return The  returned value si  from formula which is calculated from
     */
    @Override
    public double getNthTerm(int n) {
        
        return (n-1)*commonDifference + getFT();

    }

    @Override
    
    /**
     * This is the boolean method that checks to see if the statement is true or false
     */
public boolean equals(Object o){
    boolean eq=false;
    
    if(o instanceof ArithmeticSequence){
        ArithmeticSequence a = (ArithmeticSequence)o;
        eq=this.getFT()==a.getFT()&&this.getCD()==a.getCD();
        // this is used to  pass in if boolean is true that it should pass the object  o to the math  of eq to see what they equal too
    
}
    return eq;
}
    
}