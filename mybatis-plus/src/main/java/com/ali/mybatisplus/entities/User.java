package com.ali.mybatisplus.entities;

import lombok.Data;

/**
 * @author mozartc
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
