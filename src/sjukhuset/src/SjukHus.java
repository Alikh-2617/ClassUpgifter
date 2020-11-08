public class SjukHus {
    private Doktor [] doktor ;
    private Patients [] patient;

    public static void main(String[] args) {

        new SjukHus();

    }
    private SjukHus (){
        sjukHusDoktors();
        sjukHusPatient();
        sjukHus();
    }
    private void sjukHusDoktors () {
        doktor = new Doktor [2];
        doktor [0] = new Doktor("Anna");
        doktor [1] = new Doktor("Bertil");
    }
    private void sjukHusPatient (){
        patient = new Patients [10];
        patient [0] = new Patients("Ali", "Atopiska vinterfötter");
        patient [1] = new Patients("Betty", "Blodförgiftning");
        patient [2] = new Patients("Cecilia", null);
        patient [3] = new Patients("Dennis", "Diskbråck");
        patient [4] = new Patients("Eschwar", "Epikondylit");
        patient [5] = new Patients("Fadel", "Förkylning");
        patient [6] = new Patients("Gunnar", "Gallsten");
        patient [7] = new Patients("Helena",null);
        patient [8] = new Patients("Isabel", "Insomni");
        patient [9] = new Patients("Jinghua", "Järnbrist");
    }

    private void sjukHus () {
        tester(doktor[0]);
        doktor[1].behandlingPatient(patient[0],doktor[0].corektMedicin("Atopiska vinterfötter") );
        doktor[0].behandlingPatient(patient[1],doktor[1].corektMedicin("Atopiska vinterfötter"));
        doktor[1].behandlingPatient(patient[4],doktor[0].corektMedicin("Epikondylit"));
        doktor[0].behandlingPatient(patient[5],doktor[1].corektMedicin("Förkylning"));
        doktor[1].behandlingPatient(patient[7],doktor[0].corektMedicin("Gallsten"));
        doktor[0].behandlingPatient(patient[7],doktor[1].corektMedicin("Halsfluss"));
        doktor[1].behandlingPatient(patient[9],doktor[0].corektMedicin("Järnbrist"));
        tester(doktor[1]);
        doktor[1].behandlingPatient(patient[1],doktor[0].corektMedicin("Blodförgiftning"));
        doktor[0].behandlingPatient(patient[3],doktor[1].corektMedicin("Diskbråck"));
        doktor[1].behandlingPatient(patient[6],doktor[0].corektMedicin("Gallsten"));
        doktor[0].behandlingPatient(patient[8],doktor[1].corektMedicin("Insomni"));
        tester(doktor[0]);
    }
    private void tester (Doktor doktor){
        for (Patients item : patient){
            doktor.testaPatient(item);
        }
    }
}
