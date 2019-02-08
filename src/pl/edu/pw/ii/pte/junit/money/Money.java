package pl.edu.pw.ii.pte.junit.money;

public class Money implements Comparable<Object> {
    private int amount;
    private Currency currency;


    Money(Integer amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    @Override
    public String toString() {
        return this.amount + " " + this.currency.getName();
    }

    public Integer universalValue() {
        return this.currency.universalValue(this.amount);
    }

    public Boolean equals(Money other) {
        return (this.universalValue() == other.universalValue());
    }

    public Money multiply(Money other){
        int universal = this.universalValue();
        int other_universal = other.universalValue();
        int mult = universal * other_universal;
        int amount = (int) (mult / this.currency.getRate());
        return new Money(amount, this.currency);
    }

    public Money add(Money other) {
        int universal = this.universalValue();
        int other_universal = other.universalValue();
        int sum = universal + other_universal;
        int amount = (int) (sum / this.currency.getRate());
        return new Money(amount, this.currency);
    }

    public Money sub(Money other) {
        int universal = this.universalValue();
        int other_universal = other.universalValue();
        int sum = universal - other_universal;
        int amount = (int) (sum / this.currency.getRate());
        return new Money(amount, this.currency);
    }

    public Boolean isZero() {
        return (this.amount == 0);
    }

    @Override
    public int compareTo(Object other) {

        return this.universalValue() - ((Money) other).universalValue();

    }

    @Override // Override method for equal
    public boolean equals(Object object2) {
        return object2 instanceof Money && this.currency.equals(((Money) object2).getCurrency())
                && this.amount == ((Money) object2).getAmount();
    }
}
