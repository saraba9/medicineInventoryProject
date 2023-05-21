public abstract class Medicine {

    String medicineName;
    String companyName;
    String companyEmail;
    Double price;
    int quantity;
    int expirationYear;
    Type myType;

    public Medicine(){

    }
    public Medicine(String medicineName, String companyName, String companyEmail, Double price, int quantity,
                    int expirationYear,Type myType)  throws InvalidEmailAddressException {
        setMedicineName(medicineName);
        setCompanyName(companyName);
        setCompanyEmail(companyEmail);
        setPrice(price);
        setQuantity(quantity);
        setExpirationYear(expirationYear);
        setMyType(myType);
    }

    //getters & setters
    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName.toUpperCase();
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public String getCompanyEmail() {
        return companyEmail;
    }
    public void setCompanyEmail(String companyEmail) throws InvalidEmailAddressException {
        if (!companyEmail.contains("@"))
            throw new InvalidEmailAddressException(companyEmail,"no @");
        if (companyEmail.startsWith("@"))
            throw new InvalidEmailAddressException(companyEmail,"email can not start with @");
        if (companyEmail.endsWith("@"))
            throw new InvalidEmailAddressException(companyEmail,"email can not end with @");
        if (!companyEmail.substring(companyEmail.indexOf("@")).contains("."))
            throw new InvalidEmailAddressException(companyEmail,"no . after @");
         this.companyEmail = companyEmail;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getExpirationYear() {
        return expirationYear;
    }
    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }
    public Type getMyType() {
        return myType;
    }
    private void setMyType(Type myType) {
        this.myType = myType;
    }

    //functions
    @Override
    public String toString() {
        return "medicine name: "+getMedicineName()+" company name: "+companyName+
                " company email: "+ getCompanyEmail() +" price: "+getPrice()+" quantity: "+ getQuantity()
                +" expiration year: "+ getExpirationYear() +" type: "+ getMyType();
    }

    //an abstract method to calculate the total inventory for each medicine type
    public abstract double totalInventory();

    //returns true if the quantity > 0 else returns false
    public boolean inStock(){
        if (getQuantity()>0)
            return  true;
        else
            return false;
    }
}
