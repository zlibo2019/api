package com.weds.api.web.archives;

import com.weds.api.entity.archives.InsertDtUserEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import javax.validation.Valid;

import com.weds.core.base.BaseController;
import com.weds.core.annotation.Logs;
import com.weds.core.resp.JsonResult;

import javax.servlet.http.HttpServletResponse;

import com.weds.api.entity.archives.DtUserEntity;
import com.weds.api.service.archives.DtUserService;

/**
 * @Author
 * @Description DtUser管理
 * @Date 2020-03-05
 */
@RestController
@RequestMapping(value = "/dtUser")
@Api(value = "人员管理", description = "人员管理")
public class DtUserController extends BaseController {
    @Resource
    private DtUserService dtUserService;

    @Resource
    private HttpServletResponse response;

    private Logger log = LogManager.getLogger();

    @Logs
    @ApiOperation(value = "新增DtUser信息", notes = "新增DtUser信息")
    @RequestMapping(value = "/insert", method = RequestMethod.PUT)
    public JsonResult<Object> insert(@RequestBody @Valid InsertDtUserEntity record) {
        dtUserService.insert(record);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "更新DtUser信息", notes = "更新DtUser信息")
    @RequestMapping(value = "/updateByPrimaryKey", method = RequestMethod.POST)
    public JsonResult<Object> updateByPrimaryKey(@RequestBody @Valid DtUserEntity record) {
        dtUserService.updateByPrimaryKeySelective(record);
        return succMsg();
    }


    @Logs
    @ApiOperation(value = "删除DtUser信息", notes = "删除DtUser信息")
    @RequestMapping(value = "/deleteByPrimaryKey", method = RequestMethod.DELETE)
    public JsonResult<Object> deleteByPrimaryKey(@RequestParam Long userSerial) {
        dtUserService.deleteByPrimaryKey(userSerial);
        return succMsg();
    }

    @Logs
    @ApiOperation(value = "查询DtUser信息", notes = "查询DtUser信息")
    @RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.GET)
    public JsonResult<DtUserEntity> selectByPrimaryKey(@RequestParam Long userSerial) {
        DtUserEntity entity = dtUserService.selectByPrimaryKey(userSerial);
        return succMsgData(entity);
    }


    @Logs
    @ApiOperation(value = "查询DtUser信息", notes = "查询DtUser信息")
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public JsonResult<List<DtUserEntity>> select() {
        List<DtUserEntity> list = dtUserService.select();
        return succMsgData(list);
    }

    @Logs
    @ApiOperation(value = "根据userId查询人员状态", notes = "根据userId查询人员状态")
    @RequestMapping(value = "/selectByUserId", method = RequestMethod.GET)
    public JsonResult<Short> selectByUserId(@RequestParam String userId) {
        DtUserEntity dtUserEntity = dtUserService.selectByUserId(userId);
        if (dtUserEntity != null) {
            return succMsgData(dtUserEntity.getUserType());
        }
        return failMsg("人员状态有误");
    }
}