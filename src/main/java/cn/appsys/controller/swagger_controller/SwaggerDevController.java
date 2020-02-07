package cn.appsys.controller.swagger_controller;

import cn.appsys.pojo.DevUser;
import cn.appsys.service.developer.DevUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="/api/devswagger")
@Api(value="API",basePath = "/http://127.0.0.1/app/api/devswagger")
public class SwaggerDevController {
	private Logger logger = Logger.getLogger(SwaggerDevController.class);
	
	@Resource
	private DevUserService devUserService;





	@ApiOperation(value = "注册开发者到数据库", notes = "新建数据到数据库。")
	@ApiImplicitParam(name = "DevUser", value = "开发者对象", required = true, dataType = "DevUser")
	@ResponseBody
	@RequestMapping(value="/doregister",method=RequestMethod.POST)
	public int doRegister(DevUser devUser) throws  Exception {
		logger.debug("doRegister====================================");
		return 0;
	}

}

