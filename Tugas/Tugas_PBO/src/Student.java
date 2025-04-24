class Student extends User {
    public Student(String name, String nim){
        super(name, nim);
    }


    @Override
    public boolean login(String InputName, String InputNim){
        return InputName.equals(getName()) && InputNim.equals(getNim());
    }


    @Override
    public void displayInfo(){
        System.out.println("Student Login Success");
        System.out.println(" Student Name : " +getName());
        System.out.println(" Student NIM : " +getNim());
    }
}

