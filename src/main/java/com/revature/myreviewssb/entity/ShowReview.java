package com.revature.myreviewssb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ShowReviews")
@Entity
public class ShowReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String ratingDesc;
    private double rating;
    private String imgLink;
    private String lastUpdate;

    // make a constructor that excludes the id

    public ShowReview(String name, String ratingDesc, double rating, String imgLink, String lastUpdate){
        this.name = name;
        this.ratingDesc = ratingDesc;
        this.rating = rating;
        this.imgLink = imgLink;
        this.lastUpdate = lastUpdate;
    }
}
