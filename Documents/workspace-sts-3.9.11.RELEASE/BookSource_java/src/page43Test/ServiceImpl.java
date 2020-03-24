package page43Test;

public class ServiceImpl implements Service {
	private Bar bar;
	private String email;
	
	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void print() {

		System.out.println("bar : " +bar+"\n email : "+email);
	}

}
