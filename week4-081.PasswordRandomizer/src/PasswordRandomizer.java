import java.util.Random;

public class PasswordRandomizer {
    private final int length;
    private int number;
    private String password = "";
    private String tempPass= "";
    private String letters="abcdefghijklmnopqrstuvwxyz";
    private Random random= new Random();
    // Define the variables

    public PasswordRandomizer(int length) {
        this.length=length;
        this.number= this.random.nextInt(26);
        this.password += letters.charAt(number);
        // Initialize the variable
    }

    public String createPassword() {
        for (int i = 0; i <= length-1; i++) {
            this.number = this.random.nextInt(26);
            this.tempPass += letters.charAt(number);

        }
            this.password=this.tempPass;
            this.tempPass="";
            return this.password;
        }
    }
