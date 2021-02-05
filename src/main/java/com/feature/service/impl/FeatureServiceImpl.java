package com.feature.service.impl;

import com.feature.dto.FeatureDTO;
import com.feature.model.Feature;
import com.feature.repository.FeatureRepository;
import com.feature.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Handle all services related to Feature Info
 *
 * @author AnilReddy
 */
@Service
public class FeatureServiceImpl implements FeatureService {

    @Autowired
    private FeatureRepository featureRepository;

    @Override
    public void addFeature(Feature feature) {
        Feature checkAlreadyExist = featureRepository.getFeatureByEmailAndFeatureName(feature.getEmail(), feature.getFeatureName());
        if (checkAlreadyExist != null) {
            checkAlreadyExist.setEnable(feature.isEnable());
            featureRepository.save(checkAlreadyExist);
        } else {
            featureRepository.save(feature);
        }
    }

    @Override
    public FeatureDTO getFeatureByEmailAndFeatureName(String email, String featureName) {
        Feature feature = featureRepository.getFeatureByEmailAndFeatureName(email, featureName);
        FeatureDTO featureDTO = new FeatureDTO();
        if (feature != null) {
            featureDTO.setCanAccess(feature.isEnable());
        }

        return featureDTO;
    }
}
