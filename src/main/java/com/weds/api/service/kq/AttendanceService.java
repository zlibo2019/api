package com.weds.api.service.kq;

import com.weds.api.entity.kq.AttendanceFlowEntity;
import com.weds.api.mapper.kq.AttendanceMapper;
import com.weds.api.mapper.kq.AttendanceMapper;
import com.weds.core.base.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author
 * @Description DtDep管理
 * @Date 2020-02-27
 */
@Service
public class AttendanceService extends BaseService {

    @Resource
    private AttendanceMapper attendanceMapper;

    public List<AttendanceFlowEntity> select() {
        return attendanceMapper.select();
    }

}
