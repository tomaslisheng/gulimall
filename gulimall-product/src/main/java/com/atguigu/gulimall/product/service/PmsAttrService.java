package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.PmsAttrEntity;

import java.util.Map;

/**
 * ??Ʒ?
 *
 * @author shengli
 * @email tomaslisheng@163.com
 * @date 2020-10-24 17:24:19
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

