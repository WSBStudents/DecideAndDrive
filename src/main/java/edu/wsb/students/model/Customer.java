package edu.wsb.students.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name = "document_id")
    private String documentId;

    @Column(name = "document_expiration_date")
    private LocalDate documentExpirationDate;

    @Column(name = "driving_licnce_id")
    private String drivingLicenceId;

    @Column(name = "driving_licence_expiration_date")
    private LocalDate drivingLicenceExpirationDate;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "adress")
    private String adress;

    @Column(name = "phone_number")
    private int phoneNumber;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDrivingLicenceId() {
        return drivingLicenceId;
    }

    public void setDrivingLicenceId(String drivingLicenceId) {
        this.drivingLicenceId = drivingLicenceId;
    }

    public LocalDate getDocumentExpirationDate() {
        return documentExpirationDate;
    }

    public void setDocumentExpirationDate(LocalDate documentExpirationDate) {
        this.documentExpirationDate = documentExpirationDate;
    }

    public LocalDate getDrivingLicenceExpirationDate() {
        return drivingLicenceExpirationDate;
    }

    public void setDrivingLicenceExpirationDate(LocalDate drivingLicenceExpirationDate) {
        //test
        this.drivingLicenceExpirationDate = drivingLicenceExpirationDate;
    }

}
