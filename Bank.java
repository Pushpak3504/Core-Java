
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username1 = null;
        String password1 = null;
        String address = null;
        long contact = 0;
        double balance = 0.0;
        
        for(;;) {
            System.out.println();
            System.out.println("---------------WELCOME-------------");
            System.out.println("---------------DAYA BANKING----------");
            System.out.println();
            System.out.println("1. EXISTING USER");
            System.out.println("2. CREATE ACCOUNT");
            System.out.println();
            System.out.print("ENTER AN OPTION : ");
            int opt = sc.nextInt();
            if(opt == 2) {
                System.out.println();
                System.out.println("----------------CREATE NEW ACCOUNT-------------------");
                System.out.println();
                System.out.print("ENTER USERNAME : ");
                username1 = sc.next();
                System.out.print("CREATE A PASSWORD : ");
                password1 = sc.next();
                sc.nextLine();
                System.out.print("ENTER ADDRESS : ");
                String add = sc.nextLine();
                System.out.print("ENTER MOBILE NUMBER : ");
                contact = sc.nextLong();
                System.out.print("ENTER AMOUNT TO DEPOSIT : ");
                balance = sc.nextDouble();
                System.out.println();
                System.out.println("-------------ACCOUNT CREATE SUCCESSFULLY---------------");
                continue;
            }

            else if(opt == 1) {
                if(username1 == null) {
                    System.out.println("----- CREATE YOUR ACCOUNT FIRST -------");
                    continue;
                }

                System.out.println("");
                System.out.println("------------LOGIN------------");
                System.out.println();

                for(int i=3; i>=1; i--) {
                    System.out.println();
                    System.out.print("USERNAME : ");
                    String username = sc.next();
                    System.out.print("PASSWORD : ");
                    String password = sc.next();

                    if(username.equals(username1) && password.equals(password1)) {
                        home:
                        for(;;) {
                            System.out.println();
                            System.out.println("---------HOME PAGE----------");
                            System.out.println();
                            System.out.println("1. DEPOSIT");
                            System.out.println("2. WITHDRAW");
                            System.out.println("3. CHECK BALANCE");
                            System.out.println("4. MINI STATEMENT");
                            System.out.println("5. LOGOUT");
                            System.out.println();
                            System.out.print("ENTER AN OPTION : ");
                            int opt1 = sc.nextInt();
                            System.out.println();
                            switch(opt1) {
                                case 1 : {
                                    System.out.println("----------DEPOSIT----------");
                                    System.out.println();
                                    System.out.print("ENTER THE AMOUNT : ");
                                    double depositAmt = sc.nextDouble();
                                    balance += depositAmt;
                                    System.out.println("-----------AMOUNT DEPOSITED SUCCESSFULLY--------------");
                                    System.out.println();
                                    break;
                                }
                                case 2 : {
                                    System.out.println("------------------WITHDRAW-------------");
                                    System.out.println();
                                    System.out.print("ENTER THE AMOUNT : ");
                                    double withdraw = sc.nextDouble();
                                    System.out.print("ENTER THE PIN : ");
                                    String password3 = sc.next();
                                    if(password3.equals(password1)) {
                                        if(withdraw<=balance) {
                                            balance -= withdraw;
                                            System.out.println("AMOUNT DEBITED SUCCESSFULLY");
                                        }
                                        else {
                                            System.out.println("INSUFFICIENT FUNDS");
                                        }
                                    }
                                    else {
                                        System.out.println("WRONG PIN");
                                    }
                                    break;
                                }
                                case 3 : {
                                    System.out.println("------------CHECK BALANCE-----------");
                                    System.out.println();
                                    for(int j=3; j>=1; j--) {
                                        System.out.println();
                                        System.out.println("ENTER THE PIN : ");
                                        String password2 = sc.next();
                                        if(password2.equals(password1)) {
                                            System.out.println("ACCOUNT BALANCE : "+balance+" Rs");
                                            continue home;
                                        }
                                        else {
                                            System.out.println("WRONG PIN");
                                            System.out.println("ATTEMPT LEFT : "+(j - 1));

                                        }
                                    }
                                    System.out.println("YOUR ACCOUNT HAS BEEN BLOCKED FOR 24 HOURS");
                                    System.exit(0);
                                    break;
                                }
                                case 4 : {
                                    System.out.println("---------------MINI STATEMENT------------- ");
                                    break;
                                }
                                case 5 : {
                                    System.out.println("THANK YOU FOR USING OUR APP");
                                    System.out.println("VISIT AGAIN");
                                    System.exit(0);

                                }
                            }

                        }
                    }
                    else {
                        System.out.println("INVALID CREDENTIALS");
                        System.out.println("ATTEMPT LEFT : "+(i-1));
                        System.out.println();
                    }
                }
                System.out.println("INCORRECT CREDENTIALS");
                System.exit(0);
            }
            else {
                System.out.println("INVALID OPTION");
            }

        }
    }
}
