package com.example.mapper;

import com.example.domain.User;

import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface Mapper {
    public List<User>findAll();
}
