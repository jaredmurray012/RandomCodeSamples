//Random code samples provided from the book that I am using to brush up and use to code. 


public class Course 
{
	private String courseName; 
	private String [] students = new String[100]; 
	private int numberOfStudents; 
	
	public Course(String courseName)
	{
		this.courseName = courseName; 
	}
	
	public void addStudent(String student)
	{
		students[numberOfStudents] = student; 
		numberOfStudents++; 
	}
	
	public String[] getStudents()
	{
		return students; 
	}
	
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	
	public String getCourseName()
	{
		return courseName; 
	}
	
	public void dropStudent(String student) // Solution that I came up with to drop a student from an Array part one 
	{
		for(int i = 0; i < students.length; i++)
		{
			if (student.equals(students[i]))
			{
				System.out.println("I found, " + student);
				numberOfStudents--;
				dropItem(i); // Part two, sticking to clean code principle of a function doing one thing. 
			}
		}
	}
	
	public void dropItem(int startingElement) // Part two, sticking to clean code principle of a function doing one thing. 
	{
		for(int i = startingElement; i < students.length-1; i++)
		{
			students[i] = students[i+1];
			
		}
	}
	
	
}
