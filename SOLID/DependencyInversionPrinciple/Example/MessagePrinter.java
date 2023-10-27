package SOLID.DependencyInversionPrinciple.Example;

//import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file
	public void writeMessage(Message msg, Formatter formatter,PrintWriter writer) throws IOException {
		// Formatter formatter = new JSONFormatter();//creates formatter
		// try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { //creates print writer
		// 	writer.println(formatter.format(msg)); //formats and writes message
		// 	writer.flush();
		// }


		writer.println(formatter.format(msg)); //formats and writes message
		writer.flush();
	}
}
