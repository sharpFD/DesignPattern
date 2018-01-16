package Test;

import java.lang.reflect.Proxy;

public class Test1 {
	public static void main(String[] args) {
		//Class c=UserServiceImpl.class;
		UserService s=new UserServiceImpl();
		UserService service=
		(UserService) Proxy.newProxyInstance(s.getClass().getClassLoader(), s.getClass().getInterfaces(), new MyHandle(s));
		service.login();
		service.register();
	}
}
