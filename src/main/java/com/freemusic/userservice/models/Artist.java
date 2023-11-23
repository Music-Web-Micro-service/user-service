package com.freemusic.userservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "artists")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int artistId;

    private int userId;

    private int imageId;

    @OneToMany(mappedBy = "artist", fetch = FetchType.EAGER)
    private List<Biography> biographiesList;
    
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "bandId", referencedColumnName = "bandId")
    private Band band;

    private Date createdAt;

    private Date updateAt;
}
