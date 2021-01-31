public class MT {

    private double a;
    private double b;
    private double n;

    public MT(double a, double b, double n){
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public static double f(double x){

        return ((x*x)/2 );
    }

    public double calc(){

        double h = ((b-a) /n);
        double sum = f(a)/2+f(b)/2;

        for(double i = 1; i <=n-1; i++){
            sum+=f(a+(i/n) * (b-a));
        }

        return h*sum;
    }
}