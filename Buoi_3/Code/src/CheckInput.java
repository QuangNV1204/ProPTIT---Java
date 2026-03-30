public class CheckInput {
    private String accountAdmin = "admin";
    private String passwordAdmin = "admin";
    private String accountCustomer = "customer";
    public boolean checkAccount_admin(String account_admin){
        if(account_admin.equals(this.accountAdmin)){
            return true;
        }
        return false;
    }
    public boolean checkPassword_admin(String password_admin){
        if(password_admin.equals(this.passwordAdmin)){
            return true;
        }
        return false;
    }
    public boolean checkAccount_customer(String account_customer){
        if(account_customer.equals(this.accountCustomer)){
            return true;
        }
        return false;
    }

}
