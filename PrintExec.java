public class PrintExec {
	public static void main(String[] args) {
			String str1="javac ";
			String str2="java ";
			String nameclass=args[0];
			if(nameclass.charAt(0)=='\''){
				nameclass.substring(1,nameclass.length()-1);
			}
			str1=str1+args[0]+nameclass;
			str2=str2+args[1];
			System.out.println(str1);
			System.out.println(str2);
}
}
