package com.jk.controller;

import com.jk.model.PositionModel;
import com.jk.model.RestTreeModel;
import com.jk.service.PositionService;
import com.jk.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("rest")
public class RestController {


    @Autowired
    private RestService restService;

    @Autowired
    private PositionService positionService;


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
//修改
    @RequestMapping("enitRest")
    public String enitRest(){
        return "updateRest";
    }
//查看
@RequestMapping("querlposition")
@ResponseBody
//PositionModel positionModel
public ModelAndView querlposition(){
    ModelAndView view = new ModelAndView();
  //  positionService.querlposition(positionModel);
    List<PositionModel>list = positionService.querlpositionn();
//    System.out.println(list);
    view.setViewName("querll");
    view.addObject("list",list);
    return view;
}
    @RequestMapping("queryPosition")
    @ResponseBody
    public PositionModel queryPosition(Integer id){

        return positionService.queryPosition(id);
    }


    @RequestMapping("deletes")
    @ResponseBody
    public void deletes(Integer ids){
        positionService.deletes(ids);
        restService.deletes(ids);

    }

    @RequestMapping("toShow")
    public String toShow(){

        return "show";
    }

    @RequestMapping("add")
    public String addPosition(){

        return "add";
    }

    @RequestMapping("tolist")
    public String tolist(){

        return "list1";
    }


    @RequestMapping("bootstrapGetRestList")
    @ResponseBody
    public Map bootstrapGetRestList(Integer page, Integer rows){

        return restService.bootstrapGetRestList(page,rows);

    }

    @RequestMapping("/findTree")
    @ResponseBody
    public List<RestTreeModel> findTree(){

        return restService.findTree();
    }


    @RequestMapping("selectTalents")
    @ResponseBody
    public Map selectTalents(Integer page, Integer rows){

        return restService.selectTalents(page,rows);

    }

    @RequestMapping("addPosition")
    @ResponseBody
    public String addPosition(PositionModel positionModel){
        restService.addPosition(positionModel);
        return "1";
    }




}


