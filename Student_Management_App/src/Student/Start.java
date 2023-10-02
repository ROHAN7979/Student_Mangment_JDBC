package Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
public static void main(String[] args)throws IOException {
	System.out.println("Welcome To Student Managment App");
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{
		System.out.println("Press 1 to add Student");
		System.out.println("Press 2 to Delete Student");
		System.out.println("Press 3 to Display Student");
		System.out.println("Press 4 to Exit App");
		int c=Integer.parseInt(br.readLine());
		
		if(c==1)
		{
			//add student
			System.out.println("Enter UserName : ");
			String name=br.readLine();
			
			System.out.println("Enter Phone :");
			String phone=br.readLine();
			
			System.out.println("Enter City : ");
			String city=br.readLine();
			
			//create student object to store student
			Student st=new Student(name, phone, city);
		boolean answer=StudentDao.insertStudnetToDB(st);
		if(answer)
		{
			System.out.println("Student has added Succesfully!!");
		}
		else
		{
			System.out.println("Something went Wrong");
		}
			System.out.println(st);
		}
		else if(c==2)
		{
			//delete Student
			System.out.println("Enter Student Id to Delete: ");
			int userId=Integer.parseInt(br.readLine());
			boolean f=StudentDao.deleteStudent(userId);
			if(f)
			{
				System.out.println("Deleted Successfully!!");
			}
			else
			{
				System.out.println("Something Went Wrong!!");
			}
		}
		else if(c==3)
		{
			//display Student
			
			System.out.println("Displaying the Data");
			boolean dis=StudentDao.DisplayAll();
			if(dis)
			{
				System.out.println("Display Successful");
			}
			else
			{
				System.out.println("Something Went Wrong");
			}
		}else if(c==4)
		{
			//exit
			break;
		}
	}
	System.out.println("Thank You For Using My Application!!");
	System.out.println("See You Soon!!");
}
}
