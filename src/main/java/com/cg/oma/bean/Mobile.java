package com.cg.oma.bean;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.cg.oma.entities.Order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter

public class Mobile {
	
	private int mobileId;
	private String mobileName;
	private float mobileCost;
	private LocalDate mfd;
	private String modelNumber;
	private String companyName;
	
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mobileId, String mobileName, float mobileCost, String companyName) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileCost = mobileCost;
		this.companyName = companyName;
	}
	
}