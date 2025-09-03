import java.util.ArrayList;
import java.util.Scanner;
public class FinancialApplication {
	 static Scanner input = new Scanner(System.in);
ArrayList <String> names = new ArrayList<>();
  public static void main(String[] args) {
	while(true) {
	String message = """
=====================================
WELCOME TO SEMICOLON EMPLOYEE PAYROLL
=====================================
1 - ADD EMPLOYEE PAYROLL
2 - VIEW EMPLOYEE PAYROLL
3 - UPDATE EMPLOYEE PAYROLL
4 - EXIT
===========================
            		""";
		System.out.println(message);
		System.out.print("enter a number to select: ");
	        int number = input.nextInt();
		switch(number) {
		case 1 -> ADDEMPLOYEEPAYROLL();
                //case 2 -> VIEWEMPLOYEEPAYROLL();
               // case 3 -> UPDATEEMPLOYEEPAYROLL();
               case 4 -> {
                    System.out.println("....BYE!");
                    return;
                }
                default -> System.out.println("invalid input");
		}
}
}
public static void ADDEMPLOYEEPAYROLL(){
while(true){
Scanner input = new Scanner(System.in);
System.out.print("enter employee name: ");
String Name = input.nextLine();
//names.add(Name);
System.out.print("enter number of hours worked in a week: ");
double hours = input.nextDouble();
if(hours >= 40){
System.out.print("oga, oga, oga you cant work for 40 hours straight..noooo ");
System.out.print("enter number of hours worked in a week: ");
hours = input.nextInt();
System.out.print("enter hourly pay rate: ");
int pay = input.nextInt();
System.out.print("enter federal tax withholding rate: ");
double tax = input.nextDouble();
System.out.print("enter state tax withholding rate: ");
double stax = input.nextDouble();
//names.add(double.toString(hours, pay, tax, stax));
System.out.print("do you wish to continue or to go back?, press 1 to continue and 0 to go back 1/0 ");
int choice = input.nextInt();
if (choice == 1){
continue;
}
else{
break;
}
}
}
}
public static void VIEWEMPLOYEEPAYROLL(){
//if (names.isEmpty()) {
            //System.out.println("No names available.");
            //return;
        //}


}
}



