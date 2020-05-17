package com.cn.recycle.Service;

import com.cn.recycle.Mapper.BoxMapper;
import com.cn.recycle.domain.Box;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.misc.BASE64Encoder;
import tk.mybatis.mapper.entity.Example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

@Service
@Transactional
public class BoxService {

   @Autowired
    private BoxMapper boxMapper;


    public List<Box> find() {
     return boxMapper.selectAll();
    }

    public List<Box> findByStatus() {
//      Example example =new Example(Box.class);
//      Example.Criteria criteria=example.createCriteria();
//      criteria.andEqualTo("status",1);
//      return boxMapper.selectByExample(example);
        Box box=new Box();
        box.setStatus(1);
        return boxMapper.select(box);
    }

    public int save( Box box) {
        return boxMapper.insertSelective(box);
    }

    public int updatex(Box box) {
        return boxMapper.updateByPrimaryKeySelective(box);
    }
}
