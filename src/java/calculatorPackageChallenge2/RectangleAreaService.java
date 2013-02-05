
package calculatorPackageChallenge2;

/**
 * calculatorPackageChallenge2RectangleService.java
 * 
 * Feb 4, 2013
 * 
 * @author Chuck Wojciuk
 */
public class RectangleAreaService implements CalculateStrategy{
    private Rectangle r;
    public RectangleAreaService(Rectangle r) {
        this.r = r;
    }
    
    @Override
    public double answer() {
        return r.getLength() * r.getWidth();
    }
    
}
