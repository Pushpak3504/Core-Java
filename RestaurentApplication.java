
import java.util.Scanner;

class RestaurentApplication {
    static String name;
    static String password ;
    static long phone ;
    static String address ; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.println();
            System.out.println("-----------------JAVA KA DHABA-----------------");
            System.out.println();
            System.out.println("1. CREATE ACCOUNT");
            System.out.println("2. EXISTING ACCOUNT");
            System.out.println();
            System.out.print("Enter the Option : ");
            int opt = sc.nextInt();
            System.out.println();
            
            switch(opt) {
                case 1 : createAccount(sc); break;

                case 2 : login(sc); break;

                default: System.out.println(" *** INVALID OPTION *** "); break;
            }
        }
    }

    public static void createAccount(Scanner sc) {
        System.out.println("-----------------REGISTRATION----------------- ");
        System.out.println();
        System.out.print("NAME : ");
        name = sc.next();
        System.out.print("Password : ");
        password = sc.next();
        System.out.print("CONTACT : ");
        phone = sc.nextLong();
        System.out.print("ADDRESS : ");
        address = sc.nextLine();
        System.out.println();
        System.out.println("ACCOUNT CREATED SUCCESSFULLY");
    }

    public static void login(Scanner sc) {
        if(name == null) {
            System.out.println(" CREATE YOUR ACCOUNT FIRST ");
            return;
        }

        System.out.println("-------------------------LOGIN------------------------");
        System.out.println();

        for(int attempt = 3; attempt >= 1; attempt--) {
            System.out.print("USERNAME : ");
            String uName = sc.next();
            System.out.print("Password : ");
            String pass = sc.next();
            System.out.println();

            if(name.equals(uName) && password.equals(pass)) {
                homePage(sc);
            }
            else {
                System.out.println(" ***INVALID CREDENTIALS***");
                System.out.println("ATTEMPTS LEFT : "+(attempt - 1));
                System.out.println();
            }
        }
        System.out.println("___________THANK YOU AND VISIT AGAIN___________ ");
        System.exit(0);
    }

    public static void homePage(Scanner sc) {
        System.out.println();
        System.out.println("-------------------- HOME PAGE --------------------");
        System.out.println();
        System.out.println("1. MENU ");
        System.out.println("2. ORDER ");
        System.out.println("3. TABLE BOOKING");
        System.out.println("4. LOGOUT");
        System.out.println();
        System.out.print("ENTER AN OPTION : ");
        int opt = sc.nextInt();

        switch(opt) {
            case 1 : menuDisplay(sc); break;
            default: System.out.println(" ***INVALID CREDENTIALS*** "); break;
        }
    }
    
    public static void menuDisplay(Scanner sc) {
        System.out.println();
        System.out.println("----------------- MENU -----------------");
        System.out.println("1. VEGETERIAN MENU");
        System.out.println("2. NON-VEGETERIAN MENU");
        System.out.print("ENTER THE OPTION : ");
        int opt = sc.nextInt();
        switch(opt) {
            case 1 : vegeterianMenu(); break;
            case 2 : nonVegMenu(); break;
            default: System.out.println(" ***INVALID CREDENTIALS*** "); break;
        }
    }

    public static void vegeterianMenu() {
        System.out.println();
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println();
    }
    
    public static void nonVegMenu() {
        System.out.println();
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println("1. STARTER");
        System.out.println();
    }


}
