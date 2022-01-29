 /**
 * 
 */
package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import java.util.Comparator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nicoleevans
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Jeep implements Comparable<Jeep> {
	private Long modelPK; 
	private JeepModel modelID;
	private String trimLevel;
	private int numDoors;
	private int wheelSize;
	private BigDecimal basePrice;
	
	@JsonIgnore
	public Long getModelPK() {
		return modelPK;
	}

	@Override
	public int compareTo(Jeep that) {
		//@formatter: off
		return Comparator.comparing(Jeep::getModelID)
				.thenComparing(Jeep::getTrimLevel)
				.thenComparing(Jeep::getNumDoors)
				.compare(this, that);
		//@formatter: on
	}
	
}
