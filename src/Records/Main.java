package Records;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i, switch (i) {
                case 1 -> "Mary";
                case 2 -> "Harry";
                case 3 -> "Carrie";
                case 4 -> "Jerry";
                case 5 -> "Sherry";
                default -> "Anon";
            }, "05/11/1985", "Java");
            System.out.println(s);
        }
        LPAStudent s2 = new LPAStudent("S923006", "Anne", "10/21/1996", "Python");
        Student s3 = new Student("S923007", "Bill", "1/23/2000", "Python");
        s3.setClassList(s3.getClassList() + " , Python Exam 1" );
//        s2.classList(s3.getClassList() + " , Python Exam 1" );
//        You cannot update records as they have no setter class. Records are meant to be immutable.
        System.out.println(s2.name() + " is taking " + s2.classList());
        System.out.println(s3.getName()+ " is taking " + s3.getClassList());
    }
}
