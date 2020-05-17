package com.cn.recycle.Controller;

import com.cn.recycle.Service.BoxService;
import com.cn.recycle.domain.Box;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
@RequestMapping("api/box")
public class BoxController {
    @Autowired
    private BoxService boxService;

    //查询所有
    @GetMapping("find")
    public ResponseEntity find(){
        return ResponseEntity.status(HttpStatus.CREATED).body(boxService.find());
    }

    //查询已满垃圾箱
    @GetMapping("findByStatus")
     public  ResponseEntity findByStatus(){
         return ResponseEntity.status(HttpStatus.CREATED).body(boxService.findByStatus());
     }

    //保存
    @PostMapping("save")
    public  ResponseEntity save(@RequestBody Box box){
        return ResponseEntity.status(HttpStatus.CREATED).body(boxService.save(box));
    }
    //更新
    @PostMapping("update")
    public  ResponseEntity update(@RequestBody Box box){
        return ResponseEntity.status(HttpStatus.CREATED).body(boxService.updatex(box));
    }
}
