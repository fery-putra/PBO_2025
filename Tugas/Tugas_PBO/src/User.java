 class User {
    private String name;
    private String nim;

    public User(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public boolean login(String InputName, String InputNIM){
        return InputName.equals(this.name) && InputNIM.equals(this.nim);
    }

    public void displayInfo(){
        System.out.println(" User Info : ");
    }
}
