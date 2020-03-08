package edu.wsb.students.model;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("Karol Kowalski");
        customer1.setDocumentId("24563476");
        customer1.setDrivingLicenceId("DR123457");
        System.out.println(customer1.getName());
        System.out.println(customer1.getDocumentId());
        System.out.println(customer1.getDrivingLicenceId());

        Customer customer2 = new Customer();

    }

}
