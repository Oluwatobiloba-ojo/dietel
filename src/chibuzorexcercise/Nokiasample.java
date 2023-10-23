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
        int request = input.nextInt();
        switch (request) {
            case 1 -> phoneBook();
            case 2 -> message();
            case 3 -> chat();
            case 4 -> callRegister();
            case 5 -> Ringtone();
            case 6 -> Setting();
            case 7 -> callDivert();
            case 8 -> Games();
            case 9 -> Calculator();
            case 10 -> Remainder();
            case 11 -> Clock();
            case 12 -> Profiles();
            default -> display("invalid input ");
        }
    }

    public static void Profiles() {
        display("""
                    PROFILES
                Press 2 -> mainMenu
          
                """);
       int value = input.nextInt();
        if (value == 2) {
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
        int clock = input.nextInt();
        switch (clock) {
            case 1 -> {
                display("""
                            ALARM CLOCK
                        2 -> mainMenu
                        3 -> clock
                        """);
                int comeBack = input.nextInt();
                switch (comeBack) {
                    case 2 -> mainMenu();
                    case 3 -> Clock();
                    default -> {
                        while (comeBack != 2 && comeBack != 3) {
                            display("Invalid input");
                            comeBack = input.nextInt();
                        }
                    }
                }
            }
            case 2 -> {
                display("""
                            CLOCK SETTING
                        Press 2 -> mainMenu
                        Press 3 -> clock
                        """);
                int value = input.nextInt();
                switch (value) {
                    case 2 -> mainMenu();
                    case 3 -> Clock();
                    default -> display("Invalid input");
                }
            }
            case 3 -> {
                display("""
                            DATE SETTING
                        Press 2 -> mainMenu
                        Press 3 -> Clock
                        """);
                int date = input.nextInt();
                switch (date) {
                    case 2 -> mainMenu();
                    case 3 -> Clock();
                    default -> display("Invalid input");
                }
            }
            case 4 -> {
                display("""
                            STOP WATCH
                        Press 2 -> mainMenu
                        Press 3 -> Clock
                        """);
                int watch = input.nextInt();
                switch (watch) {
                    case 2 -> mainMenu();
                    case 3 -> Clock();
                    default -> display("Invalid input");
                }
            }
            case 5 -> {
                display("""
                            COUNT DOWN TIMER
                        Press 2 -> mainMenu
                        Press 3 -> Clock
                        """);
                int timer = input.nextInt();
                switch (timer) {
                    case 2 -> mainMenu();
                    case 3 -> Clock();
                    default -> display("Invalid input");
                }
            }
            case 6 -> {
                display("""
                            AUTO UPDATE OF DATE AND TIME
                        Press 2 -> mainMenu
                        Press 3 -> Clock
                        """);
                int update = input.nextInt();
                switch (update) {
                    case 2 -> mainMenu();
                    case 3 -> Clock();
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
        int response = input.nextInt();
        if (response == 2) {
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
       int response = input.nextInt();
       if (response == 2){
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
         int value = input.nextInt();
        if (value == 2){
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
      int response = input.nextInt();
        if (response == 2){
            mainMenu();
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
        int setting = input.nextInt();
        switch (setting) {
            case 1:
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
                int callSetting = input.nextInt();
                switch (callSetting) {
                    case 1 -> {
                        display("""
                                    AUTOMATIC REDIAL
                                Press 2 -> mainMenu
                                """);
                        int response = input.nextInt();
                        if (response == 2) {
                            mainMenu();
                        }while (response != 2){
                            display("Invalid input");
                            display("Enter the response");
                            response = input.nextInt();
                        }
                    }
                    case 2 -> {
                        display("""
                                    SPEED DIALLING
                                Press 2 -> mainMenu
                                """);
                        int speed = input.nextInt();
                        if (speed == 2) {
                            mainMenu();
                        }while (speed != 2){
                            display("Invalid input");
                            display("Enter the response");
                            speed = input.nextInt();
                        }
                    }
                    case 3 -> {
                        display("""
                                    CALL WAITING OPTIONS
                                Press 2 -> mainMenu
                                """);
                        int call = input.nextInt();
                        if (call == 2) {
                            mainMenu();
                        }while (call != 2){
                            display("Invalid input");
                            display("Enter the response");
                            call = input.nextInt();
                        }
                    }
                    case 4 -> {
                        display("""
                                    OWN NUMBER SENDING
                                Press 2 -> mainMenu
                                """);
                        int number = input.nextInt();
                        if (number == 2) {
                            mainMenu();
                        }while (number != 2){
                            display("Invalid input");
                            display("Enter the response");
                            number = input.nextInt();
                        }
                    }
                    case 5 -> {
                        display("""
                                    PHONE LINE IN USE
                                Press 2 -> mainMenu
                                """);
                        int phone = input.nextInt();
                        if (phone == 2) {
                            mainMenu();
                        }while (phone != 2){
                            display("Invalid input");
                            display("Enter the response");
                            phone = input.nextInt();
                        }
                    }
                    case 6 -> {
                        display("""
                                    AUTOMATIC ANSWER
                                Press 2 -> mainMenu
                                """);
                        int answer = input.nextInt();
                        if (answer == 2) {
                            mainMenu();
                        }while (answer != 2){
                            display("Invalid input");
                            display("Enter the response");
                            answer = input.nextInt();
                        }
                    }
                    case 7 -> Setting();
                    case 8 -> mainMenu();
                    default -> {
                        while (callSetting >= 8){
                            display("Invalid input Enter between 1 and 8");
                            callSetting = input.nextInt();
                        }
                    }
                }
            case 2:
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
                int phoneS = input.nextInt();
                switch (phoneS) {
                    case 1 -> {
                        display("""
                                    LANGUAGE
                                Press 2 -> mainMenu
                                """);
                        int language = input.nextInt();
                        if (language == 2) {
                            mainMenu();
                        }
                        while (language != 2) {
                            display("Pick the right number");
                            language = input.nextInt();
                        }
                    }
                    case 2 -> {
                        display("""
                                  CELL INFO DISPLAY
                                Press 2 -> mainMenu
                                """);
                        int info = input.nextInt();
                        if (info == 2) {
                            mainMenu();
                        }
                        while (info != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            info = input.nextInt();
                        }
                    }
                    case 3 -> {
                        display("""
                                    WELCOME NOTICE
                                Press 2 -> mainMenu
                                """);
                        int notice = input.nextInt();
                        if (notice == 2) {
                            mainMenu();
                        }
                        while (notice != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            notice = input.nextInt();
                        }
                    }
                    case 4 -> {
                        display("""
                                    NETWORK SELECTION
                                Press 2 -> mainMenu
                                """);
                        int network = input.nextInt();
                        if (network == 2) {
                            mainMenu();
                        }
                        while (network != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            network = input.nextInt();
                        }
                    }
                    case 5 -> {
                        display("""
                                    LIGHT
                                Press 2 -> mainMenu
                                """);
                        int light = input.nextInt();
                        if (light == 2) {
                            mainMenu();
                        }
                        while (light != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            light = input.nextInt();
                        }
                    }
                    case 6 -> {
                        display("""
                                    CONFIRMS SIM SERVICE ACTION
                                Press 2 -> mainMenu
                                """);
                        int sim = input.nextInt();
                        if (sim == 2) {
                            mainMenu();
                        }
                        while (sim != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            sim = input.nextInt();
                        }
                    }
                    case 7 -> Setting();
                    case 8 -> mainMenu();
                    default -> {
                        while (phoneS > 8) {
                            display("Invalid input");
                            display("Enter the response");
                            phoneS = input.nextInt();
                        }
                    }
                }
            case 3: display("""
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
                int security = input.nextInt();
                switch (security) {
                    case 1 -> {
                        display("""
                                    PIN CODE REQUEST
                                Press 2 -> mainMenu
                                """);
                        int code = input.nextInt();
                        if (code == 2) {
                            mainMenu();
                        }
                        while (code != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            code = input.nextInt();
                        }
                    }
                    case 2 -> {
                        display("""
                                    CALL BARRING SERVICE
                                Press 2 -> mainMenu
                                """);
                        int call = input.nextInt();
                        if (call == 2) {
                            mainMenu();
                        }
                        while (call != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            call = input.nextInt();
                        }
                    }
                    case 3 -> {
                        display("""
                                    FIXED DIALLING
                                Press 2 -> mainMenu
                                """);
                        int fixed = input.nextInt();
                        if (fixed == 2) {
                            mainMenu();
                        }
                        while (fixed != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            fixed = input.nextInt();
                        }
                    }
                    case 4 -> {
                        display("""
                                    CLOSED USER GROUP
                                Press 2 -> mainMenu
                                """);
                        int user = input.nextInt();
                        if (user == 2) {
                            mainMenu();
                        }
                        while (user != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            user = input.nextInt();
                        }
                    }
                    case 5 -> {
                        display("""
                                    PHONE SECURITY
                                Press 2 -> mainMenu
                                """);
                        int phone = input.nextInt();
                        if (phone == 2) {
                            mainMenu();
                        }
                        while (phone != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            phone = input.nextInt();
                        }
                    }
                    case 6 -> {
                        display("""
                                    CHANGE ACCESS CODE
                                Pres 2 -> mainMenu
                                """);
                        int change = input.nextInt();
                        if (change == 2) {
                            mainMenu();
                        }
                        while (change != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            change = input.nextInt();
                        }
                    }
                }
            case 4: display("""
                    1 -> RESTORE FACTORY SETTING
                    Press 2 -> mainMenu
                    """);
           int factory = input.nextInt();
                if (factory == 2){
                    mainMenu();
                }while (factory != 2){
                display("Invalid input");
                display("Enter the response");
                factory = input.nextInt();
            }
            break;
            case 5: mainMenu();
            default:{
                while (setting > 5){
                    display("Invalid input");
                    display("Enter the response");
                    setting = input.nextInt();
                }
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
                while (ring > 10) {
                    display("Invalid input");
                    display("Enter the response");
                    ring = input.nextInt();
                }
            }
        }
    }

    public static void screenSaver() {
        display("""
                    SCREEN SAVER
                Press 2 -> mainMenu
                """);
        int saver = input.nextInt();
        if (saver == 2){
            mainMenu();
        }while (saver != 2){
            display("Invalid input");
            display("Enter the response");
            saver = input.nextInt();
        }
    }

    public static void vibratingAlert() {
        display("""
                    VIBRATING ALERT
                Press 2 -> mainMenu
                """);
        int alert = input.nextInt();
        if (alert == 2){
            mainMenu();
        }while (alert != 2){
            display("Invalid input");
            display("Enter the response");
            alert = input.nextInt();
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
        }while (game != 2){
            display("Invalid input");
            display("Enter the response");
            game = input.nextInt();
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
        }while (tone != 2){
            display("Invalid input");
            display("Enter the response");
            tone = input.nextInt();
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
        }while (alert != 2){
            display("Invalid input");
            display("Enter the response");
            alert = input.nextInt();
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
        }while (compose != 2){
            display("Invalid input");
            display("Enter the response");
            compose = input.nextInt();
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
        }while (alert != 2){
            display("Invalid input");
            display("Enter the response");
            alert = input.nextInt();
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
        }while (tone != 2){
            display("Invalid input");
            display("Enter the response");
            tone = input.nextInt();
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
        int call = input.nextInt();
        switch (call) {
            case 1:
                display("""
                         Missed calls
                        press 2 -> mainMenu
                        """);
               int calls = input.nextInt();
                if (calls == 2){
                    mainMenu();
                }while (calls != 2){
                display("Invalid input");
                display("Enter the response");
                calls = input.nextInt();
            }
                break;
            case 2:
                display("""
                          RECEIVED CALLS
                        Press 2 -> mainMenu
                        """);
               int received = input.nextInt();
                if (received == 2){
                    mainMenu();
                }while (received != 2){
                display("Invalid input");
                display("Enter the response");
                received = input.nextInt();
            }
                break;
            case 3:
                display("""
                          DIALLED NUMBERS
                        Press 2 -> mainMenu
                        """);
                int number = input.nextInt();
                if (number == 2){
                    mainMenu();
                }while (number != 2){
                display("Invalid input");
                display("Enter the response");
                number = input.nextInt();
            }
                break;
            case 4:
                display("""
                           ERASE RECENT CALL LISTS
                        Press 2 -> mainMenu
                        """);
                int erase = input.nextInt();
                if (erase == 2){
                    mainMenu();
                }while (erase != 2){
                display("Invalid input");
                display("Enter the response");
                erase = input.nextInt();
            }
                break;
            case 5:
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
                int duration = input.nextInt();
                switch (duration) {
                    case 1 -> {
                        display("""
                                  LAST CALL DURATION
                                Press 2 -> mainMenu
                                """);
                        int last = input.nextInt();
                        if (last == 2) {
                            mainMenu();
                        }
                        while (last != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            last = input.nextInt();
                        }
                    }
                    case 2 -> {
                        display("""
                                 All CALL DURATION
                                 Press 2 -> mainMenu
                                """);
                        int all = input.nextInt();
                        if (all == 2) {
                            mainMenu();
                        }
                        while (all != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            all = input.nextInt();
                        }
                    }
                    case 3 -> {
                        display("""
                                   RECEIVED CALL DURATION
                                Press 2 -> mainMenu
                                """);
                        int option = input.nextInt();
                        if (option == 2) {
                            mainMenu();
                        }
                        while (option != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            option = input.nextInt();
                        }
                    }
                    case 4 -> {
                        display("""
                                    DIALLED CALL DURATION
                                Press 2 -> mainMenu
                                """);
                        int dialled = input.nextInt();
                        if (dialled == 2) {
                            mainMenu();
                        }
                        while (dialled != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            dialled = input.nextInt();
                        }
                    }
                    case 5 -> {
                        display("""
                                    CLEAR TIMERS
                                Press 2 -> mainMenu
                                """);
                        int timer = input.nextInt();
                        if (timer == 2) {
                            mainMenu();
                        }
                        while (timer != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            timer = input.nextInt();
                        }
                    }
                }
            case 6:
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
                int callCost = input.nextInt();
                switch (callCost) {
                    case 1 -> {
                        display("""
                                    LAST CALL COST
                                Press 2 -> mainMenu
                                """);
                        int last = input.nextInt();
                        if (last == 2) {
                            mainMenu();
                        }
                        while (last != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            last = input.nextInt();
                        }
                    }
                    case 2 -> {
                        display("""
                                    ALL CALLS COST
                                Press 2 -> mainMenu
                                """);
                        int all = input.nextInt();
                        if (all == 2) {
                            mainMenu();
                        }
                        while (all != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            all = input.nextInt();
                        }
                    }
                    case 3 -> {
                        display("""
                                    CLEAR COUNTER
                                Press 2 -> mainMenu
                                """);
                        int clear = input.nextInt();
                        if (clear == 2) {
                            mainMenu();
                        }
                    }
                    case 4 -> callRegister();
                    case 5 -> mainMenu();
                    default -> {
                        while (callCost > 5) {
                            display("Invalid input");
                            display("Enter the response");
                            callCost = input.nextInt();
                        }
                    }
                }
            case 7:
                display("""
                        ======================
                            CALL COST SETTING
                        ======================
                        1 -> Call cost limit
                        2 -> Show cost in
                        3 -> Go to call
                        4 -> Go to mainMenu
                        """);
                int callSetting = input.nextInt();
                switch (callSetting) {
                    case 1 -> {
                        display("""
                                  CALL COST LIMIT
                                Press 2 -> mainMenu
                                """);
                        int cost = input.nextInt();
                        if (cost == 2) {
                            mainMenu();
                        }
                        while (cost != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            cost = input.nextInt();
                        }
                    }
                    case 2 -> {
                        display("""
                                    COST IN
                                Press 2 -> mainMenu
                                """);
                        int costs = input.nextInt();
                        if (costs == 2) {
                            mainMenu();
                        }
                        while (costs != 2) {
                            display("Invalid input");
                            display("Enter the response");
                            costs = input.nextInt();
                        }
                    }
                }
            case 8:
                display("""
                            PREPAID CREDIT
                        Press 2 -> mainMenu
                        """);
                int prepaid = input.nextInt();
                if (prepaid == 2){
                    mainMenu();
                }while (prepaid != 2){
                display("Invalid input");
                display("Enter the response");
                prepaid = input.nextInt();
            }
                break;
        }
    }

    public static void chat() {
        display("""
                1 -> chat
                2 -> mainMenu
                """);
       int chat = input.nextInt();
        if (chat == 2){
            mainMenu();
        }while (chat != 2){
            display("Invalid input");
            display("Enter the response");
            chat = input.nextInt();
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
        int options = input.nextInt();
        switch (options) {
            case 1 -> {
                display("""
                             Search
                        2 -> mainmenu""");
                int main = input.nextInt();
                if (main == 2) {
                    mainMenu();
                }while (main != 2){
                    display("Invalid input");
                    display("Enter the response");
                    main = input.nextInt();
                }
            }
            case 2 -> {
                display("""
                           Service Nos
                        2 -> mainMenu
                        """);
                int service = input.nextInt();
                if (service == 2) {
                    mainMenu();
                }while (service != 2){
                    display("Invalid input");
                    display("Enter the response");
                    service = input.nextInt();
                }
            }
            case 3 -> {
                display("""
                             Add name
                        2 -> mainMenu
                        """);
                int add = input.nextInt();
                if (add == 2) {
                    mainMenu();
                }while (add != 2){
                    display("Invalid input");
                    display("Enter the response");
                    add = input.nextInt();
                }
            }
            case 4 -> {
                display("""
                             Erase
                        2-> mainMenu
                        """);
                int erase = input.nextInt();
                if (erase == 2) {
                    mainMenu();
                }while (erase != 2){
                    display("Invalid input");
                    display("Enter the response");
                    erase = input.nextInt();
                }
            }
            case 5 -> {
                display("""
                            Edit
                        2 -> mainMenu
                        """);
                int edit = input.nextInt();
                if (edit == 2) {
                    mainMenu();
                }while (edit != 2){
                    display("Invalid input");
                    display("Enter the response");
                    edit = input.nextInt();
                }
            }
            case 6 -> {
                display("""
                            Assign tone
                        2 -> mainMenu
                        """);
                int tone = input.nextInt();
                if (tone == 2) {
                    mainMenu();
                }while (tone != 2){
                    display("Invalid input");
                    display("Enter the response");
                    tone = input.nextInt();
                }
            }
            case 7 -> {
                display("""
                            Send b' cards
                        2-> mainMenu
                        """);
                int cards = input.nextInt();
                if (cards == 2) {
                    mainMenu();
                }while (cards != 2){
                    display("Invalid input");
                    display("Enter the response");
                    cards = input.nextInt();
                }
            }
            case 8 -> {
                display("""
                        1-> Type of view
                        2 -> Memory status
                        3 -> mainMenu
                        """);
                int value = input.nextInt();
                if (value == 1) {
                    System.out.println("Type of view");
                    System.out.println("Press 3 to mainMenu");
                    int press = input.nextInt();
                    if (press == 3) mainMenu();
                    while (press != 3){
                        System.out.println("Ode pick one to mainMenu");
                        press = input.nextInt();
                    }
                } else if (value == 2) {
                    System.out.println("Memory status");
                    System.out.println("Press 3 to mainMenu");
                    int press = input.nextInt();
                    if (press == 3) mainMenu();
                    while (press != 3){
                        System.out.println("Press 3 to mainMenu");
                        press = input.nextInt();
                    }
                } else if (value == 3) {
                    mainMenu();
                }while (value != 3){
                    display("Invalid input");
                    display("Enter the response");
                    value = input.nextInt();
                }
            }
            case 9 -> {
                display("""
                            Speed dials
                        2 -> mainMenu
                        """);
                int dials = input.nextInt();
                if (dials == 2) mainMenu();
                while (dials != 2){
                    System.out.println("Press 3 to mainMenu");
                    dials = input.nextInt();
                }
            }
            case 10 -> {
                display("""
                            Voice dials
                        2 -> mainMenu
                        """);
                int voice = input.nextInt();
                if (voice == 2) mainMenu();
                while (voice != 2){
                    System.out.println("Press 3 to mainMenu");
                    voice = input.nextInt();
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
        int option = input.nextInt();
        switch (option) {
            case 1:
                display("""
                             Write message
                        2 -> mainMenu
                        """);
                int mess = input.nextInt();
                if (mess == 2) mainMenu();
                while (mess != 2){
                    System.out.println("Press 2 to mainMenu");
                    mess = input.nextInt();
                }
                break;
            case 2:
                display("\tInbox");
                display("2 -> mainMenu");
                int menu = input.nextInt();
                if (menu == 2) mainMenu();
                while (menu != 2){
                    System.out.println("Press 2 to mainMenu");
                    menu = input.nextInt();
                }
                break;
            case 3:
                display("\tOutbox");
                display("2 -> mainMenu");
                int main = input.nextInt();
                if (main == 2) mainMenu();
                while (main != 2){
                    System.out.println("Press 2 to mainMenu");
                    main = input.nextInt();
                }
                break;
            case 4:
                display("\tPicture message");
                display("2 -> mainMenu");
                int picture = input.nextInt();
                if (picture == 2) mainMenu();
                while (picture != 2){
                    System.out.println("Ode");
                    picture = input.nextInt();
                }
                break;
            case 5:
                display("\tTemplate");
                display("2 -> mainMenu");
                int temp = input.nextInt();
                if (temp == 2) mainMenu();
                while (temp != 2){
                    System.out.println("Ode");
                    temp = input.nextInt();
                }
                break;
            case 6:
                display("\tSmileys");
                display("2 -> mainMenu");
                int smile = input.nextInt();
                if (smile == 2) mainMenu();
                while (smile != 2){
                    System.out.println("Ode");
                    smile = input.nextInt();
                }
                break;
            case 7:
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
            case 8:
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
            case 9:
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
            case 10:
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
            case 11: mainMenu();
            default: {
                while (option > 11) {
                    display("Invalid input");
                    display("Enter the response");
                    option = input.nextInt();
                }
            }
        }
    }
}
