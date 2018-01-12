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
  	}
  }
//双重校验锁 实现难度较为复杂 getIncetance的性能对应用程序很关键
//使用双重锁的方式，在多线程的情况下能够保持高性能
  public class Singleton {
  	private static Singleton incetance;
  		return instance;
  	private Singleton(){}
  	public static Singleton getIncetance{
  		if (instance==null) {
  			synchronized(Singleton.class){
  				instance = new Singleton();
  			}
  			return instance;
  		}
  	}
  }
  //登记式/静态内部类
  //实现简单 达到和双检锁一样的功效 对静态域使用延迟初始化，
  //应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，
  //双检锁方式可在实例域需要延迟初始化时使用
  public class Singleton{
  	private static class SingletonHolder{
  		private static final Singleton INCETANCE = new Singleton();
  	}
  	private Singleton();
  	public static final Singleton getIncetance(){
  		return SingletonHolder.INCETANCE;
  	}
  }
