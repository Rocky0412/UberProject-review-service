package org.example.uberreviewservice.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;


@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp // Hibernate automatically handled
    @Column(nullable = false)
    private Date createAt;
    @UpdateTimestamp
    @Column(nullable = false)
    @LastModifiedDate
    private Date updateAt;
}
