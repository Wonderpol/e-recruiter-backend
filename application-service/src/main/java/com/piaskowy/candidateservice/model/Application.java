package com.piaskowy.candidateservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String cvUrl;
    private String candidateReferenceNumber;
    private Long offerId;
    private Instant sentApplicationTime;

}
