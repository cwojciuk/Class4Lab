
package calculatorPackageChallenge2;

/**
 * calculatorPackageChallenge2Circle.java
 * 
 * Feb 4, 2013
 * 
 * @author Chuck Wojciuk
 */
public class Circle implements Shape{
    private double radius;
    
    public Circle(double radius) {
        setRadius( radius );
    }
    public double getRadius() {
        return radius;
    }
    public final void setRadius( double radius ) {
        if(radius >= 0){
            this.radius = radius;
        }
    }
    
    
}
