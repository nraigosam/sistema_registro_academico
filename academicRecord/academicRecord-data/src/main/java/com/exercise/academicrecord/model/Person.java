package com.exercise.academicrecord.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    public Person(Long id, String name, String lastName, String email, Set<Role> roles) {
        super(id);
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.roles = roles;
    }

    private String name;
    private String lastName;
    private String email;

    @Enumerated(value = EnumType.STRING)
    private Set<Role> roles;

}
