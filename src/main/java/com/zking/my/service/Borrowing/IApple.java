package com.zking.my.service.Borrowing;

import com.zking.my.model.Apply;
import com.zking.my.model.Ua;
import com.zking.my.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IApple {


    int   createApply(Apply  apply);


    int   shApply(Apply  apply);

    List<Apply>  getApply(Apply apply, PageBean pageBean);



//    int


    List<Ua>  getcoun();
}
