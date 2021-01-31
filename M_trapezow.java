public class M_trapezow extends Thread{

    final private double ai;
    final private double bi;
    final private double ni;
    double rovno;


    public M_trapezow(double ai, double bi, double ni){
        this.ai=ai;
        this.bi=bi;
        this.ni=ni;
    }

    public void run(){
        rovno = new MT(ai,bi,ni).calc();
    }
}