class person_detail{
	int id;
	String name;
	void print_statement(int id,String name){
		System.out.print("The id is : "+this.id);
		System.out.print("The name is "+this.name);
	}
}

class person{
	public static void main{String[]args){
		person_detail pr=new person_detail();//obj creation for person_detail class
		pr.id=289;
		pr.name="Thorfin";
		pr.print_statement(pr.id,pr.name);
	}

}