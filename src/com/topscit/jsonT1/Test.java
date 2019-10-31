package com.topscit.jsonT1;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;

public class Test {
	
	public static void main(String[] args) {
		HashMap<String,Object> hashMap = new HashMap<String,Object>();
		hashMap.put("name", "张三");
		hashMap.put("sex", "男");
		hashMap.put("age", "20");
		
		HashMap<String, String> u1 = new HashMap<String,String>();
		u1.put("name", "小王");
		HashMap<String, String> u2 = new HashMap<String,String>();
		u2.put("name", "老王");
		ArrayList<HashMap<String,String>> arrayList = new ArrayList<HashMap<String, String>>();
		arrayList.add(u1);
		arrayList.add(u2);
		hashMap.put("friends", "arryList");
		
		/*HashMap<String,String> r = new HashMap<String,String>();
		r.put("lxrname", "张思");
		r.put("phone", "3231");
		hashMap.put("relative", r);
		
		Gson gson = new Gson();
		String json = gson.toJson(hashMap);
		System.out.println(json);*/
		
		String r = "{\"name\":\"张三\",\"sex\":\"男\",\"age\":20,\"friends\":[{\"name\":\"小王\"},{\"name\":\"老王\"}],\"relative\":{\"lxrname\":\"张思\",\"phone\":\"3231\"}}";
		Gson gson = new Gson();
//		Stu fromJson = gson.fromJson(r, Stu.class);
//		System.out.println(fromJson.getRelative().getLxrname());
		
		HashMap fromJson = gson.fromJson(r, HashMap.class);
		String name = (String)fromJson.get("name");
		System.out.println(name);
	}

}
