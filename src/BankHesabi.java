public class BankHesabi {

    private double balans;

    public BankHesabi(double balans) {
        this.balans = balans;
    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }


    public void medaxilEt(double mebleg){
        this.balans+=mebleg;
        try { Thread.sleep(1); } catch (InterruptedException e) {}
    }

    public void mexaricEt(double mebleg){
        this.balans-=mebleg;
        try { Thread.sleep(1); } catch (InterruptedException e) {}
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

