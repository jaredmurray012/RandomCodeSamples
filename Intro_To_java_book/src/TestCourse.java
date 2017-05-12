
public class TestCourse {

	public static void main(String[] args) 
	{
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems"); 
		
		course1.addStudent("Stu 1");
		course1.addStudent("Stu 2");
		course1.addStudent("Stu 3");
		
		course2.addStudent("Stu 4");
		course2.addStudent("Stu 4");
		
		course1.dropStudent("Stu 3");
		
		System.out.println("Number of students in course1 " + course1.getNumberOfStudents()); 
		
		String[] students = course1.getStudents(); 
		for(int i = 0; i < course1.getNumberOfStudents(); i++)
		{
			System.out.print(students[i] + " , ");
		}
		
		
	}

}
