package by.htp.les10.main.task05a.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.les10.main.task05a.command.impl.AddCoverCommand;
import by.htp.les10.main.task05a.command.impl.AddFlowerCommand;
import by.htp.les10.main.task05a.command.impl.CreateBouquetCommand;
import by.htp.les10.main.task05a.command.impl.TakeBouquetCommand;

public class CommandProvider {
	
	private Map<String, Command> commands;

	public CommandProvider() {
		commands = new HashMap<String, Command>();
		
		commands.put("createBouquet", new CreateBouquetCommand());
		commands.put("addFlower", new AddFlowerCommand());
		commands.put("addCover", new AddCoverCommand());
		commands.put("takeBouquet", new TakeBouquetCommand());
	}
	
	public Command getCommand(String CommandName) {
		Command command;
		command = commands.get(CommandName);
		return command;
		
	}
	
	

}
