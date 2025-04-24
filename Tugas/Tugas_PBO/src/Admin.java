class Admin extends User{

    private final String username;
    private final String password;

    public Admin(String name, String nim, String username, String password) {
        super(name, nim);
        this.username = username;
        this.password = password;
    }


    @Override

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(this.username) && inputPassword.equals(this.password);
    }

    @Override
    public void displayInfo(){
        System.out.println("Username : " + username + " login success");
    }
}
