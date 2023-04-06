public class Account {
    private String username;
    private String password;
    private String ID;
    private String kahao;
    private String tel;
    private String sex;
    private double balance;
    Account(String username,String password,String ID,String kahao,String tel,String sex){
        this.username=username;
        this.password=password;
        this.ID=ID;
        this.kahao=kahao;
        this.tel = tel;
        this.sex = sex;
        this.balance=0;//余额默认为0
    }
    Account(String tel,String password){
        this.password=password;
        this.tel=tel;
    }
    Account(){}
    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getID() {
        return ID;
    }

    public String getKahao() {
        return kahao;
    }

    public String getTel() {
        return tel;
    }

    public String getSex() {
        return sex;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setKahao(String kahao) {
        this.kahao = kahao;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
