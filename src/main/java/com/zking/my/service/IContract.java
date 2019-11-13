package com.zking.my.service;

import com.zking.my.util.PageBean;
import com.zking.my.vo.ConTVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IContract {
    @Transactional(readOnly = true)
    List<ConTVo> list(PageBean pageBean);

    ConTVo list1(ConTVo conTVo);
}
