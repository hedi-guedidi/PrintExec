public class PrintExec {
	public static void main(String[] args) {
			String res1="javac";
			String res2="java";
			String mainclass="";
			String mainclasspath="";
			String libs=".";
			String bin="";
			String bin2="";
			int point=args.length-1;
			if(args[args.length-1].equals("true")){
				bin="-d bin/";
				bin2="bin/";
				point--;
			}
			if(args[args.length-1].equals("false")){
				point--;
			}
			mainclass=args[point];
			point--;
			mainclasspath=args[point];
			point--;
			while(point>=0){
				libs=libs+":"+args[point];
				point--;
			}
			res1=res1+" -cp "+"'"+libs+":"+mainclasspath+"'"+" '"+mainclasspath+mainclass+".java"+"' "+bin;
			res2=res2+" -cp "+"'"+libs+":"+mainclasspath+":"+bin2+"' "+mainclass;
			System.out.println(res1);
			System.out.println(res2);
}
}
