/*
* The RegularMember Class contains information to create new Regular Members, which will be used in the bookStore class.
*  @author Vanessa Miranda-Calleja
*/

public class RegularMember{
    
    private String regMemberName;
    private int regMemberId = 0;
    private int numRegularMembers = 0;

    //constructor
    public RegularMember(String mn, int regId){
        regMemberName = mn;
        regMemberId = regId;
    }

    //getter/setter member name
    public String getRegularMemberName(){
        return regMemberName;
    } 
    public void setRegularMemberName(String mn){
            this.regMemberName = mn;
    }

    //getters/setters ID number
    public int getRegularMemberId(){
        return regMemberId;
    }
    public void setRegularMemberId(int regId){
        this.regMemberId = regId;
    } 

    //getters/setters memNum
    public int getNumRegMembers(){
        return numRegularMembers;
    }
    public void setNumRegularMembers(int regn){
        this.numRegularMembers = regn;
    }

    @Override
    public String toString(){
        return "Members Name: " + regMemberName + "\nMember ID: " + getRegularMemberId();

    }
}
