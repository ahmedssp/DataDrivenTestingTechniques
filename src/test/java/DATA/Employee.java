package DATA;

import com.github.javafaker.Faker;

public class Employee   {
//    Faker faker_data= new Faker();
    private String ID;
    private String F_NAME;
    private String L_NAME;
    private String EMAIL;
    private String ADDRESS;
    private String PHONE_NUMBER;
    private String Password;
    public String getID() {return ID;}

    public void setID(String ID) {this.ID = ID;}

    public String getF_NAME() {
        return F_NAME;
    }

    public void setF_NAME(String f_NAME) {F_NAME = f_NAME;}

    public String getL_NAME() {
        return L_NAME;
    }

    public void setL_NAME(String l_NAME) {
        L_NAME = l_NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


}
