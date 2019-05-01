/*
 * © ⅳ
 */

package dembicki.sys;

public enum SystemOut {
	BOLD(1), UNDERLINE(4), NEGATIVE(7),
	TEXT_BLACK(30), TEXT_RED(31), TEXT_GREEN(32), TEXT_YELLOW(33), TEXT_BLUE(34), TEXT_MAGENTA(35), TEXT_CYAN(36), TEXT_WHITE(37), TEXT_DEFAULT_COLOR(39),
	BG_BLACK(40), BG_RED(41), BG_GREEN(42), BG_YELLOW(43), BG_BLUE(44), BG_MAGENTA(45), BG_CYAN(46), BG_WHITE(47), BG_DEFAULT_COLOR(49);

	private static final String START_FORMAT = "\u001B[", END_FORMAT = "m", CLEAR_FORMAT = "\u001B[0m", DELIMITER = ";";

	public static void printLn(String input, SystemOut... properties) {
		System.out.println(apply(input, properties));
	}

	public static void print(String input, SystemOut... properties) {
		System.out.print(apply(input, properties));
	}

	private static String apply(String input, SystemOut... properties) {
		StringBuilder formatString = new StringBuilder();
		formatString.append(START_FORMAT);
		for (SystemOut propertySGR : properties) {
			if (propertySGR != null) {
				String property = propertySGR.codeSGR + DELIMITER;
				formatString.append(property);
			}
		}
		return formatString + END_FORMAT + input + CLEAR_FORMAT;
	}

	// SGR — Select Graphic Rendition
	private int codeSGR;

	SystemOut(int value) {
		this.codeSGR = value;
	}

}

