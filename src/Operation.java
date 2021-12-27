public abstract class Operation implements Action {
    private int price;
    protected int profit;
    public abstract int getProfit();

    public abstract int getPrice();
    public abstract void setPrice(int price);

    public void setProfit(int profit) {
        this.profit = profit;
    }
}
