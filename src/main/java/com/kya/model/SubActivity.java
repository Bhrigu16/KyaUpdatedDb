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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.kya.model.Activity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="sub_activities",schema ="master")
public class SubActivity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "activityid")
	private Activity activity;
	
	@OneToMany(mappedBy="subActivity",fetch = FetchType.EAGER)
	private List<ThresholdParameter> thresholdParameter=new ArrayList<>();

	@Column
	private String name;
	
	private String description;
	
	@Column(nullable = false)
	private boolean is_active;
	
	@Column(nullable = false)
	private boolean is_deleted;
	
	@Column(nullable = false)
	private Long created_by;
	
	@Column(nullable = false)
	private Date created_on;
	
	@Column(nullable = false)
	private Date updated_on;
	
	//Foreign Key link to user
	@Column(nullable = false)
	private Long updated_by;
	
	
	
	public SubActivity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SubActivity(Integer id, Activity activity, List<ThresholdParameter> thresholdParameter, String name,
			String description, boolean is_active, boolean is_deleted, Long created_by, Date created_on,
			Date updated_on, Long updated_by) {
		super();
		this.id = id;
		this.activity = activity;
		this.thresholdParameter = thresholdParameter;
		this.name = name;
		this.description = description;
		this.is_active = is_active;
		this.is_deleted = is_deleted;
		this.created_by = created_by;
		this.created_on = created_on;
		this.updated_on = updated_on;
		this.updated_by = updated_by;
	}

	
}
