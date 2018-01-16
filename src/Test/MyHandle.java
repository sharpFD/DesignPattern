package Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandle  implements InvocationHandler{
	private UserService service;
	public MyHandle(UserService service) {
		this.service=service;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub\
		System.out.println("test...........");
		Object obj=method.invoke(service, args);
		return obj;
	}

}
