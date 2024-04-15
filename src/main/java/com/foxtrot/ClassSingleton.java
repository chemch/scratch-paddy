package com.foxtrot;

public final class ClassSingleton {
	  private static ClassSingleton INSTANCE;
	    private String info = "Initial info class";
	    //private int infoLength = info.length();
	    
	    public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
		}

		private ClassSingleton() {        
	    }
	    
	    public static ClassSingleton getInstance() {
	        if(INSTANCE == null) {
	            INSTANCE = new ClassSingleton();
	        }
	        
	        return INSTANCE;
	    }
}