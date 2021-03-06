public class MP{

    private double a;
    private double b;
    private int n;

    public MP(double a, double b, int n){
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public static double f(double x){
        return ((x*x)/2 );
    }

    public double calc(){

        double h = (b-a)/n;

        double sum = 0.0;

        for(double i = 1; i <=n-1; i++){
            sum+=f(a+i*h);
        }

        return h*=sum;
    }
}