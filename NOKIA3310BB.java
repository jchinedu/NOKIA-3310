import java.util.Scanner;
public class NOKIA3310BB {
	 static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
	while(true) {
	String message = """
===========================
  NOKIA 3310 - MAIN MENU 
===========================
1 - Phone Book
2 - Messages
3 - Chat
4 - Call Register
5 - Tones
6 - Settings
7 - Call Divert
8 - Games
9 - Calculator
10 - Reminders
11 - Clock
12 - Profiles
13 - Sim Service
0  - Exit
===========================
            		""";
		System.out.println(message);
		System.out.print("enter a number to select: ");
	        int number = input.nextInt();
		switch(number) {
		case 1 -> PhoneBook();
                case 2 -> Messages();
                case 3 -> Chat();
               case 4 -> CallRegister();
               case 5 -> Tones();
                case 6 -> Settings();
               case 7 -> CallDivert();
                case 8 -> Games();
                case 9 -> Calculator();
                case 10 -> Reminders();
              case 11 -> Clock();
                case 12 -> Profiles();
                case 13 -> SimService();
                case 0 -> {
                    System.out.println("NOKIA....BYE!");
                    return;
                }
                default -> System.out.println("invalid input");
            }//close of switch case
        }//close of while loop
    } //close of main method
      

public static void PhoneBook() {
	while (true) {
			
			String message2 = """
    ===============================
           PhoneBook Menu
    ===============================
    1  - Search
    2  - Service Nos.
    3  - Add name
    4  - Erase
    5  - Edit
    6  - Assign tone
    7  - Send b'card
    8  - Option
    9  - Speed dials
    10 - Voice tags
    0 - enter 0 to go back to previous menu 
    ===============================
    """;
	                System.out.println(message2);
			System.out.print("enter a number to select: ");
			int number2 = input.nextInt();
			


			switch(number2) {
			 case 0 -> {
				return;
			}
			 case 1-> {
			    System.out.println("search");
				 waitForGoBack();
				}
 			 case 2 -> {
			    System.out.println("Service Nos.");
				 waitForGoBack();
				}
			case 3 -> {
		System.out.println("Add name");
				 waitForGoBack();
			}
			case 4 ->{
			    System.out.println("Erase");
				 waitForGoBack();
				}		
			case 5 ->{
			    System.out.println("Edit");
				 waitForGoBack();
				}
			case 6 ->{
			    System.out.println("Assign tone");
				 waitForGoBack();
				}
			case 7 ->{ 
                	    System.out.println("Send b'card");
			 waitForGoBack();
			}
                        case 8 -> {
	
	boolean backToOptionsMenu = false;
    while (!backToOptionsMenu) {	
	String message3 = """
   ==============================
              Options Menu
    ==============================
    1 - Type of view
    2 - Memory status
    0 - enter 0 to go back to the previous menu
   ==============================
    """;
			System.out.println(message3);
			int num3 = input.nextInt();
			switch(num3) {
                       case 0 -> backToOptionsMenu = true;
			case 1 -> {
			    System.out.println("type of view");
			   waitForGoBack();
			}
			case 2 ->{ 

			   System.out.println("memory status");
				 waitForGoBack();
			}
			default -> 
			System.out.println("invalid input. please try again.");
			}
			}
			}
		case 9  ->{
			    System.out.println("speed dials");
				 waitForGoBack();
			} 			     		
		case 10 -> {
			     System.out.println("voice tags");
				 waitForGoBack();
		       }	
	default -> System.out.println("invalid input. please try again.");
		}
		}
		}

public static void Messages() { 
	while(true) {
	String message3 = """
    ===============================
            Messaging Menu
    ===============================
    1  - Write messages
    2  - Inbox
    3  - Outbox
    4  - Picture messages
    5  - Templates
    6  - Smileys
    7  - Message settings
    8  - Info service
    9  - Voice mailbox number
    10 - Service command editor
    11 - Enter 0 to go back to previous menu
    ===============================
    """;
				System.out.println(message3);
			System.out.print("enter a number to select: ");
			int number3 = input.nextInt();
			switch(number3) {
			case 0 ->{ return; }
			case 1 -> 
			  System.out.println("write messages: ");
			case 2 -> 
			  System.out.println("inbox ");
			case 3 -> 
			  System.out.println("outbox ");
			case 4 -> 
			  System.out.println("picture message ");
			case 5 -> 
			  System.out.println("Templates ");
			case 6 -> 
			  System.out.println("Smileys ");
			case 7 ->{ 
			boolean backToMessagesMenu = false;
		 while (!backToMessagesMenu) {	  
			 String message31 = """
    ================================
          Message Settings Menu
    ================================
    1 - Set 1
    2 - Common
    3 - enter 0 to go back to previous menu
    ================================
    """;
			System.out.println(message31);
			System.out.print("enter a number to select: ");
			int number31 = input.nextInt();
			switch(number31) {
			case 0 -> backToMessagesMenu = true;
			case 1 -> { 
		boolean backToSet1Menu = false; 
                while (!backToSet1Menu) {
			String message32 = """
    ================================
          Message Settings(SET 1)
    ================================
    1. Message center number
    2. Message sent as
    3. Message validity
    0. Enter 0 to go back to previous menu
    ================================
    """;
			System.out.println(message32);
			System.out.print("enter a number to select: ");
			int number32 = input.nextInt();
			switch(number32) {
			case 0 -> backToSet1Menu = true;
			case 1 -> {
                            System.out.println("message center number");
                            waitForGoBack();
                        }
                        case 2 -> {
                            System.out.println("messages sent as");
                            waitForGoBack();
                        }
                        case 3 -> {
                            System.out.println("message validity");
                            waitForGoBack();
                        }
                        default -> System.out.println("Invalid input.");
            }
            }
            }

            case 2 -> {
                		boolean backToCommon = false;
                		while (!backToCommon) {
                    System.out.println("""
                    ================================
                          Common Message Settings
                    ================================
                    1. Delivery reports
                    2. Reply via same centre
                    3. Character support
                    0. Go back
                    ================================
                    """);
                    System.out.print("Select an option: ");
                    int number33 = input.nextInt();
                    switch (number33) {
                        case 0 -> backToCommon = true;
                        case 1 -> {
                            System.out.println("delivery reports");
                            waitForGoBack();
                        }
                        case 2 -> {
                            System.out.println("reply via same centre");
                            waitForGoBack();
                        }
                        case 3 -> {
                            System.out.println("character support");
                            waitForGoBack();
                        }
                        default -> System.out.println("Invalid input.");
                    }
                    }
                    }

            default -> System.out.println("Invalid input.");
   }
  }
}
			case 8 ->{ 
			System.out.println("info service");
			 waitForGoBack();}

			case 9 -> {
			System.out.println("Voice mailbox number");
			 waitForGoBack();}

			case 10 ->{ 
			System.out.println("service command editor");
			 waitForGoBack();}

			default -> {System.out.print("invalid input");
			 waitForGoBack();}

		}		
		}
		}


public static void Chat() {
    			while (true) {
        System.out.println("""
            ===================================
            Chat with friends and connect with 
            people all over the world!
            ===================================
            Enter 0 to go back to Main Menu.
            """);

        System.out.print("Your choice: ");
        int choice = input.nextInt();

        if (choice == 0) {
            return;  
        } else {
            System.out.println("Invalid input. Please enter 0 to go back.");
        }
    }
}


			
public static void CallRegister() {
	while(true) {
			String message34 = """
    ================================
            Call Register Menu
    ================================
    1 - Missed call
    2 - Received call
    3 - Dialled numbers
    4 - Erase recent call lists
    5 - Show call duration
    6 - Show call cost
    7 - Call cost settings
    8 - Prepaid credit
    0 - Enter 0 to go back to previous menu
    ================================
    """; 
			System.out.println(message34);
			System.out.print("enter a number to select: ");
			int number34 = input.nextInt();
	                switch(number34) {
                  
			  case 0:  
				return;
 				
			  case 1: 
                             System.out.println("Missed call");
				waitForGoBack();
				break;
			  case 2: 
			     System.out.println("Received call");
				waitForGoBack();
				break;

			   case 3: 
			     System.out.println("Dialled numbers");
				waitForGoBack();
                		break;


			    case 4:
			     System.out.println("Erase recent call list");
				waitForGoBack();
                		break;


			case 5:{
			boolean backToCallRegisterMenu = false;
   			 while (!backToCallRegisterMenu) {
			 String message35 = """
    ================================
           Call Duration Menu
    ================================
    1 - Last call duration
    2 - All calls duration
    3 - Received calls duration
    4 - Dialled calls duration
    5 - Clear timers
    6 - Enter 0 to go back to previous menu
    ================================
    """;
				System.out.println(message35);
			System.out.print("enter a number to select: ");
			int number35 = input.nextInt();
	                switch(number35) {
		
			case 0 :backToCallRegisterMenu = true;
			case 1: 
                       		System.out.println("last call duration");
				waitForGoBack();
				break;

			case 2:
				System.out.println("All calls duration");
    				waitForGoBack();
			  	break;

			case 3:
				System.out.println("Received calls duration");
				waitForGoBack();
		          	break;

			case 4:
				System.out.println("Dialled calls duration");
				waitForGoBack();
				break;

			case 5:
				System.out.println("clear timers");
				waitForGoBack();
		             	break;

			default: System.out.println("invalid input");
			break;
		}
		}
		break;
		}
		case 6:{
			boolean backToCallRegisterMenu = false;
    			while (!backToCallRegisterMenu) {

  			String message36 = """
    ================================
          Show All Cost Menu
    ================================
    1 - Last call cost
    2 - All calls cost
    3 - Clear counters
    4 - enter 0 to go back to previous menu
    
    ================================
    """;			System.out.println(message36);
			System.out.print("enter a number to select: ");
			int number36 = input.nextInt();
			switch(number36) {
			
			case 0 : backToCallRegisterMenu = true;
				break;
			case 1:  
                            System.out.println("Last call cost");
				waitForGoBack();
			    	break;

			case 2:
			  System.out.println("All cals cost");
				waitForGoBack();
			    break;

			case 3: 
			  System.out.println("clear counters");
			waitForGoBack();			    
				break;

			default: System.out.println("invalid input");
				break;
			}
			}
				break;
			}
		
			case 7: {
			boolean backToCallRegisterMenu = false;
    			while (!backToCallRegisterMenu) {

			
			String message37 = """
    ================================
         Call Cost Settings
    ================================
    1 - Call cost limit
    2 - Show cost in
    0 - Enter 0 to go back to previous menu
    ================================
    """;
				System.out.println(message37);
			System.out.print("enter a number to select: ");
			int number37 = input.nextInt();
			switch(number37) {
			case 0:  backToCallRegisterMenu = true; 
				break;
			case 1: 
			System.out.println("Call cost limit");
				waitForGoBack();
			   	break;

			case 2:
			System.out.println("Show cost in");
			waitForGoBack();
			   break;

			default: System.out.println("Invalid input");
				break;
		        }
			}
				break;
			}
			  
			case 8:
  			System.out.println("prepaid credit");
			waitForGoBack();
			  break;
			default: System.out.println("invalid input");
			  break;
			}
			}
			}
public static void waitForGoBack() {
    			System.out.println("Enter 0 to go back to previous menu");
    			while (input.nextInt() != 0) {
       			 System.out.println("Invalid input. Enter 0 to go back.");
   			 }
			 }

public static void Tones() {
				while(true) {
	String message38 = """
    ===============================
           Tones Settings Menu
    ===============================
    1 - Ringing tone
    2 - Ringing volume
    3 - Incoming call alert
    4 - Composer
    5 - Message alert tone
    6 - Keypad tones
    7 - Warning and game tones
    8 - Vibrating alert
    9 - Screen saver
    0 - Enter 0 to go back to previous menu
    ===============================
    """;
			System.out.println(message38);
			System.out.print("enter a number to select: ");
			int number38 = input.nextInt();
			switch(number38) {
			case 0: 
				return;
			case 1: 
			System.out.println("Ringing tone");
			waitForGoBack();
			break;
			case 2:
			System.out.println("Ringing volume");
			waitForGoBack();
			break;
			case 3:
			System.out.println("Incoming call alert");
			waitForGoBack();
			break;
			case 4:
			System.out.println("composer");
			waitForGoBack();
	 		break;
			case 5:
			System.out.println("message alert tone");
			waitForGoBack();
			break;
			case 6:
			System.out.println("Keypad tones");
			waitForGoBack();
			break;
			case 7:
			System.out.println("Warning and game tones");
			waitForGoBack();			
			break;
			case 8:
			System.out.println("Vibrating alert");
			waitForGoBack();			
			break;
			case 9:
	                 System.out.println("Screen saver");
	                    waitForGoBack();
                                 break;
		         default:System.out.println("invalid input");
			   break;
			}
			}
			}
			
public static void Settings(){
			while(true) {		
		
		String message39 = """
    ================================
              Settings Menu
    ================================
    1 - Call settings
    2 - Phone settings
    3 - Security settings
    4 - Restore factory settings
    0 - Enter 0 to go back to previous menu
    ================================
    """;

				System.out.println(message39);
			System.out.print("enter a number to select: ");
			int number39 = input.nextInt();
			switch(number39) {
			case 0: 
				return;
			case 1:  
			boolean backT0SettingsMenu = false;
    			while (!backT0SettingsMenu) {


			
                          
			  String message40 = """
    ================================
            Call Settings
    ================================
    1 - Automatic redial
    2 - Speed dialing
    3 - Call waiting options
    4 - Own number sending
    5 - Phone line in use
    6 - Automatic answer
    0 - Enter 0 to go back to previous menu
    ================================
    """;

			System.out.println(message40);
			System.out.print("enter a number to select: ");
			int number40 = input.nextInt();
			switch(number40) {
			  case 0: 
				backT0SettingsMenu = true; 
				break;
			  case 1: 
				System.out.println("Automatic redial");
				waitForGoBack();
                                 break;
			  case 2:
				System.out.println("Speed dialing");
				waitForGoBack();
                                 break;
			  case 3:
				System.out.println("Call waiting options");
				waitForGoBack();
                                 break;
			  case 4:
				System.out.println("Own number sending");
				waitForGoBack();
                                 break;
			  case 5:
				System.out.println("phone line in use");
				waitForGoBack();
                                 break;
			  case 6:
				System.out.println("Automatic answer");
				waitForGoBack();
                                 break;
				default: System.out.println("invalid input");
				 break;
				}
			  	}
		        case 2: {
			backT0SettingsMenu = false;
    			while (!backT0SettingsMenu) {


			String message01 = """
    ================================
           Phone Settings
    ================================
    1 - Language
    2 - Cell info display
    3 - Welcome note
    4 - Network selection
    5 - Lights
    6 - Confirm SIM service action
    0 - Enter 0 to go back to previous menu
    ================================
    """;

			System.out.println(message01);
			System.out.print("enter a number to select: ");
			int number43 = input.nextInt();
			switch(number43) {
		        case 0: 
				backT0SettingsMenu = true; 
				break;

			case 1: 
			  System.out.println("Language");
				waitForGoBack();
                                 break;

			case 2:
			System.out.println("Cell info display");
			waitForGoBack();
                                 break;

			case 3:
			System.out.println("welcome note");
			waitForGoBack();
                                 break;

			case 4:
			System.out.println("Network selection");
			waitForGoBack();
                                 break;

			case 5:
			System.out.println("Lights");
			waitForGoBack();
                                 break;

			case 6:
			System.out.println("Confirm SIM service action");
			waitForGoBack();
                                 break;
			default:{ System.out.println("invalid input");}
			break;
			}
			}
			}
			case 3:{
	 		backT0SettingsMenu = false;
    			while (!backT0SettingsMenu) {

		        
			String message42 = """
    ================================
          Security Settings
    ================================
    1 - Pin code request
    2 - Call barring service
    3 - Fixed dialing
    4 - Closed user group
    5 - Phone security
    6 - Change access codes
    0 - Enter 0 to go back to previous menu
    ================================
    """;

			System.out.println(message42);
			System.out.print("enter a number to select: ");
			int number41 = input.nextInt();
			switch(number41) {
			case 0: 
				backT0SettingsMenu = true; 
				break;


			case 1: 
   			System.out.println("Pin code request");
			waitForGoBack();
                                 break;	
			case 2: 
   			System.out.println("Call Baring Service");
	          	waitForGoBack();
                                 break;		
			case 3: 
   			System.out.println("Fixed dialing");
			waitForGoBack();
                                 break;
		        case 4: 
   			System.out.println("Closed user group");
			waitForGoBack();
                                 break;	
		        case 5: 
   			System.out.println("Phone security");
			waitForGoBack();
                                 break;
		        case 6: 
   			System.out.println("Change access code");
			waitForGoBack();
                                 break;
			default: System.out.println("Invalid Input");
			  break;
			}
			}
			}
			case 4:
			System.out.println("Restore Factory Settings");
			 waitForGoBack();
                                 break;
			default: System.out.println("invalid input"); 
			break;
			}
			}
			}
			
public static void CallDivert() {
	 		while(true) {

			System.out.println("Call Divert"); 
			waitForGoBack();
			break;
		}
		}
		
public static void Games(){
			while(true) {
		        System.out.println("Games");
		waitForGoBack();
			break;
                }
		}
public static void Calculator(){
			while(true) {
		        System.out.println("Calculator");
		waitForGoBack();
			break;
                }
		}
public static void Reminders(){
			while(true) {
		        System.out.println("Reminders");
			waitForGoBack();
			break;
		}
                }
		
public static void Clock(){
			while(true) {		       
			String message44 = """
    ================================
             CLOCK MENU
    ================================
    1 - Alarm clock
    2 - Clock settings
    3 - Date setting
    4 - Stopwatch
    5 - Countdown timer
    6 - Auto update of date and time
    0 - Enter 0 to go back or previous menu
    ================================
    """;

			System.out.println(message44);
			System.out.print("enter a number to select: ");
			int number44 = input.nextInt();
			switch(number44) {
			case 0:
				return;
			case 1:
                         System.out.println("Alarm clock");
				waitForGoBack();
			       break;

			case 2:
                         System.out.println("Clock settings");
			waitForGoBack();
			break;
			case 3:
                         System.out.println("Date setting");
	         	waitForGoBack();
			break;

		
			case 4:
                         System.out.println("Stopwatch");
		       waitForGoBack();
			break;

			case 5: 
                         System.out.println("Countdown timer");
	                  waitForGoBack();
			 break;

			case 6:
                         System.out.println("Auto update of date and time");
	                 waitForGoBack();
			break;

			default: System.out.println("invalid input");
			break;}
			}
			}
			
public static void Profiles() {
			while(true) {
			System.out.println("Profiles");
			waitForGoBack();
			break;
}
}

public static void SimService(){
			while(true) {

			System.out.println("Sim services");
			waitForGoBack();
			break;

			
}
}
}


































































































































































































			
			
			



			


		
		
			
				
				