public class Lab2 {

    public static void main(String[] args){

        M_trapezow m_Trapezow = new M_trapezow(0.5,1.5,20);
        m_Trapezow.start();

        M_simpsona m_Simpsona = new M_simpsona(0.5,1.5,20);
        m_Simpsona.start();

        M_prostokatow m_Prostokatow = new M_prostokatow(0.5, 1.5, 120);
        m_Prostokatow.start();

        while(m_Trapezow.isAlive() && m_Simpsona.isAlive() && m_Prostokatow.isAlive())
            try {
                Thread.sleep (20); // Sleep 20 ms
            } catch (InterruptedException e) {

            }

        System.out.println("M trapezow " + m_Trapezow.rovno);
        System.out.println("M_Simpsona " + m_Simpsona.rovno);
        System.out.println("M_Prostokatow " + m_Prostokatow.rovno);

    }
}