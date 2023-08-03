package com.freemusic.userservice.services;

import com.freemusic.userservice.models.Biography;
import com.freemusic.userservice.repositories.BiographyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface BiographyService {
    List<Biography> getAllBiographies();
    Optional<Biography> getBiographyById(int bioId);
    Biography saveBiography(Biography biography);
    Biography updateBiography(Biography biography);
    void deleteBiography(int bioId);
}
