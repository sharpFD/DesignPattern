package com.briup.pattern.structure.Proxy.DynamicProxy;

//接口的一个简单实现
public class StudentServiceImpl implements IStudentService {
	public void delete(long id) {
		System.out.println("student is deleted... id="+id);
	}
	public Student find(long id) {
		System.out.println("student is found...id="+id);
		return null;
	}
	public void save(Student s) {
		System.out.println("student is saved...s="+s);
	}
}
