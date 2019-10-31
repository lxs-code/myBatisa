package com.zking.my.service;

import com.zking.my.model.Category;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICategoty {

@Transactional(readOnly = true)
Category load(Category category);

}
