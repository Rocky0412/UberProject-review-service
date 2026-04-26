package org.example.uberreviewservice.model.ManyToMany;


import jakarta.persistence.*;
import lombok.*;
import org.example.uberreviewservice.model.BaseModel;

import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Students extends BaseModel {
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = true)
    private long rollNumber;
    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))

    Set<Course> courses = new HashSet<>();
}
