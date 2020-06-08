package com.jk.service;

import com.jk.mapper.RestMapper;
import com.jk.model.PositionModel;
import com.jk.model.RestTreeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RestServiceImpl implements RestService {

    @Autowired
    private RestMapper restMapper;


    @Override
    public List<RestTreeModel> findTree() {
        Integer id =0;
        return findNodes(id);
    }

    @Override
    public Map bootstrapGetRestList(Integer page, Integer rows) {
        HashMap<String, Object> parmse  = new HashMap<>();
        HashMap<String, Object> result = new HashMap<>();
        int count = restMapper.GetCount(result);
        parmse.put("total",count);
        result.put("start",(page-1)*rows);
        result.put("end",rows);
        List<PositionModel> list = restMapper.bootstrapGetRestList(result);
        parmse.put("rows",list);
        return parmse;
    }

    @Override
    public Map selectTalents(Integer page, Integer rows) {
        HashMap<String, Object> parmse  = new HashMap<>();
        HashMap<String, Object> result = new HashMap<>();
        int count = restMapper.selectCount(result);
        parmse.put("total",count);
        result.put("start",(page-1)*rows);
        result.put("end",rows);
        List<PositionModel> list = restMapper.selectTalents(result);
        parmse.put("rows",list);

        return parmse;
    }

    @Override
    public void addPosition(PositionModel positionModel) {
        restMapper.addPosition(positionModel);
    }


    @Override
    public void deletes(Integer ids) {
        restMapper.deletes(ids);
    }

    @Override
    public PositionModel selectPositId(Integer id) {
        return restMapper.selectPositId(id);
    }

    @Override
    public void updateposition(PositionModel posts) {
        restMapper.updateposition(posts);
    }

    @Override
    public void zt(Integer id, Integer zt) {
        restMapper.zt(id,zt);
    }

    private List<RestTreeModel> findNodes(Integer id) {
        List<RestTreeModel> findTree = restMapper.findTree(id);
        for (RestTreeModel tree : findTree){
            List<RestTreeModel> nodesTree = findNodes(tree.getId());
            if (nodesTree!=null && nodesTree.size()>0){
                tree.setNodes(nodesTree);
            }else {
                tree.setSelectable(true);
            }
        }
        return findTree;
    }
}
