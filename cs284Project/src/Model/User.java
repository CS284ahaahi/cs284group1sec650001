package Model;


public class User {
    private String userID,userName,passWord,firstName,lastName,email,rank,status;
    public User(String userID, String userName, String passWord, String firstName, String lastName, String email, String rank, String status) {
        this.userID = userID;
        this.userName = userName;
        this.passWord = passWord;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.rank = rank;
        this.status = status;
    }
    public String getUserID() {
        return userID;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getRank() {
        return rank;
    }
    public String getStatus() {
        return status;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", userName=" + userName + ", passWord=" + passWord + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", rank=" + rank + ", status=" + status + '}';
    }
}
