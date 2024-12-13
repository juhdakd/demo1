package com.example.demo.Controller;

import com.example.demo.Entity.Result;
import com.example.demo.Service.MissionService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/mission")
public class MissionController {
    @Resource
    private MissionService missionService;
    // 添加mission
    @PostMapping("/input")
    public Result input(boolean is_submit) {
        return Result.success("Hello");
    }

    // 处理带有图片的请求
    @PostMapping("/inputwithimage")
    public Result inputMissionWithImage(@RequestParam boolean is_submit) {
        return Result.success("Hello");
    }
    // 获得所有输入的信息
    @GetMapping("/getAll")
    public Result getAll() {
        return Result.success("Hello");
    }

    // 更改mission
    @PostMapping("/update")
    public Result update() {
        return Result.success("Hello");
    }

    // 删除mission
    @PostMapping("/delete")
    public Result delete() {
        return Result.success("Hello");
    }

    // 找到一个mission 和它所对应的任务以及所有的描述
    @PostMapping("/get")
    public Result get() {
        return Result.success("Hello");
    }
    // 获得紧急地图
    @PostMapping("/getEmer_Map")
    public Result getEmer_Map() {
        return Result.success("Hello");
    }

    @PostMapping("/input_new")
    public Result input() {
        return Result.success("Hello");
    }
}