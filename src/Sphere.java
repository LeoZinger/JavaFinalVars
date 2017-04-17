/**
 * Created by leo.zinger on 4/17/17.
 */
public class Sphere {

    // pi is a universal constant, about as constant as anything can be.
    public static final double PI = 3.141592653589793;

    public final double radius;
    public final double xPos;
    public final double yPos;
    public final double zPos;

    Sphere(double x, double y, double z, double r) {
        radius = r;
        xPos = x;
        yPos = y;
        zPos = z;
    }

    double getVolumn (){
        return xPos*yPos*zPos*radius;
    }

    public static void main (String[] s){
        Sphere mySphere = new Sphere(1,3, 5, 6);

        System.out.println("MySphere's radius: " + mySphere.radius);
    }
    //[...]
}
