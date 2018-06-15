public class s005 {
    private static double pi = 3.14D;
    private int radius;
    private int lon;
    private int width;
    private int Above;
    private int done;
    private int height;
    private int X;
    private int Y;
    private int Angle;
    private  int count;

    public s005(int r, int w, int a, int d, int h,int x,int y,int angle) {
        this.radius = r;
        this.width = w;
        this.height = h;
        this.Above = a;
        this.done = d;
        this.X=x;
        this.Y=y;
        this.Angle=angle;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setAbove(int above) {
        Above = above;
    }

    public double getAbove() {
        return Above;
    }

    public void setDone(int done) {
        this.done = done;
    }

    public double getDone() {
        return done;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setAngle(int angle) {
        Angle = angle;
    }

    public int getAngle() {
        return Angle;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public double getLon() {
        return lon;
    }

    public void setX(int x) {
        X = x;
    }

    public int getX() {
        return X;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getY() {
        return Y;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void show() {
        System.out.println("---------------------------------");
        System.out.println("圓形面積="+this.radius*this.radius*pi);
        System.out.println("矩形="+this.width*this.height);
        System.out.println("三角形="+(this.getX()*this.getY()*Math.cos(this.getAngle()))/2);
        System.out.println("梯形面積:"+((this.Above+this.done)*this.height)/2);

        System.out.println("--------------------------------");
    }
}