package LLDCarRentalSystem.Model;

public class User {
    int userID;
    int userName;
    String drivingLicense;

    public User() {
    }

    public User(int userID, int userName, String drivingLicense) {
        this.userID = userID;
        this.userName = userName;
        this.drivingLicense = drivingLicense;
    }

    public int getUserId() {
        return userID;
    }

    public void setUserId(int userId) {
        this.userID = userId;
    }

    public int getUserName() {
        return userName;
    }

    public void setUserName(int userName) {
        this.userName = userName;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

}
