package virtualkeyproject;

import  virtualkeyproject.FileOperation;
import  virtualkeyproject.Opeartionhandling;
import  virtualkeyproject.MenuOption;

public class Locked {
public static void main(String[] args) {
		FileOperation.createMainFolderIfNotPresent("main");
		
		MenuOption.printWelcomeScreen("Lockedme", "pratiksha");
		
		Opeartionhandling.handleWelcomeScreenInput();
	}


}
