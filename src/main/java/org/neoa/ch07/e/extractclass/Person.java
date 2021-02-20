package org.neoa.ch07.e.extractclass;

public class Person {
    private String name;
    private TelephoneNumber telephoneNumber;

    public Person() {
        this.telephoneNumber = new TelephoneNumber();
    }

    public String getOfficeAreaCode() {
        return telephoneNumber.getOfficeAreaCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.telephoneNumber.setOfficeAreaCode(officeAreaCode);
    }

    public String getOfficeNumber() {
        return this.telephoneNumber.getOfficeNumber();
    }

    public void setOfficeNumber(String officeNumber) {
        this.telephoneNumber.setOfficeNumber(officeNumber);
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber.setTelephoneNumber(telephoneNumber);
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber.getTelephoneNumber();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
