package raiseTech02;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UseListAndMap {

	public static void main(String[] args) {
		/*----------------------Listのコード----------------------------*/
		ArrayList<String> mt = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

/*		System.out.println("\'end\'と入力して終了する。");
		while(true) {
			System.out.println("I want to go to ...");
			String str = scan.nextLine();
			if(str == "end") {
				break;
			}
			mt.add(str);
			無限ループを使ってendと入力されるまで好きなだけ入力するコードが書きたかった
		}
*/
		System.out.println("行きたい山を3ヶ所入力してください。");
		do {
			System.out.println("I want to go to ...");
			String str = scan.nextLine();
			mt.add(str);//入力された山をリストmtに追加していく
		}while(mt.size() < 3);
		System.out.println(mt);//一旦表示

		/*----------------------ここからMapのコード------------------------*/

		Map<String,Integer> mtElevation = new HashMap<String,Integer>();

		for (int i=0; i<mt.size(); i++) {
			System.out.println(mt.get(i)+"の標高は?");
			int elevation = scan.nextInt();
			mtElevation.put(mt.get(i), elevation);//リストmtの山の標高を入力して,Mapに入れる
		}
		scan.close();
		//Mapに格納されている山の標高をisOver2000メソッドで判定する
		for (int j=0; j<mt.size(); j++) {
			System.out.print(mt.get(j)+"は");
			isOver2000(mtElevation.get(mt.get(j)));
		}
	}

	//山が2000mより高いか否かを判定するメソッドを定義
	private static void isOver2000 (int elevation) {
		if (elevation >= 2000) {
			System.out.println("標高2000m以上の山です。");
		}else {
			System.out.println("標高2000m未満の山です。");
		}
	}
}