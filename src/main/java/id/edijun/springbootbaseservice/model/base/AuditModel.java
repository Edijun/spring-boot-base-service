package id.edijun.springbootbaseservice.model.base;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class AuditModel {

	@Column(name = "created_by", updatable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;

	@Column(name = "updated_by", updatable = false)
	@UpdateTimestamp
	private LocalDateTime updatedAt;

	@CreatedBy
	@Column(name = "created_by")
	private String createdBy;

	@LastModifiedBy
	@Column(name = "updated_by")
	private String updatedBy;
}
