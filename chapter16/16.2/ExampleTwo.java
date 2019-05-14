import java.awt.*;

class Geometry implements Cloneable {
    int height;
    Rectangle rectangle;
    Geometry(Rectangle rectangle, int height) {
        this.rectangle = rectangle;
        this.height = height;
    }
    public Object clone() throws CloneNotSupportedException {
        Geometry object = (Geometry) super.clone();
        object.rectangle = (Rectangle) rectangle.clone();
        return object;
    }

}

class Rectangle implements Cloneable{
    double m,n;
    Rectangle(double m,double n){
        this.m = m;
        this.n = n;
    }
    public Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }
}

public class ExampleTwo{
    public static void main(String args[]){
        Geometry geometry = new Geometry(new Rectangle(10,20),100);
        try{
            Geometry geometryCopy=(Geometry)geometry.clone();
            System.out.println("genometry对象中的rectangle矩形的长和宽：");
            System.out.println(geometry.rectangle.m+"."+geometry.rectangle.n);
            System.out.println("genometryCopy对象中的rectangle矩形的长和宽：");
            System.out.println(geometryCopy.rectangle.m+","+geometryCopy.rectangle.n);
        }
        catch(CloneNotSupportedException exp){}
    }
}

