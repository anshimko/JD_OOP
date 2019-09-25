package by.htp.les10.main.task04.main;

/*Задача 4.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.
*/

import java.util.List;

import by.htp.les10.main.task04.bean.Treasure;
import by.htp.les10.main.task04.dao.impl.FileTreasure;
import by.htp.les10.main.task04.service.ServiceException;
import by.htp.les10.main.task04.service.ServiceProvider;

public class Main {

	public static void main(String[] args) {

		// самое дорогое сокровище
		try {
			print(ServiceProvider.getInstance().getTreasureService().takeExpensiveTreasure());
		} catch (ServiceException e) {
			System.out.println("ServiceException");
			e.printStackTrace();
		}
		
		// сокровища на определенную сумму
		try {
			print(ServiceProvider.getInstance().getTreasureService().takeSumTreasure(300));
		} catch (ServiceException e) {
			System.out.println("ServiceException");
			e.printStackTrace();
		}

		// просмотр всех сокровищ
		try {
			print(ServiceProvider.getInstance().getTreasureService().viewTreasure());
		} catch (ServiceException e) {
			System.out.println("ServiceException");
			e.printStackTrace();
		}

	}

	public static void print(Treasure tr) {
		System.out.println(tr.toString());
	}

	public static void print(List<Treasure> treasures) {
		for (Treasure tr : treasures) {
			System.out.println(tr.toString());
		}
	}

}
