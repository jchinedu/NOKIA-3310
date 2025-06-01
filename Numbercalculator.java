import java.util.Scanner;
public class Numbercalculator{
 public static void main(String[] args) {
	String continueOperation;
Scanner input = new Scanner(System.in);
do {	
System.out.println("""
=================================================================
CHOOSE THE OPERATION YOU WANT TO PERFORM ON THIS APP OR 0 TO EXIT
=================================================================
         1- FOR ADDITION
	 2- FOR SUBTRACTION
	 3- FOR MULTIPLICATION
	 4- FOR DIVIDION
=======================================================
        """);
	int userchoice = input.nextInt();
	switch(userchoice){
	case 1:
       do {
	System.out.print("""
	============================================================================
	kindly enter the two integers you want to add with space to seperate:  
	============================================================================
	""");
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	int sum = number1 + number2;
	System.out.println("the sum of " + number1 + " and " + number2 + " is: " + sum);
	       System.out.print("do you want to perform the operation again?(yes/no):");
		continueOperation = input.next();
	} while(continueOperation.equalsIgnoreCase("yes"));
		if(continueOperation.equalsIgnoreCase("no")){
		 return;
		}
	case 2 :
       do {
	System.out.print("""
	=============================================================================================
	kindly enter the two integers you want to subtract with space to seperate the numbers:  
	=============================================================================================
	""");
	//String continueOperation;
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	int minus = number1 - number2;
	System.out.println("the subtraction of " + number1 + " and " + number2 + " is: " + minus);
	       System.out.print("do you want to perform the operation again?(yes/no):");
		continueOperation = input.next();
	} while(continueOperation.equalsIgnoreCase("yes"));
	if(continueOperation.equalsIgnoreCase("no")){
		 return;
		}
	case 3:
	do {
	System.out.print("""
	============================================================================================
	kindly enter the two integers you want to multiply with space to seperate the numbers:  
	============================================================================================
	""");
	//String continueOperation;
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	int minus = number1 * number2;
	System.out.println("the multiplication of " + number1 + " and " + number2 + " is: " + minus);
	       System.out.print("do you want to perform the operation again?(yes/no):");
		continueOperation = input.next();
	} while(continueOperation.equalsIgnoreCase("yes"));
	if(continueOperation.equalsIgnoreCase("no")){
		 return;
		}
	case 4:
	do {
	System.out.print("""
	============================================================================================
	kindly enter the two integers you want to divide with space to seperate the numbers:          
	============================================================================================
	""");
	//String continueOperation;
	double number1 = input.nextInt();
	double number2 = input.nextInt();
	double minus = number1 / number2;
	System.out.println("the divisiomn of " + number1 + " and " + number2 + " is: " + minus);
	       System.out.print("do you want to perform the operation again?(yes/no):");
		continueOperation = input.next();
	} while(continueOperation.equalsIgnoreCase("yes"));
	if(continueOperation.equalsIgnoreCase("no")){
		 return;
		}
	case 0:
          break;


	

}
 }
}
