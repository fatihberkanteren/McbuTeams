
package ProjectGUI;

public class Kullanicilar {
    private String name;
    private String lastName;
    private String userName;
    private String password;
    private int tcNo;
    private int telNumber;
    private String eMail;
    private String adress;
    private String userType;

    public Kullanicilar() {
        
    }
    
    public Kullanicilar(String name, String lastName, String userName, String password, int tcNo, int telNumber, String eMail, String adress, String userType) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.tcNo = tcNo;
        this.telNumber = telNumber;
        this.eMail = eMail;
        this.adress = adress;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTcNo() {
        return tcNo;
    }

    public void setTcNo(int tcNo) {
        this.tcNo = tcNo;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    
    
    
}
