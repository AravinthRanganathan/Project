package _01_Calculator;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class _01_SgpaCalculator {
	public static void main(String[] args) {
		sgpa obj1=new sgpa();
		obj1.calculate();
	}
}
class sgpa{
	Scanner sc=new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.###");
	public void calculate() {
		int countab=0,countra=0;
		
		System.out.println("Enter the number of Subjects in the Semester: ");
		int number_of_subject=sc.nextInt();
		float tot=0f,totsgpa=0.0f;
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		System.out.println("Enter the Subject Names with grade :\n"
				+ "(Note:The grades are entered as below format) \n"
				+ "Grades->S,A,B,C,D,E,AB,RA-F\nS->Credit points-10\n"
				+ "A->Credit points-9\nB->Credit points-8\nC->Credit points-7\n"
				+ "D->Credit points-6\nE->Credit points-5\n"
				+ "AB->Absent\nRA-F->Reappear");
		String str[]=new String[number_of_subject];
		int key[]=new int[number_of_subject];
		for(int i=0;i<number_of_subject;i++){
			str[i]=sc.next().toUpperCase();
			key[i]=sc.nextInt();
			map.put(str[i],key[i]);
		}
		int ar1[]=new int[str.length];
		for(int i=0;i<map.size();i++) {
			ar1[i]=map.get(str[i]);
		}
		System.out.println(map);
		int gd=0;
		String ab="",ra="";
		for(int j=0;j<number_of_subject;j++) {
				
				String grade_on[]= {"S","A","B","C","D","E","AB","RA-F"};
				int grade_rg[]= {10,9,8,7,6,5,0,0};
				System.out.println("Enter the obtained Grade:");
				String grade_ob=sc.next();
				for(int i=0;i<grade_on.length;i++) {
							if(grade_ob.equals(grade_on[6])) {
								ab=ab.concat(str[j])+"--";
								countab++;
								break;
							}
							if(grade_ob.equals(grade_on[7])) {
								ra=ra.concat(str[j])+"--";
								countra++;
								break;
							}
							if(grade_ob.equals(grade_on[i])) {
								gd+=ar1[j];
								System.out.println(gd);
								tot+=grade_rg[i]*ar1[j];
							}
				}
		}
		System.out.println("Total mark for this Semester is:"+tot);
		System.out.println("Total grade for this Semester is:"+gd);
		System.out.println("Number of subject ABSENT "+ab+" "+countab);
		System.out.println("Number of subject to be REAPPEAR"+ra+" "+countra);
		totsgpa=tot/gd;
		System.out.println("SGPA is "+df.format(totsgpa));
	}
}
