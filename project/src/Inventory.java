import java.util.ArrayList;

//class contains array list of all medicines
public class Inventory {

    private ArrayList<Medicine> medicineArrayList = new ArrayList<>();

    //adds the new medicine to the arraylist
    //if the medicine already exist trows a new MedicineAlreadyExistException
    public void addMedicine(Medicine m) throws MedicineAlreadyExistException {
        for (Medicine medicine : medicineArrayList) {
            if (medicine.getMedicineName().equals(m.getMedicineName())) {
                throw new MedicineAlreadyExistException(m.getMedicineName());
            }
        }
        medicineArrayList.add(m);
    }

    //returns the medicine according to its name
    //if the medicine does not exist trows a new MedicineDoesNotExistException
    public Medicine searchMedicineByName(String theName) throws MedicineDoesNotExistException {
        for (Medicine medicine: medicineArrayList) {
            if ((medicine.getMedicineName()).equalsIgnoreCase(theName))
            {
                System.out.println("The total inventory: "+medicine.totalInventory());
                return medicine;
            }
        }
        throw new MedicineDoesNotExistException(theName);
    }

    //returns an array list of medicines by its type
    public ArrayList<Medicine> searchMedicineByType(Type type){
        ArrayList<Medicine> medicinesByTape = new ArrayList<>();
        for (Medicine medicine: medicineArrayList) {
            if(medicine.getMyType()==type)
                medicinesByTape.add(medicine);
        }
        return medicinesByTape;
    }

    //returns an array list of all medicines in stock
    public ArrayList<Medicine> getMedicinesInStock() {
        ArrayList<Medicine> medicinesInStuck = new ArrayList<>();
        for (Medicine medicine: medicineArrayList) {
            if(medicine.inStock())
                medicinesInStuck.add(medicine);
        }
        return medicinesInStuck;
    }
}
