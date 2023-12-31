/*
* The class Book takes the number of Books and calculates the total cost of them. This will be used in the BookStore class to make a purchase by a member.
*   @author Vanessa Miranda-Calleja
*/

public class Book
{
    //stores number of books in variable
    private int numOfBook = 0;

    //constructors
    public Book(){}
    
    public Book(int nob){
        numOfBook = nob;
    }

    /*
    * gets the number of books
    * @return numOfBook - number of books
    */
    public int getNumOfBook(){
        return numOfBook;
    }

    /*
    * sets the number of Books
    * @parameter nob - number of Books
    */
    public void setNumOfBook(int nob){
        if( nob >= 0){
            this.numOfBook = nob;
        }else{
            System.out.println("Number is less than zero.");
        }
    }

    /*
    * gets total cost of Books
    * @parameter nob - number of books
    * @return totalBookCost - total money spent on books
    */
    public double getTotalBookCost(int nob){
        double totalBookCost = nob * 30.00;
        return totalBookCost;
    }

    @Override
    public String toString(){
        return "Number of Books Purchased: " + numOfBook + "\nTotal: " + getTotalBookCost(numOfBook);
    
    }
}
