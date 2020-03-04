package com.tourism.controller.admin;

import com.tourism.common.DataTablesParam;
import com.tourism.controller.base.BaseController;
import com.tourism.entity.Conment;
import com.tourism.entity.Scenery;
import com.tourism.service.ConmentService;
import com.tourism.utils.BuildPageRequest;
import org.codehaus.janino.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * 景区评论
 */

@Controller
@RequestMapping(value="/conment")
public class ConmentController extends BaseController {
    @Autowired
    private ConmentService conmentSrvice;
    @RequestMapping(value="/add")
    public String view(HttpServletRequest request){
        return "/admin/addConment";
    }

    @RequestMapping(value="/getList")
    public String getList(HttpServletRequest request){
        return "/admin/ConmentList";
    }

    @RequestMapping(value="/getConmentList/{id}",method = RequestMethod.GET)
    public ModelAndView getConmentList( @PathVariable("id") String id){
        List<Conment>pageRe = conmentSrvice.findBySceneryId(id);
        ModelAndView model=new ModelAndView("/page/scenery::conment_div");
        model.addObject("conments",pageRe);
        model.addObject("test","test");
        return  model;
    }
    @RequestMapping(value="/getConmentList1/{id}",method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView getConmentList1(@PathVariable("id") String id){
        List<Conment> pageRe = conmentSrvice.findBySceneryId(id);
        ModelAndView model=new ModelAndView("/page/scenery::conment_div");
        Map<String,Object> map = new HashMap();
        map.put("conments",pageRe);
        model.addAllObjects(map);
        return model;
    }
    //删除
    @RequestMapping(value="/saveConment", method = RequestMethod.POST)
    @ResponseBody
    public Conment saveConment(Conment conment){
        conment.setCreateDate(new Date());
        return conmentSrvice.save(conment);
    }

    //删除
    @RequestMapping(value="/deleteScenery", method = RequestMethod.POST)
    @ResponseBody
    public ModelMap deleteConment(String id) {
        ModelMap map = new ModelMap();
        conmentSrvice.delete(conmentSrvice.findById(id));
        map.put("msg", "删除成功");
        return map;
    }

}
