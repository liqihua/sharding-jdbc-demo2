package com.liqihua.controller;

import com.liqihua.dao.source1.interf.SysUserDao;
import com.liqihua.dao.source2.interf.SysProvinceDao;
import net.sf.json.JSONArray;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/testController")
public class TestController {
    @Resource
    private SysUserDao userDao;
    @Resource
    private SysProvinceDao provinceDao;


    @RequestMapping("/selectDB1")
    public String testDB1(){
        System.out.println("-- testDB1 start --");
        List<Map<String,Object>> list = userDao.findListSQL("SELECT * FROM sys_user ");
        JSONArray jsonArr = JSONArray.fromObject(list);
        System.out.println(jsonArr.toString());
        System.out.println("-- testDB1 end --");
        return jsonArr.toString();
    }


    @RequestMapping("/insertDB1")
    public String insertDB1(){
        System.out.println("-- insertDB1 start --");
        String id = "id-"+System.currentTimeMillis();
        String username = "un-"+System.currentTimeMillis();
        String password = "pw-"+System.currentTimeMillis();
        String locked = "0";
        String gender = "1";
        String nickname = "nn-"+System.currentTimeMillis();
        String createDate = new Date().toLocaleString();
        String updateDate = new Date().toLocaleString();
        String sql = "INSERT INTO sys_user VALUES ('"+id+"','"+username+"','"+password+"','"+locked+"','"+gender+"','"+nickname+"','"+updateDate+"','"+createDate+"')";
        userDao.exec(sql);
        System.out.println("-- insertDB1 end --");
        return "-- insertDB1 --";
    }

    @RequestMapping("/selectDB2")
    public String selectDB2(){
        System.out.println("-- testDB2 start --");
        List<Map<String,Object>> list = provinceDao.findListSQL("SELECT * FROM sys_province ");
        JSONArray jsonArr = JSONArray.fromObject(list);
        System.out.println(jsonArr.toString());
        System.out.println("-- testDB2 end --");
        return jsonArr.toString();
    }


    @RequestMapping("/insertDB2")
    public String insertDB2(){
        System.out.println("-- insertDB2 start --");
        String id = "id-"+System.currentTimeMillis();
        String name = "name-"+System.currentTimeMillis();
        String sql = "INSERT INTO sys_province VALUES ('"+id+"','"+name+"')";
        provinceDao.exec(sql);
        System.out.println("-- insertDB2 end --");
        return "-- insertDB2 --";
    }




}
