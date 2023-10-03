/*
* The PremiumMember Class contains information to create new Premium Members, which will be used in the bookStore class.
*  @author Vanessa Miranda-Calleja
*/

public class PremiumMember{
    
    //intializing variables
    private String premiumName, paymentMethod;
    private int premiumId = 0;
    private double costPerMonth = 10;
    private double amountEntered = 0;
    private boolean paymentDue;
    private int premiumNum = 0;

    public PremiumMember(String pn, int pid){
        premiumName = pn;
        premiumId = pid;
        paymentMethod = "card";
        amountEntered = 10;


    }

    public PremiumMember(String pn, int pid, String pm, double amount){
        premiumName = pn;
        premiumId = pid;
        paymentMethod = pm;  
        amountEntered = amount;
    }

    //getters/setters for premium name
    public String getPremiumName(){
        return premiumName;
    }

    public void setPremiumName(String pn){
        this.premiumName = pn;
    }

    //gets ID number
    public int getPmemId(){
        return premiumId;
    }

    //sets ID 
    public void setPmemID(int pId){
        this.premiumId = pId;
    }

    //gets cost of pm    
    public double getcostPerMonth(){
        return costPerMonth;
    } 

    //gets paymentMethod
    public String getPaymentMethod(){
        return paymentMethod;
    }

    //sets payment method
    public void setPaymentMethod(int paymentMethod){
        if(paymentMethod == 1){
            this.paymentMethod = "card";
        }else{
            this.paymentMethod = "cash"; 
        }
    }

    //getters/ setters for payment entered
    public double getAmountEntered(){
        return amountEntered;
    }

    public void setAmountEntered(double amount){
        if(amount < 0){
            this.amountEntered = amount;
        }else{
            System.out.println("Enter a number greater or equal to 0");
        }
    }
    
    //sees if payment is due or not return true if need payment
    public boolean getPaymentDue()
    {
        if(amountEntered != costPerMonth || amountEntered < costPerMonth){
            return true;
        }
        return false;
    }

    //gets number of Pm
    public int getPremiumNum(){
        return premiumNum;
    } 

    //sets number of Pm
    public void setPremiumNum(int pn){
        this.premiumNum = pn;
    } 

    @Override
    public String toString(){
        return "Premium Member name: " + premiumName + "\nPremium ID: P" + premiumId + "\nPayment Type: " + paymentMethod + "\nBalance: " + amountEntered + "\nIs Payment Due? " + getPaymentDue();

    }
}
