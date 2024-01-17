package Blocks;

class Demo7 {
	static int a= 20;
	int b =30;
    static {
    	a=30;
    	
   
    }
    {
    	b=35;
    	a=50;
    }


	public static void main(String[] args) {
		Demo7 s1 = new Demo7();
		
     System.out.println(a);
     System.out.println(s1.b);
	
	}
	}

