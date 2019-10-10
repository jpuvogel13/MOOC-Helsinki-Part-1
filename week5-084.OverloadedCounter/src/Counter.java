public class Counter {
    private int counter;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, true);
    }

    public Counter() {
        this(0, false);

    }

    public int value() {
        return this.counter;
    }

    public void increase() {
        this.counter++;
    }

    public void decrease() {
        if (check == false) {
            this.counter--;
        }
        if (this.counter == 0 && check == true) {
            this.counter = 0;
        }
        if (check == true && this.counter > 0) {
            this.counter--;
            if (this.counter < 0) {
                this.counter = 0;
            }

        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.counter += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (check == false) {
                this.counter -= decreaseAmount;
            }
            if (check == true && this.counter == 0) {
                this.counter = 0;
            }
            if (check == true && this.counter > 0) {
                this.counter -= decreaseAmount;
                if (this.counter < 0) {
                    this.counter = 0;
                }
            }
        }
    }
}



