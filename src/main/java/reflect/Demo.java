package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner in=new Scanner(System.in);
		System.out.println("��������:");
		String className=in.nextLine();
		//��̬(�����ڼ�)�����ൽ�ڴ���
		Class cls=Class.forName(className);
		System.out.println(cls);
		System.out.println(cls.getName());
		//��̬��������
		Object obj=cls.newInstance();
		System.out.println(obj);
		//��̬��ȡ���������ķ�����Ϣ
		Method[] methods=cls.getDeclaredMethods();
		for( Method method:methods) {
			System.out.println(method);
		}
	}
}
