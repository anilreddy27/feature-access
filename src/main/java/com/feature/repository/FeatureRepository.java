package com.feature.repository;

import com.feature.model.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<Feature, Integer> {

    Feature getFeatureByEmailAndFeatureName(String email, String featureName);
}
