package spring.commento.springbasic.chapter02;

public enum Gender {
    MALE ("male"),
    FEMALE("female");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }
}
