package ra.excercise;

public class BT2 {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5.4F, 9.2F);
        System.out.println("Point2D:");
        for (float element : point2D.getXY()) {
            System.out.printf("%f\t", element);
        }
        System.out.printf("\n");
        point2D.setXY(-5.4F, -9.2F);
        System.out.println("Point2D:");
        for (float element : point2D.getXY()) {
            System.out.printf("%f\t", element);
        }
        System.out.printf("\n");
        System.out.println("Point2D object: " + point2D.toString());
    }
}
