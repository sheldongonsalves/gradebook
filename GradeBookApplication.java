import java.util.Scanner;
import java.lang.String;
import java.util.Date;
public class GradeBookApplication {
	static Scanner sc = new Scanner(System.in);
	static Date date=new Date();
	static String response ="y";
	static String [] names = new String[10];
	static String [] grades = new String[10];
	static String [] genders = new String[10];
	static String [] majors = new String[10];
	static String [] stateOfOrigins = new String[10];
	static int [] scores = new int[10];
	

	public static void main(String [] args)
	{

		System.out.println("Dalton Community School");
		for (int i=0;i<scores.length;i++)
		{
			scores[i]=0;

		}
		Enter();
	}
	public static void Enter()
	{
		String name ; 
		String grade ;
		String gender ;
		String major ;
		String stateOfOrigin ;
		int score;
		int askUser;
		int counter=0;
		double average = 0 ,sum =0;
		System.out.println("Enter the number of records you want to enter");
		askUser=sc.nextInt();
		sc.nextLine();

		for (int i=0; i<askUser;i++)
		{

			System.out.println("Name: ");
			name = sc.next();
			names[i]=name;
			System.out.println("Grade: ");
			grade = sc.next();
			grades[i] =grade;
			System.out.println("Gender: ");
			gender = sc.next();
			genders[i] = gender;
			System.out.println("Major: ");
			major= sc.next();
			majors[i] = major;
			System.out.println("State of Origin: ");
			stateOfOrigin = sc.next();
			stateOfOrigins[i] =stateOfOrigin;
			System.out.println("Score: ");
			score = sc.nextInt();
			scores[i]=score;
			sum +=scores[i];
            counter=counter+1;

			
			System.out.println("---------------------------------------------------------------- ");
		}
		
			average =sum/counter;
			System.out.println("Average of Entered Data  "+average);
			Display(askUser);
			


	}
	public static void Display(int askUser)
	{
		
		System.out.println("Name"+" "+"Grade"+" "+"Gender"+" "+"Major"+" "+"State Of Origin"+" "+"Scores");
        System.out.println(date.toString());
		for(int i=0;i< askUser;i++)
		{
			System.out.println(names[i]+" "+ grades[i] +" "+ genders[i] +" "+ majors[i] +" "+ stateOfOrigins[i] +" "+scores[i]);
		}
        CalculateSearch();
	}
	public static void CalculateSearch()
	{
		String response;
		String array[]=new String[10]; int temp;
		int avg=0 ,sum=0,count=0;
		System.out.println("Enter your search criteria via State , Gender ,Major");
		response=sc.next();
		
			
				if(response.equalsIgnoreCase("M"))
				{
					for(int i=0;i<genders.length;i++)
					{
					System.out.println(i);
					sum+=scores[i];
					count++;
					}
					System.out.print("Average : "+avg/count);
				}
				if(response.equalsIgnoreCase("F"))
				{
					for(int i=0;i<genders.length;i++)
					{
					System.out.println(i);
					sum+=scores[i];
					count++;
					}
					System.out.print("Average : "+avg/count);
				}
			  
				if(response.equalsIgnoreCase("VA")||response.equalsIgnoreCase("MD")||response.equalsIgnoreCase("DC"))
				{
					for(int i=0;i<genders.length;i++)
					{
					System.out.println(i);
					sum+=scores[i];
					count++;
					}
					System.out.print("Average : "+avg/count);
				}
			
				{
					for(int i=0;i<genders.length;i++)
					{
					System.out.println(i);
					sum+=scores[i];
					count++;
					}
					System.out.print("Average : "+avg/count);
				}
			
				{
					for(int i=0;i<genders.length;i++)
					{
					System.out.println(i);
					sum+=scores[i];
					count++;
					}
					System.out.print("Average : "+avg/count);
				}
			
		       
	}
}

