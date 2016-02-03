package com.adms.mglplanlv.service.campaign;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.adms.mglplanlv.entity.Campaign;

public interface CampaignService {

	public List<Campaign> find(Campaign example) throws Exception;
	public List<Campaign> findByHql(String hql, Object...objects) throws Exception;
	public List<Campaign> findByCriteria(DetachedCriteria detachedCriteria) throws Exception;
	public List<Campaign> findCampaignByLikeListLot(String listLot) throws Exception;
	
}
