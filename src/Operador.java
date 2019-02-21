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


}
