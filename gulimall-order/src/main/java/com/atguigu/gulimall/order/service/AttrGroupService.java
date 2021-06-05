package com.atguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author shengli
 * @email tomaslisheng@163.com
 * @date 2021-06-03 15:58:26
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

