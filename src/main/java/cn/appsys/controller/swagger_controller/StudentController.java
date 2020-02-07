package cn.appsys.controller.swagger_controller;
 
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lxk on 2017/3/27
 */

@Controller
@RequestMapping("student")
public class StudentController {
 

    //@ResponseBody//(之前我因为加了这个注解，导致页面访问一直是406错误，注释了就好啦，具体为啥我暂时还不知道)
    @ApiOperation(value = "获得所有的学生对象list", notes = "get请求，查询所有的学生。")
    @RequestMapping(value = "/getAllStudent", method = RequestMethod.GET)
    public ModelAndView getAllStudent() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("studentDisplay");
        return mav;
    }
 
    @ApiOperation(value = "根据学生的name，获得单个学生的信息", notes = "根据学生的name，查询学生对象的信息。")
    @ApiImplicitParam(name = "name", value = "学生的名称", required = true, dataType = "String")
    @ResponseBody
    @RequestMapping(value = "getStudentByName", method = RequestMethod.POST)
    public String getStudentByName(String name) {
        return "aaa";
    }
 
    @ApiOperation(value = "根据学生的name和age，获得单个学生的信息", notes = "根据学生的name和age，查询学生对象的信息。")
    @ApiImplicitParams({@ApiImplicitParam(name = "name", value = "学生名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "age", value = "学生年龄", required = true, dataType = "int")})
    @ResponseBody
    @RequestMapping(value = "getStudentByNameAndAge", method = RequestMethod.POST)
    public String getStudentByName(String name, int age) {
        return "aaa";
    }
 
    @ApiOperation(value = "新建学生对象到数据库", notes = "新建数据到数据库。")
    @ApiImplicitParam(name = "student", value = "学生对象", required = true, dataType = "Object")
    @ResponseBody
    @RequestMapping(value = "createNewStudent", method = RequestMethod.POST)
    public String create(@RequestBody Object student) {
        return "aa";
    }
}
