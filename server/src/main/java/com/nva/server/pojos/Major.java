package com.nva.server.pojos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "majors")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Falcuty falcuty;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updatedAt;

//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(name = "majors_combinations", joinColumns = {
//            @JoinColumn(name = "major_id", referencedColumnName = "id")
//    }, inverseJoinColumns = {
//            @JoinColumn(name = "combination_id", referencedColumnName = "id")
//    })
//    @JsonManagedReference
//    private Set<Combination> groups;
}
