package system;

public class Desktop extends Computer {
	public void desktopSize()
	{
		System.out.println("Inside Computer desktop size function");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop obj = new Desktop();
		System.out.println("single inheritance");
		obj.computerModel();
		obj.desktopSize();

	}

}
