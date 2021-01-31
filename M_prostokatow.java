public class M_prostokatow extends Thread{

    final private double ai;
    final private double bi;
    final private int ni;
    double rovno;

    public M_prostokatow(double ai, double bi, int ni){
        this.ai=ai;
        this.bi=bi;
        this.ni=ni;
    }

    public void run(){
        rovno = new MP(ai,bi,ni).calc();
    }
}