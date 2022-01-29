/**
 * 
 */
package com.promineotech.jeep.entity;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/**
 * @author nicoleevans
 *
 */
@Data
@Builder
public class Option {

	private Long optionPK;
	private String OptionId;
	private OptionType category;
	private String manufacturer;
	private String name;
	private BigDecimal price;
}
