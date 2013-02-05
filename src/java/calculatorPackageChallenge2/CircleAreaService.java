
package calculatorPackageChallenge2;

/**
 * calculatorPackageChallenge2CircleService.java
 * 
 * Feb 4, 2013
 * 
 * @author Chuck Wojciuk
 */
public class CircleAreaService implements CalculateStrategy{
    public static final double PI = 3.14159265359;
    private Circle c;
    public CircleAreaService(Circle c) {
        this.c = c;
    }
    
    @Override
    public double answer() {
        return PI * Math.pow( c.getRadius(), 2 );
    }

}
