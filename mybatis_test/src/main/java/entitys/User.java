package entitys;


public class User  {
    private int id;
    private String user_name;
    private String cnname;
    private int sex;
    private String mobile;
    private String email;
    private String note;
    public User (String user_name,String cnname,int sex,String mobile,String email,String note ){
        System.out.println("创建了User对象");
        this.user_name=user_name;
        this.cnname=cnname;
        this.sex=sex;
        this.mobile=mobile;
        this.email=email;
        this.note=note;
    }
//    public User(int id,String user_name,String cnname,int sex,String mobile,String email,String note){
//
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


}
