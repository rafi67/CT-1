package ct1;

class Box {
    double w;
    double h;
    double d;
    Box(double width, double height, double depth) {
        w = width;
        h = height;
        d = depth;
    }
}

public class CT1 {
    public static void main(String[] args) {
        Box myBox1 = new Box(3, 3, 3.0);
        double vol = myBox1.w*myBox1.h*myBox1.d;
        System.out.println("Volume of the first Box: "+vol);
        Box myBox2 = new Box(1, 2, 3.0);
        vol = myBox2.w*myBox2.h*myBox2.d;
        System.out.println("Volume of the sceond Box: "+vol);
    }
}
