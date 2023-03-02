package javademo.methodReference;

interface Sayable{  
    void say();  
}  
public class Say {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
//        // Referring static method  
//        Sayable sayable = Say::saySomething;  
//        // Calling interface method  
//        sayable.say();  
    	
//    	anonymous inner class
    	Sayable s = new Sayable() {
			
			@Override
			public void say() {
				Say.saySomething();
				
			}
		};
		s.say();
		
//		converting to lambda expression
		Sayable s1 = () ->Say.saySomething();
    	s1.say();
    	
//    	converting to method reference
    	Sayable s2 = Say::saySomething;
    	s2.say();
    }  
} 