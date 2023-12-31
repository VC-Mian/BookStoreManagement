/*
* the TestHarness serves as a menu to test out functions created from methods from the BookStore for a book managment system to keep track of members purchases,
* inventory, and the members themselves.
* @author Vanessa Miranda-Calleja
*/

import java.util.*;

public class TestHarness {

    public static void main(String[] args) 
    {
        //Book Store Object
        BookStore testing = new BookStore();
        Scanner input = new Scanner(System.in);
        int data = -1;

        //while loop
        while (data != 0)
        {
            //menu for bookstore
            System.out.println("-----BOOKSTORE DATA MENU-----");
            System.out.println("1. Complete a purchase.");
            System.out.println("2. Products Inventory.");
            System.out.println("3. Register New Type of Member."); 
            System.out.println("4. Display all member's Purchase details.");
            System.out.println("5. Display Premium Members payment due status.");
            System.out.println("0. to exit");
            data = input.nextInt();

            switch(data)
            {   
                //completes a purchase for a member
                case 1:
                    int product = 0;
                    while(product != 4){
                        System.out.println("Enter which type of member made this purchase.\n1.Regular Member\n2.Premium Member\n4. to return to menu");
                        int memType = input.nextInt();

                        switch(memType)
                        {
                            case 1:
                                System.out.println("Enter Regular Members name to collect Purchase data");
                                String rmn = input.next();
                                int regId = testing.generateID();

                                testing.addRegularMember(rmn, regId);

                                System.out.println("Enter number of Books:");
                                int nob = input.nextInt();

                                testing.addBookData(nob);
                                System.out.println("Book purchase is added!");
                                
                                //cd nums entered
                                System.out.println("Enter number of CDs:");
                                int noc = input.nextInt();

                                testing.addCdData(noc);
                                System.out.println("CD purchase is added!");
                                
                                System.out.println("Enter number of DVDs:");
                                int nod = input.nextInt();

                                testing.addDvdData(nod);
                                System.out.println("DVD purchase is added!");

                                System.out.println("Total Purchased: $" + testing.getTotalSpent());
                                
                                break;

                            case 2:
                                System.out.println("Enter Premium Members name to collect Purchase data");
                                String pn = input.next();
                                int pid = testing.generateID();

                                testing.addPremiumMember(pn, pid);

                                System.out.println("Enter number of Books:");
                                nob = input.nextInt();

                                testing.addBookData(nob);
                                System.out.println("Book purchase is added!");

                                System.out.println("Enter number of CDs:");
                                noc = input.nextInt();

                                testing.addCdData(noc);
                                System.out.println("CD purchase is added!");
                                
                                System.out.println("Enter number of DVDs:");
                                nod = input.nextInt();

                                testing.addDvdData(nod);
                                System.out.println("DVD purchase is added!");

                                System.out.println("Total Purchased: $" + testing.getTotalSpent());
                                break;

                            //exit while loop to return to menu.
                            case 4:
                                break;

                            default:
                                System.out.println("please enter one of the numbers.");
                                break;
                        }
                        break;
                    
                    }
                    break;

                //prints out all products inventory details 
                case 2:
                    System.out.println("______PRODUCT INVENTORY______");
                    System.out.println("    Books left: " + testing.getBookInventory());
                    System.out.println("    CDs left: " + testing.getCdInventory());
                    System.out.println("    DVD left: " + testing.getDvdInventory());
                    break;
                    
                //Registers a new type of Member
                case 3:
                    System.out.println("What type of member would you like to register?\n1.Member\n2.Premium Member");
                    int type = input.nextInt();

                    switch(type)
                    {   
                        case 1:
                            System.out.println("Enter Regular Members name");
                            String rmn = input.next();

                            int regId = testing.generateID();
                            
                            testing.addRegularMember(rmn, regId);
                            System.out.println("Member has been successfully added.\nRegular Member Name: " + rmn + "\nMembers ID:" + regId);
                            break;
                        case 2:
                            System.out.println("Enter premium members name:");
                            String pn = input.next();
                            int pid = testing.generateID();
                            System.out.println("Enter premium members payment method(Enter 'cash' or 'card'):");
                            String pm = input.next();
                            System.out.println("Enter payment of $10 or more:");
                            int amount = input.nextInt();
                            testing.addPremiumMember(pn, pid, pm, amount);
                            System.out.println("Premium Member has been successfully added.\nPremium Members Name: " + pn + "\nID: S" + pid);
                            break;
                    }
                    break;

                //prints out all members details and purchase history
                case 4:
                    System.out.println("______All Members purchase history______");
                    testing.printAllMemberPurchases();
                    break;

                //prints premium member details 
                case 5:
                    System.out.println("____Payment Due Status of Each Premium Member_____");
                    testing.getPremiumMembers();
                    break;
                
                //exit entire program
                case 0:
                    break;

                default:
                    System.out.println("Enter one of the numbers listed");
                    break;
            }
            //end switch statement
        }
        //end while loop
    }
}
