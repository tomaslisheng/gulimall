package com.atguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author shengli
 * @email tomaslisheng@163.com
 * @date 2021-06-03 15:58:25
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

