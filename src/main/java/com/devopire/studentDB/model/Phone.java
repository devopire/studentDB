package com.devopire.studentDB.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Phone {
    @Id
    private long idphone;
    private String phone_number;
    private String country;
    private long idstudent;

    }
