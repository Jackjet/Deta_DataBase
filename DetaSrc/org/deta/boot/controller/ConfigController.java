package org.deta.boot.controller;
import java.util.Map;
import org.lyg.common.maps.VtoV;
import org.lyg.vpc.process.portImpl.RestDBConfigImpl;
public class ConfigController {
	public static String exec(String string, Map<String, String> data) throws Exception {
		if(string.equalsIgnoreCase("/setDBPath")){
			return new VtoV().ObjectToJsonString(RestDBConfigImpl.setDBPath(data.get("baseName")
					, data.get("baseName"), data.get("baseName")));	
		}
		if(string.equalsIgnoreCase("/setDBTable")){
			return new VtoV().ObjectToJsonString(RestDBConfigImpl.setDBTable(data.get("tableName")
					, data.get("token"), data.get("auth")));	
		}
		return "";
	}
}