public class Donate extends Operation{
    private int price;
    private int profit;

    @Override
    public void info(){
        System.out.println("Донат на сумму: "+price+", полученно: "+profit);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }
}
