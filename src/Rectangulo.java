public class Rectangulo extends Figura {
    private double l1,l2;
    public Rectangulo(double _l1,double _l2){
        this.l1=_l1;
        this.l2=_l2;
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    @Override
    public double area() {
        return l1*l2;
    }
}
