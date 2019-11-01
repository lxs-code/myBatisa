package com.zking.my.service;

import com.zking.my.model.SYSUser;
import com.zking.my.service.Borrowing.ISUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Usertest extends  test21 {

//@Autowired
//    private  IUser iUser;
    @Autowired
    private ISUser sysUser;

//private User user=new User();
    private SYSUser user=new SYSUser();
    @Override
    public void before() {

        super.before();
    }





//    @Test
//    public  void add(){
//        user.setUsername("ls");
////        Set<String> strings = iUser.listRolesByUserName(user);
//
//        Set<String> strings1 = iUser.listPermissionsByUserName(user);
//
//        for (String ss:strings1
//             ) {
//            System.out.println(ss);
//        }
//    }




    @Test
    public  void load(){
        user.setUsername("admin1");
//        Set<String> strings = iUser.listRolesByUserName(user);

//        Set<String> strings1 = sysUser.listPermissionsByUserName(user);
        SYSUser sysUser = this.sysUser.loadByUsername(user);
        System.out.println(sysUser.getPassword());
//        List<SYSNode> SYS = sysUser.listRolesByUserName(user);
//for (SYSNode sss:SYS){
//    System.out.println(sss.getTreeNodeName());
//    System.out.println(sss.getTreeNodeId());
//    List<SYSNode> nodes = sss.getNodes();
//    for (SYSNode sd:nodes){
//        System.out.println(sd.getTreeNodeName());
//    }
//
//}
    }
}
