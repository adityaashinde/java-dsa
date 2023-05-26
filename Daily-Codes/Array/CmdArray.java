class CmdArray{
	public static void main(String [] args){

		String friends[] = {"Adii", "Kanha", "Amol", "Sai"};

		for(String str : friends ){
			System.out.println(str);
		}
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
}
}
