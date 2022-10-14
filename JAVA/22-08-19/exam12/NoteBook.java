package exam12;

public abstract class NoteBook extends Computer{
	// typing이 아직 구현되지 않았으므로 추상클래스임

	@Override
	public void display() {
		System.out.println("노트북을 화면에 출력하다.");
	}
	
	// 아직 구현하지 않은 typing 메서드는 추상메서드로 선언할 수도 있고.
	// 생략도 가능함.
	public abstract void typing();

}
