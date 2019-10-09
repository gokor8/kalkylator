package kalculator;

import java.util.Scanner;

public class Take1_Number {
	public static Scanner oj = new Scanner(System.in);
public static boolean boolword,bool2;
	public static int ParsInt,ParsInt2;
	public static String Number1,save;
	
	public static void take1() {
		
		ArifmDo Arfm = new ArifmDo();
		Number1=oj.next().toLowerCase();//берем значение введенное пользователем
		System.out.println(Number1);
		
		save=Number1;//Сохраняемся, как в Скайриме)
		RomeN.Tolko();//Проверяем какое число ввели
		if( boolword==true && bool2==true) {System.exit(0);}//проверяем какое число ввели(lV || 4...)
		if( boolword==true && bool2==false) {System.exit(0);System.out.println("Бездельe-это игрушка дъявола,ежжи");}//проверяем какое число ввели(lV || 4...)
		if(boolword==false && bool2==true) {System.exit(0);System.out.println("djpvbnt vtyz r ct,t)");}//проверяем какое число ввели(lV || 4...)
		if(boolword==false && bool2==false) {
			Number1=save;//Загружаем сохранение)
		razborChisla.Proverk();//Проверка
		Arfm.Reshen();//Решаем
	}
		}

	public static void Exept(){
		ParsInt=RomeN.a;
		ParsInt2=RomeN.b;
	if((ParsInt<1 || ParsInt>10)||(ParsInt2<1 || ParsInt2>10)) {System.out.println("Ты ввел число больше 10, либо меньше 1, а поцаны так непоступают -,-| хотя вдруг ты девушка 0_o");
	System.exit(0);}
	
	}
	

}