package java0710_1;

abstract class Unit{
	int hp;
//	public abstract void repair();
}
interface Repairble{
	public void repair();
}

class Marine extends Unit{				// 사람
	public Marine() {
		super.hp=50;
		}
}

class Dropship extends Unit implements Repairble{			// 기계
	public Dropship() {
		super.hp=100;
		}
	@Override
	public void repair() {
		System.out.println("scv가 수리");
		}
}

class Tank extends Unit implements Repairble{				// 기계
	public Tank() {
		super.hp=150;
		}
	@Override
	public void repair() {
		System.out.println("수리");
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		
		Marine m = new Marine();
		Dropship d = new Dropship();
		Tank t = new Tank();
		
		m.hp -= 10;		// HP → 40
		d.hp -= 20;		// HP → 80
		t.hp -= 50;		// HP → 100
		// hp가 줄어 들어서 수리를 한다.
	}

}
