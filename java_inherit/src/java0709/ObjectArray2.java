package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		// 7개의 데이터를 담을 배열 생성
		Game[] game = new Game[7];
		
		// 인덱스별 game 클랙스 객체 생성
		game[0] = new Game("Grnad Theft Auto V", "Open World", "PC");
		game[1] = new Game("God of war", "Action ", "PS5");
		game[2] = new Game("Hallo", "FPS", "XBOX");
		game[3] = new Game("Super mario", "2D Side View", "Nintendo Switch");
		game[4] = new Game("GenShin", "Action ", "Moblie");
		game[5] = new Game("world of warcaft", "MMORPG", "PC");
		game[6] = new Game("Starcraft", "RTS", "PC");
		
		//인덱스를 사용하여 반복문 생성 및 출력
		for(int i=0; i<game.length; i++) {
			System.out.println(game[i]);
		}

	}

}
