package kalculator;

import java.util.Scanner;

public class Take1_Number {
	public static Scanner oj = new Scanner(System.in);
public static boolean boolword,bool2;
	public static int ParsInt,ParsInt2;
	public static String Number1,save;
	
	public static void take1() {
		
		ArifmDo Arfm = new ArifmDo();
		Number1=oj.next().toLowerCase();//����� �������� ��������� �������������
		System.out.println(Number1);
		
		save=Number1;//�����������, ��� � ��������)
		RomeN.Tolko();//��������� ����� ����� �����
		if( boolword==true && bool2==true) {System.exit(0);}//��������� ����� ����� �����(lV || 4...)
		if( boolword==true && bool2==false) {System.exit(0);System.out.println("�������e-��� ������� �������,����");}//��������� ����� ����� �����(lV || 4...)
		if(boolword==false && bool2==true) {System.exit(0);System.out.println("djpvbnt vtyz r ct,t)");}//��������� ����� ����� �����(lV || 4...)
		if(boolword==false && bool2==false) {
			Number1=save;//��������� ����������)
		razborChisla.Proverk();//��������
		Arfm.Reshen();//������
	}
		}

	public static void Exept(){
		ParsInt=RomeN.a;
		ParsInt2=RomeN.b;
	if((ParsInt<1 || ParsInt>10)||(ParsInt2<1 || ParsInt2>10)) {System.out.println("�� ���� ����� ������ 10, ���� ������ 1, � ������ ��� ����������� -,-| ���� ����� �� ������� 0_o");
	System.exit(0);}
	
	}
	

}