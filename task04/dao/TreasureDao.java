package by.htp.les10.main.task04.dao;

import java.util.List;

import by.htp.les10.main.task04.bean.Cave;
import by.htp.les10.main.task04.bean.Treasure;

public interface TreasureDao {
	
	List<Treasure> takeTreasure () throws DAOException;
	
	

}
