
package calculatorPackageChallenge2;

/**
 * calculatorPackageChallenge2Triangle.java
 * 
 * Feb 4, 2013
 * 
 * @author Chuck Wojciuk
 */
public class Triangle implements Shape{
    private boolean hasHypotenuse;
    private double a;
    private double b;
    public Triangle( boolean hasHypotenuse, double a, double b ) {
        this.hasHypotenuse = hasHypotenuse;
        this.a = a;
        this.b = b;
    }
    public boolean isHasHypotenuse() {
        return hasHypotenuse;
    }


    public void setHasHypotenuse( boolean hasHypotenuse ) {
        this.hasHypotenuse = hasHypotenuse;
    }


    public double getA() {
        return a;
    }


    public void setA( double a ) {
        this.a = a;
    }


    public double getB() {
        return b;
    }


    public void setB( double b ) {
        this.b = b;
    }
}
