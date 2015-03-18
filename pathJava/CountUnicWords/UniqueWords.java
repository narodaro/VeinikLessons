//import java.io.*;
//import java.util.HashSet;
//import java.util.StringTokenizer;
//
//public class NamesFilter implements FilenameFilter {
//	String pattern;
//	NamesFilter(String pattern){
//		this.pattern = pattern;
//	}
//	@Override
//	public boolean accept(File dir, String name) {
//		String s = new File(name).getName();
//		return s.indexOf(pattern) != -1;
//	}
//}
//import java.io.*;
//import java.util.HashSet;
//import java.util.StringTokenizer;
//
//public class UniqueWords {
//	static void getOnlyJavaFIlesAndCountUniqueWords(File f) throws IOException {
//		String [] javaNames = f.list(new NamesFilter(".java"));
//		String content = null;
//		String tempString = null;
//		for(int i = 0 ; i < javaNames.length; i++){
//			BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Java\\FolderFive\\"+javaNames[i])));
//			while ((tempString = br.readLine()) != null){
//				content+=tempString + "\n";
//			}
//			br.close();
//			System.out.println(content);
//		}
//		StringTokenizer st = new StringTokenizer(content);
//		HashSet<String> set = new HashSet<String>();
//		while (st.hasMoreElements() == true){
//			set.add(st.nextToken());
//		}
//		System.out.println("All java files in C//Java//FolderFieve// have "+set.size()+" unique wors.");
//
//	}
//
//}