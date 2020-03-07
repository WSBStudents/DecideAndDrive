package edu.wsb.students.model;

import java.time.LocalDateTime;
import java.util.Currency;

public class Car {

    private int id;
    private String brand;
    private String model;
    private int hp;
    private String capacity;
    private int prodYear;
    private String VIN;
    private String insurance;
    private LocalDateTime insuraceDate;
    private String technicalInspection;
    private Currency priceMinute;
    private Currency priceDay;
    private Currency priceMonth;
    private String rate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public LocalDateTime getInsuraceDate() {
        return insuraceDate;
    }

    public void setInsuraceDate(LocalDateTime insuraceDate) {
        this.insuraceDate = insuraceDate;
    }

    public String getTechnicalInspection() {
        return technicalInspection;
    }

    public void setTechnicalInspection(String technicalInspection) {
        this.technicalInspection = technicalInspection;
    }

    public Currency getPriceMinute() {
        return priceMinute;
    }

    public void setPriceMinute(Currency priceMinute) {
        this.priceMinute = priceMinute;
    }

    public Currency getPriceDay() {
        return priceDay;
    }

    public void setPriceDay(Currency priceDay) {
        this.priceDay = priceDay;
    }

    public Currency getPriceMonth() {
        return priceMonth;
    }

    public void setPriceMonth(Currency priceMonth) {
        this.priceMonth = priceMonth;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
