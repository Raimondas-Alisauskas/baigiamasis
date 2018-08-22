package operators;

import rentalOperations.ClientOps;


public class Client extends ClientOps {

    private String name;

    private String surname;

    private int age;

    private boolean driverLicense;

    private int creditCardNo;

    private boolean creditCardValidity;

    private int clientId;

    private  static int counter = 0;

    public void create (){
        new Client();
    }
    public Client (){
        counter++;
        setName("Andrius");
        setSurname("Vaitiekunas");
        setAge(29);
        setDriverLicense(true);
        setCreditCardNo(12345678);
        setCreditCardValidity(true);
        System.out.println("labadiena");



        this.clientId=counter;
    }

    public Client (String name, String surname, int age, boolean driverLicense, int creditCardNo, boolean creditCardValidity){
        counter++;
        setName(name);
        setSurname(surname);
        setAge(age);
        setDriverLicense(driverLicense);
        setCreditCardNo(creditCardNo);
        setCreditCardValidity(creditCardValidity);
        this.clientId=counter;
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

    public boolean isDriverLicense(boolean b) {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId() {
        this.clientId = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
