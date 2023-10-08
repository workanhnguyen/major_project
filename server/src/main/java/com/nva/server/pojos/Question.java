package com.nva.server.pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "questions")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @NotBlank(message = "Không được bỏ trống")
    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    private Survey survey;

    private Date createdAt;

    private Date updatedAt;

    @OneToMany
    @JsonManagedReference
    private Set<Option> options;

    @Transient
    @JsonIgnore
    private String listOptions;

    @ManyToOne(cascade = CascadeType.ALL)
    private Holland holland;
}
