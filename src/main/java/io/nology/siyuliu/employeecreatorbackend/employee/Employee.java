package io.nology.siyuliu.employeecreatorbackend.employee;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employees")
public class Employee {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Getter
    @Setter
    private String firstName;

    @Column
    @Getter
    @Setter
    private String middleName;

    @Column
    @Getter
    @Setter
    private String lastName;

    @Column
    @Getter
    @Setter
    private String email;
    
    @Column
    @Getter
    @Setter
    private String phone;

    @Column
    @Getter
    @Setter
    private String address;

    @Column
    @Getter
    @Setter
    private String type;

    @Column
    @Getter
    @Setter
    private String startDateDay;

    @Column
    @Getter
    @Setter
    private String startDateMonth;

    @Column
    @Getter
    @Setter
    private String startDateYear;

    @Column
    @Getter
    @Setter
    private String finishDateDay;

    @Column
    @Getter
    @Setter
    private String finishDateMonth;

    @Column
    @Getter
    @Setter
    private String finishDateYear;

    @Column
    @Getter
    @Setter
    private String onGoing;

    @Column
    @Getter
    @Setter
    private String basis;

    @Column
    @Getter
    @Setter
    private String hoursPerWeek;

public Employee() {}

public Employee(Long id, String firstName, String middleName,String lastName, String email, String phone, String address, String type,
        String startDateDay, String startDateMonth, String startDateYear, String finishDateDay, String finishDateMonth,
        String finishDateYear, String onGoing, String basis, String hoursPerWeek) {
    this.id = id;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.type = type;
    this.startDateDay = startDateDay;
    this.startDateMonth = startDateMonth;
    this.startDateYear = startDateYear;
    this.finishDateDay = finishDateDay;
    this.finishDateMonth = finishDateMonth;
    this.finishDateYear = finishDateYear;
    this.onGoing = onGoing;
    this.basis = basis;
    this.hoursPerWeek = hoursPerWeek;
}
	   
}
