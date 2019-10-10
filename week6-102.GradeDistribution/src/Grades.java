import java.util.Scanner;

public class Grades {
    private int accepted=0;
    private int grade;
    private int counter=0;
    private String zero = "";
    private String one = "";
    private String two = "";
    private String three = "";
    private String four = "";
    private String five = "";

    public Grades(Scanner reader, int grade){
        this.grade=grade;
    }

    public void addGrade(int grade, Scanner reader){
                if(grade<=29 && grade!=-1 && grade>0){
                    zero+="*";
                    this.counter++;
                }else if (grade<35 && grade>29){
                    one+="*";
                    this.counter++;
                    this.accepted++;
                }else if (grade<40 && grade>34){
                    two+="*";
                    this.counter++;
                    this.accepted++;
                } else if (grade<45 && grade>39){
                    three+="*";
                    this.counter++;
                    this.accepted++;
                }else if(grade < 50 && grade>44){
                    four+="*";
                    this.counter++;
                    this.accepted++;
                }else if(grade < 61 && grade>49){
                    five+="*";
                    this.counter++;
                    this.accepted++;
                }else if (grade==0){
                    this.counter++;

                }
        }
        public double acceptance(int counter, int accepted){
        return (double)this.accepted/(double) this.counter*(100);

        }
        public void print(int grade){
            System.out.println("Grade distribution:");
            System.out.println("5: " + five);
            System.out.println("4: " + four);
            System.out.println("3: " + three);
            System.out.println("2: " + two);
            System.out.println("1: " + one);
            System.out.println("0: " + zero);
            System.out.println("Acceptance percentage: " + acceptance(counter,accepted) );
            }
            }




