package firmrummager.yakubus.pl.firmrummager;

/**
 * Jakub Garbacz
 * Model wspólny model danych
 */
public class dataModel {
    private String inputId;
    private String typeId;
    private String nip;
    private String regon;
    private String krs;

    /*************************
     * Getters and Setters
     *************************/
    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getKrs() {
        return krs;
    }

    public void setKrs(String krs) {
        this.krs = krs;
    }
    /******************
    * toString
     ********************/
    @Override
    public String toString() {
        return "dataModel{" +
                "inputId='" + inputId + '\'' +
                ", typeId='" + typeId + '\'' +
                ", nip='" + nip + '\'' +
                ", regon='" + regon + '\'' +
                ", krs='" + krs + '\'' +
                '}';
    }
}
