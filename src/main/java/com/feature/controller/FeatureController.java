package com.feature.controller;

import com.feature.dto.FeatureDTO;
import com.feature.model.Feature;
import com.feature.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Manage rest api calls related to feature
 *
 * @author AnilReddy
 *
 */
@RestController
@RequestMapping(path="/feature")
public class FeatureController {

	@Autowired
	private FeatureService featureService;

	/**
	 * Save Feature Access Info
	 *
	 * @RequestBody feature
	 * @return
	 */
	@PostMapping
	public void addFeature(@RequestBody Feature feature) {
		featureService.addFeature(feature);
	}

	/**
	 * Retrieve Feature Access
	 *
	 * @param email
	 * @param featureName
	 * @return FeatureDTO
	 */
	@GetMapping
	public FeatureDTO getFeatureByEmailAndFeatureName(@RequestParam String email, @RequestParam String featureName) {
		return featureService.getFeatureByEmailAndFeatureName(email, featureName);
	}
}
