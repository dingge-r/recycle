package com.cn.recycle.domain;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="lj")
public class Box {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String address;
    private String dustbin;
    private Integer status; //0为空，1为满，2为坏
}
