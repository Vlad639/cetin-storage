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
@Table(name = "methodic_redactions")
public class MethodicRedaction {

    @Id
    @Column(name = "redaction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "methodicRedaction", cascade = CascadeType.ALL)
    private List<Coefficient> coefficients;
}
