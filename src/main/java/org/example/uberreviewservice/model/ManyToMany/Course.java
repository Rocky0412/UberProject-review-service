package org.example.uberreviewservice.model.ManyToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;
import org.example.uberreviewservice.model.BaseModel;

import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course extends BaseModel {
    private String courseName;
    private String courseDescription;
    @ManyToMany(mappedBy = "courses")
    Set<Students> students = new HashSet<>();
}
