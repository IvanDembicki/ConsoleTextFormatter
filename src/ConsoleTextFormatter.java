/*
 * © ⅳ
 */


import dembicki.sys.SystemOut;

import static dembicki.sys.SystemOut.*;


public class ConsoleTextFormatter {

	public static void main(String[] args) {
		printExample();
	}

	private final static SystemOut[] ERROR_STYLE = new SystemOut[]{BOLD, BG_RED, TEXT_WHITE};
	private final static SystemOut[] WARNING_STYLE = new SystemOut[]{BOLD, TEXT_RED, BG_YELLOW};

	private static void printExample() {
		SystemOut.printLn("☛ SystemOut text formatter usage example ☚", TEXT_RED, BOLD);

		printLn(" Blue text ", TEXT_BLUE);
		printLn(" Underline text ", TEXT_BLUE, UNDERLINE);
		printLn(" Null format ");
		printLn(" Green background ", BG_GREEN);
		printLn(" Negative ", NEGATIVE);
		printLn("");

		printLn(" Error style example ", ERROR_STYLE);
		printLn(" Warning style example ", WARNING_STYLE);
	}


}


