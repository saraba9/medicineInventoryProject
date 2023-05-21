public class Pills extends Medicine{

    int numOfPillsInBox;

    public Pills() {

    }

    public Pills(String medicineName, String companyName, String companyEmail, Double price, int quantity, int expirationYear,
                 Type myType, int numOfPillsInBox) throws InvalidEmailAddressException{
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear, myType);
        setNumOfPillsInBox(numOfPillsInBox);
    }

    //get & set
    public int getNumOfPillsInBox() {
        return numOfPillsInBox;
    }
    public void setNumOfPillsInBox(int numOfPillsInBox) {
        this.numOfPillsInBox = numOfPillsInBox;
    }

    //functions
    @Override
    public String toString() {
        return super.toString()+" pills in box: "+getNumOfPillsInBox();
    }
    @Override
    public double totalInventory() {
        return getNumOfPillsInBox()*getQuantity();
    }
}
