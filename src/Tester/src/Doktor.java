public class Doktor {
    private String name;

    public Doktor(String name){
        this.name = name;
    }
    public String testaPatient (Patients patients){
        if(patients.sjuk()){
            System.out.println("Dr. " + name + " tested patient " + patients.getName() + " positive for " + patients.getSickness());
            return patients.getSickness();
        }
        else {
            System.out.println("Dr. " + name + " tested patient " + patients.getName() + ", patient is healthy.");
            return null;
        }
    }
    void behandlingPatient (Patients patients ,Medicin medicin){
        System.out.println("Dr. " + name + " treated patient " + patients.getName() + " for " + medicin.getHandling());
        patients.taMedicin(medicin);
        if (patients.sjuk()){
            System.out.println(patients.getName() + " is still sick ");
        }
        else {
            System.out.println(patients.getName() + " is now healthy ");
        }
    }
    public Medicin corektMedicin (String sjukom ){
        Medicin medicin = new Medicin(sjukom);
        System.out.println("Dr. " + name + " fetched medication for " + medicin.getHandling());
        return medicin;
    }
}
