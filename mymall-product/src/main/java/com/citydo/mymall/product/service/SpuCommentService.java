package com.citydo.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citydo.common.utils.PageUtils;
import com.citydo.mymall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author yjj
 * @email yejj@gmail.com
 * @date 2021-06-10 17:59:16
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

