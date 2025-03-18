//class Admin extends User{
//
//    private String username;
//    private String password;
//
//    public Admin(String username, String password, String name, int nim) {
//        super(name, nim);
//        this.username = username;
//        this.password = password;
//    }
//
//
//    @Override
//    public boolean login(String inputUsername, int inputNIM) {
//        return false;
//
//    }
//
//    public boolean login(String inputUsername, String inputPassword) {
//        return inputUsername.equals(this.username) && inputPassword.equals(this.password);
//    }
//
//    @Override
//    public void displayInfo(){
//        System.out.println("User name : " + username + " login success");
//    }
//}
