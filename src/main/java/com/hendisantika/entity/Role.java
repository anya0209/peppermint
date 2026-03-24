package com.hendisantika.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Project : spring-boot-invoice-app-system
 */
@Entity
@Table(name = "authorities", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "authority"})})
@Data
@AllArgsConstructor
public class Role implements Serializable {

    private static final long serialVersionUID = 2699282209351614842L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;

    public Role() {
    }

    public Role(String authority) {
        this.authority = authority;
    }
}
