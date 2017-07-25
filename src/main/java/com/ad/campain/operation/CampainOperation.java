package com.ad.campain.operation;

import java.util.Hashtable;

import com.ad.campain.model.Campain;

public class CampainOperation {

	private static final Hashtable<String, Campain> campains=new Hashtable<>();
	
	public static void add(String campain_id,Campain campain){
		campains.put(campain_id, campain);
	}
	
	public static Campain get(String campain_id){
		return campains.get(campain_id);
	}
	
}
