package com.api;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TreeSet ts=new TreeSet();
		ts.add(3);
		ts.add(9);
		ts.add(1);
		ts.add(21);
		System.out.println("������TreeSet����Ϊ"+ts);
		
		//2.��ȡ��Ԫ��
		System.out.println("TreeSet������Ԫ��Ϊ��"+ts.first());
		System.out.println("TreeSet����βԪ��Ϊ��"+ts.last());
		
		//3.�Ƚϲ���ȡԪ��
		System.out.println("������С�ڻ����9������һ��Ԫ��Ϊ��"+ts.floor(9));
		System.out.println("�����д���10����С��һ��Ԫ��Ϊ"+ts.higher(10));
		System.out.println("�����д���100����С��һ��Ԫ��Ϊ��"+ts.higher(100));
		
		//4.ɾ��Ԫ��
		Object first=ts.pollFirst();
		System.out.println("ɾ���ĵ�һ��Ԫ���ǣ�"+first);
		System.out.println("ɾ����һ��Ԫ�غ�TreeSet����Ϊ��"+ts);
	}

}
