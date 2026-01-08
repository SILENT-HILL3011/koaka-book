package com.silenthill.redbook.entity;

import lombok.Data;

@Data
public class Follower {
    private Integer id;
    private Integer userId;
    private Integer followerId;
}
