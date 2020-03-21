package com.weds.api.mapper.xf;

import com.weds.api.entity.xf.DtAcLinkEntity;
import com.weds.core.annotation.MyBatisDao;
import java.util.List;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-11
 */
@MyBatisDao
public interface DtAcLinkMapper {
    /**
     */
    int deleteByPrimaryKey(Long userSerial);

    /**
     */
    int insert(DtAcLinkEntity record);

    /**
     */
    int insertSelective(DtAcLinkEntity record);

    /**
     */
    DtAcLinkEntity selectByPrimaryKey(Long userSerial);

    /**
     */
    int updateByPrimaryKeySelective(DtAcLinkEntity record);

    /**
     */
    int updateByPrimaryKey(DtAcLinkEntity record);

    /**
     */
    List<DtAcLinkEntity> selectListByEntity(DtAcLinkEntity record);
}