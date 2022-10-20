package com.sca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.sca.entity.User.ValidationGroup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "EmployeeTable")


public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String empId;
	@Column(name = "name")
	@NotEmpty(message = "The above field must not be blank.")
	@Size(min = 2, max= 20,  message   = "user firstname should have at least 2 characters")
    private String name;
	
	@Column(name = "designation")
	@NotEmpty(message = "The above field must not be blank.")
	@Size(min = 2, max= 20,  message   = "user firstname should have at least 2 characters")
    private String designation;
	
	@Max(groups={ValidationGroup.class}, value=(long) Double.MAX_VALUE, message="some key or default message")
    @Min(groups={ValidationGroup.class}, value=(long) 1D, message="some key or default message")
	@NotNull(message = "The above field must not be blank.")
	@Column(name = "salary")
	private double salary;
	

}
