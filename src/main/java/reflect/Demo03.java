package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) 
			throws ClassNotFoundException, 
			InstantiationException, IllegalAccessException, 
			IllegalArgumentException, InvocationTargetException {
		Scanner in=new Scanner(System.in);
		System.out.println("类名:");
		String className=in.nextLine();
		
		//动态加载类
		Class cls=Class.forName(className);
		//动态创建对象
		Object obj=cls.newInstance();
		//动态查找方法
		Method[] methods=cls.getDeclaredMethods();
		//检查每个方法是否半酣指定注解
		for(Method method : methods) {
			Object ann=method.getAnnotation(Test.class);
			//如果ann不是null,则说明包含Test注解
			if(ann!=null) {
				//执行找到的方法
				method.invoke(obj);
			}
		}
	}
}	
