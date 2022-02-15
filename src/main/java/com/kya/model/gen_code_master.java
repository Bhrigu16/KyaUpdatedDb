package com.kya.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="gen_code_master",schema = "master")
public class gen_code_master {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String abbr;
	
	@Column(nullable = false)
	private String val;
	
	@Column(nullable = false)
	private String parent_grp;
	
	@Column(nullable = false)
	private boolean is_active;
	
	@Column(nullable = false)
	private boolean is_deleted;
	
	@Column(nullable = false)
	private String uuid;
	
	@Column(nullable = true)
	private Integer created_by;
	
	@Column(nullable = true)
	private Date created_on;
	
	@Column(nullable = true)
	private Integer updated_by;
	
	@Column(nullable = true)
	private Date updated_on;

}
