package com.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Builder;
import lombok.Data;

@Embeddable
@lombok.Getter
@lombok.Setter
@Data
@Builder
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

@AttributeOverrides({
	 @AttributeOverride(
             name = "city",
             column = @Column(name = "s_city")
     ),
	 
	 @AttributeOverride(
             name = "state",
             column = @Column(name = "s_state")
     ),
	 
	 @AttributeOverride(
             name = "country",
             column = @Column(name = "s_country")
     ),
	 
	 @AttributeOverride(
             name = "zipcode",
             column = @Column(name = "s_zipcode")
     ),
})
public class Address {

	private String city;
	private String state;
	private String country;
	private String zipcode;

}
