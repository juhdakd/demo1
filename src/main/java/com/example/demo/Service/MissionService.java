package com.example.demo.Service;

import com.example.demo.Entity.Result;
import org.springframework.stereotype.Service;

@Service
public class MissionService {

    public Result getMission(){
        return Result.success("Hello");
    }
}
