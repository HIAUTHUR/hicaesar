package abc;

public class TestDemo1 {
	public static void main(String[] args) {
		//java���Ը����ͳ���Ĭ��ΪDOUBLE�ͣ�����һ��float�ͳ��������ڳ����������F����f
		float floatNumber=3.14F;
		//ֱ���ڿ���̨������������͵���Сֵ�����ֵ
		
		System.out.println("float��Сֵ="+Float.MIN_VALUE);
		System.out.println("float��С��="+Float.MAX_VALUE);
		System.out.println("double��Сֵ="+Double.MIN_VALUE);
		System.out.println("double���ֵ="+Double.MAX_VALUE);

		//java�ַ���ʹ�÷���
		char eChar='q';
		char cChar='��';
		System.out.println(eChar);
		System.out.println("��ʾ���֣�"+cChar);
		
		char tChar='\u0061';
		System.out.println("UNICODE������0051������ַ�Ϊ:"+tChar);
		char fChar='\t';
		System.out.println(fChar+"UNICODE����0061������ַ�Ϊ��"+tChar);
		
		//������
	/*	boolean flag=true;
		while(flag){
			System.out.println("authur is the most hansome man in the world");}*/
			
		//���������
			final int STU_AGE=22;
			System.out.println(STU_AGE);
		    
		//PLAY JOKES
		System.out.println("YOU ARE THE BEST");
		
	}

}
