package _01_Calculator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_CgpaCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of semester");
		int number_of_sem=sc.nextInt();
		float totcgpa=0;int totgd=0;
		float cgpa;
		for(int k=0;k<number_of_sem;k++) {
			int countab=0,countra=0;
			
			System.out.println("Enter the number of Subjects in the Semester:");
			int number_of_subject=sc.nextInt();
			float tot=0f;
			float totsgpa=0.0f;
			Map<String,Integer> map=new LinkedHashMap<String,Integer>();
			System.out.println("Enter the Subject Names with grade :");
			String str[]=new String[number_of_subject];
			int key[]=new int[number_of_subject];
			for(int i=0;i<number_of_subject;i++){
				str[i]=sc.next();
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
									ab=ab.concat(str[j])+"\n";
									countab++;
									break;
								}
								if(grade_ob.equals(grade_on[7])) {
									ra=ra.concat(str[j])+"\n";
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
			System.out.println(tot);
			System.out.println(gd);
			System.out.println("Number of subject ABSENT\n"+ab+" "+countab);
			System.out.println("Number of subject to be REAPPEAR "+ra+" "+countra);
			totcgpa+=tot;
			totgd+=gd;
			totsgpa=tot/gd;
			System.out.println(totsgpa);
			tot=0;gd=0;
		}
		System.out.println("total:"+totcgpa);
		System.out.println("total grade"+totgd);
		cgpa=totcgpa/totgd;
		System.out.println(cgpa);
	}
}
