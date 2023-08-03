package com.freemusic.userservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="biographies")
public class Biography {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bioId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "artistId", referencedColumnName = "artistId")
    private Artist artist;

    private String content;

    private Date createdAt;

    private Date updatedAt;
}
