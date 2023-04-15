package com.jsp.hospital_app.dao;

import java.util.List;

import com.jsp.hospital_app.dto.Item;
import com.jsp.hospital_app.dto.MedOrder;

public interface ItemDao {
	Item saveItem(int iid,Item item);
	Item getItemId(int iid);
	boolean deleteItemId(int iid);
	Item updateItem(int iid,Item item);
	List<Item> getAllItems();
}
