import java.util.Scanner;

class Student {
    String name;
    String rollNo;
    
    Student(String name,String rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
   
    void display(){
        System.out.println("Name: " + name + " Roll No: " + rollNo);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	String name1=sc.nextLine();
	String roll1=sc.nextLine();

	String name2=sc.nextLine();
	String roll2=sc.nextLine();

	Student s1=new Student(name1,roll1);
	Student s2=new Student(name2,roll2);
	
        s1.display();
	s2.display();

 	}
}
