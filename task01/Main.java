package by.htp.les10.main.task01;

/*Задача 1.
Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.
*/
public class Main {

	public static void main(String[] args) {

		Directory newDirectory = new Directory();
		newDirectory.addTextFile("New File");

		TextFile textFile = new TextFile("New File-1");

		textFile.addContent("Это первое предложение. ");
		textFile.addContent("Это второе предложение. ");

		textFile.setName("Блокнот.txt");

		print(textFile);

	}

	public static void print(TextFile file) {
		System.out.println("Файл " + file.getName() + " содержит:\n" + file.getContent());
	}

}
