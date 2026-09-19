public class CopyConst {
    String name;
    int rollno;

    // parametrized constructor
    CopyConst(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    CopyConst(CopyConst s){
        this.name = s.name;
        this.rollno = s.rollno;
    }


    public static void main(String args[]){
        CopyConst s1 = new CopyConst("parth", 84);

        CopyConst s2 = new CopyConst(s1);

        System.out.println(s2.name);
        System.out.println(s2.rollno);
    }
}