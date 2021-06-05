package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.PmsSpuInfoEntity;

import java.util.Map;

/**
 * spu??Ϣ
 *
 * @author shengli
 * @email tomaslisheng@163.com
 * @date 2020-10-24 17:24:16
 */
public interface PmsSpuInfoService extends IService<PmsSpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

