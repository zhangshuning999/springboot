package com.jk.mapper;

import com.jk.model.PositionModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface PositionMapper {
    void deletes(Integer ids);

    PositionModel queryPosition(@Param("id")Integer id);

    void querlposition(PositionModel positionModel);

    List<PositionModel> querlpositionn();


}
