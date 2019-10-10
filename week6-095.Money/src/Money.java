
public class Money {

    private final int euros;
    private final int cents;
    private int sumCents;
    private int sumEuros;







    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;

    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added){
        sumEuros=added.euros+this.euros;
        sumCents= added.cents+this.cents;
    return new Money(sumEuros,sumCents);

    }
    public Money minus(Money decremented) {
        Money sumZero = new Money(0, 0);
        if ((this.euros < decremented.euros && this.cents < decremented.cents) || this.euros<decremented.euros) {
            return new Money(0,0);
        } else if (this.euros >=decremented.euros && this.cents < decremented.cents) {
            sumEuros = (this.euros - decremented.euros) - 1;
            sumCents = (100 + this.cents) - decremented.cents;
            return new Money(sumEuros, sumCents);
        } else if (this.euros>=decremented.euros && this.cents>=decremented.cents)
            sumEuros = this.euros - decremented.euros;
            sumCents = this.cents - decremented.cents;
            return new Money(sumEuros, sumCents);
    }


    public boolean less (Money compared){
        if(this.euros<compared.euros){
            return true;
        }else if(this.euros==compared.euros && this.cents<compared.cents){
            return true;
        }
        return false;
        }


    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }

}
