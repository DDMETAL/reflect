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
		System.out.println("����:");
		String className=in.nextLine();
		System.out.println("������:");
		String methodName=in.nextLine();
		
		//��̬������
		Class cls=Class.forName(className);
		//��̬��������
		Object obj=cls.newInstance();
		//��̬����һ���޲η���
		Method method=cls.getDeclaredMethod(methodName,int.class);
		//�򿪷�����������
		method.setAccessible(true);
		//��̬����һ���޲η���
		Object value=method.invoke(obj,1);
		System.out.println(value);
	}
}
