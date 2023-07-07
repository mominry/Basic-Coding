import java.util.Scanner;

public class RideBillCalculator {

 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Put your height");
  int height = sc.nextInt();
  int rideBill = 0;
  if (height > 120 ) {
   System.out.println(" can't  ride");
  }
  else {
	   System.out.println("can ride");
	   System.out.println("enter your age");
	   int age = sc.nextInt();
		   if(age < 12) {
			rideBill = 5;
		   }
		   else if(age > 12 && age < 18) {
			rideBill = 7;
		   }
		   else
			{
			if (age >= 45 && age <= 55) {
			 rideBill = 0;
			}
			else {
			 rideBill = 12;
			}
		   
			}
   
   System.out.println("Want Photos?, Enter Yes or No ");
   String wantPhotos = sc.next();
   if(wantPhotos.equalsIgnoreCase("no")) {
		System.out.println("The total Bill is $" +rideBill);
   }
   else if (wantPhotos.equalsIgnoreCase("yes")){
		rideBill = rideBill+3;
		System.out.println("The total Bill is $" + rideBill);
   }
   else {
		System.out.println("Please enter yes or no");
   }
  }
 }
}


/*
output of the code
D:\Aurionpro 22\core java>java RideBillCalculator
Put your height
34
can ride
enter your age
14
Want Photos?, Enter Yes or No
yes
The total Bill is $10




*/