package abc;

public class TestDemo1 {
	public static void main(String[] args) {
		//java语言浮点型常量默认为DOUBLE型，声明一个float型常量，需在常量后面加上F或者f
		float floatNumber=3.14F;
		//直接在控制台输出者两种类型的最小值和最大值
		
		System.out.println("float最小值="+Float.MIN_VALUE);
		System.out.println("float最小数="+Float.MAX_VALUE);
		System.out.println("double最小值="+Double.MIN_VALUE);
		System.out.println("double最大值="+Double.MAX_VALUE);

		//java字符的使用方法
		char eChar='q';
		char cChar='桥';
		System.out.println(eChar);
		System.out.println("显示汉字："+cChar);
		
		char tChar='\u0061';
		System.out.println("UNICODE代码中0051代表的字符为:"+tChar);
		char fChar='\t';
		System.out.println(fChar+"UNICODE代码0061代表的字符为："+tChar);
		
		//布尔型
	/*	boolean flag=true;
		while(flag){
			System.out.println("authur is the most hansome man in the world");}*/
			
		//常量的输出
			final int STU_AGE=22;
			System.out.println(STU_AGE);
		    
		//PLAY JOKES
		System.out.println("YOU ARE THE BEST");
		
	}

}
