import java.util.Scanner;
class TresureIsland{
	public static void main(String args[]){
		String firstChoice;
		String secondChoice;
		String thirdChoice;
		System.out.println("enter left or right");
		Scanner sc = new Scanner(System.in);
		firstChoice =sc.next();
		if(firstChoice.equalsIgnoreCase("left")){
			System.out.println(" enter swim or wait");
			//Scanner sc = new Scanner(System.in);
			secondChoice = sc.next();
			if(secondChoice.equalsIgnoreCase("wait")){
				System.out.println("which door red blue or yellow");
				thirdChoice = sc.next().toLowerCase();
				/*if(thirdChoice.equalsIgnoreCase("red")){
					System.out.println("burned by fire game over");
				}
				if(thirdChoice.equalsIgnoreCase("blue")){
					System.out.println("eaten by pest");
				
				
				}
				if(thirdChoice.equalsIgnoreCase("yellow")){
					System.out.println("you win");
				
				
				}
				else{
					System.out.println("game over");
				}
				*/
				
				switch(thirdChoice){
					case "blue":
						System.out.println("eaten by pest");
						break;
					case "red":
						System.out.println("burned by fire game over");
						break;
					case "yellow":
						System.out.println("you win");
						break;
					default:
						System.out.println("invalid choice for red blue yellow");
					
					
					
					
					
					
					
					
				}
			
			}
			else{
				System.out.println("attacked by trout game over");
			}
		
			
		
		}
		else{
			System.out.println("fall into home game over");
		}
		
	}




}

/*
D:\Aurionpro 22\core java>java TresureIsland
enter left or right
left
 enter swim or wait
wait
which door red blue or yellow
yellow
you win




*/