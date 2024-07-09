package java0709;

public class Game {
	
		// ���� �����, �帣, �÷���
		// �帣�� �׼�, ���÷���, FPS ������
		// �÷����� PC, PS4, switch, XBOX
		
		// �ν��Ͻ� ���� �����ڴ� private
		// �ν��Ͻ� ���� ����
		private String title;			// ����
		private String genre;			// �帣
		private String platform;		// �÷���
		
		public Game() {}
		public Game(String title, String genre, String platform) {
			this.title=title;
			this.genre=genre;
			this.platform=platform;
		};
		
		//��ü�� �ν��Ͻ� ������ �� ����ϱ� ���� �޼���
		@Override
		public String toString() {
			return title+", "+genre+", "+platform;
		}
		
		// set�޼��带 ���ؼ� ������ ����
		// ������ �޼���� �����͸� ����
		// private ������ �ν��Ͻ� ������ ���� get,set �޼��� ����
		public String getName() {
			return title;
		}
		public void setName(String name) {
			this.title = name;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getPlatform() {
			return platform;
		}
		public void setPlatform(String platform) {
			this.platform = platform;
		}
		
		
}