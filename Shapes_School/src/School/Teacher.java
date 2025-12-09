package School;

public class Teacher extends Person {
    private double salary;
    private String subject;

    private Student[]  tutees = new Student[3];
    private int tuteeCount;

    public Teacher(String name, int age,String gender, String subject, double salary){
        super(name, age, gender);
        this.subject = subject;
        this.salary =salary;
    }


    public void addTutee(Student s){
        if(tuteeCount < 3){
            tutees[tuteeCount] = s;
            tuteeCount++;
            System.out.println("Assign "+s.getMyName()+ " to "+this.getMyName());
        } else{
            System.out.println("This teacher already have 3 student's, can't add more");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString(){
        String teacherInfo = super.toString() + ", Subject: " + subject + ", Salary: " + salary;
        String studentList = "\n   Tutees:";

        for (int i = 0; i < tuteeCount; i++) {
            studentList += "\n   - " + tutees[i].getMyName(); // Assumes Student has getName()
        }
        return teacherInfo + studentList;
    }
}
