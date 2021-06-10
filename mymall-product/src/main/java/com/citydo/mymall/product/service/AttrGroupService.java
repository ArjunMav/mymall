package com.citydo.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citydo.common.utils.PageUtils;
import com.citydo.mymall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author yjj
 * @email yejj@gmail.com
 * @date 2021-06-10 17:59:16
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

