package com.Jack.MyBatis.test;

import com.Jack.MyBatis.Pojo.PosRole;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestJavaFilterStream {
    @Test
    public  void testJavaFilter(){
        List<PosRole> posRoleList=new ArrayList<>();
        posRoleList.add(new PosRole(1,1,"Jack"));
        posRoleList.add(new PosRole(2,3,"ANE"));
        posRoleList.add(new PosRole(3,5,"DSADS"));
        posRoleList.add(new PosRole(14,6,"NJHUH"));
        posRoleList.add(new PosRole(5,1,"FDFD"));
        posRoleList.add(new PosRole(1,1,"Jack"));
        List<PosRole>  pos = posRoleList.stream().filter(posRole -> posRole.getPosId().equals(1) && posRole.getRole().equals(1)).collect(Collectors.toList());
        pos.forEach(posRole -> {
            System.out.println("posId:"+posRole.getPosId()+"roleId:"+posRole.getRole()+"name:"+posRole.getName());
         });

    }
}
