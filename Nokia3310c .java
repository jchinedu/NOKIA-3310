import java.util.Scanner;

public class Nokia3310c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exitMainMenu = false;

        do {
            String message = """
                    ===========================
                    NOKIA 3310 - MAIN MENU
                    ===========================
                    1 - Phone book
                    2 - Messages
                    3 - Chat
                    4 - Call register
                    5 - Tones
                    6 - Settings
                    7 - Call divert
                    8 - Games
                    9 - Calculator
                    10 - Reminders
                    11 - Clock
                    12 - Profiles
                    13 - Sim Service
                    0 - Exit
                    ===========================
                    """;
            System.out.println(message);
            System.out.print("Enter a number to select: ");
            int number = input.nextInt();

            switch (number) {
                case 0 -> exitMainMenu = true;

                case 1 -> {
                    boolean exitPhoneBook = false;
                    do {
                        String phoneBookMenu = """
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
                                0  - Back to Main Menu
                                ===============================
                                """;
                        System.out.println(phoneBookMenu);
                        System.out.print("Enter a number to select: ");
                        int number2 = input.nextInt();

                        switch (number2) {
                            case 0 -> exitPhoneBook = true;
                            case 1 -> System.out.println("Search");
                            case 2 -> System.out.println("Service Nos.");
                            case 3 -> System.out.println("Add name");
                            case 4 -> System.out.println("Erase");
                            case 5 -> System.out.println("Edit");
                            case 6 -> System.out.println("Assign tone");
                            case 7 -> System.out.println("Send b'card");
                            case 8 -> {
                                boolean exitOptionMenu = false;
                                do {
                                    String optionMenu = """
                                            ==============================
                                            Options Menu
                                            ==============================
                                            1 - Type of view
                                            2 - Memory status
                                            0 - Back to PhoneBook
                                            ==============================
                                            """;
                                    System.out.println(optionMenu);
                                    System.out.print("Enter a number to select: ");
                                    int opt = input.nextInt();
                                    switch (opt) {
                                        case 0 -> exitOptionMenu = true;
                                        case 1 -> System.out.println("Type of view");
                                        case 2 -> System.out.println("Memory status");
                                        default -> System.out.println("Invalid option");
                                    }
                                } while (!exitOptionMenu);
                            }
                            case 9 -> System.out.println("Speed dials");
                            case 10 -> System.out.println("Voice tags");
                            default -> System.out.println("Invalid option");
                        }
                    } while (!exitPhoneBook);
                }

                case 2 -> {
                    boolean exitMessages = false;
                    do {
                        String messageMenu = """
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
                                0  - Back to Main Menu
                                ===============================
                                """;
                        System.out.println(messageMenu);
                        System.out.print("Enter a number to select: ");
                        int msg = input.nextInt();
                        switch (msg) {
                            case 0 -> exitMessages = true;
                            case 1 -> System.out.println("Write messages");
                            case 2 -> System.out.println("Inbox");
                            case 3 -> System.out.println("Outbox");
                            case 4 -> System.out.println("Picture messages");
                            case 5 -> System.out.println("Templates");
                            case 6 -> System.out.println("Smileys");
                            case 7 -> System.out.println("Message settings");
                            case 8 -> System.out.println("Info service");
                            case 9 -> System.out.println("Voice mailbox number");
                            case 10 -> System.out.println("Service command editor");
                            default -> System.out.println("Invalid input");
                        }
                    } while (!exitMessages);
                }

                default -> System.out.println("Invalid option. Please try again.");
            }
        } while (!exitMainMenu);

        System.out.println("Exiting Nokia 3310 Menu. Goodbye!");
           }
}
