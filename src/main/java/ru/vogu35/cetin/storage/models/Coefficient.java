package ru.vogu35.cetin.storage.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "coefficients")
public class Coefficient {

    @Id
    @Column(name = "coeff_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "explanation")
    private String explanation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "methodic")
    private MethodicRedaction methodicRedaction;

    @OneToMany(mappedBy = "coefficient", cascade = CascadeType.ALL)
    private List<CoefficientsValue> values;

}
