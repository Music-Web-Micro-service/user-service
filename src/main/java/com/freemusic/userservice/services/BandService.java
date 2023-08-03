package com.freemusic.userservice.services;

import com.freemusic.userservice.models.Band;

import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2023/7/9
 */
public interface BandService {
    List<Band> getAllBands();
    Band getBandById(int bandId);
    Band createBand(Band band);
    Band updateBand(int bandId, Band band);
    void deleteBand(int bandId);
}