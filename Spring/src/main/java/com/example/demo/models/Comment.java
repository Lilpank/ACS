package com.example.demo.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Film film;

    @OneToOne
    private Rating rating;

    private String comment;

    public Comment(User user, String comment, Rating rating, Film film) {
        this.film = film;
        this.user = user;
        this.comment = comment;
        this.rating = rating;
    }
}
