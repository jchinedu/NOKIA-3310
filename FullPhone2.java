import java.util.Scanner;

public class FullPhone2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    hello,
                    welcome to Tega's phone,
                    kindly enter:
              ........ MAIN MENU.......
                    1  -> Phone Book
                    2  -> Messages
                    3  -> Chat
                    4  -> Call Register
                    5  -> Tones
                    6  -> Settings
                    7  -> Call divert
                    8  -> Games
                    9  -> Calculator
                    10 -> Reminder
                    11 -> Clock
                    12 -> Profiles
                    13 -> Sim services
                    0  -> Exit
                    """);
            int userInput = input.nextInt();

            switch (userInput) {
                case 1 -> PhoneBook();
                case 2 -> messages();
                case 3 -> chat();
                case 4 -> callRegister();
                case 5 -> Tones();
                case 6 -> Settings();
                case 7 -> CallDivert();
                case 8 -> Games();
                case 9 -> Calculator();
                case 10 -> Reminder();
                case 11 -> clock();
                case 12 -> Profiles();
                case 13 -> SimService();
                case 0 -> {
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("invalid input");
            }
        }
    } // void main end

    //............................................................................

    public static void PhoneBook() {
        System.out.println("""
                1  - Search
                2  - Service Nos
                3  - Add Name
                4  - Erase
                5  - Edit
                6  - Assign Tone
                7  - Send b'card
                8  - Options
                9  - Speed dial
                10 - voice tags
                11 - enter 0 to go back to previous menu
                """);
        int phoneBookInput = input.nextInt();

        switch (phoneBookInput) {
            case 0 -> {
                return;
            }
            case 1 -> {
                System.out.println("Search");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 2 -> {
                System.out.println("Service Nos");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 3 -> {
                System.out.println("Add Name");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 4 -> {
                System.out.println("Erase");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 5 -> {
                System.out.println("Edit");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 6 -> {
                System.out.println("Assign Tone");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                                        PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 7 -> {
                System.out.println("Send b'card");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 8 -> {
                System.out.println("""
                        1  -> Type of view
                        2  -> Memory status
                        3  -> enter 0 to go back to previous menu
                        4  -> enter 99 to go back to main menu
                        """);

                int card = input.nextInt();
                switch (card) {
                    case 99 -> main(null);
                    case 0 -> PhoneBook();
                    case 1 -> {
                        System.out.println("Type of view");
                        System.out.println("enter 0 to go back to previous menu");
                        int enterNumber = input.nextInt();
                        if (enterNumber == 0) {
                            PhoneBook();
                        } else {
                            System.out.println("invalid number");
                        }
                        break;
                    }
                    case 2 -> {
                        System.out.println("Memory status");
                        System.out.println("enter 0 to go back to previous menu");
                        int enterNumber = input.nextInt();
                        if (enterNumber == 0) {
                            PhoneBook();
                        } else {
                            System.out.println("invalid number");
                        }
                        break;
                    }
                    default -> System.out.println("invalid input");
                }
                break;
            }
            case 9 -> {
                System.out.println("Speed dial");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 10 -> {
                System.out.println("Voice tags");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    PhoneBook();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            default -> System.out.println("invalid input");
        }
    }

    //............................................................................

    public static void messages() {
        System.out.println("""
                1  - Write Messages
                2  - Inbox
                3  - Outbox
                4  - Picture messages
                5  - Templates
                6  - Smileys
                7  - Messages setting
                8  - Info service
                9  - Voice mailbox number
                10 - Services command editor
                11 - enter 0 to go back to previous menu
                """);
        int userMessages = input.nextInt();

        switch (userMessages) {
            case 0 -> main(null);
            case 1 -> {
                System.out.println("Write Messages");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    messages();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 2 -> {
                System.out.println("Inbox");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    messages();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 3 -> {
                System.out.println("Outbox");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    messages();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 4 -> {
                System.out.println("Picture messages");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    messages();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 5 -> {
                System.out.println("Templates");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    messages();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 6 -> {


                System.out.println("Smileys");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    messages();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 7 -> {
                System.out.println("""
                        1 . Set 1
                        2 . Common
                        3 - enter 0 to go back to previous menu
                        4  -> enter 99 to go back to main menu
                        """);
                int messageSetting = input.nextInt();
                switch (messageSetting) {
                    case 0 -> messages();
                    case 99 -> main(null);
                    case 1 -> {
                        System.out.println("""
                                1  - Message center number
                                2  - Message sent as
                                3  - Message validity
                                4 - enter 0 to go back to previous menu
                                5  -> enter 99 to go back to main menu
                                """);
                        int set = input.nextInt();
                        switch (set) {
                            case 0 -> messages();
                            case 99 -> main(null);
                            case 1 -> {
                                System.out.println("Message center number");
                                System.out.println("enter 0 to go back to main menu");
                                int enterNumber = input.nextInt();
                                if (enterNumber == 0) {
                                    return;
                                } else {
                                    System.out.println("invalid number");
                                }
                                break;
                            }
                            case 2 -> {
                                System.out.println("Message sent as");
                                System.out.println("enter 0 to go back to main menu");
                                int enterNumber = input.nextInt();
                                if (enterNumber == 0) {
                                    return;
                                    } else {
                                    System.out.println("invalid number");
                                }
                                break;
                            }
                            case 3 -> {
                                System.out.println("Message validity");
                                System.out.println("enter 0 to go back to main menu");
                                int enterNumber = input.nextInt();
                                if (enterNumber == 0) {
                                    return;
                            } else {
                                    System.out.println("invalid number");
                            }
                                break;
                            }
                            default -> System.out.println("invalid input");
                    }
                        break;
                    }
                    case 2 -> {
                        System.out.println("""
                                1  - Delivery report
                                2  - Reply via same center
                                3  - Character support
                                4 - enter 0 to go back to previous menu
                                5  -> enter 99 to go back to main menu
                                """);
                        int common = input.nextInt();
                        switch (common) {
                            case 99 -> main(null);
                            case 0 -> messages();
                            case 1 -> {
                                System.out.println("Delivery report");
                                System.out.println("enter 0 to go back to main menu");
                                int enterNumber = input.nextInt();
                                if (enterNumber == 0) {
                                    return;
                                } else {
                                    System.out.println("invalid number");
                                }
                                break;
                            }
                            case 2 -> {
                                System.out.println("Reply via same center");
                                System.out.println("enter 0 to go back to main menu");
                                int enterNumber = input.nextInt();
                                if (enterNumber == 0) {
                                    return;
                                } else {
                                    System.out.println("invalid number");
                                }
                                break;
                            }
                            case 3 -> {
                                System.out.println("Character support");
                                System.out.println("enter 0 to go back to main menu");
                                int enterNumber = input.nextInt();
                                if (enterNumber == 0) {
                                    return;
                                } else {
                                    System.out.println("invalid number");
                                }
                                break;
                            }
                            default -> System.out.println("invalid input");
                        }
                        break;
                    }
                    default -> System.out.println("invalid input");
            }
                break;
            }
            case 8 -> {
                System.out.println("Info service");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    messages();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 9 -> {
                System.out.println("Voice mailbox number");
                System.out.println("enter 0 to go back to previous menu");
                int enterNumber = input.nextInt();
                if (enterNumber == 0) {
                    messages();
                } else {
                    System.out.println("invalid number");
                }
                break;
            }
            case 10 -> {
                System.out.println("Service command editor");
                System.out.println("enter 0 to go back to previous menu");
                 int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    messages();
                                    }else{
                                            System.out.println("invalid number");
                                    }
                                    break;}

                            //default : System.out.println("invalid input");

                    }
   }

//............................................................................

public static void chat(){


          System.out.println("Chat");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
          }


}



//............................................................................


public static void callRegister(){
           System.out.println("""
    1  - Missed calls
    2  - Recieve calls
    3  - dialled Numbers
    4  - Erase recent call list
    5  - show call duration
    6  - show call cost
    7  - call cost setting
    8  - prepaid credit
    9 - enter 0 to go back to previous menu


    """);
           int phoneBookInput = input.nextInt();

        switch(phoneBookInput){

        case 0 : { main(null);}
        case 1 : {
                                    System.out.println("Missed calls");
                                    System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    messages();
                                    }else{
                                            System.out.println("invalid number");
                                    }
                    break;}
        case 2 : {
                                    System.out.println("Recieve calls");
                                    System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    messages();
                                    }else{
                                            System.out.println("invalid number");
                                    }
                break;}
        case 3 : {
                                    System.out.println("dialled Numbers");
                                    System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    messages();
                                    }else{
                                            System.out.println("invalid number");
                                    }
                break;}
        case 4 : {
                                    System.out.println("Erase recent call list");
                                    System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    messages();
                                    }else{
                                            System.out.println("invalid number");
                                    }
                    break;}

        case 5 :{
                                System.out.println("""
                    1  - Last call duration
                    2  - All call`s durunation
                    3  - Recieved call`s durunation
                    4  - Dialled calls~s durunation
                    5  - Clear counters
                    6 - enter 0 to go back to previous menu
                    7  -> enter 99 to go back to main menu

                    """);
                        int callDurunation = input.nextInt();

                                    switch(callDurunation){
                                        case 99 : {main(null);} break;
                                        case 0 : { callRegister();}
                                        case 1 : {
                                                                        System.out.println("Last call duration");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                                                                        break;}
                                        //break;}
                                        case 2 : {
                                                                        System.out.println("All call`s durunation");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                                                                        break;}


                                        case 3 : {
                                                                        System.out.println("Recieved call`s durunation");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                                                                        break;}
                                       // break;}
                                        case 4 : {
                                                                        System.out.println("Dialled calls~s durunation");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                                                                        break;}

                                                                        //break;}
                                        case 5 : {
                                                                        System.out.println("Clear counters");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                                                                        break;}
                                                                       // break;}
                                        default : System.out.println("invalid input");

                break;


    }
}
        case 6 : {
                   System.out.println("""
    1  - show last call
    2  - All call cost
    3  - clear counters
    4 -  enter 0 to go back to previous menu
    5  - enter 99 to go back to main menu


    """);
                        int showAllCallCost = input.nextInt();

                            switch(showAllCallCost){
                                case 99 : {main(null);} break;
                                case 0 : { callRegister();}
                                case 1 : {
                                                                        System.out.println("show last call");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                                                                        break;}

                                case 2 : {
                                                                        System.out.println("All call cost");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                                break;}
                                case 3 : {

                                                                        System.out.println("clear counters");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }

                                            break;}
                                default : System.out.println("invalid input");

                        break; }
                        }


                        case 7 : {
                                System.out.println("""
                    1  - call cost limits
                    2  - Show cost in
                    3 -  enter 0 to go back to previous menu
                    4  - enter 99 to go back to main menu



                    """);
        int callCostSetting = input.nextInt();

            switch(callCostSetting){
                case 99 : {main(null);} break;
                case 0 : { callRegister();}
                case 1 : {
                                                                        System.out.println("call cost limits");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }

                    break;}
                case 2 : {
                                                                        System.out.println("Show cost in");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }

                    break;}
                default : System.out.println("invalid input");

            }

                break;}
        case 8 : {
                                    System.out.println("prepaid credit");
                                    System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    messages();
                                    }else{
                                            System.out.println("invalid number");
                                    }
                break;}
        default : System.out.println("invalid input");
        break;}


                }

//............................................................................

   public static void Tones(){
           System.out.println("""
    1  - Ringing tone
    2  - Ringing volume
    3  - incoming call alert
    4  - Composer
    5  - Messages alert tone
    6  - Keypad tones
    7  - Warning and games tones
    8  - Vibrating alert
    9  - screen saver
    10 - enter 0 to go back to previous menu


    """);
           int userTones = input.nextInt();

        switch(userTones){
        case 0 : { main(null);}
        case 1 : {
                                    System.out.println("Ringing tone");
                                    System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }
            break;}
        case 2 : {
                                    System.out.println("Ringing volume");
                                     System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }

                break;}
        case 3 : {
                                    System.out.println("incoming call alert");
                                    System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }

        break;}
        case 4 : {
                                    System.out.println("Composer");
                                    System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }


                break;}
        case 5 : {
                            System.out.println("Messages alert tone");
                 System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }
                break;}
        case 6 : {
                                    System.out.println("Keypad tones");
                                    System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }

                break;}
        case 7 : {
                                    System.out.println("Warning and games tones");
                                     System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }

            break;}
        case 8 : {

                                    System.out.println("Vibrating alert");
                                     System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }

        break;}
        case 9 : {
                                         System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }System.out.println("screen saver");

        break;}
        default : System.out.println("invalid input");
        break;}


                }
//............................................................................


  public static void Settings(){
           System.out.println("""
    1  - call setting
    2  - Phone setting
    3  - security setting
    4  - Restore factory setting
    5 - enter 0 to go back to previous menu

    """);
           int userTones = input.nextInt();

        switch(userTones){
        case 0 : { main(null);}
        case 1 : {
              System.out.println("""
                    1  - Automatic redial
                    2  - Speed dialing
                    3  - call waiting response
                    4  - own number sending
                    5  - Phone line in use
                    6  - automatic answer
                    7 - enter 0 to go back to previous menu
                    8  - enter 99 to go back to main menu

                """);
                        int callSetting = input.nextInt();
                        switch(callSetting){
                            case 99 : {main(null);} break;
                            case 0 : { Settings();}
                            case 1 : {
                                                                        System.out.println("Automatic redial");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }

                                break;}
                            case 2 : {
                                                                System.out.println("Speed dialing");
                                                                System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }

                            break;}
                            case 3 : {                                  System.out.println("call waiting response");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }

                            break;}
                            case 4 : {

                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }System.out.println("own number sending");

                            break;}
                            case 5 : {
                                                                        System.out.println("Phone line in use");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }

                            break;}
                            case 6 : {
                                                                        System.out.println("automatic answer");
                                                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }

                            break;}
                            default : System.out.println("invalid input");
                         break; }


        }
        case 2 :{
              System.out.println("""
                    1  - language
                    2  - cell info display
                    3  - Welcome note
                    4  - network section
                    5  - lights
                    6  - Confirm SIM service action
                    7 - enter 0 to go back to previous menu
                    8  - enter 99 to go back to main menu
                """);
                        int phoneSetting = input.nextInt();
                        switch(phoneSetting){
                            case 99 : {main(null);}

                            break;
                            case 0 : { Settings();}
                            case 1 : {
                                            System.out.println("language");
                                            System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }

                            break;}
                            case 2 : {
                                            System.out.println("cell info display");
                                            System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }

                            break;}
                            case 3 : {
                                            System.out.println("Welcome note");
                                            System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }

                            break;}
                            case 4 :{
                                            System.out.println("network section");
                                            System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }

                            break;}
                            case 5 : {
                            System.out.println("lights");

                            break;}
                            case 6 : {
                                            System.out.println("Confirm SIM service action");

                            System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                            break;}
                            default : {
                            System.out.println("invalid input");}
                         break; }

        }


        case 3 : {
              System.out.println("""
                    1  - PIN code request
                    2  - call barring service
                    3  - Fixed  dialing
                    4  - Close user group
                    5  - Phone security
                    6  - Change access codes
                    7 - enter 0 to go back to previous menu
                    8  - enter 99 to go back to main menu
                """);
                        int securitySetting = input.nextInt();
                        switch(securitySetting){
                            case 99 : {main(null);} break;
                            case 0 : { Settings();} break;
                            case 1 : {

                            System.out.println("PIN code request");

                            break;}
                            case 2 : {

                            System.out.println("all barring service");
                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                            break;}
                            case 3 : {

                            System.out.println("Fixed  dialing");
                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                            break;}
                            case 4 :{

                            System.out.println("Close user group");
                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                            break;}
                            case 5 : {

                            System.out.println("Phone security");
                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                            break;}
                            case 6 : {

                            System.out.println("Change access codes ");
                                        System.out.println("enter 0 to go back to main menu");
                                                                        int enterNumber = input.nextInt();
                                                                        if(enterNumber == 0){
                                                                        return;
                                                                        }else{
                                                                            System.out.println("invalid number");
                                                                        }
                            break;}
                            default : System.out.println("invalid input");
                         break; }

        }
        case 4 : System.out.println("Restore factory setting"); break;
               default : System.out.println ("invalid input");
        break;}


                }
//............................................................................

public static void CallDivert(){


          System.out.println("Call Divert");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
          }

}



//............................................................................

public static void Games(){


          System.out.println("Games");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
          }

}



//............................................................................


public static void Calculator(){


          System.out.println("Calculator");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
          }

}



//............................................................................


public static void Reminder(){


          System.out.println("Reminder");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
          }

}



//............................................................................


 public static void clock(){
           System.out.println("""
    1  - Alarm clock
    2  - clock setting
    3  - Date setting
    4  - stopwatch
    5  - Countdown timer
    6  - auto update of date and time
    7  - enter 0 to go back to previous menu



    """);
           int userTones = input.nextInt();

        switch(userTones){
        case 0 : { clock();} break;
        case 1 : {
                                    System.out.println("Alarm clock");
                                    System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }

            break;}
        case 2 : {
                            System.out.println("clock setting");
                             System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }
        break;}
        case 3 : {
                            System.out.println("Date setting");
                             System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }

        break;}
        case 4 : {
                                System.out.println("stopwatch");
                                 System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }
        break;}
        case 5 : {
                    System.out.println("Countdown timer");
                     System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }
        break;}
        case 6 : {
                                System.out.println("auto update of date and time");
                                    System.out.println("enter 0 to go back to previous menu");
                                    int enterNumber = input.nextInt();
                                    if(enterNumber == 0){
                                    Tones();
                                    }else{
                                            System.out.println("invalid number");
                                    }
        break;}
        default : System.out.println("invalid input");
        break;}


                }
//............................................................................


public static void Profiles(){


          System.out.println("Profiles");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
          }

}



//............................................................................
public static void SimService(){


          System.out.println("SimService");
          System.out.println("enter 0 to go back previous menu");
          int goBack = input.nextInt();
          if(goBack == 0){
            main(null);
          }else{
             System.out.println("invalid input");
          }

}



//............................................................................









} //ends the class