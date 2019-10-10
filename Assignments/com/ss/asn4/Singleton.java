package com.ss.asn4;

public class Singleton {
	private static volatile Singleton _instance;
	/*First check is made at the first if statement
	 *Second check is made at the Second if
	 * _instance is volatile
	 * */
	public static Singleton getInstance() {
        if (_instance == null) {
            synchronized (Singleton.class) {
                if (_instance == null) {
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }

public static void main(String[] args) {
	// TODO Auto-generated method stub
		getInstance();
	}



}
