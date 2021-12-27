public class Promo extends Operation {
    @Override
    public void info() {
        System.out.println("Промокод на "+profit);
    }

    @Override
    public int getProfit() {
        return profit;
    }

    public int getPrice(){
        return 0;
    }

    @Override
    public void setPrice(int price) {

    }
}
