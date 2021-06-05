package com.atguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author shengli
 * @email tomaslisheng@163.com
 * @date 2021-06-03 15:58:26
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

