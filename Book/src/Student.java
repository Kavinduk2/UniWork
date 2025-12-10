public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "" + name + " - " +age;
    }

    @Override
    public int compareTo(Student other){
        return this.age - other.age;
    }


}
