package com.atguigu.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.product.entity.PmsCategoryBrandRelationEntity;
import com.atguigu.gulimall.product.service.PmsCategoryBrandRelationService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * Ʒ?Ʒ???????
 *
 * @author shengli
 * @email tomaslisheng@163.com
 * @date 2020-10-24 17:24:18
 */
@RestController
@RequestMapping("productMaster/pmscategorybrandrelation")
public class PmsCategoryBrandRelationController {
    @Autowired
    private PmsCategoryBrandRelationService pmsCategoryBrandRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsCategoryBrandRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PmsCategoryBrandRelationEntity pmsCategoryBrandRelation = pmsCategoryBrandRelationService.getById(id);

        return R.ok().put("pmsCategoryBrandRelation", pmsCategoryBrandRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PmsCategoryBrandRelationEntity pmsCategoryBrandRelation){
		pmsCategoryBrandRelationService.save(pmsCategoryBrandRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PmsCategoryBrandRelationEntity pmsCategoryBrandRelation){
		pmsCategoryBrandRelationService.updateById(pmsCategoryBrandRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		pmsCategoryBrandRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
