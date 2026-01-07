package com.silenthill.redbook.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private Integer sex;
    private Integer age;
    private String date;
    private Integer status;
    private Integer attentionCount;
    private Integer followerCount;
}
