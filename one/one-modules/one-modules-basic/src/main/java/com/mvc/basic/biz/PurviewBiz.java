package com.mvc.basic.biz;

import com.mvc.basic.dao.PurviewDao;
import com.mvc.basic.entity.Purview;
import com.mvc.modules.core.BaseBiz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by guoyibin on 7/25/14.
 */
@Service
public class PurviewBiz extends BaseBiz<Purview, PurviewDao> {

    @Resource
    private PurviewDao purviewDao;


    //根据父id查询列表
    public List<Purview> findByParentId(Long parentId){
        return purviewDao.findByParentId(parentId);
    }
}
