package ra.excercise;

public class Point3D extends Point2D {
    private float z = 0F;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrFloat = {super.getX(), super.getY(), this.z};
        return arrFloat;
    }

    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}
