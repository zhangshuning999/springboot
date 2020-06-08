package com.jk.service;

import com.jk.mapper.PositionMapper;
import com.jk.model.PositionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Resource
    private PositionMapper positionMapper;


    @Override
    public void deletes(Integer ids) {
        positionMapper.deletes(ids);
    }

    @Override
    public PositionModel queryPosition(Integer id) {
        return positionMapper.queryPosition(id);
    }

    @Override
    public void querlposition(PositionModel positionModel) {
        positionMapper.querlposition(positionModel);
    }

    @Override
    public List<PositionModel> querlpositionn() {
        return positionMapper.querlpositionn();
    }


}
