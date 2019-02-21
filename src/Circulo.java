public class Circulo extends Figura {
    private double radius;
    public Circulo(double _rad){
        this.radius=_rad;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius* radius * Math.PI;
    }
}
