package com.jk.controller;

import com.jk.model.PositionModel;
import com.jk.model.RestTreeModel;
import com.jk.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("rest")
public class RestController {


    @Autowired
    private RestService restService;




    @RequestMapping("zt")
    @ResponseBody
    public void zt(Integer id,Integer zt){
        restService.zt(id,zt);
    }


    @RequestMapping("savePosition")
    @ResponseBody
    public void savePosition(PositionModel posts){

        if (posts.getPositionid() != null) {
            restService.updateposition(posts);
        }else {

        }
    }


    @RequestMapping("selectRestId")
    @ResponseBody
    public PositionModel selectRestId(Integer id){
        return restService.selectPositId(id);
    }

    @RequestMapping("enitRest")
    public String enitRest(){
        return "updateRest";
    }


    @RequestMapping("deletes")
    @ResponseBody
    public void deletes(Integer ids){

        restService.deletes(ids);

    }

    @RequestMapping("toShow")
    public String toShow(){
        return "show";
    }

    @RequestMapping("bootstrapGetRestList")
    @ResponseBody
    public Map bootstrapGetRestList(Integer page, Integer rows){

        return restService.bootstrapGetRestList(page,rows);

    }

    @RequestMapping("findTree")
    @ResponseBody
    public List<RestTreeModel> findTree(){
        return restService.findTree();
    }


}
