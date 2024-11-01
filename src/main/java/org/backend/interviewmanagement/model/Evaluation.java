package org.backend.interviewmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "evaluation")
public class Evaluation {
    @Id
    private Integer id;
    

}
