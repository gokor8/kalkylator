package kalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class razborChisla extends Take1_Number{
	public static void Proverk() {
		int Num1,Num2;
		String NuMbers="",NuMbers2="";
		Pattern p = Pattern.compile("-?\\d+");
		Matcher m = p.matcher(Number1);
		while (m.find()) {
			NuMbers=NuMbers+m.group();
			NuMbers2=NuMbers2+m.group();}//удаление лишних символов
		
if(Number1.contains("-")) {NuMbers=NuMbers.substring(0, NuMbers.length() - 2);}
else {NuMbers=NuMbers.substring(0, NuMbers.length() - 1);}
if(Number1.contains("-")) {NuMbers2=NuMbers2.substring(2);}
else {NuMbers2=NuMbers2.substring(1);}
	
Num1=Integer.parseInt(NuMbers);//Parsing
ParsInt=Num1;

	Num2=Integer.parseInt(NuMbers2);
	
	ParsInt2=Num2;
	}
}
