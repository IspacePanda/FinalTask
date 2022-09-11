package by.tc.task01.service.impl;

import java.util.List;

import by.tc.task01.dao.DAOAppliance;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.validation.ApplianceValidator;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) throws ServiceException {
		
		if (!ApplianceValidator.criteriaValidator(criteria)) {
			throw new ServiceException("Invalid values");
		}

		DAOFactory factory = DAOFactory.getInstance();
		DAOAppliance dAOAppliance = factory.getApplianceDAO();

		List<Appliance> appliances;
		try {
			appliances = dAOAppliance.find(criteria);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		return appliances;
	}

}