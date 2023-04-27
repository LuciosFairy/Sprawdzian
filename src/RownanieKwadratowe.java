import java.util.Objects;
/**
    <Klasa ma za zadanie obliczac rownania pierwszego i drugiego stopnia>
    <a>:<double>, <pole musi zawierac liczby>
    <b>:<double>, <pole musi zawierac liczby>
    <c>:<double>, <pole musi zawierac liczby>
    @author : <Mark><Pohrebnyak>
 **/
public class RownanieKwadratowe {
    private final double a, b, c;

    public RownanieKwadratowe(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public RownanieKwadratowe(RownanieKwadratowe InnyObiekt) {
        this.a = InnyObiekt.a;
        this.b = InnyObiekt.b;
        this.c = InnyObiekt.c;
    }

    public static double[] ObliczPierwiastek(double a, double b, double c){
        double delta = b*b-4*a*c;
        if (delta < 0){
            return new double[0];
        }
        else if (delta == 0){
            double x = -b/(2*a);
            return new double[]{x};
        }
        else{
            double x1 = (-b - Math.sqrt(delta)) / (2*a);
            double x2 = (-b + Math.sqrt(delta)) / (2*a);
            return new double[]{x1,x2};
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RownanieKwadratowe that)) return false;
        return Double.compare(that.a, a) == 0 && Double.compare(that.b, b) == 0 && Double.compare(that.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public String toString(){
        return String.format("(%ax^2 + %bx + %c", a,b,c);
    }


    public void add(RownanieKwadratowe rownania) {
    }
}
