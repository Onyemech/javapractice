import java.util.Scanner;

public class ChristmasSong {

	public static void main(String[] args) {
		
	Scanner christmas = new Scanner(System.in);
	
	String christmasSongs = """

		1. A Partridge in a Pear Tree
		2. Two Turtle Doves
		3. Three French Hens
		4. Four Calling Birds
		5. Five Golden Rings
		6. Six Geese a-Laying
		7. Seven Swans a-Swimming
		8. Eight Maids a-Milking
		9. Nine Ladies Dancing
		10. Ten Lords a-Leaping
		11. Eleven Pipers Piping
		12. Twelve Drummers Drumming
		""";
	System.out.println(christmasSongs);

	System.out.print("please choose any of the options : ");
	int userOption = christmas.nextInt();
	
		switch (userOption) {
			case 1:
				System.out.print("On the first day of Christmas, my true love gave to me\nA Partridge in a Pear Tree");
				break;
			case 2:
				System.out.print("On the second day of Christmas, my true love gave to me\nTwo Turtle Doves and A Partridge in a Pear Tree");
				break;
			case 3:
				System.out.print("On the third day of Christmas, my true love gave to me\n Three French Hens\nTwo Turtle Doves and A Partridge in a Pear Tree");
				break;
			case 4:
				System.out.print("On the fourth day of Christmas, my true love gave to me\nFour Calling Birds\n Three French Hens\nTwo Turtle Doves and A Partridge in a Pear Tree");
				break;
			case 5:
				System.out.print("On the fifth day of Christmas, my true love gave to me\nFive Golden Rings\nFour Calling Birds\n Three French Hens\nTwo Turtle Doves and A Partridge in a Pear Tree");
				break;
			case 6:
				String sixDay = """
				On the sixth day of christmas, my true love gave to meeee

				Six Geese a-Laying
				Five golden ringsss
				Four calling birds
				Three french hens 
				Two turtle dove
				And a partridge in a pear tree
				""";
				System.out.print(sixDay);
					break;
			case 7:
				String sevenDay = """
				On the seventh day of christmas, my true love gave to meeee
				Seven Swans a-Swimming
				Six Geese a-Laying
				Five golden ringsss
				Four calling birds
				Three french hens 
				Two turtle dove
				And a partridge in a pear tree
				""";
				System.out.print(sevenDay);
					break;
			case 8:
				String eightDay = """
				On the eighth day of christmas, my true love gave to meeee
				Eight Maids a-Milking
				Seven Swans a-Swimming
				Six Geese a-Laying
				Five golden ringsss
				Four calling birds
				Three french hens 
				Two turtle dove
				And a partridge in a pear tree
				""";
				System.out.print(eightDay);
					break;
			case 9:
				String ninthDay = """
				On the ninth day of christmas, my true love gave to meeee

				Nine Ladies Dancing
				Eight Maids a-Milking
				Seven Swans a-Swimming
				Six Geese a-Laying
				Five golden ringsss
				Four calling birds
				Three french hens 
				Two turtle dove
				And a partridge in a pear tree
				""";
				System.out.print(ninthDay);
					break;
			case 10:
				String tenthDay = """
				On the tenth day of christmas, my true love gave to meeee

				Ten Lords a-Leaping
				Nine Ladies Dancing
				Eight Maids a-Milking
				Seven Swans a-Swimming
				Six Geese a-Laying
				Five golden ringsss
				Four calling birds
				Three french hens 
				Two turtle dove
				And a partridge in a pear tree
				""";
				System.out.print(tenthDay);
					break;
			case 11:
				String eleventhDay = """
				On the eleventh day of christmas, my true love gave to meeee

				Eleven Pipers Piping
				Ten Lords a-Leaping
				Nine Ladies Dancing
				Eight Maids a-Milking
				Seven Swans a-Swimming
				Six Geese a-Laying
				Five golden ringsss
				Four calling birds
				Three french hens 
				Two turtle dove
				And a partridge in a pear tree
				""";
				System.out.print(eleventhDay);
					break;
			case 12:
				String twelveDay = """
					On the twelveth day of christmas, my true love gave to meeee

					    Twelve Drummers Drumming
					    Eleven Pipers Piping
					    Ten Lords a-Leaping
					    Nine Ladies Dancing
					    Eight Maids a-Milking
					    Seven Swans a-Swimming
					    Six Geese a-Laying
					  Five golden ringsss
					    Four calling birds
					    Three french hens 
					    Two turtle dove
					    And a partridge in a pear tree
				""";
				System.out.print(twelveDay);
					break; 
			default:
				System.out.print("Invalid input please try again");


				



		}
	}
}