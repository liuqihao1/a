package com.topscit.jsonT1;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;

public class Test {
	
	public static void main(String[] args) {
		HashMap<String,Object> hashMap = new HashMap<String,Object>();
		hashMap.put("name", "����");
		hashMap.put("sex", "��");
		hashMap.put("age", "20");
		
		HashMap<String, String> u1 = new HashMap<String,String>();
		u1.put("name", "С��");
		HashMap<String, String> u2 = new HashMap<String,String>();
		u2.put("name", "����");
		ArrayList<HashMap<String,String>> arrayList = new ArrayList<HashMap<String, String>>();
		arrayList.add(u1);
		arrayList.add(u2);
		hashMap.put("friends", "arryList");
		
		/*HashMap<String,String> r = new HashMap<String,String>();
		r.put("lxrname", "��˼");
		r.put("phone", "3231");
		hashMap.put("relative", r);
		
		Gson gson = new Gson();
		String json = gson.toJson(hashMap);
		System.out.println(json);*/
		
		String r = "{\"name\":\"����\",\"sex\":\"��\",\"age\":20,\"friends\":[{\"name\":\"С��\"},{\"name\":\"����\"}],\"relative\":{\"lxrname\":\"��˼\",\"phone\":\"3231\"}}";
		Gson gson = new Gson();
//		Stu fromJson = gson.fromJson(r, Stu.class);
//		System.out.println(fromJson.getRelative().getLxrname());
		
		HashMap fromJson = gson.fromJson(r, HashMap.class);
		String name = (String)fromJson.get("name");
		System.out.println(name);
	}

}
