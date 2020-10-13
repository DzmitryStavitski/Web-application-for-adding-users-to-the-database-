package app.entities;

import java.util.Date;

public class User {
    private String lastName, firstName, middleName;
    private Date birthday;
    private String passportSeries;
    private String passportID;
    private String issuedBy;
    private Date dateOfIssue;
    private String identificationNumber;
    private String placeOfBirth;
    private String cityOfResidence;
    private String residenceAddress;
    private String homeNumber;
    private String personalPhone;
    private String email;
    private String placeOfWork;
    private String position;
    private String placeOfResidence;
    private String familyPosition;
    private String citizenship;
    private String disability;
    private boolean pensionary;
    private String mountIncome;

    public User(String lastName, String firstName, String middleName, Date birthday, String passportSeries, String passportID,
                String issuedBy, Date dateOfIssue, String identificationNumber, String placeOfBirth,
                String cityOfResidence, String residenceAddress, String homeNumber, String personalPhone,
                String email, String placeOfWork, String position, String placeOfResidence, String familyPosition,
                String citizenship, String disability, boolean pensionary, String mountIncome) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthday = birthday;
        this.passportSeries = passportSeries;
        this.passportID = passportID;
        this.issuedBy = issuedBy;
        this.dateOfIssue = dateOfIssue;
        this.identificationNumber = identificationNumber;
        this.placeOfBirth = placeOfBirth;
        this.cityOfResidence = cityOfResidence;
        this.residenceAddress = residenceAddress;
        this.homeNumber = homeNumber;
        this.personalPhone = personalPhone;
        this.email = email;
        this.placeOfWork = placeOfWork;
        this.position = position;
        this.placeOfResidence = placeOfResidence;
        this.familyPosition = familyPosition;
        this.citizenship = citizenship;
        this.disability = disability;
        this.pensionary = pensionary;
        this.mountIncome = mountIncome;


    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public String getPassportID() {
        return passportID;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getPersonalPhone() {
        return personalPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public String getPosition() {
        return position;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public String getFamilyPosition() {
        return familyPosition;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public String getDisability() {
        return disability;
    }

    public boolean isPensionary() {
        return pensionary;
    }

    public String getMountIncome() {
        return mountIncome;
    }
}
