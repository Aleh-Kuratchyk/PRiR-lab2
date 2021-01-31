public class M_simpsona extends Thread{

    final private double ai;
    final private double bi;
    final private double ni;
    double rovno;

    public M_simpsona(double ai, double bi, double ni){
        this.ai=ai;
        this.bi=bi;
        this.ni=ni;
    }

    public void run(){
        rovno = new MS(ai, bi, ni).calc();
    }
}