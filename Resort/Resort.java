package Resort;

import java.util.Scanner;

class Resort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter No of days to stay");
        int days = sc.nextInt();
        System.out.println("Enter Room Id:");
        int rid = sc.nextInt();
        System.out.println("Enter Charges:");
        int charges = sc.nextInt();
        members m = new members(name, rid, days, charges);
        System.out.println(m.compute());
        System.out.println(m.Getinfo());
    }
}

class members {
    int Rno;
    String Name;
    int Days;
    int Charges;

    members(String name, int rno, int days, int charges) {
        this.Name = name;
        this.Rno = rno;
        this.Days = days;
        this.Charges = charges;
    }

    public int compute() {
        int val = Days * Charges;
        if (val > 11000) {
            return (int) (Days * Charges * 1.02);
        } else {
            return val;
        }
    }

    public String Getinfo() {
        return "[ " + Name + " " + Rno + " " + Days + " " + Charges + " ]";
    }
}
