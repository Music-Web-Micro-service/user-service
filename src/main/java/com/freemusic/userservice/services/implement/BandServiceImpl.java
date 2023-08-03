package com.freemusic.userservice.services.implement;

import com.freemusic.userservice.models.Band;
import com.freemusic.userservice.repositories.BandRepository;
import com.freemusic.userservice.services.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandServiceImpl implements BandService {

    private final BandRepository bandRepository;

    @Autowired
    public BandServiceImpl(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }

    @Override
    public List<Band> getAllBands() {
        return bandRepository.findAll();
    }

    @Override
    public Band getBandById(int bandId) {
        return bandRepository.findById(bandId)
                .orElseThrow(() -> new IllegalArgumentException("Band not found with ID: " + bandId));
    }

    @Override
    public Band createBand(Band band) {
        return bandRepository.save(band);
    }

    @Override
    public Band updateBand(int bandId, Band band) {
        Band existingBand = getBandById(bandId);
        existingBand.setArtistList(band.getArtistList());
        return bandRepository.save(existingBand);
    }

    @Override
    public void deleteBand(int bandId) {
        Band band = getBandById(bandId);
        bandRepository.delete(band);
    }
}
