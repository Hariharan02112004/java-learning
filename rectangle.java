class rect{ //Class creation
	int length;
	int breadth;
	void insert(int l,int b){ //method creation
	length =l;
	breadth =b;
	}
	void calculate(){ //Method creation
	System.out.println("The area is "+(length*breadth));
	}

}

class rectangle{
	public static void main(String[]args){
	rect r1=new rect(); //obj 1
	rect r2=new rect(); //obj2
	r1.insert(10,5);
	r2.insert(2,10);
	r1.calculate();
	r2.calculate();
	}

}
