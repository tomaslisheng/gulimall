package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.PmsSkuInfoEntity;

import java.util.Map;

/**
 * sku??Ϣ
 *
 * @author shengli
 * @email tomaslisheng@163.com
 * @date 2020-10-24 17:24:17
 */
public interface PmsSkuInfoService extends IService<PmsSkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

