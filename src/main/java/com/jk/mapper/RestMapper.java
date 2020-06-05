package com.jk.mapper;

import com.jk.model.PositionModel;
import com.jk.model.RestTreeModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.HashMap;
import java.util.List;

public interface RestMapper {
    List<RestTreeModel> findTree(@Param("pid") Integer id);

    int GetCount(HashMap<String, Object> result);

    List<PositionModel> bootstrapGetRestList(HashMap<String, Object> result);

    void deletes(@Param("ids") Integer ids);

    PositionModel selectPositId(@Param("id") Integer id);

    void updateposition(PositionModel posts);

    @Update("update t_position_zw set positiontop = #{zt} where positionid = #{id}")
    void zt(@Param("id") Integer id,@Param("zt") Integer zt);


}
