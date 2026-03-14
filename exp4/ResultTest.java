class Student {
    protected int rollNo;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    protected int sub1, sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void getMarks() {
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
    }
}

interface Sports {
    int sMarks = 0;
    void set(int sMarks);
}

class Result extends Test implements Sports {
    private int sportsMarks;

    public void set(int sMarks) {
        this.sportsMarks = sMarks;
    }

    public void display() {
        int total = sub1 + sub2 + sportsMarks;

        System.out.println("Roll No: " + getRollNo());
        getMarks();
        System.out.println("Sports Marks: " + sportsMarks);
        System.out.println("Total Marks: " + total);
    }
}

public class ResultTest {
    public static void main(String[] args) {
        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(80, 90);
        r.set(15);

        r.display();
    }
}