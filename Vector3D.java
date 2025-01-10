public class Vector3D {
    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }

    public double getz() {
        return z;
    }
    public static void main(String[] args)
    {
        Vector3D e = new Vector3D(2.0, 2.0, 3.0);
        System.out.println("x: " + e.getx());
        System.out.println("y: " + e.gety());
        System.out.println("z: " + e.getz());
    }
}


