package kalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomeN extends Take1_Number{
	public static String resultString="",rstls;
	public static String RomeNumb,RomeNumb2,opt;
	public static int results;
	public static int a,b;
	
	public static void Tolko(){
		Swtch();
		System.out.println(resultString);
	}
	
	public static void Swtch() {
		RomeNumb2=Take1_Number.Number1;RomeNumb=Take1_Number.Number1;//передаем значения
		opt=Take1_Number.Number1;//передаем значения
       System.out.println(opt);
		opt=opt.replaceAll("[qazwsedcrftgbyhnujmik,op.]", "");
		RomeNumb=RomeNumb.replaceAll("[qazwsedcrftgbyhnujmik,op.]", "");
		RomeNumb2.replaceAll("[qazwsedcrftgbyhnujmik,op.]", "");
		ifa();// получаем римские цифры 
	     MenRome1();MenRome2();//Преобразовываем их в адекватный вид
if(boolword==false && bool2==false) {}else {
	if( boolword==true && bool2==false) {System.out.println("Угомонись, ЕЖЖИИИИИ ");System.exit(0);}else {
	if(boolword==false && bool2==true) {System.out.println("Угомонись, ЕЖЖИИИИИ ");System.exit(0);}else {
	     a=Integer.parseInt(RomeNumb);b=Integer.parseInt(RomeNumb2);//Парсим
	     Take1_Number.Exept();//Проверяем, небольшое ли число ввел пользователь
	     Take1_Number.ParsInt=a;Take1_Number.ParsInt2=b;
	     resu();//Результат
	}}}}
//................................................................................................................................
	public static void resu() {  
		if(opt.contains("+")) {results=a+b;}
		if(opt.contains("-")) {results=a-b;}
		if(opt.contains("/")) {results=a/b;}
		if(opt.contains("*")) {results=a*b;}
		 ReshRome();
		System.out.println(rstls);}
			
//.................................................................................................................................
		public static void ifa() {
if(RomeNumb.contains("+")) {RomeNumb= RomeNumb.substring(0, RomeNumb.indexOf("+"));RomeNumb2 =RomeNumb2.substring(RomeNumb2.indexOf("+")+1);}
if(RomeNumb.contains("-")) {RomeNumb= RomeNumb.substring(0, RomeNumb.indexOf("-"));RomeNumb2 =RomeNumb2.substring(RomeNumb2.indexOf("-")+1);}
if(RomeNumb.contains("/")) {RomeNumb= RomeNumb.substring(0, RomeNumb.indexOf("/"));RomeNumb2 =RomeNumb2.substring(RomeNumb2.indexOf("/")+1);}
if(RomeNumb.contains("*")) {RomeNumb= RomeNumb.substring(0, RomeNumb.indexOf("*"));RomeNumb2 =RomeNumb2.substring(RomeNumb2.indexOf("*")+1);}
		}
		
//.........................................................................................................................		
		public static void MenRome1() {
			boolword=false;
		if(RomeNumb.equals("x")) {RomeNumb="10"; boolword=true;}
else {if(RomeNumb.equals("lx")) {RomeNumb="9"; boolword=true;}
	else{if(RomeNumb.equals("vlll")) {RomeNumb="8"; boolword=true;}
		else{if(RomeNumb.equals("vll")) {RomeNumb="7"; boolword=true;}
			else{if(RomeNumb.equals("vl")) {RomeNumb="6"; boolword=true;}
					else{if(RomeNumb.equals("lv")) {RomeNumb="4"; boolword=true;}
							else{if(RomeNumb.equals("lll")) {RomeNumb="3"; boolword=true;}
								 	else{if(RomeNumb.equals("ll")) {RomeNumb="2"; boolword=true;}
								 			else{if(RomeNumb.equals("v")) {RomeNumb="5"; boolword=true;}
								 					else{if(RomeNumb.equals("l")) {RomeNumb="1"; boolword=true;}else{}}}}}}}}}}}
	
		
//..........................................................................................................................	
			public static void MenRome2() {
				bool2=false;
		if(RomeNumb2.equals("x")) {RomeNumb2="10"; bool2=true;}
	else {if(RomeNumb2.equals("lx")) {RomeNumb2="9"; bool2=true;}
		else{if(RomeNumb2.equals("vlll")) {RomeNumb2="8"; bool2=true;}
			else{if(RomeNumb2.equals("vll")) {RomeNumb2="7"; bool2=true;}
				else{if(RomeNumb2.equals("vl")) {RomeNumb2="6";bool2=true;}
					else{if(RomeNumb2.equals("lv")) {RomeNumb2="4"; bool2=true;}
						else{if(RomeNumb2.equals("lll")) {RomeNumb2="3"; bool2=true;}
							else{if(RomeNumb2.equals("ll")) {RomeNumb2="2"; bool2=true;}
								else{if(RomeNumb2.equals("v")) {RomeNumb2="5"; bool2=true;}
									else{if(RomeNumb2.equals("l")) {RomeNumb2="1"; bool2=true;}else{}}}}}}}}}}}

public static void ReshRome() {
	if(results==1) {rstls="l";}else {
		if(results==2) {rstls="ll";}else {
			if(results==3) {rstls="lll";}else {
				if(results==4) {rstls="lv";}else {
					if(results==5) {rstls="v";}else {
						if(results==6) {rstls="vl";}else {
							if(results==7) {rstls="vll";}else {
								if(results==8) {rstls="vlll";}else {
									if(results==9) {rstls="lx";}else {
										if(results==10) {rstls="x";}else {System.out.println(results);}}}}}}}}}}}

}