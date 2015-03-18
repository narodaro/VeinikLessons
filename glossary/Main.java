package com.veinik.glossary;

public class Main {
	public static void main(String[] args) {

		Glossary glossary = new Glossary();

		glossary.addWord("Abstract Window Toolkit", "(AWT) - Набор компонент графического пользовательского интерфейса, " +
				"реализованных с использованием платформо-зависимого кода. Эти компоненты предоставляют множество функций," +
				" общих для всех платформ. Вытесняется компонентным набором Swing Set.");
		glossary.addWord("abstract method", "Метод, не имеющий реализации.");
		glossary.addWord("API", "(Application Programming Interface) - Интерфейс прикладных программ." +
				" Описание доступа к данным и методам классов, которыми пользуется программист при написании приложений.");
		glossary.addWord("ASCII", "(American Standart Code for Information Inetr) - Стандартный семиразрядный код символов.");
		glossary.addWord("bytecode", "Машинно-независимый код, который генерирует Java-компилятор. Байт-код выполняется Java-интерпретатором.");
		glossary.addWord("class", "В Java это тип, описывающий структуру заданного объекта.");
		glossary.addWord("compiler", "Программа, транслирующая исходный текст программы в машинный код, который будет выполняться." +
				" Компилятор Java транслирует исходный Java-код в Java байт-код.");
		glossary.addWord("exception", "Событие, возникающее во время выполнения программы, препятствующее нормальному" +
				" продолжению ее выполнения; обычно происходит из-за ошибок.");
		glossary.addWord("interpreter", "Программа, которая декодирует и исполняет каждую команду программы. " +
				"Интерпретатор Java декодирует и исполняет Java байт-код.");
		glossary.addWord("JVM", "Java Virtual Machine  - виртуальная машина Java. Часть среды исполнения Java, выполняющая интерпретацию Java байт-кода.");
		glossary.addWord("JavaScript", "Открытый межплатформенный объектный язык, разработанный компанией Netscape для создания приложений. Часто его путают с Java.");

		glossary.print(glossary.showMinning("API"));
		glossary.delWord("API");
		glossary.print(glossary.showMinning("API"));
		glossary.print(glossary.showMinning("compiler"));
		glossary.print(glossary.showMinning("JVM"));
		glossary.print(glossary.showMinning("JavaScript"));

	}
}
