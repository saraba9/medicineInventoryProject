public class MedicineAlreadyExistException extends Exception{
    public MedicineAlreadyExistException(String theName){
        System.out.println("Error:"+theName+" medicine already exist in the inventory");
    }
}
