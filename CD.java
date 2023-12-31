/*
* The class CD takes the number of CDs and calculates the total cost of them. This will be used in the BookStore class to make a purchase by a member.
*   @author Vanessa Miranda-Calleja
*/
public class CD{
    
    //variable to store number of cds
    private int numOfCd = 0;

    //constructors
    public CD(){}
    
    public CD(int noc){
        numOfCd = noc;
    }

    /*
    * get the number of CDs
    * @return numOfCd - number of cds
    */
    public int getNumOfCd(){
        return numOfCd;
    }

    /*
    * sets the number of CDs
    * @parameter noc - number of Cds
    */
    public void setNumOfCd(int noc){
        if( noc >= 0){
            this.numOfCd = noc;
        }else{
            System.out.println("Number is less than zero.");
        }
    }

    /*
    * gets total cost of cds
    * @parameter noc - number of Cds
    * @return totalCdCost - total money spent on CDs
    */
    public double getTotalCdCost(int noc){
        double totalCdCost = noc * 30.00;
        return totalCdCost;
    }

    @Override
    public String toString(){
        return "Number of CDs Purchased: " + numOfCd + "\nTotal: " + getTotalCdCost(numOfCd);

    }
}
