package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.PmsSpuInfoDescEntity;

import java.util.Map;

/**
 * spu??Ϣ???
 *
 * @author shengli
 * @email tomaslisheng@163.com
 * @date 2020-10-24 17:24:16
 */
public interface PmsSpuInfoDescService extends IService<PmsSpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

