package by.tc.task01.dao;

import by.tc.task01.dao.impl.FileApplianceDAOImpl;

public final class DAOFactory {

	private static final DAOFactory instance = new DAOFactory();

	private final DAOAppliance dAOAppliance = new FileApplianceDAOImpl();

	private DAOFactory() {
	}

	public DAOAppliance getApplianceDAO() {
		return dAOAppliance;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}