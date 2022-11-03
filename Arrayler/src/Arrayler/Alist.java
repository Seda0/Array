package Arrayler;

import java.util.ArrayList;

public class Alist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayList<String> dizi=new ArrayList<String>();
		dizi.add("red");
		dizi.add("yellow");
		dizi.add("green");
		dizi.add(1,"orange");
		for(int i=0; i<=dizi.size();i++) {
		System.out.println(dizi.get(i));	
		}
		if(dizi.contains("red")) {
		System.out.println("Dizi icinde red var");
		}
		else 
			System.out.println("Dizi icinde red yok");
		
	System.out.println("Green degerinin indeksi :" + dizi.indexOf("green"));
	
	
	}

}
