package io.nology.siyuliu.employeecreatorbackend.employee;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

public class EmployeeCreateDTO {
   
    @Getter
    @Setter
    @NotBlank
    private String firstName;

    @Getter
    @Setter
    private String middleName;
    
    @Getter
    @Setter
    @NotBlank
    private String lastName;

    @Getter
    @Setter
    @NotBlank
    private String email;
    
    @Getter
    @Setter
    @NotBlank
    private String phone;

    @Getter
    @Setter
    @NotBlank
    private String address;

    @Getter
    @Setter
    @NotBlank
    private String type;

    @Getter
    @Setter
    @NotBlank
    private String startDateDay;

    @Getter
    @Setter
    @NotBlank
    private String startDateMonth;

    @Getter
    @Setter
    @NotBlank
    private String startDateYear;

    @Getter
    @Setter
    private String finishDateDay;

    @Getter
    @Setter
    private String finishDateMonth;

    @Getter
    @Setter
    private String finishDateYear;

    @Getter
    @Setter
    private String onGoing;

    @Getter
    @Setter
    @NotBlank
    private String basis;
    
    @Getter
    @Setter
    @NotBlank
    private String hoursPerWeek;

}
