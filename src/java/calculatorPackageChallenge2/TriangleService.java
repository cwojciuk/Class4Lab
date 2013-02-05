
package calculatorPackageChallenge2;

/**
 * calculatorPackageChallenge2TriangleService.java
 * 
 * Feb 4, 2013
 * 
 * @author Chuck Wojciuk
 */
public class TriangleService implements CalculateStrategy{
    private Triangle t;
    public TriangleService(Triangle t) {
        this.t = t;
    }
    
    @Override
    public double answer() {
        double a = Math.pow(t.getA(),2);
        double b = Math.pow(t.getB(),2);
        if(t.isHasHypotenuse()==true){
            return Math.sqrt(b-a);
        }else{
            return Math.sqrt(a+b);
        }
    }
}
