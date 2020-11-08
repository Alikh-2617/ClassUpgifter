public class Patients {
    private String name ;
    private String sjukdom ;


    public Patients(String name, String sjuk) {
        this.name = name;
        this.sjukdom = sjuk;
    }

    void taMedicin (Medicin medicin) {
        if (medicin.getHandling().equals(sjukdom)){
            sjukdom = null;
        }
    }


    public String getname(){
        return name;
    }


    public String getsjukdom() {
        return sjukdom;
    }
    Boolean sjuk(){
        return sjukdom != null;
    }
}
