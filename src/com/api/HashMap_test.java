package com.api;

import java.util.HashMap;
import java.util.Map;

public class HashMap_test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Map hmap=new HashMap();
		hmap.put("1","jack");
		hmap.put("2","DAW");
		hmap.put("3","DADA");
		hmap.put("4","jACA");
		System.out.println(hmap);
		
		
		if (hmap.containsKey("1")) {
			System.out.println("���˫�м��ϰ�����1");
		}
		System.out.println("�����˫�м��ϰ��м�1��ֵ��"+hmap.get("1"));
	}

}
