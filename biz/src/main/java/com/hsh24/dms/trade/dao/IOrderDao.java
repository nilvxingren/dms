package com.hsh24.dms.trade.dao;

import java.util.List;

import com.hsh24.dms.api.trade.bo.Order;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface IOrderDao {

	/**
	 * 
	 * @param order
	 * @return
	 */
	int createOrder4Item(Order order);

	/**
	 * 
	 * @param order
	 * @return
	 */
	int createOrder4Cart(Order order);

	/**
	 * 
	 * @param order
	 * @return
	 */
	List<Order> getOrderList(Order order);

	/**
	 * 
	 * @param order
	 * @return
	 */
	Order getOrder(Order order);

}
