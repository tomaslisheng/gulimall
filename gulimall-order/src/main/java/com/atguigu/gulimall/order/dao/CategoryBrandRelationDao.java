package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author shengli
 * @email tomaslisheng@163.com
 * @date 2021-06-03 15:58:26
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
