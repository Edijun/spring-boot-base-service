package id.edijun.springbootbaseservice.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import id.edijun.springbootbaseservice.model.base.AuditModel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "customer")
public class Customer extends AuditModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String salutation;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "mother_name")
	private String motherName;
	
	@Column(name = "birth_place")
	private String birthPlace;
	
	@Column(name = "birth_date")
	private Date birthDate;
	
	private String gender;
	private String religion;
	
	@Column(name = "martial_status")
	private String martialStatus;
	
	@Column(name = "number_dependent")
	private Integer numberDependent;
	
	private String occupation;
	
	@Column(name = "sub_occupation")
	private String subOccupation;
}
