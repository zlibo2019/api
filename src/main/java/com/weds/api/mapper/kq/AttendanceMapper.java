package com.weds.api.mapper.kq;

import com.weds.api.entity.kq.AttendanceFlowEntity;
import com.weds.core.annotation.MyBatisDao;

import java.util.List;

/**
 * @Author
 * @Description 管理
 * @Date 2020-02-27
 */
@MyBatisDao
public interface AttendanceMapper {

    /**
     */
    List<AttendanceFlowEntity> select();

}