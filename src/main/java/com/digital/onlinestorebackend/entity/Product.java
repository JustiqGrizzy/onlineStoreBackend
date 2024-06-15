package com.digital.onlinestorebackend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String brand;
    private String brandLogoUrl;
    private String name;
    private String model;
    private String displaySize;
    private String displayType;
    private String refreshRate;
    private String color;
    private String imageUrl;
    private String price;
    private String year;
    private String cpu;
    private String cpuModel;
    private String memory;
    private String storage;
    private String ram;
    private String graphics;
    private String connection;
    private String cameraFront;
    private String cameraBack;
    private String type;
    private String chargerType;
    @ManyToOne
    private Category category;
}
