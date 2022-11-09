import java.util.Arrays;
public class Triangle {
    private double a; //Smalest
    private double b; //Medium
    private double c; //Largest
    
    public Triangle(){
        a  = 3;
        b = 4;
        c = 5;
    }

    public Triangle(double x, double y, double z){
        
        double[] list = new double[] {x, y, z};
        Arrays.sort(list);


        a = list[0];
        b = list[1];
        c = list[2];
    }

    public double geta(){
        return a;
    }

    public double getb(){
        return b;
    }

    public double getc(){
        return c;
    }

    public void seta(double smallest){
        a = smallest;
    }

    public void setb(double medium){
        b = medium;
    }

    public void setc(double largest){
        c = largest;
    }

    public boolean isTriangle(){
        return (a + b) > c;
    }
    
    public boolean isRightTriangle(){
        double x = (Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(x);
        x = Math.round(x*100);
        x /= 100;
        System.out.println(x);
        double y = Math.pow(c, 2);
        System.out.println(y);
        y = Math.round(y*100);
        y /= 100;
        System.out.println(y);

        if(x + 0.1 == y || x - 0.1 == y){
            return true;
        }else if(x + 0.1 > y && x - 0.1 < y){
            return true;
        }
        else{
            return false;
        }
    }

    public double perimeter(){
        return a + b + c;
    }

    public double area(){
        double p = perimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public void displayTriangle(){
        System.out.println("Smallest Side: " + a + '\n' + "Medium Side: " + b + '\n' + "Largest Side: " + c);
    }

}