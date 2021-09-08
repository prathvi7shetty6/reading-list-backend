package com.reader.readingList.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;

    @Column(name= "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name= "rating")
    private int rating;

    @OneToOne(fetch= FetchType.EAGER, cascade=CascadeType.ALL, orphanRemoval=true)
    @JoinColumn(name="review_id")
    private Review review;
}
