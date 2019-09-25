package by.htp.les10.main.task04.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.les10.main.task04.bean.Treasure;
import by.htp.les10.main.task04.dao.DAOException;
import by.htp.les10.main.task04.dao.DAOProvider;
import by.htp.les10.main.task04.service.ServiceException;
import by.htp.les10.main.task04.service.TreasureService;

public class TreasureServiceImpl implements TreasureService {

	@Override
	public List<Treasure> viewTreasure() throws ServiceException {
		DAOProvider provider = DAOProvider.getInstance();
		List<Treasure> viewTreasure;
		

		try {
			viewTreasure = provider.getFileTreasureDao().takeTreasure();
		
		} catch (DAOException e) {
			
			throw new ServiceException(e);
		}
		return viewTreasure;
	}

	@Override
	public Treasure takeExpensiveTreasure() throws ServiceException {
		Treasure tr = new Treasure();

		DAOProvider provider = DAOProvider.getInstance();

		try {
			for (Treasure treasure : provider.getFileTreasureDao().takeTreasure()) {
				if (tr.getValue() < treasure.getValue()) {
					tr = treasure;
				}
			}
		} catch (DAOException e) {
			
			throw new ServiceException(e);
		}

		return tr;
	}

	@Override
	public List<Treasure> takeSumTreasure(int value) throws ServiceException {
		DAOProvider provider = DAOProvider.getInstance();
		List<Treasure> treasures = new ArrayList<>();
		int sum = 0;

		try {
			
			for (Treasure treasure : provider.getFileTreasureDao().takeTreasure()) {
				sum = sum + treasure.getValue();
				if(sum <= value) {
				treasures.add(treasure);
				}
			}
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return treasures;
	}

}
