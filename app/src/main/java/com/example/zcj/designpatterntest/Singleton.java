//懒汉式，线程不安全 最基本的单例方式 
//最大的问题是不支持多线程，因为没有加锁
public class Singleton{
	private  static Singleton instance;
	private Singleton (){
	}
	public static Singleton getIncetance{
		if(incetance ==null){
			incetance = new Singleton();
		}
			return incetance;
	}
}

//懒汉式，线程安全 避免浪费内存 加锁影响效率
public class Singleton {
	private static Singleton instance;
	private Singleton(){}
	public static synchronized Singleton getIncetance(){
		if(instance ==null ){
			instance = new Singleton();
		}
		return instance;
	}
}
/*饿汉式 比较常用，但是容易产生垃圾对象
  优点：没有加锁，执行效率会提高
  缺点：类加载时就初始化，浪费内存*/
public class Singleton {
	private static Singleton instance = new Singleton();
	private Singleton(){}
	public static Singleton getIncetance(){
		return instance;
	}
}