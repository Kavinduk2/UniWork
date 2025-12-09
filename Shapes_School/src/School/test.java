package School;

import org.w3c.dom.ls.LSOutput;

public class test {
    public static void main(String[] args) {
        Teacher mrSmith = new Teacher("Mr. Smith", 40, "M", "Math", 50000);

        Student s1 = new Student("Alice", 18, "F", "S001");
        Student s2 = new Student("Bob", 19, "M", "S002");
        Student s3 = new Student("Charlie", 18, "M", "S003");


        mrSmith.addTutee(s1);
        mrSmith.addTutee(s2);
        mrSmith.addTutee(s3);


        Student s4 = new Student("Dave", 20, "M", "S004");
        mrSmith.addTutee(s4);

      
        System.out.println("-----------------------------");
        System.out.println(mrSmith.toString());


    }


}
