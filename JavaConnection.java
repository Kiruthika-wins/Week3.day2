package week3.day2.HomeAssignments;

public class JavaConnection extends AbstractClass{

	@Override
	public void connect() {
		System.out.println("Implement connect through concrete class");
	}

	@Override
	public void disconnect() {
		System.out.println("Implement disconnect through concrete class");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Implement execute through concrete class");
	}
	
public static void main(String[] args) {
	
	JavaConnection jc=new JavaConnection();
	jc.Abstractconnect();
	jc.connect();
	jc.disconnect();
	jc.executeUpdate();
	
		
	}

}
