package edu.wsb.students.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Currency;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "rentDate")
    private LocalDateTime rentDate;

    @Column(name = "price")
    private Currency price;

    @ManyToOne
    @JoinColumn(name = "car_id", unique = true, referencedColumnName = "id")
    private Car rentalCar;

    @ManyToOne
    @JoinColumn(name = "customer_id", unique = true, referencedColumnName = "id")
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDateTime rentDate) {
        this.rentDate = rentDate;
    }

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }

    public Car getRentalCar() {
        return rentalCar;
    }

    public void setRentalCar(Car rentalCar) {
        this.rentalCar = rentalCar;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
