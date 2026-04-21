package org.example.uberreviewservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "bookingreview")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String content;
    private  double rating;
    @CreationTimestamp // Hibernate automatically handled
    @Column(nullable = false)
    private Date createAt;
    @UpdateTimestamp
    @Column(nullable = false)
    @LastModifiedDate
    private Date updateAt;
    public Review(String content, double rating) {
        this.content = content;
        this.rating = rating;
    }
}
