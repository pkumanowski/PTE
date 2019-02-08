package pl.edu.pw.ii.pte.junit.money;

public class Currency {
    private String name;
    private Double rate;

    Currency(String name, Double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Integer universalValue(Integer amount) {
        return (int) (this.rate * (double) amount);
    }

    public String getName() {
        return this.name;

    }

    public Double getRate() {
        return this.rate;

    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer valueInThisCurrency(Integer amount, Currency othercurrency) {
        // Amount of the other Currency / this.rate
        return (int) ((double) (othercurrency.universalValue(amount)) / this.rate);
    }
}