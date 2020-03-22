public class PrintExec {
	public static void main(String[] args) {
			String str1="javac ";
			String str2="java ";
			String nameclass=args[1];
			if(nameclass.charAt(0)=='\''){
				nameclass.substring(1,nameclass.length()-1);
			}
			str1=str1+"-cp "+"'.:"+args[0]+"' "+"'"+args[0]+args[1]+".java'"+((args[args.length-1].equals("true"))?" -d bin/":"");
			str2=str2+"-cp "+"'.:"+args[0]+((args[args.length-1].equals("true"))?":bin/":"")+"' "+args[1];
			System.out.println(str1);
			System.out.println(str2);
}
}
