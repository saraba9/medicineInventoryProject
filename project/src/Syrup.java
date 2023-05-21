public class Syrup extends Medicine{

    double bottleContent;

    public Syrup() {

    }

    public Syrup(String medicineName, String companyName, String companyEmail, Double price, int quantity, int expirationYear,
                 Type myType, double bottleContent) throws InvalidEmailAddressException{
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear, myType);
        setBottleContent(bottleContent);
    }

    //set & get
    public double getBottleContent() {
        return bottleContent;
    }
    public void setBottleContent(double bottleContent) {
        this.bottleContent = bottleContent;
    }

    //functions
    @Override
    public double totalInventory() {
        return getQuantity()*getBottleContent();
    }
    @Override
    public String toString() {
        return super.toString()+" bottle content: "+ getBottleContent();
    }
}
