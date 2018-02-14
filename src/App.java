import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			
			System.out.println("Pretend Calculator v0.1");
			System.out.println("------------");
			
			System.out.println();
			
			
			while(true) {
				// loop until exit
				System.out.println("Type a command. 'a' for addition. 's' for subtraction. 'm' for multiplication. 'd' for division'");
				System.out.print("Type a command: ");
				String command = input.next().toLowerCase();
				System.out.println();
				
				ICalculator calculator = null;
				
				switch(command)
				{
					case (String) "a":
						calculator = new AddingCalculator();
						break;
					case (String) "s":
						calculator = new SubtractingCalculator();
						break;
					case (String) "m":
						calculator = new MultiplyingCalculator();
						break;
					case (String) "d":
						calculator = new DividingCalculator();
						break;
					default:
						System.out.println("Invalid command! Try again!");
						continue;
				}
				
				//do random math
				
				for(int i = 1; i < 25; i++) {
					System.out.println(i + ": " + calculator.Calculate(i, i ^ 2));
				}
				
			}
	}

}
