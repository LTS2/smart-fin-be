package com.ysmeta.smartfin.domain.user.entity;

import static jakarta.persistence.FetchType.*;

import com.ysmeta.smartfin.common.AbstractBaseEntity;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 클래스입니다.
 *
 * @author : ewjin
 * @version : 0.0.1
 * @since : 2024. 8. 20.
 */
@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "USER_ROLE")
public class UserRoleEntity extends AbstractBaseEntity {

	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "USER_ID", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
	private UserEntity user;

	@ManyToOne(fetch = LAZY)
	// @JoinColumn(name = "CODE", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
	@JoinColumn(name = "CODE", nullable = false)
	private RoleTypeEntity roleTypeCode;

	// @Enumerated(EnumType.STRING)
	// @Column(name = "CODE", nullable = false)
	// private RoleType roleTypeCode;

}
