package sh;

public class Test {
	
	 // 将初始二进制字符串转换成字符串数组，以空格相隔 
    static private String[] StrToStrArray(String str) { 
        return str.split(" "); 
    } 

	static private String StrToBinstr(String str) {
		char[] strChar = str.toCharArray();
		String result = "";
		for (int i = 0; i < strChar.length; i++) {
			result += Integer.toBinaryString(strChar[i]) + " ";
		}
		return result;
	}

    static private String BinstrToBinstr16(String input) { 
        StringBuffer output = new StringBuffer(); 
        String[] tempStr = StrToStrArray(input); 
        for (int i = 0; i < tempStr.length; i++) { 
            for (int j = 16 - tempStr[i].length(); j > 0; j--) 
                output.append('0'); 
            output.append(tempStr[i] + " "); 
        } 
        return output.toString(); 
    } 
    
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(String.format("%s%s", 12.3, "12.3"));

		System.out.println(BinstrToBinstr16("9"));
	}

}
