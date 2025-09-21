public class Task1 {


    public static void main(String[] args) {

        Runnable runnable= () ->{
            for (int i = 10; i > 0; i++) {
                System.out.println(i+" " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        };


        Runnable runnable1= () ->{
            for (int i = 10; i > 0; i--) {
                System.out.println(i+" " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        };


        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread2.start();


//        Thread thread3 = new Thread(()->{
//            System.out.println("Sadece yoxlama");
//        },"NHJJFN");






    }


}
