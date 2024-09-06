import java.util.Scanner;

public class Nokia3310 {

  public static void main(String[] args) {

    Scanner phoneMenu = new Scanner(System.in);
    boolean goBack = false;


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

    System.out.println(menu);
    int userInput = phoneMenu.nextInt();
	public static int phonebook(userInput) {
	switch (userInput) {
      case 1:
        System.out.println("Phone book");
     String internalMenu = ("1.Service\n2.Search\n3.Add name\n4.Erase\n5.Edit\n6.Assign tone\n7.Send b'card\n8.Options\n9.Speed dials\n10.Voice tags");
	System.out.println(internalMenu);}
    
	break;
      case 2:
        System.out.println("Messages");
	    String messages = ("1.Write Messages\n2.inbox\n3.Outbox\n4.Picture messages\n5.Templates\n6.Smileys\n7.Messsages");
		 System.out.println(messages);
            int messageset = phoneMenu.nextInt();
        switch (messageset) {
      case 7:
        System.out.println("Messages\n1.Set 1\n2.Common\n0.Back"); 
            int setcommon = phoneMenu.nextInt();
	switch (setcommon) {
      case 1:
        System.out.println("Set\n1.Messages centre number\n2.Messages sent as\n3.Message validity\n0.Back");
        break;
      case 2:
        System.out.println("Common\n1.Delivery reports\n2.Reply via same centre\n3.Character support\n0.Back");
	break;
        }
       
	
            break;
        }
        break;

      case 3:
        System.out.println("Chat");
        break;

      case 4:
        System.out.println("Call Register");
        int callRegister = phoneMenu.nextInt();
        switch (callRegister) {
        case 1:
          System.out.println("1.Missed calls\n2.Received calls\n3.Dialled numbers\n4.Erase recent call lists\n5.Show call duration\n6.Show call costs\n7.Call cost settings\n8.Prepaid credit");
            break;
        }
        break;

      case 5:
        System.out.println("Tone");
	
        break;


      case 6:
	System.out.println("Settings");
        int settings = phoneMenu.nextInt();
        switch (settings) {
         case 1:
            System.out.println("Call settings\n1.Automatic redial\n2.Speed dialling\n3.Call waiting options\n4.Own number sending\n5.Phone line in use\n6.Automatic answer\n0.Back");
            break;
         case 2:
            System.out.println("1.Phone Setting\nlanguage\n2.Cell info display\n3.Welcome note\n4.network\n5.Lights\n6.Confirm SIM service actions\n0.Back");
            break;
          case 3:
            System.out.println("Security settings\n1.PIN code\n2.Call barring service\n3.Fixed dialling\n4.Closed user group\n5.Phone Security\n6.Change access codes\n0.Back");
          case 0:
          goBack = true;
            break;
	}

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
        System.out.println("Clock");
        int clock = phoneMenu.nextInt();
        switch (clock) {
          case 1:
            System.out.println("1.Alarm clock\n2.Clock settings\n3.Date setting\n4.Stopwatch\n5.Countdown\n6.Auto update of date and time");
            System.out.println("Back or Exit\nplease select one");
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
	
	
    }
  }
     
}