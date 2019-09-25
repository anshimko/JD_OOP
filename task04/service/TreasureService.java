package by.htp.les10.main.task04.service;

import java.util.List;

import by.htp.les10.main.task04.bean.Treasure;

public interface TreasureService {

	public List<Treasure> viewTreasure() throws ServiceException;

	public Treasure takeExpensiveTreasure() throws ServiceException;

	public List<Treasure> takeSumTreasure(int value) throws ServiceException;

}
