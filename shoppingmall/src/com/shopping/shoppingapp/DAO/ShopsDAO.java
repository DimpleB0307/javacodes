package com.shopping.shoppingapp.DAO;

import java.util.Collection;

import com.shopping.shoppingapp.dto.ShopsDTO;
public class ShopsDAO {

	public void saveShop(ShopsDTO shopsDTO);
	public Collection<ShopsDTO> getAllShops();
	public void updateFloorByName(String floor,String shopName);
	public void deleteShopByShopId(int shopId);

}

