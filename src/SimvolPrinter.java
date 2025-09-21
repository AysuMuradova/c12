public class SimvolPrinter implements Runnable {

    char simvol;
    int tekrarsay;

    public SimvolPrinter(char simvol, int tekrarsay) {
        this.simvol = simvol;
        this.tekrarsay = tekrarsay;
    }

    @Override
    public void run() {
        for (int i=tekrarsay; i>0; i--){
            System.out.print(simvol);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
