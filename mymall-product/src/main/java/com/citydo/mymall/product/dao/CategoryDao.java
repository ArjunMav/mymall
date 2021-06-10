package com.citydo.mymall.product.dao;

import com.citydo.mymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yjj
 * @email yejj@gmail.com
 * @date 2021-06-10 17:59:16
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
