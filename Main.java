import java.util.Scanner;

public class Main {
	
	static char[][] print(String input) {
		int length = input.length();
		char output[][] = new char[length][length];
		int rows = 0;
		for(int i=length-1;i>=0;i--) {
			int k = 0;
			for(int j=i;j<length;j++) {
				output[rows][j] = input.charAt(k++);
			}
			rows++;
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		int length = inputString.length();
		String modifiedInput = inputString.substring(length/2) + inputString.substring(0, length/2);		
		char[][] output = print(modifiedInput);
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
	}

}
