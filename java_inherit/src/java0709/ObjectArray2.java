package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		// 7���� �����͸� ���� �迭 ����
		Game[] game = new Game[7];
		
		// �ε����� game Ŭ���� ��ü ����
		game[0] = new Game("Grnad Theft Auto V", "Open World", "PC");
		game[1] = new Game("God of war", "Action ", "PS5");
		game[2] = new Game("Hallo", "FPS", "XBOX");
		game[3] = new Game("Super mario", "2D Side View", "Nintendo Switch");
		game[4] = new Game("GenShin", "Action ", "Moblie");
		game[5] = new Game("world of warcaft", "MMORPG", "PC");
		game[6] = new Game("Starcraft", "RTS", "PC");
		
		//�ε����� ����Ͽ� �ݺ��� ���� �� ���
		for(int i=0; i<game.length; i++) {
			System.out.println(game[i]);
		}

	}

}
