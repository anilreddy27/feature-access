package com.feature.model;

import com.sun.istack.NotNull;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feature {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@NonNull
	private String featureName;

	@NotNull
	private String email;

	private boolean enable;

	public Integer getId() {
		return id;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}
}
