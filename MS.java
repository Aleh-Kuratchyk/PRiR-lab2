import java.util.ArrayList;

public class MS {

    private double a;
    private double b;
    private double n;

    public MS(double a, double b, double n){
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public static double f(double x){
        return ((x*x)/2 );
    }

    public double calc(){

        double sum = f(a)+f(b);
        double h=0.0;
        ArrayList<Double> array = new ArrayList<Double>();

        array.add(a);
        //xi
        for(int i = 1; i <= n-1;i++){
            array.add(a+(i/n)*(b-a));
            sum+=2*f(a+(i/n)*(b-a));
        }

        array.add(b);
        //ti
        for(int i = 0; i <= n-1;i++){
            sum+=4*f( (array.get(i+1) + array.get(i))/2 );
            h=(array.get(i+1)-array.get(i))/2;
        }

        return sum*(h/3);
    }
}