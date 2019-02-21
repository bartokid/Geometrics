public class Cuadrado extends Rectangulo{
    private double c;
    public Cuadrado(double _c){
        super(_c,_c);
        this.c=_c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }
}
