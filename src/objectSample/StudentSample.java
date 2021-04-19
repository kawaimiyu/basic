package objectSample;

public class StudentSample {
    public static void main(String[] args) {
        Student[] students = {
                new Student("太郎",1,1,1),
                new Student("次郎",2,2,2),
                new Student("三郎",3,3,3),
                new Student("四郎",4,4,4),
        };

        for(Student student:students){
            System.out.println(student);
        }
    };
}
