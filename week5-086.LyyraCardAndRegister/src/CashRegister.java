
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister=1000.0;
        // at start the register has 1000 euros 
    }

    public double payEconomical(double cashGiven) {
        if(cashGiven>=2.50){
            cashInRegister+=2.50;
            economicalSold++;
        } else{
            return cashGiven;

        }
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        return cashGiven-2.50;
    }

    public double payGourmet(double cashGiven) {
        if(cashGiven>=4.00){
            this.cashInRegister+=4.00;
            gourmetSold++;
        } else {
            return cashGiven;

        }
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        return cashGiven-4.00;
    }
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if(card.balance()>=2.50){
            card.loadMoney(-2.50); //***** Check
            economicalSold++;
            return true;
        }
        return false;
    }
    public boolean payGourmet(LyyraCard card){
        if(card.balance()>=4.00){
            gourmetSold++;
            card.loadMoney(-4.00);//**** CHECK
            return true;
        } else {
            return false;
        }

    }
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum>=0){
            this.cashInRegister+=sum;
            card.loadMoney(sum);
        }

    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
