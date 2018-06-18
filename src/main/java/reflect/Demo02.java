package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) 
			throws ClassNotFoundException, 
			InstantiationException, IllegalAccessException, 
			NoSuchMethodException, SecurityException, 
			IllegalArgumentException, InvocationTargetException {
		Scanner in=new Scanner(System.in);
		System.out.println("类名:");
		String className=in.nextLine();
		System.out.println("方法名:");
		String methodName=in.nextLine();
		
		//动态加载类
		Class cls=Class.forName(className);
		//动态创建对象
		Object obj=cls.newInstance();
		//动态查找一个无参方法
		Method method=cls.getDeclaredMethod(methodName,int.class);
		//打开方法访问限制
		method.setAccessible(true);
		//动态调用一个无参方法
		Object value=method.invoke(obj,1);
		System.out.println(value);
	}
}
