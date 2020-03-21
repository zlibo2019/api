package com.weds.api.service.archives;

import javax.annotation.Resource;

import com.weds.api.entity.archives.InsertDtUserEntity;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

import com.weds.core.base.BaseService;
import com.weds.api.mapper.archives.DtUserMapper;
import com.weds.api.entity.archives.DtUserEntity;

/**
 * @Author
 * @Description DtUser管理
 * @Date 2020-03-05
 */
@Service
public class DtUserService extends BaseService {

    @Resource
    private DtUserMapper dtUserMapper;

    private Logger log = LogManager.getLogger();

    public int deleteByPrimaryKey(Long userSerial) {
        return dtUserMapper.deleteByPrimaryKey(userSerial);
    }

    public int insert(InsertDtUserEntity record) {
        return dtUserMapper.insert(record);
    }

    public int insertSelective(DtUserEntity record) {
        return dtUserMapper.insertSelective(record);
    }

    public DtUserEntity selectByPrimaryKey(Long userSerial) {
        return dtUserMapper.selectByPrimaryKey(userSerial);
    }

    public int updateByPrimaryKeySelective(DtUserEntity record) {
        return dtUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(DtUserEntity record) {
        return dtUserMapper.updateByPrimaryKey(record);
    }

    public List<DtUserEntity> select() {
        return dtUserMapper.select();
    }

    public DtUserEntity selectByUserId(String userId){
        return  dtUserMapper.selectByUserId(userId);
    }

}
