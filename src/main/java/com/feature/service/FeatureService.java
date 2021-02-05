package com.feature.service;

import com.feature.dto.FeatureDTO;
import com.feature.model.Feature;

public interface FeatureService {
    /**
     * Save Feature Access Info
     *
     * @RequestBody feature
     * @return
     */
    void addFeature(Feature feature);

    /**
     * Retrieve Feature Access Info
     *
     * @param email
     * @param featureName
     * @return FeatureDTO
     */
    FeatureDTO getFeatureByEmailAndFeatureName(String email, String featureName);
}
