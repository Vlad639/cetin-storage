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
@Table(name = "history")
public class History {

    @Id
    @Column(name = "history_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "c")
    private Integer c;

    @Column(name = "e")
    private Integer e;

    @Column(name = "t")
    private Integer t;

    @Column(name = "i")
    private Integer i;

    @Column(name = "n")
    private Integer n;

    @Column(name = "calc_cost")
    private Double calcCost;

    @Column(name = "real_cost")
    private Double realCost;

    @Column(name = "error_cost")
    private Double errorCost;

    @Column(name = "calc_time")
    private Double calcTime;

    @Column(name = "real_time")
    private Double realTime;

    @Column(name = "error_time")
    private Double errorTime;

    @Column(name = "redaction")
    private Long redaction;

    @OneToMany(mappedBy = "history", cascade = CascadeType.ALL)
    private List<UsersCalc> calcs;

}
