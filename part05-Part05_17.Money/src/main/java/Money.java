
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public Money plus(Money addition) {
        int addEuros = this.euros + addition.euros;
        int addCents = this.cents + addition.cents;
        Money newMoney = new Money(addEuros, addCents);
        return newMoney;
    }
    
    public Money minus(Money decreaser) {
        if (lessThan(decreaser)) {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        int takeEuros = this.euros - decreaser.euros;
        int takeCents = this.cents - decreaser.cents;
        if (takeCents < 0) {
            takeCents = 100 - decreaser.cents;
            takeEuros--;
        }
        Money newMoney = new Money(takeEuros, takeCents);
        return newMoney;
    }

}
