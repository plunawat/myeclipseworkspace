package com.prl;

class WorkWithJson {
	
	 static void main(def args)	{
		
		File f1 = new File('Input.json');
		FileReader fi = new FileReader(f1);
		
		BufferedReader br = new BufferedReader(fi);
		
		StringBuilder strB = new StringBuilder();
		String str
		while((str=br.readLine()) != null)	{
			strB.append(str);
		}
		
		println strB;
	}

}
