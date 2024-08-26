import java.util.Scanner;

public class NokiaUpgrade {

public static void main(String... args){
menu();
}

	public static void menu(){

       	String menu = """
     	 Hello Welcome to Nokia
        Select any of the options below
      1 -> Phone book
      2 -> Messages
      3 -> Chat 
      4 -> Call register 
      5 -> Tone
      6 -> Settings
      7 -> Call divert
      8 -> Games
      9 -> Calculator 
      10 -> Reminders
      11 -> Clocks
      12 -> Profiles
      13 -> Sim services
       0 -> back
	""";
	Scanner input = new Scanner(System.in); 
	 System.out.println(menu);
    	int userInput = input.nextInt();
		switch(userInput) {

	case 1: 
		phoneMenu1 ();
		int phoneBook = input.nextInt();
	    switch (phoneBook) {

	    case 8:
		options();
		int goBak = input.nextInt();
		break;
	    case 0:
		menu();}
		break;



	case 2:
        	messages2 ();
		int message = input.nextInt();
		switch(message) {
	            case 0:
			menu();
	    	    case 7:
			innerMessages7 ();
			int subMessage = input.nextInt();
		    	  switch(subMessage) {
		       case 1:
			set1();
			 int prevoius = input.nextInt();
			switch (prevoius) {
			  case 0:
			    menu();
			}
			break;

		       case 2:
			common2();
			 int previous = input.nextInt();
			switch (previous) {
		          case 0:
			    menu();
			    break;
			}
			 
			break;
		       case 0:
			messages2 ();
			break;
		    	  }
		}
		break;



	case 3:
        	System.out.println("Chat\n0.back");
		int chat = input.nextInt();
		   switch (chat) {
		     case 0:
		      menu();
		   }	
        	break;
	case 4:
        	callRegister();
		int callRegister = input.nextInt();
        	   switch (callRegister) {
		   case 0:
		    menu();
		    int call = input.nextInt();
		    break;
		   case 5:
			callDuration5 ();
			int duration = input.nextInt();
			 switch (duration) {
			 case 0:
			  menu();
			  break;
			 }
		    break;
		  /* case 6:
		    break;
		   case 7:
		    break;*/

		   }
		break;
	case 5:
        	System.out.println("Tone");
		break;
	case 6:
		System.out.println("Settings");
		break;
	case 7:
        	System.out.println("Call divert");
        	break;
	case 8:
        	System.out.println("Games");
        	break;
	case 9:
        	System.out.println("Calculator"); 
        	break;
	case 10:
        	System.out.println("Reminders");
        	break;
	case 11:
        	System.out.println("Clock");
		break;
	case 12:
        	System.out.println("Profiles");
        	break;
	case 13:
        	System.out.println("SIM services");
        	break;
	case 0: 
		System.out.println("Bye");
		break;
	default:
        	System.out.println("Invalid input please input any of the given option");
		System.out.println(menu);
		int tryAgain = input.nextInt();
	break;

		}
	}
		public static void phoneMenu1 () { 
String internalMenu = ("Phone\n1.Service\n2.Search\n3.Add name\n4.Erase\n5.Edit\n6.Assign tone\n7.Send b'card\n8.Options\n9.Speed dials\n10.Voice tags\n0.Exit");
	System.out.println(internalMenu);
		

	
		}
			public static void options() {
			  String options = """
			   Options
			   1.Type of view
			   2.Memory Status
			   0.Back
				""";
				System.out.println(options);
		
			}
		 	public static void messages2 () {
		  	 String messages = ("Messages\n1.Write Messages\n2.inbox\n3.Outbox\n4.Picture messages\n5.Templates\n6.Smileys\n7.Messsages\n0.Back");
		    	  System.out.println(messages);

		}
				public static void innerMessages7 () {
				  System.out.println("Messages\n1.Set 1\n2.Common\n0.Back"); 
				}
					public static void set1() {
					 System.out.println("Set\n1.Messages centre number\n2.Messages sent as\n3.Message validity\n0.Exit");
					}
					public static void common2() {
					 System.out.println("Common\n1.Delivery reports\n2.Reply via same centre\n3.Character support\n0.Exit");
					}
			public static void callRegister() {
			 System.out.println("Call Register\n1.Missed calls\n2.Received calls\n3.Dialled numbers\n4.Erase recent call lists\n5.Show call duration\n6.Show call costs\n7.Call cost settings\n8.Prepaid credit\n0.Exit");
				
			}
				public static void callDuration5 () {
				 String callDuration = """
				  Show Call duration
				   1. Last Call Duration
				   2. All Calls Duration
				   3. Received Calls Duration
				   4. Dialed Calls Duration
				   5. Clear Timers
				   0.Exit
				""";
				  System.out.println(callDuration);

				}

}