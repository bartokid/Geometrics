import java.util.Arrays;

public class Operador implements GestorFigures{

    public Operador(){}
    public  double suma(Figura[] l){
        double resultat=0;
        for (Figura f: l  ) {
            resultat +=f.area();
        }
        return resultat;
    }

    @Override
    public void sort(Figura[] l) {
            Arrays.sort(l);
    }

    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(2.34,3.55);
        Figura cuadrado = new Cuadrado(5.0);
        Figura circulo = new Circulo(6.7);
        Figura triangulo1 =new Triangulo(3.0,6.1);
        Figura triangulo2 =new Triangulo(3.7,2.1);
        Operador op= new Operador();
        Figura[] l={triangulo1,rectangulo,triangulo2, circulo,cuadrado};
        System.out.println("Suma de areas: "+op.suma(l));
        op.sort(l);
        System.out.print("Array Ordenado:"+ l.toString());


    }

}
