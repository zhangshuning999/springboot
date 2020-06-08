package com.jk.service;

import com.jk.model.PositionModel;
import com.jk.model.RestTreeModel;

import java.util.List;
import java.util.Map;

public interface RestService {
    List<RestTreeModel> findTree();


    void deletes(Integer ids);

    PositionModel selectPositId(Integer id);

    void updateposition(PositionModel posts);

    void zt(Integer id, Integer zt);

    Map bootstrapGetRestList(Integer page, Integer rows);

    Map selectTalents(Integer page, Integer rows);

    void addPosition(PositionModel positionModel);
}
