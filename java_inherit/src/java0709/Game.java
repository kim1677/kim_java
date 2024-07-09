package java0709;

public class Game {
	
		// 게임 제목과, 장르, 플랫폼
		// 장르는 액션, 롤플레잉, FPS 같은거
		// 플랫폼은 PC, PS4, switch, XBOX
		
		// 인스턴스 변수 제어자는 private
		// 인스턴스 변수 생성
		private String title;			// 제목
		private String genre;			// 장르
		private String platform;		// 플랫폼
		
		public Game() {}
		public Game(String title, String genre, String platform) {
			this.title=title;
			this.genre=genre;
			this.platform=platform;
		};
		
		//객체의 인스턴스 변수들 값 출력하기 위한 메서드
		@Override
		public String toString() {
			return title+", "+genre+", "+platform;
		}
		
		// set메서드를 통해서 데이터 저장
		// 생성자 메서드로 데이터를 저장
		// private 제어자 인스턴스 변수에 대한 get,set 메서드 생성
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