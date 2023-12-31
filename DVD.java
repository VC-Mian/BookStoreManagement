/*
* The class DVD takes the number of dvds and calculates the total cost of them. This will be used in the BookStore class to make a purchase by a member.
*   @author Vanessa Miranda-Calleja
*/

public class DVD
{
   //stores the number of DVDs in variable
    private int numOfDvd = 0;

    //constructors
    public DVD(){}

    public DVD(int nod){
        numOfDvd = nod;
    }

    /*
    * gets the number of Dvds
    * @return numOfDvd - number of Dvds
    */
    public int getNumOfDvd(){
        return numOfDvd;
    }

    /*
    * sets the number of Dvds
    * @parameter nod - number of Dvds
    */
    public void setNumOfDvd(int nod){
        if( nod >= 0){
            this.numOfDvd = nod;
        }else{
            System.out.println("Number is less than zero.");
        }
    }

    /*
    * gets total cost of Dvds
    * @parameter nod - number of DVDs
    * @return totalDvdCost - total money spent on DVDs
    */
    public double getTotalDvdCost(int nod){
        double totalDvdCost = nod * 30.00;
        return totalDvdCost;
    }

    @Override
    public String toString(){
        return "Number of DVDs Purchased: " + numOfDvd + "\nTotal: " + getTotalDvdCost(numOfDvd);

    }
}
