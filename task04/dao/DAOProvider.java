package by.htp.les10.main.task04.dao;

import by.htp.les10.main.task04.dao.impl.FileTreasure;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	public static DAOProvider getInstance() {
		return instance;
	}

	private DAOProvider() {
	}

	private TreasureDao fileTreasureDAO = new FileTreasure();

	public TreasureDao getFileTreasureDao() {
		return fileTreasureDAO;
	}

}
