package org.example.carselect.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "person")
@Table(name = "person")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@SequenceGenerator(name = "personSeq", sequenceName = "personSeq")
public class Person {
    @Id
    @GeneratedValue(generator = "personSeq")
    private Long id;
    @Column(name = "name", columnDefinition = "VARCHAR2(20)", nullable = false)
    private String name;
    @Column(name = "family", columnDefinition = "VARCHAR2(20)", nullable = false)
    private String family;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personCar")
    private Car personCar;
}
