package com.lucy.bblog.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    public SqlSession sqlSession;

    @GetMapping({"/test","/"})
    public String test() {
        List<String> list = sqlSession.selectList("info.select");
        System.out.println(list.toString());
        return "hi";
    }
}
