package ru.vogu35.cetin.storage.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "coefficients_values")
public class CoefficientsValue {

    @Id
    @Column(name = "value_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "coefficient")
    @ManyToOne(fetch = FetchType.LAZY)
    private Coefficient coefficient;

    @Column(name = "description")
    private String description;

    @Column(name = "value")
    private Double value;
}
