public abstract class Figura implements Comparable<Figura>{

    public Figura(){}

    public abstract double area();

    @Override
    public int compareTo(Figura figura) {
        return (int) (this.area()-figura.area());
    }
}
