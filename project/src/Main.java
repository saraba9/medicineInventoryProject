import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Inventory myInventory=new Inventory();

        //enters valid values
        try {
            Pills p1 = new Pills("Optalgin", "cts", "ctsMedicine@cts.org.il",
                    26.9, 30, 2026, Type.PILLS, 25);
            Pills p2 = new Pills("ACAMOL", "cts", "ctsMedicine@cts.org.il",
                    21.0, 35, 2028, Type.PILLS, 60);
            Pills p3 = new Pills("ZINNAT", "rekah", "rekah123@cts.org.il",
                    21.0, 35, 2028, Type.PILLS, 60);

            Syrup s1 = new Syrup("ACAMOLI", "ctz", "ctsMedicine@cts.org.il", 25.9,
                    90, 2030, Type.SYRUP, 100);
            Syrup s2 = new Syrup("AVILAC", "teva", "TEVA@walla.co.il", 50.3,
                    90, 2030, Type.SYRUP, 100);
            Syrup s3 = new Syrup("VITAMOX", "teva", "TEVA@walla.co.il", 30.60,
                    90, 2030, Type.SYRUP, 100);

            Inhaler i1 = new Inhaler("TURBUHALER", "supherb", "supherb@sub.org", 56.0,
                    12, 2023, Type.INHALER, 80);
            Inhaler i2 = new Inhaler("BECONASE", "rekah", "rekah123@walla.co.il", 25.0,
                    12, 2023, Type.INHALER, 90);
            Inhaler i3 = new Inhaler("VENTOLIN", "supherb", "supherb@sub.org", 30.0,
                    12, 2023, Type.INHALER, 50);

            myInventory.addMedicine(p1);
            myInventory.addMedicine(p2);
            myInventory.addMedicine(p3);
            myInventory.addMedicine(s1);
            myInventory.addMedicine(s2);
            myInventory.addMedicine(s3);
            myInventory.addMedicine(i1);
            myInventory.addMedicine(i2);
            myInventory.addMedicine(i3);

        }catch (MedicineAlreadyExistException maee){
            maee.printStackTrace();
        }catch (InvalidEmailAddressException ieae){
            ieae.printStackTrace();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //search for a specific medicine by name
        Medicine medicine=null;
        try{
            medicine=myInventory.searchMedicineByName("VENTOLIN");
        }catch (MedicineDoesNotExistException mdee){
            System.out.println(mdee.getMessage());
        }

        //search for all medicine by type
        ArrayList<Medicine> medicines= myInventory.searchMedicineByType(Type.PILLS);

       // prints all medicines in stock
        ArrayList<Medicine> medicinesInStock =myInventory.getMedicinesInStock();
        for (Medicine m: medicinesInStock) {
            System.out.println(m.toString());
        }

        //try to add an existing medicine
        try{
            myInventory.addMedicine(medicine);
        }catch (MedicineAlreadyExistException maee){
            maee.printStackTrace();
        }

        //search for a non-existing medicine
        try{
            myInventory.searchMedicineByName("DEXAMOL");
        }catch (MedicineDoesNotExistException mdee){
            mdee.printStackTrace();
        }

        //try to add medicine with in-correct email
        try {
            Pills p4 = new Pills("PRENATAL", "cts", "ctsMedicine@",
                    26.9, 30, 2026, Type.PILLS, 25);
            myInventory.addMedicine(p4);
        }catch (InvalidEmailAddressException ieae){
            ieae.printStackTrace();
        }catch (Exception e){
             e.printStackTrace();
        }
    }
}