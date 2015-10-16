

public class Cubiverse
{
    private String name;
    private int w,h,d;
    private double x,y,z;
    private double distanceL, distanceBo, distanceBa;

    Cubiverse()
    {
        name = "Default Cubiverse-" + Math.random();
        d = 1;
        w = 1;
        h = 1;
        x = 0.50;
        y = 0.50;
        z = 0.50;
        distanceL =(x*(double)(w));
        distanceBo = (y*(double)(h));
        distanceBa = (z*(double)(d));
    }
    Cubiverse( int w, int h, int d, String name)
    {
        this.w = w;
        this.h = h;
        this.d = d;
        this.name = name;
        x = 0.5;
        y =0.5;
        z = 0.5;
        distanceL =(x*(double)(w));
        distanceBo = (y*(double)(h));
        distanceBa = (z*(double)(d));
    }
    Cubiverse( double x, double y, double z, String name)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        w = 1;
        h = 1;
        d = 1;
        this.name = name;
        distanceL =(x*(double)(w));
        distanceBo = (y*(double)(h));
        distanceBa = (z*(double)(d));
    }
    public String toString()
    {


         String output = name + "\n" 
         + "w: " + w  + "\n" 
         + "h: " + h  + "\n" 
         + "d: " + d  + "\n" 
         + "volume : " + (w*h*d) + "\n" 
         + "x:" + String.format("%.2f",x) + "\n" 
         + "y:" + String.format("%.2f",y) + "\n"
         + "z:" + String.format("%.2f",z) + "\n"
         + "distance from left: " + String.format("%.2f",distanceL) + "\n" 
         + "distance from bottom: " + String.format("%.2f",distanceBo) + "\n" 
         + "distance from back:" + String.format("%.2f",distanceBa);
         return output;
    }
}
