package com.hsh24.dms.trade.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import com.hsh24.dms.api.trade.bo.Trade;
import com.hsh24.dms.framework.dao.impl.BaseDaoImpl;
import com.hsh24.dms.trade.dao.ITradeDao;

/**
 * 
 * @author JiakunXu
 * 
 */
public class TradeDaoImpl extends BaseDaoImpl implements ITradeDao {

	@Override
	public Long createTrade(Trade trade) {
		return (Long) getSqlMapClientTemplate().insert("trade.createTrade", trade);
	}

	@Override
	public BigDecimal getTradePrice(Trade trade) {
		return (BigDecimal) getSqlMapClientTemplate().queryForObject("trade.getTradePrice", trade);
	}

	@Override
	public int getTradeCount(Trade trade) {
		return (Integer) getSqlMapClientTemplate().queryForObject("trade.getTradeCount", trade);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Trade> getTradeList(Trade trade) {
		return (List<Trade>) getSqlMapClientTemplate().queryForList("trade.getTradeList", trade);
	}

	@Override
	public Trade getTrade(Trade trade) {
		return (Trade) getSqlMapClientTemplate().queryForObject("trade.getTrade", trade);
	}

	@Override
	public int updateTrade(Trade trade) {
		return getSqlMapClientTemplate().update("trade.updateTrade", trade);
	}

}
