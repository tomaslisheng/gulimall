package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.PmsSpuCommentEntity;

import java.util.Map;

/**
 * ??Ʒ???
 *
 * @author shengli
 * @email tomaslisheng@163.com
 * @date 2020-10-24 17:24:17
 */
public interface PmsSpuCommentService extends IService<PmsSpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

