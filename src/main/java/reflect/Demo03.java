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
		System.out.println("����:");
		String className=in.nextLine();
		
		//��̬������
		Class cls=Class.forName(className);
		//��̬��������
		Object obj=cls.newInstance();
		//��̬���ҷ���
		Method[] methods=cls.getDeclaredMethods();
		//���ÿ�������Ƿ�뺨ָ��ע��
		for(Method method : methods) {
			Object ann=method.getAnnotation(Test.class);
			//���ann����null,��˵������Testע��
			if(ann!=null) {
				//ִ���ҵ��ķ���
				method.invoke(obj);
			}
		}
	}
}	
