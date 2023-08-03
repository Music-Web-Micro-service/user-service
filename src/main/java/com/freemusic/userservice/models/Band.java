package com.freemusic.userservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2023/7/9
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="bands")
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int bandId;
    @OneToMany(mappedBy = "band", fetch = FetchType.EAGER)
    private List<Artist> artistList;
}
