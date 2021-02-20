package org.neoa.ch07.e.extractclass;

public class Person {
    private String name;
    private String telephoneNumber;

    private TelephoneNumber telephoneNumber_;

    public Person() {
        this.telephoneNumber_ = new TelephoneNumber();
    }

    public String getOfficeAreaCode() {
        return telephoneNumber_.getOfficeAreaCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.telephoneNumber_.setOfficeAreaCode(officeAreaCode);
    }

    public String getOfficeNumber() {
        return this.telephoneNumber_.getOfficeNumber();
    }

    public void setOfficeNumber(String officeNumber) {
        this.telephoneNumber_.setOfficeNumber(officeNumber);
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
