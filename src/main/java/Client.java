package main.java;

public class Client {

    private String name;

    private String surname;

    private int age;

    private boolean driverLicense;

    private int creditCardNo;

    private boolean creditCardValidity;

    public Client (boolean driverLicense, boolean creditCardValidity){
        setName("Andrius");
        setSurname("Vaitiekunas");
        setAge(29);
        setDriverLicense(driverLicense);
        setCreditCardNo(12345678);
        setCreditCardValidity(creditCardValidity);
    }

    public Client (String name, String surname, int age, boolean driverLicense, int creditCardNo, boolean creditCardValidity){
        setName(name);
        setSurname(surname);
        setAge(age);
        setDriverLicense(driverLicense);
        setCreditCardNo(creditCardNo);
        setCreditCardValidity(creditCardValidity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(int creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public boolean isCreditCardValidity() {
        return creditCardValidity;
    }

    public void setCreditCardValidity(boolean creditCardValidity) {
        this.creditCardValidity = creditCardValidity;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }
}
