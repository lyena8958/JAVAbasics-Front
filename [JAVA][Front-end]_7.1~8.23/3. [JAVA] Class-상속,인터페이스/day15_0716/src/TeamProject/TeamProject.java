package TeamProject; // 이예나 김영진 양윤혁

abstract class Animal{
	//[생성자] - 이름 은 필수!! (서식지,나이 선택)
	Animal(String name){
		this(name,"알수없음",0); 
		// 선택사항-서식지"알수없음", 나이 0 으로 초기화부여
	}
	Animal(String name, String habitat, int age){
		this.name = name;
		this.habitat = habitat;
		this.age = age;
		this.type = ""; //개발자가 입력
	}
	//[멤버변수]
	String name; // 이름
	String habitat; // 서식지
	String type; // 종(포유류 어류 조류)
	int age; // 나이
	
	//[메소드]
	abstract void food(); // 식사 출력(사료, 고기)
	abstract void play(); // 놀이 출력(사냥놀이, 산책)
	abstract void action(); // 행동 출력(앉아, 일어서)
	
	//[오버라이딩]
	public boolean equals(Object obj) { // 비교함수 오버라이딩
		Animal ani = (Animal) obj; 
		if(ani.type == this.type) { // 종이 같니?
			return true;
		}
		return false;
	}
	public String toString() {//출력함수 오버라이딩
		return this.name+"이는 "+this.age+"살, "+this.type+"이고, "+this.habitat+"에 삽니다!!";
	}
}//Animal 종료

//[어류]양윤혁=====================================================================
//===============================================================================
abstract class TypeFish extends Animal {
    // 객체를 생성하지않기위해서 추상클래스화
    
    TypeFish(String name){
          super(name);
       }
    TypeFish(String name, String habitat, int age){
          super(name, habitat, age);
          this.type = "어류";
       }

    
    void call() {
       System.out.println(this.name+this.habitat+this.name+this.name);
    }

 }
 class yellowTail extends TypeFish {
    
    yellowTail(String name) {
       this(name, "알수없음", 0);
       }
       
    yellowTail(String name, String habitat, int age) {
          super(name, habitat, age);
          System.out.println("방어 생성");
       }



    @Override
    void food() {
       // TODO Auto-generated method stub
       System.out.println(this.name+"는 전갱이를 먹습니다");
    }

    @Override
    void play() {
       // TODO Auto-generated method stub
       System.out.println(this.name+"는 조리사의 그물망을 피해다닙니다.");
    }

    @Override
    void action() {
       // TODO Auto-generated method stub
       System.out.println(this.name+"는 조리사의 눈치를 봅니다.");
    }

 }

 class Shark extends TypeFish {
    Shark(String name) {
          this(name, "알수없음", 0);
       }
       
    Shark(String name, String habitat, int age) {
          super(name, habitat, age);
          System.out.println("상어 생성");
       }
     void food() { 
     System.out.println(this.name+"는 플랑크톤을 먹습니다.");
     }

     void play() { 
        System.out.println(this.name+"는 사람들을 구경합니다.");
     }

     void action() {;
     System.out.println(this.name+"는 헤엄을 칩니다.");
     }
 }

 class Salmon extends TypeFish {
    Salmon(String name) {
       this(name, "알수없음", 0);
       }
       
    Salmon(String name, String habitat, int age) {
          super(name, habitat, age);
          System.out.println("연어 생성");
       }
     void food() {; 
     System.out.println(this.name+"는 플랑크톤을 먹습니다");
     }

     void play() {; 
     System.out.println(this.name+"는 강물을 거슬러 올라갑니다");
     }

     void action() {;
     System.out.println(this.name+"는 헤엄을 칩니다");
     }
 }
	
	
	//[조류]김영진=====================================================================
	//===============================================================================
	abstract class TypeBird extends Animal{

		   TypeBird(String name) {
		      super(name, "알수없음", 0);
		   }
		   
		   TypeBird(String name, String habitat, int age) {
		      super(name, habitat, age);
		      this.type = "조류";
		   }
		   
		}

		// 펭귄 클래스
		class BirdPenguin extends TypeBird{

		   BirdPenguin(String name) {
		      this(name, "알수없음", 0);
		   }
		   
		   BirdPenguin(String name, String habitat, int age) {
		      super(name, habitat, age);
		      System.out.println("펭귄 한마리 등장~");
		   }
		   
		   void food() { 
		      System.out.println(this.name+"은 크릴새우와 물고기를 먹어요~ ♥");
		   }
		   void play() {
		      System.out.println(this.name+"은 다이빙 놀이~");
		      
		   }
		   void action() {
		      System.out.println(this.name+"(수영하기) 어푸~어푸~");
		      
		   }
		   
		}

		// 닭 클래스
		class BirdChicken extends TypeBird{

		   BirdChicken(String name) {
		      this(name, "알수없음", 0);
		   }
		   
		   BirdChicken(String name, String habitat, int age) {
		      super(name, habitat, age);
		      System.out.println("치킨 한마리 등장~");
		   }
		   
		   void food() { 
		      System.out.println(this.name+"은  모이를 먹어요~");
		   }
		   void play() { 
		      System.out.println(this.name+"(춤추기) 박자맞춰 머리흔들기~");
		   }
		   void action() { 
		      System.out.println(this.name+"(알품기) 포근포근~ ♨");
		   }
		   
		}

		//타조 클래스
		class BirdOstrich extends TypeBird{

		   BirdOstrich(String name) {
		      this(name, "알수없음", 0);
		   }
		   
		   BirdOstrich(String name, String habitat, int age) {
		      super(name, habitat, age);
		      System.out.println("타조 한마리 등장~");
		   }
		   
		   void food() { 
		      System.out.println(this.name+"은  과일과 새순을 먹어요~");
		   }
		   void play() { 
		      System.out.println(this.name+"(누가누가 빠른가) 나 잡아봐라~ @@@");
		   }
		   void action() { 
		      System.out.println(this.name+"(달리기) 후다다닥~");
		   }
		   
		}



//[포유류]이예나=====================================================================
//===============================================================================
abstract class TypeMal extends Animal{ // 포유류
	TypeMal(String name){
		super(name);
	}
	TypeMal(String name, String habitat, int age){
		super(name, habitat, age);
		this.type= "포유류";
	}
	void Call() {
		System.out.print(this.name+"가 ");
	}
}
class Bare extends TypeMal{
	Bare(String name){
		this(name, "알수없음", 0);
	}
	Bare(String name, String habitat, int age){
		super(name, habitat, age);
		System.out.println(this.name+"이가 주인을 향해 손을 흔듭니다!! \\\\^ㅇ㉦ㅇ^//");
	}
	@Override
	void food() {
		this.Call();
		System.out.println("주변 작은친구들 찾아 먹습니다. ┌( ㅇ㉦ㅇ)┘ ");
	}
	@Override
	void play() {
		this.Call();
		System.out.println("평야를 돌아다니며 사냥을 합니다!! \\\\('㉦')ㄴ =33 ");
		
	}
	@Override
	void action() {
		this.Call();
		System.out.println("나무를 타고 올라가 경치를 구경합니다 ㅇ㉦ㅇ");
	}
}
class Cat extends TypeMal{
	Cat(String name){
		this(name, "알수없음", 0);
	}
	Cat(String name, String habitat, int age){
		super(name, habitat, age);
		System.out.println("애~옹~~ 집사옆으로 다가옵니다! (⊙ㅅ⊙)__/ ");
	}
	@Override
	void food() {
		this.Call();
		System.out.println("사료를 먹습니다. (●'ㅅ'●) ");
	}
	@Override
	void play() {
		this.Call();
		System.out.println("집사에게 명령하여 사냥놀이를 합니다 (+ㅅ+)_ _ } ");
		
	}
	@Override
	void action() {
		this.Call();
		System.out.println("잠에 빠져듭니다. . . . . zZz");
	}
	
}
class Seal extends TypeMal{
	Seal(String name){
		this(name,"알수없음", 0);
	}
	Seal(String name, String habitat, int age){
		super(name, habitat, age);
		System.out.println("옹옹!!!! 반가옹!!! >mm< // ");
	}
	@Override
	void food() {
		this.Call();
		System.out.println("물고기를 잡아먹습니다. ㅇmmㅇ");
	}
	@Override
	void play() {
		this.Call();
		System.out.println("공으로 치고 던지고 놀기!  ☆mm☆ 3 오~옹!! ");
		
	}
	@Override
	void action() {
		this.Call();
		System.out.println("인사를 합니다!! 옹!! 반갑게 인사해주세요:D  ^mm^ ");
	}
	
}
public class TeamProject {

	public static void main(String[] args) {

		System.out.println("동물왕국에 오신것을 환영합니다! 인자는 이름(필수) 주소,나이(선택) 입니다.\n\n");
		Animal[] animal = new Animal[9];
		
		// 조류
		  animal[0] = new BirdPenguin("펭순이"); //펭귄 생성
	      animal[1] = new BirdChicken("치순이","닭장",6); //치킨생성
	      animal[2] = new BirdOstrich("타순이","서울대공원",11); //타조생성
	     System.out.println("-------------------------조류↑");
	     
	    // 포유류
	      animal[3] = new Cat("나응이","우리집",5); // 고양이 생성
	      animal[4] = new Bare("곰순이"); // 곰 생성
	      animal[5] = new Seal("웅이","에버랜드 동물원",6); // 물개 생성
	      System.out.println("-------------------------포유류↑");
	      
	    // 어류
	      animal[6] = new yellowTail("방방이","부산 횟집",10); //방어 생성
	      animal[7] = new Shark("백상아","아쿠아리움",20); //상어 생성
	      animal[8] = new Salmon("여너","노르웨이",30); //연어 생성
	      System.out.println("-------------------------어류↑");
	    
	    // 메소드 총 출력
	      for(int i = 0; i < animal.length; i++) {
	    	  animal[i].food();
	    	  animal[i].play();
	    	  animal[i].action();
	    	  System.out.println(); // 줄정리
	      }
	      
	      System.out.println(); // 줄정리
        // equals 타입 비교
	     if(animal[3].equals(animal[4])) {
	    	 System.out.println(animal[3].type+"으로 같습니다!!");
	     }
	    
	     System.out.println(); // 줄정리
	     
	    // toString 출력
	     for (Animal v: animal) {
	         System.out.println(v);
	      }
	      
	}//main종료

}
