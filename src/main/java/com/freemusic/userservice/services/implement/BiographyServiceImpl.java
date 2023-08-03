package com.freemusic.userservice.services.implement;

import com.freemusic.userservice.models.Biography;
import com.freemusic.userservice.repositories.BiographyRepository;
import com.freemusic.userservice.services.BiographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2023/7/8
 */
@Service
public class BiographyServiceImpl implements BiographyService {
    @Autowired
    BiographyRepository biographyRepository;

    public List<Biography> getAllBiographies() {
        return biographyRepository.findAll();
    }

    public Optional<Biography> getBiographyById(int bioId) {
        return biographyRepository.findById(bioId);
    }

    public Biography saveBiography(Biography biography) {
        return biographyRepository.save(biography);
    }

    public void deleteBiography(int bioId) {
        biographyRepository.deleteById(bioId);
    }
    @Override
    public Biography updateBiography(Biography biography) {
        // Check if the biography with the provided bioId exists in the repository
        if (biographyRepository.existsById(biography.getBioId())) {
            return biographyRepository.save(biography);
        } else {
            // Handle the case when the biography doesn't exist
            throw new RuntimeException("Biography not found with bioId: " + biography.getBioId());
        }
    }
}
