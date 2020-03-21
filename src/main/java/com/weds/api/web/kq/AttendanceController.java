package com.weds.api.web.kq;

import com.weds.api.entity.kq.AttendanceFlowEntity;
import com.weds.api.service.kq.AttendanceService;
import com.weds.core.annotation.Logs;
import com.weds.core.base.BaseController;
import com.weds.core.resp.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author
 * @Description DtDep管理
 * @Date 2020-02-27
 */
@RestController
@RequestMapping(value = "/attendance")
@Api(value = "考勤流水", description = "考勤流水")
public class AttendanceController extends BaseController {
    @Resource
    private AttendanceService attendanceService;


    private Logger log = LogManager.getLogger();
    @Logs
    @ApiOperation(value = "查询考勤流水", notes = "查询考勤流水")
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public JsonResult<List<AttendanceFlowEntity>> select() {
       List<AttendanceFlowEntity> list = attendanceService.select();
        return succMsgData(list);
    }

}