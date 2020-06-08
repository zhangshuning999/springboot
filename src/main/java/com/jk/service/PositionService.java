package com.jk.service;

import com.jk.model.PositionModel;

import java.util.List;

public interface PositionService {
    void deletes(Integer ids);

    PositionModel queryPosition(Integer id);

    void querlposition(PositionModel positionModel);

    List<PositionModel> querlpositionn();
}
