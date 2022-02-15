package com.kya.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.kya.model.SubActivity;
import com.kya.model.ThresholdParameter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="activities",schema = "master")
public class Activity {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	
	@OneToMany(mappedBy="activity")
	private List<SubActivity> subactivity=new ArrayList<>();
	
	@OneToMany(mappedBy="activity")
	private List<ThresholdParameter> thresholdParameter=new ArrayList<>();
	
	@Column(name="name",nullable = false)
	private String name;
		
	@Column(nullable = false)
	private Integer created_by;
	
	@Column(nullable = false)
	private Date created_on;
	
	@Column(nullable = false)
	private boolean is_active;
	
	@Column(nullable = false)
	private boolean is_deleted;

	private String description;
	
	@Column(nullable = false)
	private Integer updated_by;
	
	@Column(nullable = false)
	private Date updated_on;

	
	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Activity(Integer id, List<SubActivity> subactivity, List<ThresholdParameter> thresholdParameter, String name,
			Integer created_by, Date created_on, boolean is_active, boolean is_deleted, String description,
			Integer updated_by, Date updated_on) {
		super();
		this.id = id;
		this.subactivity = subactivity;
		this.thresholdParameter = thresholdParameter;
		this.name = name;
		this.created_by = created_by;
		this.created_on = created_on;
		this.is_active = is_active;
		this.is_deleted = is_deleted;
		this.description = description;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}


	

}
