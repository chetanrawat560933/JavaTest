package Session13thApril;

class Student
        {
            int rollNo;
            String name;
            int marks;
        }

public class ArrayOfObjects {
    public static void main(String[] args) {

        //int nums[] = new int[4];

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Chetan";
        s1.marks = 80;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "HiThere";
        s2.marks = 45;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Test";
        s3.marks = 98;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i<students.length; i++)
        {
            System.out.println(students[    i].name+ " : " + students[i].marks);
        }

    }
}
