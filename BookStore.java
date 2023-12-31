/*
* The bookstore combines classes to create methods that will be used in the TestHarness to create functions.
*  @author Vanessa Miranda-Calleja 
*/

import java.util.*;

public class BookStore
{
    //arrayList to keep track of members and their purchases
    private ArrayList<Object> memberPurchases = new ArrayList<Object>();

    //premiumMembers arrayList to keep track of who needs to pay the payment due. 
    private ArrayList<PremiumMember> premiumList = new ArrayList<PremiumMember>();
    
    //keeps track number of members
    private int numOfRegularMembers = 0;
    private int numOfPreMem = 0;

    //products - Book
    private Book bk = new Book();
    private ArrayList<Book> bookList = new ArrayList<Book>();
    private int bookInventory = 100;
    private int newBookInventory = 0;
    private double bookSpent = 0; 

    //product - CD
    private CD cd = new CD();
    private ArrayList<CD> cdList = new ArrayList<CD>();
    private int cdInventory = 150;
    private int newCdInventory = 0;
    private double cdSpent = 0;

    //product - DVD
    private DVD dvd = new DVD();
    private ArrayList<DVD> dvdList = new ArrayList<DVD>();
    private int dvdInventory = 200;
    private int newDvdInventory = 0;
    private double dvdSpent = 0;
//------------------------------------------------

    /*
    * add a book purchase to bookList and memberPurchases when a member makes a book purchase
    * @parameter nob - number of books
    */
    public void addBookData(int nob){
        memberPurchases.add(new Book(nob));
        bookList.add(new Book(nob));
        minusBookInventory(nob);
        setBookSpent(nob);
        System.out.println("Total for Purchased Books: $" + getBookSpent());
    }

    /*
    * Gets updated book Inventory.
    * @return newBookInventory - updated book inventory
    */
    public int addBookData(){
        return newBookInventory;
    }

    /*
    * updates Book Inventory by subtracting Books pruchased
    * @parameter nod - number of DVDs
    */
    public void minusBookInventory(int nob){
        newBookInventory = bookInventory - nob; 
    }

//------------------------------------------------------------
    /*
    * adds a CD purchase to cdList and memberPurchases when a member make a CD purchase
    * @paramter noc - the number of cds
    */
    public void addCdData(int noc){
        memberPurchases.add(new CD(noc));
        cdList.add(new CD(noc));
        minusCdInventory(noc);
        setCdSpent(noc);
        System.out.println("Total for Purchased CDs: $" + getCdSpent());
    }

    /*
    * gets updated Cd inventory
    * @return newCdInventory - updated Cd Inventory
    */
    public int getCdInventory(){
        return newCdInventory;
    }

     /*
    * updates CD Inventory by subtracting CDs pruchased
    * @parameter nod - number of DVDs
    */
    public void minusCdInventory(int noc){
        newCdInventory = cdInventory - noc; 
    }

//-------------------------------------

    /*
    * adds a DVD purchase to dvdList and memberpurchase when a member makes a purchase
    * @parameter nod - number of DVDs
    */
    public void addDvdData(int nod){
        memberPurchases.add(new DVD(nod));
        dvdList.add(new DVD(nod));
        minusDvdInventory(nod);
        setDvdSpent(nod);
        System.out.println("Total for Purchased DVDs: $" + getDvdSpent());
    }

    /*
    * gets updated Dvd inventory 
    * @return newDvdInventory - updated Dvd Inventory
    */
    public int getDvdInventory(){
        return newDvdInventory;
    }

    /*
    * updates DVD Inventory by subtracting DVDs pruchased
    * @parameter nod - number of DVDs
    */
    public void minusDvdInventory(int nod){
        newDvdInventory = dvdInventory - nod; 
    }
//---------------------------------------------------
    
    //START of regular member methods

    /*
    * adds a regular member with purchases
    * @parameter rmn - regular members name
    * @parameter regId - regular members Id 
    */
    public void addRegularMember(String rmn, int regId){
        memberPurchases.add(new RegularMember(rmn, regId));
        incrementRegularMember();
    }

    /*
    * gets number of regular members
    * @return numOfRegularMembers - number of regular members
    */
    public int getRegularMemberNum(){
        return numOfRegularMembers;
    }

    //increments number of regular members
    public void incrementRegularMember(){
        numOfRegularMembers++;
    }
    //END regular member methods

    /*
    * adds purchases to premiumMember and memberPurchases.
    * @parameter pn - premium members name
    * @parameter pid - premium members Id
    */
    public void addPremiumMember(String pn, int pid){
        memberPurchases.add(new PremiumMember(pn, pid));
        premiumList.add(new PremiumMember(pn, pid));
        incrementPremium();
    }
    
    /*
    * adds a new premiumMember and adds it to memberPurchases list.
    * @parameter pn - premium members name
    * @parameter pid - premium member Id
    * @parameter pm - payment method "card" or "cash"
    * @parameter amount - amount of money deposited
    */
    public void addPremiumMember(String pn, int pid, String pm, double amount){
        memberPurchases.add(new PremiumMember(pn, pid, pm, amount));
        premiumList.add(new PremiumMember(pn, pid, pm, amount));
        incrementPremium();
    } 

    //gets details of all premium members 
    public void getPremiumMembers(){
        for(PremiumMember pm : premiumList){
        System.out.println("_____________\n" + pm);
        }
    }

    /*
    * gets premium member number
    * @return numOfPreMem - number of premium members
    */
    public int getPreMemNum(){
        return numOfPreMem;
    }

    //increments Premium Members
    public void incrementPremium(){
        numOfPreMem++;
    }
    //END of premium methods

    /*
    * generates an ID for all members
    * @return id - id of member
    */
    public int generateID(){
        Random rnd = new Random();
        int id = 100000 + rnd.nextInt(900000);
        return id;
    }

    //Prints all member and Premium member detail with purchase history
    public void printAllMemberPurchases() {
      for(Object mp : memberPurchases){
         System.out.println("\n" + mp);
        }
    }
//-----------------------------------------
    /*
    * gets total money spent on books
    * @ return bookSpent - total spent on books
    */ 
    public double getBookSpent(){
        return bookSpent;
    }

    /*
    * sets total money spent on books
    * @ parameter nob - number of books
    * @ return bookSpent - total spent on books
    */
    public double setBookSpent(int nob){
        bookSpent = bk.getTotalBookCost(nob);       
        return bookSpent;
    }

    /*
    * gets total money spent on CDs
    * @return cdSpent - total money spent on CD
    */
    public double getCdSpent(){
        return cdSpent;
    }

    /*
    * sets total money spent on CDs
    * @paremeter noc - number of CDs
    * @return cdSpent - total money spent on CD
    */
    public double setCdSpent(int noc){
        cdSpent = cd.getTotalCdCost(noc);       
        return cdSpent;
    }

    /*
    * gets total money spent on DVDs
    * @return dvdSpent - total money spent on DVDs
    */
    public double getDvdSpent(){
        return dvdSpent;
    }

    /*
    * sets total money spent on DVDs
    * @ parameter nod - number of DVDs
    * @return dvdSpent - total money spent on DVDs
    */
    public double setDvdSpent(int nod){
        dvdSpent = dvd.getTotalDvdCost(nod);       
        return dvdSpent;
    }

    /*
    * gets the total purchase spent
    * @return moneySpent - sum of all products
    */
    public double getTotalSpent(){
        double moneySpent = (getBookSpent() + getCdSpent() + getDvdSpent());
        return moneySpent;
    }
}
