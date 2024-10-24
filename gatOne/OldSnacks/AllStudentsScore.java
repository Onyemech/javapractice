import java.util.Scanner;

public class AllStudentsScore {

	public static void main(String... args){ 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students do you have : ");
		int numberOfStudents = input.nextInt();

		System.out.println("How many subject do they offer : ");
		int numberOfSubjects = input.nextInt();

		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved successfully");

		int [] [] scoreRecorder = new int[numberOfStudents] [numberOfSubjects];
		int [] [] registerNewScores = collectScores(numberOfStudents, numberOfSubjects);

		displayResults (numberOfSubjects, registerNewScores);


		}

		public static int [] [] collectScores (int numberOfStudents, int numberOfSubjects) {

			Scanner input = new Scanner(System.in);

			int [] [] scoreRecorder = new int[numberOfStudents] [numberOfSubjects];
			for(int count = 0; count < numberOfStudents; count++) {
				int numbering1 = count + 1;
				for(int counter = 0; counter < numberOfSubjects ; counter++) {
					int numbering2 = counter + 1;
					System.out.print("Entering score for student "+numbering1+"\nEnter score for subject "+numbering2+" : ");
					if(scoreRecorder[count] [counter] < 0 || scoreRecorder[count] [counter]  > 100) {
						System.out.println("Invalid score");
					}

					else {
						scoreRecorder[count] [counter] = input.nextInt();
					}
				
				}
			
			}
			return scoreRecorder;
		}
		
		public static void displayResults (int numberOfSubjects, int [] []scoreRecorder) {
		
				for(int displayResults = 0; displayResults < numberOfSubjects; displayResults++) {
					if (displayResults * 1 == 0){ 
						System.out.println("Students	");
						System.out.println("---------------------------------------------------------------------------------------------------");
						System.out.println("---------------------------------------------------------------------------------------------------");
					}
				}

				for(int output = 0; output < scoreRecorder.length; output++) {

					int display = output + 1;
					System.out.print("Students "+display+" : ");
					for(int output3 = 0; output3 < numberOfSubjects; output3++) {
						System.out.print(" "+scoreRecorder[output] [output3]);
					}
					System.out.println();
				}

		}

}