package hw;
import java.util.Scanner;
/*某間學校舉辦英文檢定測驗，若是學生通過該測驗，則能通過畢業門檻。老師準備的 英文測驗中分為三個項目當作考試，
 * 分別是聽力、閱讀、口說。每一個項目測驗滿分 皆為 100 分，總分為 300 分。想要通過測驗有兩種方式。
 * 方式一:若是三個項目分 數皆為 60 分以上 ( 包含 60 分 ) 即為通過測驗。
 * 方式二:若三個項目中有其中一 個項目分數未滿 60 分，但三個項目分數總合超過 220 分，也可算通過測驗。
 * 若三個項目中有其中一個項目分數未滿 60 分，而三個項目分數總合也沒能超過 220 分，可獲得補考機會。
 * 若是三個項目中有兩個項目不及格，但另一個項目成績高於 80 分 ( 包含 80 分 ) ，也可獲得補考的機會。其餘皆判定為無法通過測驗。
*說明: 第一行為一個整數 N ，代表共有 N 組測試資料。之後有 N 行，每一行有 3 個非 負整數 ( 範圍皆為 0 到 100), 
*分別代表該名學生聽力、閱讀、口說的測驗分數。
*若是通過測驗，則輸出 ”P” 。若是需要補考，則輸出 ”M” 。若是無法通過測驗， 則輸出 ”F”
*/
public class hw01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++){
			int m1=sc.nextInt();
			int m2=sc.nextInt();
			int m3=sc.nextInt();
			sum=m1+m2+m3;
			if(m1>=60&&m2>=60&&m3>=60)
				System.out.println("P");	
			else if(m1<0||m2<0||m3<0 || m1>100||m2>100||m3>100)
				System.out.println("成績錯誤");
			else if(m1<60&&sum>220 ||m2<60&&sum>220 ||m3<60&&sum>220)//[超過]不含220,與作業圖片爭議在此
				System.out.println("P");
			else if(m1<60&&sum<=220 ||m2<60&&sum<=220 ||m3<60&&sum<=220)
				System.out.println("M");
			else if(m1<60&&m2<60&&m3>=80 ||m1<60&&m2>=80&&m3<60 ||m1>=80&&m2<60&&m3<60)
				System.out.println("M");
			else
				System.out.println("F");
		}
		
		
		
		
	}
}
