package org.backend.interviewmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "location")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Id
    private Integer id;
    private String name;
    private String created_by;
    private String updated_by;
}
