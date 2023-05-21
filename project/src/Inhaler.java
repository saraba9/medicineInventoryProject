public class Inhaler extends Medicine{
    int amountOfClick;

    public Inhaler() {

    }
    public Inhaler(String medicineName, String companyName, String companyEmail, Double price, int quantity,
                   int expirationYear, Type myType, int amountOfClick) throws InvalidEmailAddressException{
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear, myType);
        setAmountOfClick(amountOfClick);
    }

    //get & set
    public int getAmountOfClick() {
        return amountOfClick;
    }
    public void setAmountOfClick(int amountOfClick) {
        this.amountOfClick = amountOfClick;
    }

    //functions
    @Override
    public double totalInventory() {
        return getAmountOfClick()*getQuantity();
    }

    @Override
    public String toString() {
        return super.toString()+ " amount of click: "+getAmountOfClick();
    }
}
