public class BankMain {
    public static void main(String[] args) {

        BankHesabi bankHesabi = new BankHesabi(1000);

        Thread thread = new Thread(()->{
            for (int i=0; i< 100; i++){
                bankHesabi.medaxilEt(10);
            }
        },"Parent");


        Thread thread1 = new Thread(()->{
            for (int i=0; i< 100; i++){
                bankHesabi.mexaricEt(10);
            }
        },"Child");

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        System.out.println("Gözlənilən yekun balans: 1000.0 AZN");

        System.out.println("Faktiki yekun balans: " + bankHesabi.getBalans() + " AZN");


    }
}
