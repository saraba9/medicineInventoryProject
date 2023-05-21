public class MedicineDoesNotExistException extends Exception {
    public MedicineDoesNotExistException(String theName){
        System.out.println("Error:"+theName+" does not exist in the inventory");
    }
}
