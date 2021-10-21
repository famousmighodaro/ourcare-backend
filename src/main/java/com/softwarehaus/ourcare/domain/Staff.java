package com.softwarehaus.ourcare.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Staff {
    private String firstName;
    private String lastName;
    private LocalDate DateOfBirth;
    private Address address;
    private Profession profession;

}
