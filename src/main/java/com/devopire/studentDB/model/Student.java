package com.devopire.studentDB.model;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name="student")
public class Student {
    @Id
    private int idstudent;

    private String firstName;

    private String lastName;

    @OneToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @JoinColumn(name = "idstudent")
    @NotFound(action = NotFoundAction.IGNORE)
    public List<Phone> phone;
}
