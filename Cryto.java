import java.util.Scanner;
import java.util.Arrays;

public class Crypto {
   
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
System.out.print("Enter four digits: ");
 int number = input.nextInt();
int[] digits = new int[4];

     
        for (int i = 3; i >= 0; i--) {
     digits[i] = number % 10;
	   number /= 10;
        }
for (int i = 0; i < 4; i++) {
     digits[i] = (digits[i] + 7) % 10;
 }

       
        
       

     
        
        
       


       
 
       
         