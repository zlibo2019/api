package com.weds.api.mapper.xf;

import com.weds.api.entity.xf.RechargeCashEntity;
import com.weds.core.annotation.MyBatisDao;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-11
 */
@MyBatisDao
public interface CashMapper {

    /**
     */
    int rechargeCash(RechargeCashEntity record);
}