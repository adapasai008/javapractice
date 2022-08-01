package abstractionAndEncapsulation;

class Student {
    public int rollno;
    public String name;
    public double cgpa;

    public Student(int rollno,String name,double cgpa){
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
    }
    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
    }
    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }
}


public class StudentClass {

	public static void main(String[] args) {
		
	    Student s1 = new Student(1056,"karan",8.8);
	    s1.displayProfile();
	   System.out.println("Percentage of s1 is "+s1.findPercentage());

	}

}
