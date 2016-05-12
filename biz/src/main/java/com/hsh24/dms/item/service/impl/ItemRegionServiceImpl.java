package com.hsh24.dms.item.service.impl;

import java.util.List;

import com.hsh24.dms.api.item.IItemRegionService;
import com.hsh24.dms.api.item.bo.Item;
import com.hsh24.dms.framework.log.Logger4jCollection;
import com.hsh24.dms.framework.log.Logger4jExtend;
import com.hsh24.dms.item.dao.IItemRegionDao;
import com.wideka.weixin.framework.util.LogUtil;

/**
 * 
 * @author JiakunXu
 * 
 */
public class ItemRegionServiceImpl implements IItemRegionService {

	private Logger4jExtend logger = Logger4jCollection.getLogger(ItemRegionServiceImpl.class);

	private IItemRegionDao itemRegionDao;

	@Override
	public List<Item> getItemList(String[] region) {
		if (region == null || region.length == 0) {
			return null;
		}

		Item item = new Item();
		item.setCodes(region);

		try {
			return itemRegionDao.getItemList(item);
		} catch (Exception e) {
			logger.error(LogUtil.parserBean(item), e);
		}

		return null;
	}

	public IItemRegionDao getItemRegionDao() {
		return itemRegionDao;
	}

	public void setItemRegionDao(IItemRegionDao itemRegionDao) {
		this.itemRegionDao = itemRegionDao;
	}

}
