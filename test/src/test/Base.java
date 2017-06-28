package test;

public class Base {
	protected String flag = "";
	
	public void test() throws Exception{
		try{
			test1();
		}catch (Exception e) {
			System.out.println("-------------");
			System.out.println(e.getMessage());
		}
	}
	
	public void test1(){
		int i = 0;
		int j = 10/i;
	}
	
	public static void main(String[] args) throws Exception {
		Base b = new Base();
		b.test();
	}
}
