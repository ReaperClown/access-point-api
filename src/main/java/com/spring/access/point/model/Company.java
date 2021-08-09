package com.spring.access.point.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.envers.Audited;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Company {
    @Id
    private long id;
    private String description;
    private String cnpj;
    private String address;
    private String district;
    private String city;
    private String stateProvince;
    private String tel;
}
