package inheritance_project;

public class Hybrid_inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildD cd=new ChildD();
		ChildE ce=new ChildE();
		ChildF cf=new ChildF();
		cd.m1();
		cd.m2();
		cd.m4();
		System.out.println("---------");
		ce.m1();
		ce.m3();
		ce.m5();
		System.out.println("---------");
		cf.m1();
		cf.m3();
		cf.m6();
	}
}

class GParentA{
	void m1() {
		System.out.println("GParent A class");
	}
	
}
class ParentB extends GParentA{
	void m2() {
		System.out.println("Parent B class");
	}
	
}
class ParentC extends GParentA{
	void m3() {
		System.out.println("Parent C class");
	}
	
}
class ChildD extends ParentB{
	void m4() {
		System.out.println("Child D class");
	}
	
}
class ChildE extends ParentC{
	void m5() {
		System.out.println("Child E class");
	}
	
}
class ChildF extends ParentC{
	void m6() {
		System.out.println("Child F class");
	}
	
}