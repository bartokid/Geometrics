public class Cuadrado extends Rectangulo{
    public Cuadrado(double c){
        super(c,c);
    }

    public void setC(double c) {

        super.setL1(c);
        super.setL2(c);
    }

    public double getC() {
        return super.getL1();
    }
}
