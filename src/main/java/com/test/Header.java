package com.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by soniw on 2016. 5. 26..
 */
@Data
public class Header {

	@JsonProperty("resultCode")
	String resultCode;

	@JsonProperty("resultMsg")
	String resultMsg;

}
