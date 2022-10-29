public class Main {
    public static void main(String[] args) {
        PasswordInfo p;
        PasswordDao passwordDao = new PasswordDaoImpl();

        System.out.println("--- 데이터 DB에 추가");
        p = new PasswordInfo("https://www.smu.ac.kr", "smu", "abcde");
        passwordDao.insert(p);
        p = new PasswordInfo("https://www.smu2.ac.kr", "smu2", "abcde");
        passwordDao.insert(p);

        System.out.println("--- 전체 데이터 출력");
        for (PasswordInfo pi : passwordDao.findAll()) {
            System.out.println("reading... " + pi);
        }

        System.out.println("--- 두 번째 데이터 id 수정");
        p = passwordDao.findAll().get(1);
        p.setId("smu1");

        System.out.println("--- 해당 데이터 출력");
        System.out.println(p);

        System.out.println("--- 데이터 삭제");
        passwordDao.delete("https://www.smu2.ac.kr");

        System.out.println("--- 데이터 삭제 후 전체 데이터 출력");
        for (PasswordInfo pi : passwordDao.findAll()) {
            System.out.println("reading... " + pi);
        }
    }
}
