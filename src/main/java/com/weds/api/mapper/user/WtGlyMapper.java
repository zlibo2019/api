package com.weds.api.mapper.user;

//import com.weds.api.entity.user.WtGlyEntity;
import com.weds.api.entity.user.WtGlyEntity;
import com.weds.core.annotation.MyBatisDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @Author
 * @Description 管理
 * @Date 2020-03-07
 */
@MyBatisDao
public interface WtGlyMapper {
    /**
     */
    int deleteByPrimaryKey(String glyNo);

    /**
     */
    int insert(WtGlyEntity record);

    /**
     */
    int insertSelective(WtGlyEntity record);

    /**
     */
    WtGlyEntity selectByPrimaryKey(String glyNo);

    /**
     */
    int updateByPrimaryKeySelective(WtGlyEntity record);

    /**
     */
    int updateByPrimaryKey(WtGlyEntity record);

    /**
     */
    List<WtGlyEntity> selectListByEntity(WtGlyEntity record);

    int updatePwd(WtGlyEntity record);

}