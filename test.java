
public class hello{

public static void main(String args[]) {
String hola = "hola mundo";
System.out.println( centerText(hola,40));
}


	public String centerText( String text, int maxText ){
		int lenS = text.length();
		if (lenS>0 && lenS<maxText){
			int lenMsg = ( ( maxText - lenS ) / 2 ) + lenS;
			String format = "%"+lenMsg+"s";
			text = String.format(format, text);
		}
		return text;
	}
	}