package CallBy;

//Q.2 Fix the compilation error and run the program
class DisplayMessage {
void printMessage() {
	System.out.println("Hello My Message"); //We use only one bracket 'System.out.println(' after this statement
}
}
public class MyProgram {
	public static void main(String args[]) {
		DisplayMessage program=new DisplayMessage(); //Here we need to call "DisplayMessage" class to use the method "printMessage()"
		program.printMessage();
	}

}
