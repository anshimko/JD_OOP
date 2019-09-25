package by.htp.les10.main.task04.dao.impl;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.htp.les10.main.task04.bean.Treasure;
import by.htp.les10.main.task04.dao.DAOException;
import by.htp.les10.main.task04.dao.TreasureDao;

public class FileTreasure implements TreasureDao {

	final String SOURCE = "cave.txt";

	@Override
	public List<Treasure> takeTreasure() throws DAOException {

		List<Treasure> cave = new ArrayList<Treasure>();

		

		try {
			FileReader fr = new FileReader(SOURCE);
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(fr);

			while (scan.hasNextLine()) {
				String str = scan.nextLine();
				cave.add(newTreasure(str));
			}
			fr.close();

		} catch (IOException e) {
			throw new DAOException(e);
		} 

		return cave;
	}

	private static Treasure newTreasure(String str) {
		String name = str.split(" ")[0];
		int value = Integer.parseInt(str.split(" ")[1]);

		return new Treasure(name, value);
	}

}
