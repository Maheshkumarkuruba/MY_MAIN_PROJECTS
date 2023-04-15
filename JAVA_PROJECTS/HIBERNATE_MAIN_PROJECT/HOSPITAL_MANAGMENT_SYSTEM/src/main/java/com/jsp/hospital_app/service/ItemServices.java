package com.jsp.hospital_app.service;

import com.jsp.hospital_app.dao.imp.EncounterDaoImpl;
import com.jsp.hospital_app.dao.imp.ItemDaoImpl;
import com.jsp.hospital_app.dto.Encounter;
import com.jsp.hospital_app.dto.Item;

public class ItemServices {
	ItemDaoImpl itemdaoimpl =new ItemDaoImpl();
	public void saveItem(Item item,int bid) {
		Item item1 =itemdaoimpl.saveItem(bid,item);
		if(item1!=null) {
			System.out.println("branch is save");
		}
		else {
			System.out.println("unfaortunatly data is not save");
		}
	}
	public Item getItemById(int iid) {
		Item item=itemdaoimpl.getItemId(iid);
			if(item!=null) {
				return item;
			}
			else {
				return null;
			}
		}
	public void deleteItemById(int iid) {
		boolean flag=itemdaoimpl.deleteItemId(iid);
		if(flag) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("data not found");
		}
	}
	public Item updateItemById(int iid,Item item) {
		Item item1=itemdaoimpl.updateItem(iid,item);
		if(item1!=null) {
			return item1;
		}
		return null;
	}
	
}
