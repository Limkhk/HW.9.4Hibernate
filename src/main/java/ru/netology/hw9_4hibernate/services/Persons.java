package ru.netology.hw9_4hibernate.services;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String surname;

    @Column(nullable = false, length = 4)
    private int age;

    @Column(nullable = true, length = 15)
    private String phoneNumber;

    @Column(nullable = true, length = 50)
    private String cityOfLiving;


}
