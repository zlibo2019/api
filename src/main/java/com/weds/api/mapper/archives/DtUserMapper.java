package com.weds.api.mapper.archives;

import com.weds.api.entity.archives.DtUserEntity;
import com.weds.api.entity.archives.InsertDtUserEntity;
import com.weds.core.annotation.MyBatisDao;

import java.util.List;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-05
 */
@MyBatisDao
public interface DtUserMapper {
    /**
     */
    int deleteByPrimaryKey(Long userSerial);

    /**
     */
    int insert(InsertDtUserEntity record);

    /**
     */
    int insertSelective(DtUserEntity record);

    /**
     */
    DtUserEntity selectByPrimaryKey(Long userSerial);

    /**
     */
    int updateByPrimaryKeySelective(DtUserEntity record);

    /**
     */
    int updateByPrimaryKey(DtUserEntity record);


    /**
     */
    List<DtUserEntity> select();

    DtUserEntity selectByUserId(String userId);
}