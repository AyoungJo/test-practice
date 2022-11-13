package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator){
        //as-is
        //내부에서 생성하면 강한 결합도
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        //to-be
        //강한 결합을 약한 결합으로 느슨하게 하기 위해 상위에 interface 생성하여 사용 -> Random 의존 X
       String password = passwordGenerator.generatePassword();
        /*
        * 비밀번호가 최소 8자 이상, 12자 이하여야 한다.
        *
        * */
        if(password.length() >= 8 && password.length() <= 12){
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
