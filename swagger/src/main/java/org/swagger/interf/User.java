package org.swagger.interf;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="org.swagger.interf.User",description = "用户类")
public class User {
	
	@ApiModelProperty(value = "姓名")
	private String name;

}
