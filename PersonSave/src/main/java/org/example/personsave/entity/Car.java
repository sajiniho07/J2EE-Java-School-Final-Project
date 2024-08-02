package org.example.personsave.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "car")
@Table(name = "car")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@SequenceGenerator(name = "carSeq", sequenceName = "carSeq")
public class Car {
    @Id
    @GeneratedValue(generator = "carSeq")
    private Long id;
    @Column(name = "name", columnDefinition = "VARCHAR2(20)", nullable = false)
    private String model;
    @OneToOne(mappedBy = "personCar")
    private Person person;
}
