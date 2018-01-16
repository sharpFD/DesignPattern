package com.briup.pattern.structure.Proxy.DynamicProxy;

//Service接口 处理学生的相关业务
public interface IStudentService {
	void save(Student s);
	void delete(long id);
	Student find(long id);
}
