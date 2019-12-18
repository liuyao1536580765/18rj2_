package com.api;

public class Zfc_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
String zfc=new String("HelloWorld");

	/*	for (int i=zfc.length()-1;i>=0;i--) {
			if(zfc.charAt(i)>='a'&&zfc.charAt(i)<='z')
				System.out.print((char)(zfc.charAt(i)-32));
			else if(zfc.charAt(i)>='A'&&zfc.charAt(i)<='Z')
				System.out.print((char)(zfc.charAt(i)+32));
	*/
			StringBuffer sb=new StringBuffer();
			char[] zfsz=zfc.toCharArray();
			for (int i = zfsz.length-1; i >= 0; i--) {
				char zf=zfsz[i];
				if(Character.isUpperCase(zf)) {
					String zfc1=(""+zf).toLowerCase();
					sb.append(zfc1);
				}
				else if(Character.isLowerCase(zf)) {
					String zfsc2=(""+zf).toUpperCase();
					sb.append(zfsc2);
				}

				
			}
			System.out.println(sb);
		}

	
}
