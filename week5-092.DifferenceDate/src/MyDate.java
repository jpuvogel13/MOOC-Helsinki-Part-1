public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate compared) {
        double yearDiff = 0.00;
        if (this.year > compared.year) {
            yearDiff = (this.year + (double) this.month / 12 + (double) this.day / 365)
                    - (compared.year + (double) compared.month / 12
                    + (double) compared.day / 365);
        } else {
            yearDiff = (compared.year + (double) compared.month / 12
                    + (double) compared.day / 365)
                    - (this.year + (double) this.month / 12 + (double) this.day / 365);
        }
        return (int) yearDiff;
    }
}


