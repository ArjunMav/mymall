package com.citydo.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citydo.common.utils.PageUtils;
import com.citydo.mymall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author yjj
 * @email yejj@gmail.com
 * @date 2021-06-10 17:59:16
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

