package org.swagger.interf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = { "用户接口" })
@RestController
public class UserController {
	@ApiImplicitParams({@ApiImplicitParam(name="id",value="用户id",dataType = "int",paramType = "query",required = true,defaultValue = "1")})
    //@ApiResponse 用于方法上，说明接口响应的一些信息；@ApiResponses 组装了多个 @ApiResponse。
	@ApiResponses({ @ApiResponse(code = 200, message = "ok", response = String.class) })
	@ApiOperation(value = "获取一个用户", notes = "通过用户ID获取一个用户信息")
	@GetMapping("getUser")
	public String getUser(@ApiParam(value = "用户ID", required = true) int id) {

		return "a";
	}

}
