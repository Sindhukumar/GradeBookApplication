import java.util.Scanner;

public class GradeBookApplication {
	public static final int Max = 100;
  public static void main(String args[]){
	String[] name,grade,gender,major,stateOfOrigin; 
	double[] score;
	String choice;
	name=new String[Max];
	grade=new String[Max];
	gender=new String[Max];
	major=new String[Max];
	stateOfOrigin=new String[Max];
	score = new double[Max];
	boolean hasMore=true;
	int count=0,oCount=0, mCount=0, fCount=0, mdCount=0, dcCount=0, vaCount=0, eConCount=0, comSciCount=0, eeCount=0;
	double oSum=0, mSum=0, fSum=0, mdSum=0, dcSum=0, vaSum=0, eConSum=0, comSciSum=0, eeSum=0; 
	Scanner sc = new Scanner(System.in);
	while(true){
		System.out.println("Add a student to the database? (\"yes\"/\"no\")");
		choice =sc.nextLine();
		if(choice.equalsIgnoreCase("no"))
			break;
		System.out.println("Enter the name: ");
		name[count]=sc.nextLine();
		System.out.println("Enter the Grade: ");
		grade[count]=sc.nextLine();
		System.out.println("Enter the gender (\"M\"/\"F\"): ");
		gender[count]=sc.nextLine();
		System.out.println("Enter the major: ");
		major[count]=sc.nextLine();
		System.out.println("State of Origin: ");
		stateOfOrigin[count]=sc.nextLine();
		System.out.println("Score: ");
		score[count]=sc.nextDouble();
		sc.nextLine();
		if(gender[count].equalsIgnoreCase("M")){
			mSum=mSum+score[count];
			mCount++;
		}
		if(gender[count].equalsIgnoreCase("F")){
			fSum=mSum+score[count];
			fCount++;
		}
		if(major[count].equalsIgnoreCase("Econ")){
			eConSum=mSum+score[count];
			eConCount++;
		}
		if(major[count].equalsIgnoreCase("CompSci")){
			comSciSum=mSum+score[count];
			comSciCount++;
		}
		if(major[count].equalsIgnoreCase("EE")){
			eeSum=mSum+score[count];
			eeCount++;
		}
		if(stateOfOrigin[count].equalsIgnoreCase("MD")){
			mdSum=mSum+score[count];
			mdCount++;
		}
		if(stateOfOrigin[count].equalsIgnoreCase("VA")){
			vaSum=mSum+score[count];
			vaCount++;
		}
		if(stateOfOrigin[count].equalsIgnoreCase("DC")){
			dcSum=mSum+score[count];
			dcCount++;
		}
		oSum=oSum+score[count];
		count++;
	}
	System.out.println("Report Date: Sep 7: 2016\n");	
	System.out.println("Number of students: "+count);
	System.out.println("Overall Average: "+ (oSum/(count==0?1:count)));
	System.out.println("\nAverage for Gender");
	System.out.println("Male: "+(mSum/(mCount==0?1:mCount)));
	System.out.println("Female: "+(fSum/(fCount==0?1:fCount)));
	System.out.println("\nAverage for Major");
	System.out.println("Econ: "+(eConCount/(eConCount==0?1:eConCount)));
	System.out.println("CompSci: "+(comSciSum/(comSciCount==0?1:comSciCount)));
	System.out.println("EE: "+(eeSum/(eeCount==0?1:eeCount)));
	System.out.println("\nAverage by State");
	System.out.println("MD: "+(mdSum/(mdCount==0?1:mdCount)));
	System.out.println("VA: "+(vaSum/(vaCount==0?1:vaCount)));
	System.out.println("DC: "+(dcSum/(dcCount==0?1:dcCount)));
	sc.close();
  }
	
}
