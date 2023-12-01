package com.employee.management.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;


import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "Employee")
public class User {

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "110000")
    private Integer employee_id;

    @NotNull
    @Column(name = "phone_number",length = 10,nullable = false)
    private BigDecimal phone_number;

    private String location;

    private String email_id;
//    @NotNull
//    @OneToOne
//    @JoinColumn(name = "userType", referencedColumnName = "user_type_id")
//    private UserType userType;

}
