public class Test {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account("123", 10000.0, "Mehmet ÖZER", "ozermehmet1@proton.me", "1234");

        //account2.paraYatir(2000.0);

        System.out.println(account1.getIsim());

        /*
        account1.setHesapNo("123456");
        account1.setBakiye(1000.0);
        account1.setIsim("Mehmet Özer");
        account1.setEmail("ozermehmet911@gmail.com");
        account1.setTelefonNo("12345678901");
         */


    }

}

