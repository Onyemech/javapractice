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
       0 -> Power off
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

		  case 6:
		    showCallCosts ();
		   int showCall = input.nextInt();
		    switch (showCall) {
			 case 0:
			  menu();
			  break;
			 }
		    break;

		   case 7:
			callCostSettings ();
		       int callCost = input.nextInt();
		    switch (callCost) {
			 case 0:
			  menu();
			  break;
			 }

		    break;

		   }
		break;


	case 5:
		tones ();
	      int tone = input.nextInt();
			 switch (tone) {
			 case 0:
			  menu();
			  break;
			 }

		break;


	case 6:
		settings ();
		int setting = input.nextInt();
			 switch (setting) {
			 case 0:
			  menu();
			  break;
			 case 1:
			  callSettings ();
			 int callSett = input.nextInt();
			 switch (callSett) {
			 case 0:
			  menu();
			  break;
			 }

			  break;
			 case 2:
			  phoneSettings ();
			 int phoneSett = input.nextInt();
			 switch (phoneSett) {
			 case 0:
			  menu();
			  break;
			 }

			  break;
			 case 3:
			  securitySettings ();
			 int securitySett = input.nextInt();
			 switch (securitySett ) {
			 case 0:
			  menu();
			  break;
			 }

			  break;
			 }
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
     		clock ();
		int clock = input.nextInt();
			 switch (clock) {
			 case 0:
			  menu();
			  break;
			 }

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
				public static void showCallCosts  () {
				String callCost = """
				Show call costs
				1.Last call cost
				2.All calls cost
				3.Clear counters
				0.Exit
				""";
				System.out.println(callCost);

				}
				public static void callCostSettings () {

				String callSetting = """
				Call cost setting
				1.Call cost limit
				2.Show costs in
				0.Exit
				""";
				System.out.println(callSetting);

				}

			public static void tones () {

				String tones = """
				Tones
				1.Ringing tones
				2.Ringing volume
				3.incoming call alert
				4.Composer
				5.Message alert tone
				6.Keypad tones
				7.Warning and games tones
				8.Vibrating alert
				9.Screen saver
				0.Exit
				""";
				System.out.println(tones);

			}
			public static void settings () {

				String settings = """
				Settings
				1.Call Settings
				2.Phone Settings
				3.Security settings
				4.Restore factory settings
				""";
				System.out.println(settings);

			}
				public static void callSettings () {
				
				String callSett = """
				Call settings
				1.Automatic redial
				2.Speed dialling
				3.Call waiting options
				4.Own number sending
				5.Phone line in use
				6.Automatic answer
				0.Exit
				""";
				System.out.println(callSett);

				}
				public static void phoneSettings () {
				String phoneSett = """
				Phone settings
				1.Language
				2.Cell info display
				3.Welcome note
				4.Network selection
				5.Lights
				6.Confirm SIM service actions
				0.Exit
				""";
				System.out.println(phoneSett);
				
				}
				public static void securitySettings () {
				String securitySett = """
				Security settings
				1.PIN code request
				2.Call barring service
				3.Fixed dialling
				4.Closed user group
				5.Phone security
				6.Change access codes
				0.Exit
				""";
				System.out.println(securitySett);
				
				}
			public static void clock () {
				
				String clock = """
				Clock
				1.Alarm clock
				2.Clock settings
				3.Date setting
				4.Stopwatch
				5.Countdown timer
				6.Auto update of date and time
				0.Back
				""";
				System.out.println(clock);

			}




}