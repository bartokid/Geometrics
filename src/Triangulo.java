public class Triangulo extends Figura {
    private double b,h;
    public Triangulo(double _b,double _h ){
        this.b=_b;
        this.h=_h;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double area() {
        double area;
        area=h*b/2;
        return area;
    }
}
