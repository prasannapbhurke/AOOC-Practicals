class Student {
    protected int roll_no;

    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    public void displayRollNo() {
        System.out.println("Roll No: " + roll_no);
    }
}

class Test extends Student {
    protected int sub1, sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void displayMarks() {
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
    }
}

class Result extends Test {
    public void displayResult() {
        int total = sub1 + sub2;
        double avg = total / 2.0;

        displayRollNo();
        displayMarks();
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

public class Mainnnn {
    public static void main(String[] args) {
        Result r = new Result();
        r.setRollNo(101);
        r.setMarks(85, 90);
        r.displayResult();
    }
}