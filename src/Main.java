public class Main {
    public static void main(String[] args) {

        SimvolPrinter simvol1 = new SimvolPrinter('#', 50);
        SimvolPrinter simvol3 = new SimvolPrinter('-', 50);

        SimvolPrinter simvol2 = new SimvolPrinter('%', 50);
        SimvolPrinter simvol4 = new SimvolPrinter(' ', 50);


        Thread thread1= new Thread(simvol1);
        Thread thread2= new Thread(simvol2);
        Thread thread3= new Thread(simvol3);
        Thread thread4= new Thread(simvol4);



        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();





    }
}