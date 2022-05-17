public class Circle {
    private Point centerPoint;
    private float R;


    public Circle(Point centerPoint, float r) {
        this.centerPoint = centerPoint;
        R = r;
    }


    public float getR() {
        return R;
    }

    public int getPointLocation(Point otherPoint) {
        float temp = (float) Math.sqrt(Math.pow((otherPoint.getX() - centerPoint.getX()), 2) +
                Math.pow((otherPoint.getY() - centerPoint.getY()), 2));
        if (R > temp) {
            return 1;
        } else if (R == temp) {
            return 0;
        } else {
            return 2;
        }
    }
}
