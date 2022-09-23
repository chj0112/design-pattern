interface Hello {
    default public void sayHello() {
        System.out.println("영어로 인사");
    }
}

class HelloMain {
    public static void main(String[] args) {
//        Hello h = new Hello();
//        h.sayHello();
        Hello h = new HelloKorean();
        h.sayHello();
        h = new HelloChinese();
        h.sayHello();
    }
}

class HelloKorean implements Hello {
    public void sayHello() {
        System.out.println("한국어로 인사");
    }
}

class HelloChinese implements Hello {
    public void sayHello() {
        System.out.println("중국어로 인사");
    }
}