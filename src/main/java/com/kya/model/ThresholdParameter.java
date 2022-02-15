package com.kya.model;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="threshold_parameter",schema = "master")
public class ThresholdParameter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "activity_id")
	private Activity activity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subactivity_id")
	private SubActivity subActivity;
	
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private int unit;
	
	@Column(nullable = false)
	private String val;
	
	@Column(nullable = false)
	private String data_type;
	
	@Column(nullable = false)
	private String rendering_type;
	
	@Column(nullable = true)
	private String description;
	
	@Column(nullable = true)
	private String regex;
	
	@Column(nullable = false)
	private boolean is_active;
	
	@Column(nullable = false)
	private boolean is_deleted;
	
	@Column(nullable = true)
	private Date created_on;
	
	@Column(nullable = true)
	private Date updated_on;
	
	@Column(nullable = true)
	private Long created_by;
	
	@Column(nullable = true)
	private Long updated_by;
	
	
}
