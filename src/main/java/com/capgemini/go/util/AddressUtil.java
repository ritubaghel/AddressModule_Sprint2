package com.capgemini.go.util;
import java.util.Map;
import javax.validation.Valid;

import com.capgemini.go.entities.AddressDto;
public class AddressUtil {
	public static AddressDto convertToAddress(Map<String,Object> map) {
	        AddressDto address=new AddressDto();
			String id=(String)map.get("id");
			String buildingNo=(String)map.get("buildingNo");
			String city=(String)map.get("city");
			String field=(String)map.get("field");
			String retailerId=(String)map.get("retailerId");
			String state=(String)map.get("state");
			String zip=(String)map.get("zip");
			return address;
		}

	}


