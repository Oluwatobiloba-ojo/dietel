package chibuzorexcercise;
import java.util.Scanner;

public class Nokiasample {
    static Scanner input = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("""
                ===========================
                   WELCOME TO NOKIA 3310
                ============================
                """);
        System.out.println("""
                1 -> phoneBook
                2 -> Message
                3 -> chat
                4 -> Call register
                5 -> Tones
                6 -> Setting
                7 -> Call Divert
                8 -> Games
                9 -> Calculator
                10 -> Remainder
                11 -> Clock
                12 -> Profiles
                13 -> Sim services
                """);
        System.out.println("Enter a request: ");
        String request = input.nextLine();
        switch (request) {
            case "1" -> phoneBook();
            case "2" -> message();
            case "3" -> chat();
            case "4" -> callRegister();
            case "5" -> Ringtone();
            case "6" -> Setting();
            case "7" -> callDivert();
            case "8" -> Games();
            case "9" -> Calculator();
            case "10" -> Remainder();
            case "11" -> Clock();
            case "12" -> Profiles();
            default -> display("invalid input ");
        }
    }

    public static void Profiles() {
        display("""
                    PROFILES
                Press 2 -> mainMenu
          
                """);
       String value = input.nextLine();
        if (value.equals("2")) {
            mainMenu();
        }else {
            display("invalid input");
        }
    }


    public static void Clock() {
        display("""
                ===============
                    CLOCK
                ================
                1 -> ALARM CLOCK
                2 -> CLOCK SETTING
                3 -> DATE SETTING
                4 -> STOPWATCH
                5 -> COUNT DOWN TIMER
                6 -> AUTO UPDATE OF DATE AND TIME
                """);
        System.out.println("Enter your request: ");
        String clock = input.nextLine();
        switch (clock) {
            case "1" -> {
                display("""
                            ALARM CLOCK
                        2 -> mainMenu
                        3 -> clock
                        """);
                String comeBack = input.nextLine();
                switch (comeBack) {
                    case "2" -> mainMenu();
                    case "3" -> Clock();
                    default -> display("Invalid input");
                }
            }
            case "2" -> {
                display("""
                            CLOCK SETTING
                        Press 2 -> mainMenu
                        Press 3 -> clock
                        """);
                String value = input.nextLine();
                switch (value) {
                    case "2" -> mainMenu();
                    case "3" -> Clock();
                    default -> display("Invalid input");
                }
            }
            case "3" -> {
                display("""
                            DATE SETTING
                        Press 2 -> mainMenu
                        Press 3 -> Clock
                        """);
                String date = input.nextLine();
                switch (date) {
                    case "2" -> mainMenu();
                    case "3" -> Clock();
                    default -> display("Invalid input");
                }
            }
            case "4" -> {
                display("""
                            STOP WATCH
                        Press 2 -> mainMenu
                        Press 3 -> Clock
                        """);
                String watch = input.nextLine();
                switch (watch) {
                    case "2" -> mainMenu();
                    case "3" -> Clock();
                    default -> display("Invalid input");
                    }
            }
            case "5" -> {
                display("""
                            COUNT DOWN TIMER
                        Press 2 -> mainMenu
                        Press 3 -> Clock
                        """);
                String timer = input.nextLine();
                switch (timer) {
                    case "2" -> mainMenu();
                    case "3" -> Clock();
                    default -> display("Invalid input");
                }
            }
            case "6" -> {
                display("""
                            AUTO UPDATE OF DATE AND TIME
                        Press 2 -> mainMenu
                        Press 3 -> Clock
                        """);
                String update = input.nextLine();
                switch (update) {
                    case "2" -> mainMenu();
                    case "3" -> Clock();
                    default -> display("Invalid input");
                }
            }
        }
    }

    public static void Remainder() {
        display("""
                    REMAINDER
                Press 2 -> mainMenu
                Press 3 -> Clock
                """);
        String response = input.nextLine();
        if (response.equals("2")) {
            mainMenu();
        }else {
            display("Invalid input");
            Remainder();
        }
    }

    public static void Calculator() {
        display("""
                    CALCULATOR (A + B)
                Press 2 -> mainMenu
                
                """);
       String response = input.nextLine();
       if (response.equals("2")){
           mainMenu();
       }else {
           display("Invalid input ");
           Calculator();
       }
    }

    public static void Games() {
        display("""
                        GAMES
                      Press 2 -> mainMenu
                      """);
         String value = input.nextLine();
        if (value.equals("2")){
            mainMenu();
        }else {
            display("Invalid input");
            Games();
        }
    }

    public static void callDivert() {
        display("""
                    CALL DIVERT
                Press 2 -> mainMenu
                """);
      String response = input.nextLine();
        if (response.equals("2")){
            mainMenu();
        }else{
            display("Invalid input");
            callDivert();
        }
    }

    public static void Setting() {
        display("""
                =================
                    SETTING
                =================
                1 -> Call Setting
                2 -> Phone Setting
                3 -> Security Setting
                4 -> Restore factory Setting
                5 -> mainMenu
                """);
        System.out.println("Enter your request:");
        String setting = input.nextLine();
        switch (setting) {
            case "1":
                display("""
                        ================
                           CALL SETTING
                        ================
                        1 -> Automatic redial
                        2 -> Speed dialling
                        3 -> Call waiting options
                        4 -> Own number sending
                        5 -> Phone in line use
                        6 -> Automatic answer
                        7 -> Go Back to setting
                        8 -> Go back to mainMenu
                        """);
                System.out.println("Enter your request: ");
                String callSetting = input.nextLine();
                switch (callSetting) {
                    case "1" -> {
                        display("""
                                    AUTOMATIC REDIAL
                                Press 2 -> mainMenu
                                """);
                        String response = input.nextLine();
                        if (response.equals("2")) {
                            mainMenu();
                        }else {
                            Setting();
                        }
                    }
                    case "2" -> {
                        display("""
                                    SPEED DIALLING
                                Press 2 -> mainMenu
                                """);
                        String speed = input.nextLine();
                        if (speed.equals("2")) {
                            mainMenu();
                        }else Setting();
                    }
                    case "3" -> {
                        display("""
                                    CALL WAITING OPTIONS
                                Press 2 -> mainMenu
                                """);
                        String call = input.nextLine();
                        if (call.equals("2")) {
                            mainMenu();
                        }else Setting();
                    }
                    case "4" -> {
                        display("""
                                    OWN NUMBER SENDING
                                Press 2 -> mainMenu
                                """);
                        String number = input.nextLine();
                        if (number.equals("2")) {
                            mainMenu();
                        }else display("Invalid input");
                    }
                    case "5" -> {
                        display("""
                                    PHONE LINE IN USE
                                Press 2 -> mainMenu
                                """);
                        String phone = input.nextLine();
                        if (phone.equals("2")) {
                            mainMenu();
                        }else display("Invalid input");
                    }
                    case "6" -> {
                        display("""
                                    AUTOMATIC ANSWER
                                Press 2 -> mainMenu
                                """);
                        String answer = input.nextLine();
                        if (answer.equals("2")) {
                            mainMenu();
                        }Setting();
                    }
                    case "7" -> Setting();
                    case "8" -> mainMenu();
                    default -> display("Invalid input");
                }
            case "2":
                display("""
                        ==================
                           PHONE SETTING
                        ==================
                        1 -> Language
                        2 -> Cell info display
                        3 -> Welcome notice
                        4 -> Network Selection
                        5 -> Light
                        6 -> Confirms SIM Service Action
                        7 -> Go Back to Setting
                        8 -> Go Back to mainMenu
                        """);
                System.out.println("Enter a request: ");
                String phoneS = input.nextLine();
                switch (phoneS) {
                    case "1" -> {
                        display("""
                                    LANGUAGE
                                Press 2 -> mainMenu
                                """);
                        String language = input.nextLine();
                        if (language.equals("2")) {
                            mainMenu();
                        }else display("Invalid input");
                    }
                    case "2" -> {
                        display("""
                                  CELL INFO DISPLAY
                                Press 2 -> mainMenu
                                """);
                        String info = input.nextLine();
                        if (info.equals("2")) {
                            mainMenu();
                        }else display("Invalid input");
                    }
                    case "3" -> {
                        display("""
                                    WELCOME NOTICE
                                Press 2 -> mainMenu
                                """);
                        String notice = input.nextLine();
                        if (notice.equals("2")) {
                            mainMenu();
                        }else display("Invalid input");
                    }
                    case "4" -> {
                        display("""
                                    NETWORK SELECTION
                                Press 2 -> mainMenu
                                """);
                        String network = input.nextLine();
                        if (network.equals("2")) {
                            mainMenu();
                        }else display("Invalid input");
                    }
                    case "5" -> {
                        display("""
                                    LIGHT
                                Press 2 -> mainMenu
                                """);
                        String light = input.nextLine();
                        if (light.equals("2")) {
                            mainMenu();
                        }else display("Invalid input");
                    }
                    case "6" -> {
                        display("""
                                    CONFIRMS SIM SERVICE ACTION
                                Press 2 -> mainMenu
                                """);
                        String sim = input.nextLine();
                        if (sim.equals("2")) {
                            mainMenu();
                        } else display("Invalid input");
                    }
                    case "7" -> Setting();
                    case "8" -> mainMenu();
                    default -> display("Invalid input");
                }
            case "3": display("""
                    ====================
                     SECURITY SETTING
                    ====================
                    1 -> PIN CODE REQUEST
                    2 -> CALL BARRING SERVICE
                    3 -> FIXED DIALLING
                    4 -> CLOSED USER GROUP
                    5 -> PHONE SECURITY
                    6 -> CHANGE ACCESS CODE
                    7 -> Go to Setting
                    8 -> Go to mainMenu
                    """);
                System.out.println("Enter a request: ");
                String security = input.nextLine();
                switch (security) {
                    case "1" -> {
                        display("""
                                    PIN CODE REQUEST
                                Press 2 -> mainMenu
                                """);
                        String code = input.nextLine();
                        if (code.equals("2")) {
                            mainMenu();
                        }else display("Invalid input");
                    }
                    case "2" -> {
                        display("""
                                    CALL BARRING SERVICE
                                Press 2 -> mainMenu
                                """);
                        String call = input.nextLine();
                        if (call.equals("2")) {
                            mainMenu();
                        }else display("Invalid input");
                    }
                    case "3" -> {
                        display("""
                                    FIXED DIALLING
                                Press 2 -> mainMenu
                                """);
                        String fixed = input.nextLine();
                        if (fixed.equals("2")) {
                            mainMenu();
                        }else display("Invalid input");
                    }
                    case "4" -> {
                        display("""
                                    CLOSED USER GROUP
                                Press 2 -> mainMenu
                                """);
                        String user = input.nextLine();
                        if (user.equals("2")) {
                            mainMenu();
                        }else display("Invalid input");
                    }
                    case "5" -> {
                        display("""
                                    PHONE SECURITY
                                Press 2 -> mainMenu
                                """);
                        String phone = input.nextLine();
                        if (phone.equals("2")) {
                            mainMenu();
                        } else display("Invalid input");
                    }
                    case "6" -> {
                        display("""
                                    CHANGE ACCESS CODE
                                Pres 2 -> mainMenu
                                """);
                        String change = input.nextLine();
                        if (change.equals("2")) {
                            mainMenu();
                        }else
                            display("Invalid input");
                    }
                }
            case "4": display("""
                    1 -> RESTORE FACTORY SETTING
                    Press 2 -> mainMenu
                    """);
           String factory = input.nextLine();
                if (factory.equals("2")){
                    mainMenu();
                }else display("Invalid input");
                break;
                case "5": mainMenu();
            default:{
                display("Invalid input");
            }
        }
    }

    public static void Ringtone() {
        display("""
                =================
                    RINGTONE
                =================
                1 -> RINGING TONE
                2 -> RINGING VOLUME
                3 -> INCOMING CALL ALERT
                4 -> COMPOSER
                5 -> MESSAGE ALERT ZONE
                6 -> KEYPAD TONE
                7 -> WARNING AND GAME TONE
                8 -> VIBRATING ALERT
                9 -> SCREEN SAVER
                10 -> mainMenu
                """);
        System.out.println("Enter your request: ");
        int ring = input.nextInt();
        switch (ring) {
            case 1 -> ringing();
            case 2 -> volumeRinging();
            case 3 -> callAlert();
            case 4 -> composer();
            case 5 -> messageAlert();
            case 6 -> keypadTone();
            case 7 -> gameTone();
            case 8 -> vibratingAlert();
            case 9 -> screenSaver();
            case 10 -> mainMenu();
            default -> {
                display("Invalid input");
            }
        }
    }

    public static void screenSaver() {
        display("""
                    SCREEN SAVER
                Press 2 -> mainMenu
                """);
        String saver = input.nextLine();
        if (saver.equals("2")){
            mainMenu();
        }else {
            display("Invalid input");
            screenSaver();
        }
    }

    public static void vibratingAlert() {
        display("""
                    VIBRATING ALERT
                Press 2 -> mainMenu
                """);
        int alert = input.nextInt();
        if (alert == 2) {
            mainMenu();
        } else {
            display("Invalid input");
            vibratingAlert();
        }
    }

    public static void gameTone() {
        display("""
                    GAME TONE
                Press 2 -> mainMenu
                """);
        int game = input.nextInt();
        if (game == 2){
            mainMenu();
        }else {
            display("Invalid input");
            gameTone();
        }
    }

    public static void keypadTone() {
        display("""
                    KEYPAD TONE
                Press 2 -> mainMenu
                """);
        int tone = input.nextInt();
        if (tone == 2){
            mainMenu();
        }else {
            display("Invalid input");
            keypadTone();
        }
    }

    public static void messageAlert() {
        display("""
                    MESSAGE ALERT
                Press 2 -> mainMenu
                """);
        int alert = input.nextInt();
        if (alert == 2){
            mainMenu();
        }else {
            display("Invalid input");
            messageAlert();
        }
    }

    public static void composer() {
        display("""
                    COMPOSER
                Press 2 -> mainMenu
                """);
        int compose = input.nextInt();
        if (compose == 2){
            mainMenu();
        }else {
            display("Invalid input");
        }
    }

    public static void callAlert() {
        display("""
                    CALL ALERT
                Press 2 -> mainMenu
                """);
        int alert = input.nextInt();
        if (alert == 2){
            mainMenu();
        }else  {
            display("Invalid input");
            callAlert();
        }
    }

    public static void volumeRinging() {
        display("""
                    RINGING VOLUME
                Press 2 -> mainMenu
                """);
        int volume = input.nextInt();
        if (volume == 2){
            mainMenu();
        }while (volume != 2){
            display("Invalid input");
            display("Enter the response");
            volume = input.nextInt();
        }
    }

    public static void ringing() {
        display("""
                    RINGING TONE
                Press 2 -> mainMenu
                """);
       int tone = input.nextInt();
        if (tone == 2){
            mainMenu();
        }else {
            display("Invalid input");
            ringing();
        }
    }

    public static void callRegister() {
        display("""
                ====================
                    CALL REGISTER
                ====================
                1 -> Missed calls
                2 -> Received calls
                3 -> Dialled numbers
                4 -> Erase recent call list
                5 -> Show all call duration
                6 -> Show call cost
                7 -> Call cost setting
                8 -> prepaid credit
                9 -> mainMenu
                """);
        System.out.println("Enter your request");
        String call = input.nextLine();
        switch (call) {
            case "1":
                display("""
                         Missed calls
                        press 2 -> mainMenu
                        """);
               String calls = input.nextLine();
                if (calls.equals("2")){
                    mainMenu();
                }else {
                display("Invalid input");
            }
                break;
            case "2" :
                display("""
                          RECEIVED CALLS
                        Press 2 -> mainMenu
                        """);
               int received = input.nextInt();
                if (received == 2){
                    mainMenu();
                }else {
                display("Invalid input");
            }
                break;
            case "3":
                display("""
                          DIALLED NUMBERS
                        Press 2 -> mainMenu
                        """);
                String number = input.nextLine();
                if (number.equals("2")){
                    mainMenu();
                }else {
                display("Invalid input");
            }
                break;
            case "4":
                display("""
                           ERASE RECENT CALL LISTS
                        Press 2 -> mainMenu
                        """);
                String erase = input.nextLine();
                if (erase.equals("2")){
                    mainMenu();
                }else {
                display("Invalid input");
            }
                break;
            case "5":
                display("""
                        =====================
                            CALL DURATION
                        =====================
                        1 -> lAST CALL DURATION
                        2 -> ALL CALL'S DURATION
                        3 -> RECEIVED CALL DURATION
                        4 -> DIALLED CALL DURATION
                        5 -> CLEAR TIMERS
                        6 -> GO BACK TO CALL
                        7 -> GO BACK TO MAIN MENU
                        """);
                System.out.println("Enter the request:");
                String duration = input.nextLine();
                switch (duration) {
                    case "1" -> {
                        display("""
                                  LAST CALL DURATION
                                Press 2 -> mainMenu
                                """);
                        String last = input.nextLine();
                        if (last.equals("2")) {
                            mainMenu();
                        }else {
                            display("Invalid input");
                        }
                    }
                    case "2"  -> {
                        display("""
                                 All CALL DURATION
                                 Press 2 -> mainMenu
                                """);
                        String all = input.nextLine();
                        if (all. equals("2")) {
                            mainMenu();
                        }else {
                            display("Invalid input");
                        }
                    }
                    case "3" -> {
                        display("""
                                   RECEIVED CALL DURATION
                                Press 2 -> mainMenu
                                """);
                        String option = input.nextLine();
                        if (option.equals("2")) {
                            mainMenu();
                        }else {
                            display("Invalid input");
                        }
                    }
                    case "4" -> {
                        display("""
                                    DIALLED CALL DURATION
                                Press 2 -> mainMenu
                                """);
                        String dialled = input.nextLine();
                        if (dialled.equals("2")) {
                            mainMenu();
                        }else {
                            display("Invalid input");
                        }
                    }
                    case "5" -> {
                        display("""
                                    CLEAR TIMERS
                                Press 2 -> mainMenu
                                """);
                        String timer = input.nextLine();
                        if (timer.equals("2")) {
                            mainMenu();
                        } else  {
                            display("Invalid input");
                        }
                    }
                }
            case "6":
                display("""
                        ===================
                            CALL COST
                        ===================
                        1 -> Last call cost
                        2 -> All call cost
                        3 -> Clear counter
                        4 -> GO BACK TO CALL
                        5 -> GO BACK TO MENU
                        """);
                String callCost = input.nextLine();
                switch (callCost) {
                    case "1" -> {
                        display("""
                                    LAST CALL COST
                                Press 2 -> mainMenu
                                """);
                        String last = input.nextLine();
                        if (last.equals("2")) {
                            mainMenu();
                        }else {
                            display("Invalid input");
                        }
                    }
                    case "2" -> {
                        display("""
                                    ALL CALLS COST
                                Press 2 -> mainMenu
                                """);
                        String all = input.nextLine();
                        if (all.equals("2")) {
                            mainMenu();
                        }else {
                            display("Invalid input");
                        }
                    }
                    case "3" -> {
                        display("""
                                    CLEAR COUNTER
                                Press 2 -> mainMenu
                                """);
                        String clear = input.nextLine();
                        if (clear.equals("2")) {
                            mainMenu();
                        }
                    }
                    case "4" -> callRegister();
                    case "5" -> mainMenu();
                    default -> {
                            display("Invalid input");
                        }
                    }
            case "7":
                display("""
                        ======================
                            CALL COST SETTING
                        ======================
                        1 -> Call cost limit
                        2 -> Show cost in
                        3 -> Go to call
                        4 -> Go to mainMenu
                        """);
                String callSetting = input.nextLine();
                switch (callSetting) {
                    case "1" -> {
                        display("""
                                  CALL COST LIMIT
                                Press 2 -> mainMenu
                                """);
                        String cost = input.nextLine();
                        if (cost.equals("2")) {
                            mainMenu();
                        }else {
                            display("Invalid input");
                        }
                    }
                    case "2" -> {
                        display("""
                                    COST IN
                                Press 2 -> mainMenu
                                """);
                        String costs = input.nextLine();
                        if (costs. equals("2")) {
                            mainMenu();
                        }else {
                            display("Invalid input");
                        }
                    }
                }
            case "8":
                display("""
                            PREPAID CREDIT
                        Press 2 -> mainMenu
                        """);
                String prepaid = input.nextLine();
                if (prepaid.equals("2")){
                    mainMenu();
                }else {
                display("Invalid input");
            }
                break;
        }
    }

    public static void chat() {
        display("""
                1 -> chat
                2 -> mainMenu
                """);
       String chat = input.nextLine();
        if (chat.equals("2")){
            mainMenu();
        }else {
            chat();
        }
    }

    public static void display(String prompt) {
        System.out.println(prompt);
    }

    public static void phoneBook() {
        display("""
                1 -> Search
                2 -> Service Nos
                3 -> Add name
                4 -> Erase
                5 -> Edit
                6 -> Assign tone
                7 -> Send B' card
                8 -> Options
                9 -> Speed dials
                10 -> Voice tags
                """);
        System.out.println("Enter the options: ");
        String options = input.nextLine();
        switch (options) {
            case "1" -> {
                display("""
                             Search
                        2 -> mainmenu""");
                String main = input.nextLine();
                if (main.equals("2")) {
                    mainMenu();
                }else {
                    display("Invalid input");
                }
            }
            case "2" -> {
                display("""
                           Service Nos
                        2 -> mainMenu
                        """);
                String service = input.nextLine();
                if (service.equals("2")) {
                    mainMenu();
                }else {
                    display("Invalid input");
                }
            }
            case "3" -> {
                display("""
                             Add name
                        2 -> mainMenu
                        """);
                String add = input.nextLine();
                if (add.equals("2")) {
                    mainMenu();
                }else {
                    display("Invalid input");
                }
            }
            case "4" -> {
                display("""
                             Erase
                        2-> mainMenu
                        """);
                int erase = input.nextInt();
                if (erase == 2) {
                    mainMenu();
                } else {
                    display("Invalid input");
                }
            }
            case "5" -> {
                display("""
                            Edit
                        2 -> mainMenu
                        """);
                String edit = input.nextLine();
                if (edit.equals("2")) {
                    mainMenu();
                }else {
                    display("Invalid input");
                }
            }
            case "6" -> {
                display("""
                            Assign tone
                        2 -> mainMenu
                        """);
            String tone = input.nextLine();
                if (tone.equals("2")) {
                    mainMenu();
                }else {
                    display("Invalid input");
                }
            }
            case "7" -> {
                display("""
                            Send b' cards
                        2-> mainMenu
                        """);
                String cards = input.nextLine();
                if (cards.equals("2")) {
                    mainMenu();
                }else {
                    display("Invalid input");
                }
            }
            case "8" -> {
                display("""
                        1-> Type of view
                        2 -> Memory status
                        3 -> mainMenu
                        """);
                String  value = input.nextLine();
                if (value.equals("1")) {
                    System.out.println("Type of view");
                    System.out.println("Press 3 to mainMenu");
                    int press = input.nextInt();
                    if (press == 3) mainMenu();
                    else {
                        System.out.println("Invalid input");
                    }
                } else if (value.equals("2")) {
                    System.out.println("Memory status");
                    System.out.println("Press 3 to mainMenu");
                    String press = input.nextLine();
                    if (press.equals("3")) mainMenu();
                    else {
                        System.out.println("Invalid input");
                    }
                } else if (value.equals("3")) {
                    mainMenu();
                }else {
                    display("Invalid input");
                }
            }
            case "9" -> {
                display("""
                            Speed dials
                        2 -> mainMenu
                        """);
                String dials = input.nextLine();
                if (dials.equals("2")) mainMenu();
                else {
                    System.out.println("Invalid input");
                }
            }
            case "10" -> {
                display("""
                            Voice dials
                        2 -> mainMenu
                        """);
                String voice = input.nextLine();
                if (voice.equals("2")) mainMenu();
                else {
                    System.out.println("Invalid input");
                }
            }
        }
    }

    public static void message() {
        display("""
                1 -> Write message
                2 -> inbox
                3 -> outbox
                4 -> Picture message
                5 -> Template
                6 -> Smileys
                7 -> Message setting
                8 -> Info service
                9 -> Voice mailbox number
                10 -> Service Command Editor
                11 -> Go back to menu
                """);
        System.out.println("Enter your request:");
        String option = input.nextLine();
        switch (option) {
            case "1":
                display("""
                             Write message
                        2 -> mainMenu
                        """);
                String  mess = input.nextLine();
                if (mess.equals("2")) mainMenu();
                else {
                    System.out.println("Invalid input");
                }
                break;
            case "2":
                display("\tInbox");
                display("2 -> mainMenu");
                String menu = input.nextLine();
                if (menu.equals("2")) mainMenu();
                else {
                    System.out.println("Invalid input");
                }
                break;
            case "3":
                display("\tOutbox");
                display("2 -> mainMenu");
                String main = input.nextLine();
                if (main.equals("2")) mainMenu();
                while (!main.equals("2")) {
                    System.out.println("Press 2 to mainMenu");
                    main = input.nextLine();
                    if (main.equals("2")) {
                        mainMenu();
                        break;
                    }
                }
                break;
            case "4":
                display("\tPicture message");
                display("2 -> mainMenu");
                String picture = input.nextLine();
                if (picture.equals("2")) mainMenu();
                while (!picture.equals("2")){
                    System.out.println("Ode");
                    picture = input.nextLine();
                    if (picture.equals("2")){
                        mainMenu();
                    }
                }
                break;
            case "5":
                display("\tTemplate");
                display("2 -> mainMenu");
                int temp = input.nextInt();
                if (temp == 2) mainMenu();
                while (temp != 2){
                    System.out.println("Ode");
                    temp = input.nextInt();
                }
                break;
            case "6":
                display("\tSmileys");
                display("2 -> mainMenu");
                int smile = input.nextInt();
                if (smile == 2) mainMenu();
                while (smile != 2){
                    System.out.println("Ode");
                    smile = input.nextInt();
                }
                break;
            case "7":
                display("""
                        =======================
                            MESSAGE SETTING
                        =======================
                        1 -> Set 1 ^ 2
                        2 -> Common ^ 3
                        3 -> Go back to message
                        4 -> Go back to menu
                        """);
                display("Enter your request:");
                int messageS = input.nextInt();
                switch (messageS) {
                    case 1:
                        display("""
                                1 -> Message Centre number
                                2 -> Message sent as
                                3 -> Message Validity
                                4 -> go back to message
                                5 -> go back to menu
                                """);
                        System.out.println("Enter the request: ");
                        int set1 = input.nextInt();
                        switch (set1) {
                            case 1 -> {
                                display("\tMessage Center number: ");
                                display("2 -> mainMenu");
                                int centre = input.nextInt();
                                if (centre == 2) mainMenu();
                                while (centre != 2) {
                                    System.out.println("Ode");
                                    centre = input.nextInt();
                                }
                            }
                            case 2 -> {
                                display("\tMessage sent as ");
                                display("2 -> mainMenu");
                                int sent = input.nextInt();
                                if (sent == 2) mainMenu();
                                while (sent != 2) {
                                    System.out.println("Ode");
                                    sent = input.nextInt();
                                }
                            }
                            case 3 -> {
                                display("\tMessage validity");
                                display("2 -> mainMenu");
                                int valid = input.nextInt();
                                if (valid == 2) mainMenu();
                                while (valid != 2) {
                                    System.out.println("Ode");
                                    valid = input.nextInt();
                                }
                            }
                            case 4 -> message();
                            case 5 -> mainMenu();
                            default -> {
                                while (set1 > 5) {
                                    display("Invalid input");
                                    display("Enter the response");
                                    set1 = input.nextInt();
                                }
                            }
                        }
                    case 2:
                        display("""
                                ===================
                                1 -> Delivery report
                                2 -> Report via same centre
                                3 -> Character support
                                4 -> Go back to message
                                5 -> go back to menu
                                """);
                        System.out.println("Enter request: ");
                        int common = input.nextInt();
                        switch (common) {
                            case 1:
                                display("""
                                        \tDelivery report
                                        2 -> mainMenu
                                        """);
                                int report = input.nextInt();
                                if (report == 2) mainMenu();
                                while (report != 2){
                                    System.out.println("Ode");
                                    report = input.nextInt();
                                }
                                break;
                            case 2:
                                display("""
                                        \t Report via same centre
                                        2 -> mainMenu
                                        """);
                                int via = input.nextInt();
                                if (via == 2) mainMenu();
                                while (via != 2){
                                    System.out.println("Ode");
                                    via = input.nextInt();
                                }
                                break;
                            case 3:
                                display("""
                                        \tCharacter support
                                        2 -> mainMenu
                                        """);
                               int character = input.nextInt();
                                if (character == 2) mainMenu();
                                while (character != 2){
                                    System.out.println("Ode");
                                    character = input.nextInt();
                                }
                                break;
                            case 4: message();
                            break;
                            case 5: mainMenu();
                            default:{
                                while (common > 5) {
                                    display("Invalid input");
                                    display("Enter the response");
                                    common = input.nextInt();
                                }
                            }
                        }
                }
            case "8":
                display("""
                        \tInfo service
                         2 -> mainMenu
                        """);
               int info = input.nextInt();
                if (info == 2) mainMenu();
                while (info != 2){
                    System.out.println("Ode");
                    info = input.nextInt();
                }
                break;
            case "9":
                display("""
                        \tVoice mailbox editor
                        2 -> mainMenu
                        """);
                int value = input.nextInt();
                if (value == 2) mainMenu();
                while (value != 2){
                    System.out.println("Ode");
                    value = input.nextInt();
                }
                break;
            case "10":
                display("""
                        \tService command editor
                        2 -> mainMenu
                        """);
                int service = input.nextInt();
                if (service == 2) mainMenu();
                while (service != 2){
                    System.out.println("Ode");
                    service = input.nextInt();
                }
                break;
            case "11": mainMenu();
            default: {
                    display("Invalid input");
                }
            }
        }
    }
