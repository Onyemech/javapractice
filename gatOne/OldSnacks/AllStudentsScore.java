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

			int sum = 0;
			

			int [] [] scoreRecorder = new int[numberOfStudents] [numberOfSubjects];
			for(int count = 0; count < numberOfStudents; count++) {
				int numbering1 = count + 1;
				for(int counter = 0; counter < numberOfSubjects ; counter++) {
					int numbering2 = counter + 1;
					System.out.print("Entering score for student "+numbering1+"\nEnter score for subject "+numbering2+" : \n");
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
						System.out.println("\tStudents	");
						System.out.println("\t=================================");
					}
				}
				int [] [] newScoreRecorder = scoreRecorder;

				for(int output = 0; output < scoreRecorder.length; output++) {
					float total = 0;
					int display = output + 1;
					System.out.print("\tStudents "+display+" : ");

					float averageCalculator = 0;
					float average = 0;
					for(int output2 = 0; output2 < numberOfSubjects; output2++) {
						total += scoreRecorder[output] [output2];
						averageCalculator++;
						average = total /averageCalculator ;
						System.out.print(" "+scoreRecorder[output] [output2]);
					}
					System.out.printf(" %d ",total," %2.f ",average);
					System.out.println();
				} 
			System.out.println("\t=================================");
			
		}

}