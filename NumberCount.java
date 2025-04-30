import java.util.Scanner;
public class NumberCount {
public static void main(String[] args) {
	int neg = 0;
	int pos = 0;
	int count = 1;
	int total = 0;
	Scanner input = new Scanner(System.in);
	while(count != 0) {
	System.out.print("kindly enter the integer, the input ends if it is 0: ");
	int num = input.nextInt();
	count++;
	if(num == 0) {
	break;
	}
	total += num;
	if(num > 0) {
	pos++;
	}
	if(num < 0) {
	neg++;
	}
	
	}
double average = (double) total / (pos + neg);
 System.out.printf("the number of positive is %d%n", pos);
System.out.printf("the number of negative is %d%n", neg);
System.out.printf("the total  is %d%n", total);
System.out.printf("the average is %f%n", average);
}
 }